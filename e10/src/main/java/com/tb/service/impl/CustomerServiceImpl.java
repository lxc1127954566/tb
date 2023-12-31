package com.tb.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.alibaba.fastjson.JSONObject;
import com.tb.common.component.XBBConfigConstant;
import com.tb.common.exception.TBConcreteException;
import com.tb.common.exception.TBE10ExceptionEnum;
import com.tb.domain.e10.request.*;
import com.tb.domain.e10.vo.AttributeVo;
import com.tb.domain.xbb.request.*;
import com.tb.interfaceManager.xbb.CustomManager;
import com.tb.interfaceManager.xbb.FormManager;
import com.tb.interfaceManager.xbb.XBBUserManager;
import com.tb.manager.*;
import com.tb.mbg.model.*;
import com.tb.mbg.model.Currency;
import com.tb.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * 客户具体业务实现类
 *
 * @author linxc
 * @date 2023/12/15
 */
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    private final Integer MAX_SERIAL = 1000;

    @Autowired
    private CustomerManager customerManager;
    @Autowired
    private E10UserManager e10UserManager;
    @Autowired
    private CurrencyManager currencyManager;
    @Autowired
    private BpClusterManager bpClusterManager;
    @Autowired
    private CustomerPropertyManager customerPropertyManager;
    @Autowired
    private BpPropertyDManager bpPropertyDManager;
    @Autowired
    private CustomerPropertyViewManager customerPropertyViewManager;
    @Autowired
    private CsTaxClassificationManager csTaxClassificationManager;
    @Autowired
    private SalesCenterManager salesCenterManager;
    @Autowired
    private CustomerSalesManager customerSalesManager;
    @Autowired
    private CompanyManager companyManager;
    @Autowired
    private CustomerFicategoryManager customerFicategoryManager;
    @Autowired
    private CustomerFiManager customerFiManager;
    @Autowired
    private CustomManager customManager;
    @Autowired
    private XBBUserManager xbbUserManager;
    @Autowired
    private FormManager formManager;

    @Override
    public String e10ValidateCode(String code) {
        String serial;
        List<Customer> customerList;
        for (int i = 1; i < MAX_SERIAL; i ++){
            serial = code + (i < 10 ? "00" + i : i < 100 ? "0" + i : i);
            CustomerManagerRequest customerManagerRequest = CustomerManagerRequest.builder()
                    .customerCode(serial)
                    .build();
            customerList = customerManager.getCustomerByCondition(customerManagerRequest).getCustomerList();
            if (CollectionUtil.isEmpty(customerList)){
                return serial;
            }
        }
        return null;
    }

    /**
     * 新增客户信息需要插入表单
     * 1、客户信息表 CUSTOMER
     * 2、客户属性表 CUSTOMER_PROPERTY
     * 3、客户属性视图表 CUSTOMER_PROPERTY_VIEW
     * 4、客户业务信息表 CUSTOMER_SALES
     * 5、客户财务信息表 CUSTOMER_FI
     *
     * */
    @Override
    @Transactional
    public String e10Save(CustomerRequest request){
        BpPropertyDMangerRequest bpPropertyDMangerRequest;
        //1、新增客户信息
        //获取提交人id
        List<User> userList = e10UserManager.getUserByUsername(request.getUsername()).getUserList();
        if (CollectionUtil.isEmpty(userList)){
            throw new NullPointerException("未获取到该用户，请确认权限");
        }
        String submitId = userList.get(0).getUserId();
        //获取币种id
        CurrencyManagerRequest currencyManagerRequest = new CurrencyManagerRequest(request.getCurrency());
        List<Currency> currencyList = currencyManager.getCurrencyListByCondition(currencyManagerRequest).getCurrencyList();
        if (CollectionUtil.isEmpty(currencyList)){
            log.info("未获取到币种名称，取第一个币种数据");
            currencyManagerRequest.setCurrencyName(null);
            currencyList = currencyManager.getCurrencyListByCondition(currencyManagerRequest).getCurrencyList();
        }
        String currencyId = currencyList.get(0).getCurrencyId();
        //获取群组id
        BpClusterRequest bpClusterRequest = new BpClusterRequest();
        bpClusterRequest.setBpClusterName(request.getGroup());
        List<BpCluster> bpClusterList = bpClusterManager.getBpClusterListByCondition(bpClusterRequest).getBpClusterList();
        if (CollectionUtil.isEmpty(bpClusterList)){
            throw new NullPointerException("未获取到群组");
        }
        String bpClusterId = bpClusterList.get(0).getBpClusterId();
        //内部客户数据转换
        boolean innerCustomer = request.getInnerCustomer() == 1 ? true : false;
        //生成客户信息id
        String customerId = get();
        log.info("生成客户id：【{}】", customerId);
        //新增客户消息
        CustomerManagerRequest customerManagerRequest = CustomerManagerRequest.builder()
                .customerBusinessId(customerId)
                .customerCode(request.getCustomerCode())
                .customerName(request.getSimpleName())
                .customerFullName(request.getAllName())
                .shortcut(request.getShortcut())
                .setupDate(request.getSetUpDate())
                .shutoutDate(request.getShutoutDate())
                .regAddress(request.getRegAddress())
                .remark(request.getRemark())
                .innerCustomer(innerCustomer)
                .principal(request.getPrincipal())
                .capital(request.getCapital())
                .turnover(request.getTurnover())
                .staffs(request.getStaffs())
                .branches(request.getBranches())
                .submitId(submitId)
                .bpClusterId(bpClusterId)
                .generalCurrencyId(currencyId).build();
        int customer = customerManager.save(customerManagerRequest);
        if (customer != 1) {
            log.warn( "时间【{}】，客户id【{}】，客户数据插入失败", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())), customerId);
            throw new TBConcreteException(TBE10ExceptionEnum.INSERT_FAILED);
        }
        //2、新增客户属性表
        List<AttributeVo> attributeList = request.getAttributeList();
        for (AttributeVo attribute : attributeList){
            bpPropertyDMangerRequest = new BpPropertyDMangerRequest();
            bpPropertyDMangerRequest.setPropertyValue(attribute.getCode());
            bpPropertyDMangerRequest.setPropertyValueDesc(attribute.getValue());
            List<BpPropertyD> bpPropertyDList = bpPropertyDManager.getBpPropertyDByCondition(bpPropertyDMangerRequest).getBpPropertyDList();
            if (CollectionUtil.isEmpty(bpPropertyDList)){
                log.info("未获取到属性值信息");
                continue;
            }
            BpPropertyD bpPropertyD = bpPropertyDList.get(0);
            CustomerPropertyRequest customerPropertyRequest = CustomerPropertyRequest.builder()
                    .bpPropertyId(attribute.getId())
                    .customerId(customerId)
                    .customerPropertyId(get())
                    .propertyValue(attribute.getCode())
                    .propertyValueDesc(attribute.getValue())
                    .propertyValueId(bpPropertyD.getBpPropertyDId())
                    .remark(attribute.getRemark())
                    .submitId(submitId)
                    .build();
            int property = customerPropertyManager.save(customerPropertyRequest);
            if (property != 1){
                log.warn( "时间【{}】，客户id【{}】，客户属性信息插入失败", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())), customerId);
                throw new TBConcreteException(TBE10ExceptionEnum.INSERT_FAILED);
            }
        }
        //3、新增客户属性视图表
        CustomerPropertyViewManagerRequest customerPropertyViewManagerRequest = CustomerPropertyViewManagerRequest.builder()
                .customerId(customerId)
                .customerPropertyViewId(get())
                .p5(attributeList.get(0).getCode())
                .p6(attributeList.get(1).getCode())
                .p7(attributeList.get(2).getCode())
                .build();
        int view = customerPropertyViewManager.save(customerPropertyViewManagerRequest);
        if (view != 1){
            log.warn( "时间【{}】，客户id【{}】，客户属性信息视图插入失败", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())), customerId);
            throw new TBConcreteException(TBE10ExceptionEnum.INSERT_FAILED);
        }
        //4、新增客户业务信息表
        CsTaxClassificationManagerRequest csTaxClassificationManagerRequest = new CsTaxClassificationManagerRequest();
        csTaxClassificationManagerRequest.setTaxClassificationCode(request.getTaxSort());
        List<CsTaxClassification> csTaxClassificationList = csTaxClassificationManager.getCsTaxClassificationByCondition(csTaxClassificationManagerRequest).getCsTaxClassificationList();
        if (CollectionUtil.isEmpty(csTaxClassificationList)){
            log.warn("未获取到税分类");
            return null;
        }
        String csTaxClassificationId = csTaxClassificationList.get(0).getCsTaxClassificationId();
        //获取销售域id
        SalesCenterManagerRequest salesCenterManagerRequest = new SalesCenterManagerRequest();
        salesCenterManagerRequest.setSalesCenterCode(request.getCompanyCode());
        List<SalesCenter> salesCenterList = salesCenterManager.getSalesCenterByCondition(salesCenterManagerRequest).getSalesCenterList();
        if (CollectionUtil.isEmpty(csTaxClassificationList)){
            log.warn("未获取到销售域");
            salesCenterManagerRequest.setSalesCenterCode(null);
            salesCenterList = salesCenterManager.getSalesCenterByCondition(salesCenterManagerRequest).getSalesCenterList();
        }
        String salesCenterId = salesCenterList.get(0).getSalesCenterId();
        CustomerSalesManagerRequest customerSalesManagerRequest = CustomerSalesManagerRequest.builder()
                .currencyId(currencyId)
                .customerId(customerId)
                .customerSalesId(get())
                .deptId(null)
                .taxSortId(csTaxClassificationId)
                .userId(submitId)
                .salesAreaId(salesCenterId)
                .build();
        int customerSales = customerSalesManager.save(customerSalesManagerRequest);
        if (customerSales != 1){
            log.warn( "时间【{}】，客户id【{}】，客户业务信息插入失败", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())), customerId);
            throw new TBConcreteException(TBE10ExceptionEnum.INSERT_FAILED);
        }
        //5、新增客户财务信息表
        //获取公司id
        CompanyManagerRequest companyManagerRequest = new CompanyManagerRequest();
        companyManagerRequest.setCompanyName(request.getCompany());
        companyManagerRequest.setCompanyCode(request.getCompanyCode());
        List<Company> companyList = companyManager.getCompanyByCondition(companyManagerRequest).getCompanyList();
        if (CollectionUtil.isEmpty(companyList)){
            log.warn("未获取到公司信息");
            companyManagerRequest.setCompanyName(null);
            companyManagerRequest.setCompanyCode(null);
            companyList = companyManager.getCompanyByCondition(companyManagerRequest).getCompanyList();
        }
        String companyId = companyList.get(0).getCompanyId();
        //获取客户会计分类id
        CustomerFicategoryManagerRequest customerFicategoryManagerRequest = new CustomerFicategoryManagerRequest();
        customerFicategoryManagerRequest.setCustomerFicategoryName(request.getAccountingSort());
        customerFicategoryManagerRequest.setCompanyId(companyId);
        List<CustomerFicategory> customerFicategoryList = customerFicategoryManager.getCustomerFicategoryByCondition(customerFicategoryManagerRequest).getCustomerFicategoryList();
        if (CollectionUtil.isEmpty(customerFicategoryList)){
            log.warn("未获取到客户会计分类");
            customerFicategoryManagerRequest.setCustomerFicategoryName(null);
            customerFicategoryManagerRequest.setCompanyId(null);
            customerFicategoryList = customerFicategoryManager.getCustomerFicategoryByCondition(customerFicategoryManagerRequest).getCustomerFicategoryList();
        }
        String customerFicategoryId = customerFicategoryList.get(0).getCustomerFicategoryId();
        CustomerFiManagerRequest customerFiManagerRequest = CustomerFiManagerRequest.builder()
                .companyId(companyId)
                .currencyId(currencyId)
                .customerFicategoryId(customerFicategoryId)
                .customerFiId(get())
                .customerId(customerId)
                .submitId(submitId)
                .build();
        int customerFi = customerFiManager.save(customerFiManagerRequest);
        if (customerFi != 1){
            log.warn( "时间【{}】，客户id【{}】，客户财务信息插入失败", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())), customerId);
            throw new TBConcreteException(TBE10ExceptionEnum.INSERT_FAILED);
        }
        log.info("时间【{}】，客户id【{}】，客户信息新增完成!", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis())), customerId);
        return customerId;
    }

    @Override
    public String xbbSave(XBBCustomRequest request) {
        UserManagerRequest userManagerRequest = new UserManagerRequest();
        userManagerRequest.setUsername(request.getOwnerId());
        JSONObject userListByCondition = xbbUserManager.getUserListByCondition(userManagerRequest);
        String userId = XBBConfigConstant.USER_ID;
        if (userListByCondition.getInteger("totalCount") > 0){
            Object user = userListByCondition.getJSONArray("userList").get(0);
            userId = (String)getFieldValueByName("userId", user);
        }
        FormManagerRequest formManagerRequest = new FormManagerRequest();
        formManagerRequest.setBusinessType(100);
        formManagerRequest.setSaasMark(1);
        JSONObject formManager = this.formManager.getFormManager(formManagerRequest);
        List<Object> formList = Arrays.asList(formManager.get("formList"));
        String formId = CollectionUtil.isEmpty(formList) ? null : String.valueOf(getFieldValueByName("formId", formList.get(0)));
        CustomRequest customRequest = new CustomRequest();
        customRequest.setText_2(request.getSimpleName());
        customRequest.setText_1(request.getFullName());
        customRequest.setSubForm_1(request.getContactSort());
        customRequest.setNum_5(Integer.valueOf(request.getArea()));
        customRequest.setAddress_1(request.getAddress());
        customRequest.setText_4("持续跟进");
        customRequest.setOwnerId(Arrays.asList(userId));
        CustomManagerRequest customManagerRequest = new CustomManagerRequest();
        customManagerRequest.setUserId(userId);
        customManagerRequest.setFormId(formId);
        customManagerRequest.setRequest(customRequest);
        JSONObject save = customManager.save(customManagerRequest);
        return String.valueOf(save.get("msg"));
    }

    private static String get(){
        return UUID.randomUUID().toString();
    }

    private Object getFieldValueByName(String fieldName, Object o) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = o.getClass().getMethod(getter, new Class[] {});
            Object value = method.invoke(o, new Object[] {});
            return value;
        } catch (Exception e) {
            log.error(e.getMessage(),e);
            return null;
        }
    }
}


