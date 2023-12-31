package com.tb.interfaceManager.xbb;

import cn.hutool.core.collection.CollectionUtil;
import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tb.common.component.XBBConfigConstant;
import com.tb.common.exception.TBConcreteException;
import com.tb.common.exception.TBE10ExceptionEnum;
import com.tb.domain.e10.request.*;
import com.tb.domain.xbb.request.*;
import com.tb.manager.*;
import com.tb.mbg.model.*;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static org.springframework.util.StringUtils.split;

@SpringBootTest
@Slf4j
public class XBBAndE10SyncTest {

    @Autowired
    private CustomerManager customerManager;
    @Autowired
    private CustomManager customManager;
    @Autowired
    private CustomerSalesManager customerSalesManager;
    @Autowired
    private CustomerAddressManager customerAddressManager;
    @Autowired
    private EmployeeManager employeeManager;
    @Autowired
    private XBBUserManager xbbUserManager;
    @Autowired
    private CustomerPropertyManager customerPropertyManager;
    @Autowired
    private CustomerContactManager customerContactManager;

//    @Test
//    public void testCustomSync(){
//        //获取E10所有客户信息
//        //客户比对查找，确认设置客户
//        //销帮帮客户新增
//        log.info("销帮帮客户新增任务开始！开始时间：【{}】", new SimpleDateFormat().format(new Date(System.currentTimeMillis())));
//        long startTime = System.currentTimeMillis();
//        CustomerManagerRequest customerManagerRequest = CustomerManagerRequest.builder()
//                .build();
//        List<Customer> customerList = customerManager.getCustomerByCondition(customerManagerRequest).getCustomerList();
//        List<Customer> importCustom = new ArrayList<>();
//        List<Customer> noImportCustom = new ArrayList<>();
//        List<Customer> failImportCustom = new ArrayList<>();
//        List<Map<String, Object>> conditions = new ArrayList<>();
//        Map<String, Object> condition = new HashMap<>();
//        condition.put("attr", "text_1");
//        condition.put("symbol", "equal");
//        CustomManagerRequest customManagerRequest = new CustomManagerRequest();
//        customManagerRequest.setFormId("6923243");
//        customManagerRequest.setPage(1);
//        customManagerRequest.setPageSize(10);
//        customManagerRequest.setDel(0);
//        customManagerRequest.setIsPublic(0);
////        Customer c = new Customer();
////        c.setCustomerBusinessId("D1A988B0-B095-4A5F-5096-1993AB47486F");
////        c.setCustomerName("拓普电动车");
////        c.setCustomerFullName("拓普电动车热管理系统（宁波）有限公司");
////        List<Customer> customerList = Arrays.asList(c);
////        Customer customer1 = customerList.stream().filter(i -> StringUtils.equals(i.getCustomerBusinessId(), "7EEB6777-53C1-4716-ABAC-1946DF623E28")).collect(Collectors.toList()).get(0);
//        for (Customer customer1 : customerList){
//            condition.put("value", Arrays.asList(customer1.getCustomerFullName()));
//            conditions.add(condition);
//            customManagerRequest.setIsPublic(0);
//            customManagerRequest.setCondition(conditions);
//            JSONObject customListByConditionNoPublic = customManager.getCustomListByCondition(customManagerRequest);
//            customManagerRequest.setIsPublic(1);
//            JSONObject customListByConditionIsPublic = customManager.getCustomListByCondition(customManagerRequest);
//            conditions.clear();
//            if ((Integer)customListByConditionNoPublic.get("totalCount") > 0){
//                noImportCustom.add(customer1);
//                continue;
//            }
//            if ((Integer)customListByConditionIsPublic.get("totalCount") > 0){
//                noImportCustom.add(customer1);
//                continue;
//            }
//            importCustom.add(customer1);
//        }
//        CustomRequest customRequest = new CustomRequest();
//        for (Customer customer : importCustom){
//            log.info("检索【{}】客户信息！", customer.getCustomerFullName());
//            CustomerSalesManagerRequest customerSalesManagerRequest = CustomerSalesManagerRequest.builder()
//                    .customerId(customer.getCustomerBusinessId())
//                    .salesAreaId("485EB507-5302-4F3B-F08D-18EAE97AA491")
//                    .build();
//            List<CustomerSales> customerSalesList = customerSalesManager.getCustomerSalesListByCondition(customerSalesManagerRequest).getCustomerSalesList();
//            if (CollectionUtil.isEmpty(customerSalesList)){
//                failImportCustom.add(customer);
//                continue;
//            }
//            CustomerAddressManagerRequest customerAddressManagerRequest = new CustomerAddressManagerRequest();
//            customerAddressManagerRequest.setCustomerId(customerSalesList.get(0).getCustomerBusinessId());
//            List<CustomerAddress> customerAddressList = customerAddressManager.getCustomerAddressListByCondition(customerAddressManagerRequest).getCustomerAddressList();
//            AddressRequest addressRequest = new AddressRequest();
//            if (CollectionUtil.isNotEmpty(customerAddressList)){
//                addressRequest.setAddress(customerAddressList.get(0).getAddress());
//            }
//            String userId = XBBConfigConstant.USER_ID;
//            EmployeeManagerRequest employeeManagerRequest = new EmployeeManagerRequest();
//            if (validateUniqueidentifier(customerSalesList.get(0).getOwnerEmp())){
//                employeeManagerRequest.setEmployeeId(customerSalesList.get(0).getOwnerEmp());
//                List<Employee> employeeList = employeeManager.getEmployeeListByCondition(employeeManagerRequest).getEmployeeList();
//                if (CollectionUtil.isEmpty(employeeList)){
//                    throw new TBConcreteException(TBE10ExceptionEnum.NO_DATA_WAS_OBTAINED);
//                }
//                UserManagerRequest userManagerRequest = new UserManagerRequest();
//                userManagerRequest.setUsername(employeeList.get(0).getEmployeeName());
//                JSONObject userListByCondition = xbbUserManager.getUserListByCondition(userManagerRequest);
//                if ((int)userListByCondition.get("totalCount") > 0){
//                    JSONArray userList = (JSONArray) userListByCondition.get("userList");
//                    JSONObject s = (JSONObject) userList.get(0);
//                    userId = (String) s.get("userId");
//                }
//            }
//            CustomerPropertyRequest customerPropertyRequest = CustomerPropertyRequest.builder()
//                    .customerId(customer.getCustomerBusinessId())
//                    .bpPropertyId("30D2FF8C-D26E-464B-E787-18F5D9BFE594")
//                    .build();
//            List<CustomerProperty> customerPropertyList = customerPropertyManager.getCustomerPropertyListByCondition(customerPropertyRequest).getCustomerPropertyList();
//            if (CollectionUtil.isEmpty(customerPropertyList)){
//                throw new TBConcreteException(TBE10ExceptionEnum.NO_DATA_WAS_OBTAINED);
//            }
//            log.info("插入客户：【{}】", customer.getCustomerName());
//            CustomerContactManagerRequest customerContactManagerRequest = new CustomerContactManagerRequest();
//            customerContactManagerRequest.setCustomerId(customerSalesList.get(0).getCustomerBusinessId());
//            List<CustomerContact> customerContactList = customerContactManager.getCustomerContactListByCondition(customerContactManagerRequest).getCustomerContactList();
//            List<ContactRequest> contactRequests = new ArrayList<>();
//            for (CustomerContact customerContact : customerContactList){
//                ContactRequest contactRequest = new ContactRequest();
//                contactRequest.setText_1("工作");
//                contactRequest.setText_2(customerContact.getOfficePhone());
//                contactRequests.add(contactRequest);
//            }
//            contactRequests = contactRequests.stream().filter(i ->!StringUtils.isEmpty(i.getText_2())).filter(distinctByKey(b->b.getText_2())).collect(Collectors.toList());
//            customRequest.setText_2(customer.getCustomerName());
//            customRequest.setText_1(customer.getCustomerFullName());
//            customRequest.setAddress_1(addressRequest);
//            customRequest.setOwnerId(Arrays.asList(userId));
//            customRequest.setNum_5(Integer.valueOf(customerPropertyList.get(0).getPropertyValue()));
//            customRequest.setSubForm_1(contactRequests);
//            customRequest.setText_4("持续跟进");
//            customRequest.setText_16("16756439299807099");
//            customManagerRequest.setRequest(customRequest);
//            customManager.save(customManagerRequest);
//        }
//        log.info("销帮帮客户新增任务完成！时间：【{}】，花费时间：【{}毫秒】", new SimpleDateFormat().format(new Date(System.currentTimeMillis())), (System.currentTimeMillis() - startTime));
//        log.info("销帮帮客户新增任务完成列表【{}】", Arrays.deepToString(importCustom.stream().map(i -> i.getCustomerFullName()).collect(Collectors.toList()).toArray()));
//        log.info("销帮帮客户新增任务失败列表【{}】", Arrays.deepToString(failImportCustom.stream().map(i -> i.getCustomerFullName()).collect(Collectors.toList()).toArray()));
//        log.info("销帮帮客户新增任务无需插入列表【{}】", Arrays.deepToString(noImportCustom.stream().map(i -> i.getCustomerFullName()).collect(Collectors.toList()).toArray()));
//    }

    public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object,Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    public static boolean validateUniqueidentifier(String uuid){
        if (StringUtils.equals(uuid, "00000000-0000-0000-0000-000000000000")){
            return false;
        }
        return true;
    }
}
