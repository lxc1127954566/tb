package com.tb.service.impl;

import cn.hutool.core.collection.CollectionUtil;
import com.alibaba.fastjson.JSON;
import com.aliyun.dingtalkyida_1_0.models.BatchSaveFormDataResponse;
import com.aliyun.dingtalkyida_1_0.models.SearchFormDataSecondGenerationResponse;
import com.aliyun.dingtalkyida_1_0.models.SearchFormDataSecondGenerationResponseBody;
import com.tb.common.api.CommonHeader;
import com.tb.common.component.RedisService;
import com.tb.common.exception.TBConcreteException;
import com.tb.common.exception.TBE10ExceptionEnum;
import com.tb.domain.e10.request.*;
import com.tb.domain.e10.vo.IQCVo;
import com.tb.interfaceManager.yida.YidaApiService;
import com.tb.manager.*;
import com.tb.mbg.model.*;
import com.tb.service.E10DingTalkService;
import com.tb.domain.yida.dto.HasntA519OrderDto;
import com.tb.domain.yida.dto.InsertQuantityOfShipmentDto;
import com.tb.domain.yida.dto.ProductionOfHasInventoryDto;
import com.tb.domain.yida.request.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * E10 钉钉 数据处理业务层
 *
 * @author linxc
 * @date 2023/11/09
 * */
@Service
public class E10DingTalkServiceImpl implements E10DingTalkService {

    private static final Logger log = LoggerFactory.getLogger(E10DingTalkServiceImpl.class);

    private static final String NOA519SALEORDER_TO_YIDA_FORMINSTIDLIST = "noA519SaleOrderToYida:FormInstIdList";
    private static final String STOCK = "stock:formInstIdList";

    private static final int YEAR = 2023;
    private static final int MONTH = 10;
    private static final int DAY = 1;

    @Autowired
    private YidaApiService yidaApiService;
    @Autowired
    private E10AssociatedQueryManager e10AssociatedQueryService;
    @Autowired
    private RedisService redisService;
    @Autowired
    private PoArrivalInspectionManager poArrivalInspectionManager;
    @Autowired
    private SupplierManager supplierManager;
    @Autowired
    private AdminManager adminManager;
    @Autowired
    private ItemManager itemManager;
    @Autowired
    private EmployeeManager employeeManager;
    @Autowired
    private CompanyManager companyManager;
    @Autowired
    private PurchaseArrivalManager purchaseArrivalManager;
    @Autowired
    private PurchaseArrivalDManager purchaseArrivalDManager;

    @Override
    public List<String> getNoA519SaleOrderToYiDa(){
        CommonHeader header = new CommonHeader();
        header.setHost("oapi.dingtalk.com");
        header.setContentType("application/json");
        List<String> formInstArr = (List<String>) redisService.get(NOA519SALEORDER_TO_YIDA_FORMINSTIDLIST);
        if (!CollectionUtil.isEmpty(formInstArr)){
            DingTalkRequest batchRemoveRequest = new DingTalkRequest();
            BatchRemoveFormRequest batchRemoveFormRequest = new BatchRemoveFormRequest()
                    .setAppType("APP_PH1T78RDMR5CCSCQYXE0")
                    .setAsynchronousExecution(false)
                    .setFormUuid("FORM-XHA66881HLNF3WGRBFVSU6RTUFG33GHPFCJOLC1")
                    .setSystemToken("3T866P61PCNFYOT89WFFE5N0SGXT2F2TECJOLT1")
                    .setUserId("16756439299807099")
                    .setFormInstanceIdList(formInstArr)
                    .setExecuteExpression(false);
            batchRemoveRequest.setHeader(header);
            batchRemoveRequest.setBody(batchRemoveFormRequest);
            yidaApiService.batchRemove(batchRemoveRequest);
            redisService.del(NOA519SALEORDER_TO_YIDA_FORMINSTIDLIST);
        }
        List<HasntA519OrderModel> hastA519OrderList = e10AssociatedQueryService.getHastA519OrderList(initDate());
        List<String> list = new ArrayList<>();
        if (CollectionUtil.isEmpty(hastA519OrderList)){
            return list;
        }
        String[] strings = hastA519OrderList.stream().map(o -> HasntA519OrderDto.builder()
                .textField_lojcj7gc(o.getItemCode())
                .textField_lojcj7gd(o.getItemDescription())
                .textField_lojcj7ge(o.getItemSpecification())
                .build()).map(i -> JSON.toJSONString(i)).toArray(String[]::new);
        for (int i = 0; i < strings.length;) {
            String[] range = Arrays.copyOfRange(strings, i, (i + 50) > strings.length ? strings.length : i + 50);
            i = i + 50;
            BatchSaveFormRequest batchSaveFormRequest = new BatchSaveFormRequest()
                    .setAppType("APP_PH1T78RDMR5CCSCQYXE0")
                    .setAsynchronousExecution(false)
                    .setFormUuid("FORM-XHA66881HLNF3WGRBFVSU6RTUFG33GHPFCJOLC1")
                    .setFormDataJsonList(range)
                    .setNoExecuteExpression(false)
                    .setKeepRunningAfterException(true)
                    .setSystemToken("3T866P61PCNFYOT89WFFE5N0SGXT2F2TECJOLT1")
                    .setUserId("16756439299807099");
            DingTalkRequest batchSaveRequest = new DingTalkRequest();
            batchSaveRequest.setBody(batchSaveFormRequest);
            batchSaveRequest.setHeader(header);
            BatchSaveFormDataResponse batchSaveFormDataResponse = yidaApiService.batchSave(batchSaveRequest);
            list.addAll(batchSaveFormDataResponse.getBody().getResult());
        }
        redisService.set(NOA519SALEORDER_TO_YIDA_FORMINSTIDLIST, list);
        return list;
    }

    @Override
    public void setQuantityOfShipment() {
        List<String> itemNameList = new ArrayList<>();
        CommonHeader header = new CommonHeader();
        header.setHost("oapi.dingtalk.com");
        header.setContentType("application/json");
        SearchFormRequest searchFormRequest = new SearchFormRequest()
                .setFormUuid("FORM-XHA668813BNFUINFDW0OYBRDUM6W334JE0IOLD2")
                .setAppType("APP_M7SVKYATLAL8WYR0PJE6")
                .setSystemToken("4W866G915S48CQLBFCTSK9ZEDCIP3HK2FM9ELKM")
                .setUserId("16756439299807099")
                .setPageNumber(1)
                .setPageSize(100);
        DingTalkRequest request = new DingTalkRequest();
        request.setBody(searchFormRequest);
        request.setHeader(header);
        SearchFormDataSecondGenerationResponse searchFormDataSecondGenerationResponse = yidaApiService.queryAll(request);
        List<SearchFormDataSecondGenerationResponseBody.SearchFormDataSecondGenerationResponseBodyData> data = searchFormDataSecondGenerationResponse.getBody().getData();
        itemNameList.addAll(data.stream().map(i -> (String)i.getFormData().get("textField_loi0elrg")).collect(Collectors.toList()));
        double totalPage = Math.ceil((double) searchFormDataSecondGenerationResponse.getBody().getTotalCount() / 100);
        for (int page = 2; page < totalPage; page++){
            SearchFormRequest searchFormRequest1 = new SearchFormRequest()
                    .setFormUuid("FORM-XHA668813BNFUINFDW0OYBRDUM6W334JE0IOLD2")
                    .setAppType("APP_M7SVKYATLAL8WYR0PJE6")
                    .setSystemToken("4W866G915S48CQLBFCTSK9ZEDCIP3HK2FM9ELKM")
                    .setUserId("16756439299807099")
                    .setPageNumber(page)
                    .setPageSize(100);
            DingTalkRequest request1 = new DingTalkRequest();
            request.setBody(searchFormRequest1);
            request.setHeader(header);
            SearchFormDataSecondGenerationResponse searchFormDataSecondGenerationResponse1 = yidaApiService.queryAll(request1);
            List<SearchFormDataSecondGenerationResponseBody.SearchFormDataSecondGenerationResponseBodyData> data1 = searchFormDataSecondGenerationResponse1.getBody().getData();
            itemNameList.addAll(data1.stream().map(i -> (String)i.getFormData().get("textField_loi0elrg")).collect(Collectors.toList()));
        }
        log.info("获取到的品号列表：【{}】",itemNameList);
        for (String itemName : itemNameList){
            List<QuantityOfShipment> quantityOfShipmentList = e10AssociatedQueryService.getQuantityOfShipment(itemName);
            if (!CollectionUtil.isEmpty(quantityOfShipmentList)){
                QuantityOfShipment quantityOfShipment = new QuantityOfShipment();
                quantityOfShipment.setItemName(quantityOfShipmentList.get(0).getItemName().split("\\(")[0]);
                quantityOfShipment.setBusinessQty(quantityOfShipmentList.stream().mapToLong(QuantityOfShipment::getBusinessQty).sum());
                //插入对象数据
                InsertQuantityOfShipmentDto insertQuantityOfShipmentDto = InsertQuantityOfShipmentDto.builder()
                        .numberField_los9ql60(quantityOfShipment.getBusinessQty())
                        .build();
                //匹配对象数据
                Map<String, Object> condition = new HashMap<>();
                condition.put("key","textField_ksjz52nw");
                condition.put("value",quantityOfShipment.getItemName());
                condition.put("type","TEXT");
                condition.put("operator","like");
                condition.put("componentName","TextField");
                CreateOrUpdateFormRequest createOrUpdateFormRequest = new CreateOrUpdateFormRequest()
                        .setFormDataJson(JSON.toJSONString(insertQuantityOfShipmentDto))
                        .setFormUuid("FORM-XN966G71A9C80YG0FUXCM4MGH1X82VL2FM9ELX9")
                        //并转换成通过json转换成字符串
                        .setSearchCondition(new String[]{JSON.toJSONString(condition)})
                        .setAppType("APP_M7SVKYATLAL8WYR0PJE6")
                        .setSystemToken("4W866G915S48CQLBFCTSK9ZEDCIP3HK2FM9ELKM")
                        .setUserId("16756439299807099");
                DingTalkRequest request1 = new DingTalkRequest();
                request1.setHeader(header);
                request1.setBody(createOrUpdateFormRequest);
                log.info("宜搭插入总出货量数据");
                yidaApiService.insertOrUpdate(request1);
            }
        }
        log.info("宜搭插入总出货量完成！");
    }

    @Override
    public List<String> getProductionOfHasInventoryListToYiDa(ProductionOfHasInventoryDto productionOfHasInventoryDto) {
        String warehouseId = productionOfHasInventoryDto.getWarehouseId();
        CommonHeader header = new CommonHeader();
        header.setHost("oapi.dingtalk.com");
        header.setContentType("application/json");
        List<String> formInstArr = (List<String>) redisService.get(STOCK + ":" + warehouseId);
        if (!CollectionUtil.isEmpty(formInstArr)){
            DingTalkRequest batchRemoveRequest = new DingTalkRequest();
            batchRemoveRequest.setHeader(header);
            batchRemoveRequest.setBody(productionOfHasInventoryDto.getBatchRemoveFormRequest().setFormInstanceIdList(formInstArr));
            yidaApiService.batchRemove(batchRemoveRequest);
            redisService.del(STOCK + ":" + productionOfHasInventoryDto.getWarehouseId());
        }
        List<ProductionOfHasInventory> inventoryList = e10AssociatedQueryService.getProductionOfHasInventoryList(warehouseId);
        List<String> list = new ArrayList<>();
        if (CollectionUtil.isEmpty(inventoryList)){
            return list;
        }
        String[] strings = inventoryList.stream().map(n -> n.setWarehouseId(warehouseId)).map(i ->JSON.toJSONString(i)).toArray(String[]::new);
        for (int i = 0; i < strings.length;){
            String[] range = Arrays.copyOfRange(strings, i, (i + 50) > strings.length ? strings.length : i + 50) ;
            i = i + 50;
            BatchSaveFormRequest batchSaveFormRequest = productionOfHasInventoryDto.getBatchSaveFormRequest();
            batchSaveFormRequest.setFormDataJsonList(range);
            DingTalkRequest batchSaveRequest = new DingTalkRequest();
            batchSaveRequest.setBody(batchSaveFormRequest);
            batchSaveRequest.setHeader(header);
            BatchSaveFormDataResponse batchSaveFormDataResponse = yidaApiService.batchSave(batchSaveRequest);
            list.addAll(batchSaveFormDataResponse.getBody().getResult());
        }
        redisService.set(STOCK + ":" + productionOfHasInventoryDto.getWarehouseId(), list);
        return list;
    }

    @Override
    public List<String> getPurchaseArrivalListToYiDa(Date date) {
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
        CommonHeader header = new CommonHeader();
        header.setHost("oapi.dingtalk.com");
        header.setContentType("application/json");
        List<PurchaseArrivalModel> purchaseArrivalList = e10AssociatedQueryService.getPurchaseArrivalList(date);
        System.out.println(Arrays.deepToString(purchaseArrivalList.toArray()));
        List<String> list = new ArrayList<>();
        if (CollectionUtil.isEmpty(purchaseArrivalList)){
            return list;
        }
        String[] strings = purchaseArrivalList.stream().map(i -> JSON.toJSONString(i)).toArray(String[]::new);
        for (int i = 0; i < strings.length;) {
            String[] range = Arrays.copyOfRange(strings, i, (i + 50) > strings.length ? strings.length : i + 50);
            i = i + 50;
            BatchSaveFormRequest batchSaveFormRequest = new BatchSaveFormRequest()
                    .setAppType("APP_PH1T78RDMR5CCSCQYXE0")
                    .setAsynchronousExecution(false)
                    .setFormUuid("FORM-F8C6CB0D2E134BE09E0A8077C38FE83CUW8I")
                    .setFormDataJsonList(range)
                    .setNoExecuteExpression(false)
                    .setKeepRunningAfterException(true)
                    .setSystemToken("3T866P61PCNFYOT89WFFE5N0SGXT2F2TECJOLT1")
                    .setUserId("16756439299807099");
            DingTalkRequest batchSaveRequest = new DingTalkRequest();
            batchSaveRequest.setBody(batchSaveFormRequest);
            batchSaveRequest.setHeader(header);
            BatchSaveFormDataResponse batchSaveFormDataResponse = yidaApiService.batchSave(batchSaveRequest);
            list.addAll(batchSaveFormDataResponse.getBody().getResult());
        }
        return list;
    }

    @Override
    public List<String> getEngineeringChangeListToYiDa(Date date) {
        CommonHeader header = new CommonHeader();
        header.setHost("oapi.dingtalk.com");
        header.setContentType("application/json");
        List<EngineeringChange> engineeringChangeList = e10AssociatedQueryService.getEngineeringChangeList(date);
        engineeringChangeList.stream().map(i -> {
            i.setBomChange(e10AssociatedQueryService.getEngineeringChangeBOMChangeList(i.getEcnId()));
            return null;
        }).collect(Collectors.toList());
        List<String> list = new ArrayList<>();
        if (CollectionUtil.isEmpty(engineeringChangeList)){
            return list;
        }
        String[] strings = engineeringChangeList.stream().map(i -> JSON.toJSONString(i)).toArray(String[]::new);
        for (int i = 0; i < strings.length;) {
            String[] range = Arrays.copyOfRange(strings, i, (i + 50) > strings.length ? strings.length : i + 50);
            i = i + 50;
            BatchSaveFormRequest batchSaveFormRequest = new BatchSaveFormRequest()
                    .setAppType("APP_PH1T78RDMR5CCSCQYXE0")
                    .setAsynchronousExecution(false)
                    .setFormUuid("FORM-E8525A9214EC4FD382D20BA9BB82E1C1PY87")
                    .setFormDataJsonList(range)
                    .setNoExecuteExpression(false)
                    .setKeepRunningAfterException(true)
                    .setSystemToken("3T866P61PCNFYOT89WFFE5N0SGXT2F2TECJOLT1")
                    .setUserId("16756439299807099");
            DingTalkRequest batchSaveRequest = new DingTalkRequest();
            batchSaveRequest.setBody(batchSaveFormRequest);
            batchSaveRequest.setHeader(header);
            BatchSaveFormDataResponse batchSaveFormDataResponse = yidaApiService.batchSave(batchSaveRequest);
            list.addAll(batchSaveFormDataResponse.getBody().getResult());
        }
        return list;
    }

    @Override
    public List<String> getBomDetailListToYiDa(Date date) {
        CommonHeader header = new CommonHeader();
        header.setHost("oapi.dingtalk.com");
        header.setContentType("application/json");
        List<Bom> newBom = e10AssociatedQueryService.getNewBom(date);
        newBom.stream().map(i -> {
            i.setBomDS(e10AssociatedQueryService.getBomDByBomId(i.getBomId()));
            return null;
        }).collect(Collectors.toList());
        List<String> list = new ArrayList<>();
        if (CollectionUtil.isEmpty(newBom)){
            return list;
        }
        String[] strings = newBom.stream().map(i -> JSON.toJSONString(i)).toArray(String[]::new);
        for (int i = 0; i < strings.length;) {
            String[] range = Arrays.copyOfRange(strings, i, (i + 50) > strings.length ? strings.length : i + 50);
            i = i + 50;
            BatchSaveFormRequest batchSaveFormRequest = new BatchSaveFormRequest()
                    .setAppType("APP_PH1T78RDMR5CCSCQYXE0")
                    .setAsynchronousExecution(false)
                    .setFormUuid("FORM-A16A43B2E5354650AE0CC272623C58DEC7RF")
                    .setFormDataJsonList(range)
                    .setNoExecuteExpression(false)
                    .setKeepRunningAfterException(true)
                    .setSystemToken("3T866P61PCNFYOT89WFFE5N0SGXT2F2TECJOLT1")
                    .setUserId("16756439299807099");
            DingTalkRequest batchSaveRequest = new DingTalkRequest();
            batchSaveRequest.setBody(batchSaveFormRequest);
            batchSaveRequest.setHeader(header);
            BatchSaveFormDataResponse batchSaveFormDataResponse = yidaApiService.batchSave(batchSaveRequest);
            list.addAll(batchSaveFormDataResponse.getBody().getResult());
        }
        return list;
    }

    @Override
    public List<String> getIQCListToYiDa(Date date) {
        //先获取到货检验单相关数据（包括到货检验单与各类子单身）
        //往宜搭中插入到货检验单数据
        List<IQCVo> iqcVos = new ArrayList<>();
        PoArrivalInspectionRequest poArrivalInspectionRequest = new PoArrivalInspectionRequest();
        poArrivalInspectionRequest.setLastModifiedDate(date);
        poArrivalInspectionRequest.setApproveStatus("Y");
        List<PoArrivalInspection> poArrivalInspectionList = poArrivalInspectionManager.getPoArrivalInspectionListByCondition(poArrivalInspectionRequest).getPoArrivalInspectionList();
        if (CollectionUtil.isEmpty(poArrivalInspectionList)){
            return new ArrayList<>();
        }
        for (PoArrivalInspection po : poArrivalInspectionList){
            SupplierManagerRequest supplierManagerRequest = new SupplierManagerRequest();
            supplierManagerRequest.setId(po.getSupplierId());
            List<Supplier> supplierList = supplierManager.getSupplierListByCondition(supplierManagerRequest).getSupplierList();
            if (CollectionUtil.isEmpty(supplierList)){
                throw new TBConcreteException(TBE10ExceptionEnum.NO_DATA_WAS_OBTAINED);
            }
            List<AdminUnit> adminUnitList = adminManager.getAdminUnitListById(po.getSubmitDeptId()).getAdminUnitList();
            if (CollectionUtil.isEmpty(adminUnitList)){
                throw new TBConcreteException(TBE10ExceptionEnum.NO_DATA_WAS_OBTAINED);
            }
            System.out.println(po.getSubmitEmpId());
            EmployeeManagerRequest employeeManagerRequest = new EmployeeManagerRequest();
            employeeManagerRequest.setEmployeeId(po.getSubmitEmpId());
            List<Employee> employeeList = employeeManager.getEmployeeListByCondition(employeeManagerRequest).getEmployeeList();
            if (CollectionUtil.isEmpty(employeeList)){
                throw new TBConcreteException(TBE10ExceptionEnum.NO_DATA_WAS_OBTAINED);
            }
            ItemManagerRequest itemManagerRequest = new ItemManagerRequest();
            itemManagerRequest.setItemId(po.getItemId());
            List<Item> itemList = itemManager.getItemManagerByCondition(itemManagerRequest).getItemList();
            if (CollectionUtil.isEmpty(itemList)){
                throw new TBConcreteException(TBE10ExceptionEnum.NO_DATA_WAS_OBTAINED);
            }
            PurchaseArrivalDManagerRequest purchaseArrivalDManagerRequest = new PurchaseArrivalDManagerRequest();
            purchaseArrivalDManagerRequest.setId(po.getSourceId());
            List<PurchaseArrivalD> purchaseArrivalDList = purchaseArrivalDManager.getPurchaseArrivalDListByCondition(purchaseArrivalDManagerRequest).getPurchaseArrivalDList();
            if (CollectionUtil.isEmpty(purchaseArrivalDList)){
                throw new TBConcreteException(TBE10ExceptionEnum.NO_DATA_WAS_OBTAINED);
            }
            PurchaseArrivalManagerRequest purchaseArrivalManagerRequest = new PurchaseArrivalManagerRequest();
            purchaseArrivalManagerRequest.setId(purchaseArrivalDList.get(0).getPurchaseArrivalId());
            List<PurchaseArrival> purchaseArrivalList = purchaseArrivalManager.getPurchaseArrivalListByCondition(purchaseArrivalManagerRequest).getPurchaseArrivalList();
            if (CollectionUtil.isEmpty(purchaseArrivalList)){
                throw new TBConcreteException(TBE10ExceptionEnum.NO_DATA_WAS_OBTAINED);
            }
            CompanyManagerRequest companyManagerRequest = new CompanyManagerRequest();
            companyManagerRequest.setCompanyId(po.getCompanyId());
            List<Company> companyList = companyManager.getCompanyByCondition(companyManagerRequest).getCompanyList();
            if (CollectionUtil.isEmpty(companyList)){
                throw new TBConcreteException(TBE10ExceptionEnum.NO_DATA_WAS_OBTAINED);
            }
            IQCVo iqcVo = new IQCVo();
            iqcVo.setSupplier(supplierList.get(0).getSupplierName());
            iqcVo.setArrivalListDocNo(purchaseArrivalList.get(0).getDocNo());
            iqcVo.setSubmitForInspectionAdminUnit(adminUnitList.get(0).getAdminUnitName());
            iqcVo.setSubmitForInspectionPerson(employeeList.get(0).getEmployeeName());
            iqcVo.setDocNo(po.getDocNo());
            iqcVo.setDocDate(po.getDocDate());
            iqcVo.setInspectionDate(po.getInspectionDate());
            iqcVo.setItemCode(itemList.get(0).getItemCode());
            iqcVo.setItemName(po.getItemDescription());
            iqcVo.setSpecification(po.getItemSpecification());
            iqcVo.setTotalCount(po.getInspectionQty());
            iqcVo.setQualifiedQuantity(po.getAcceptableQty());
            iqcVo.setRejectedQuantity(po.getUnqualifiedQty());
            iqcVo.setDestroyQuantity(po.getDestroyedQty());
            iqcVo.setResult(po.getDecision());
            iqcVo.setCompany(companyList.get(0).getCompanyName());
            iqcVos.add(iqcVo);
        }
        CommonHeader header = new CommonHeader();
        header.setHost("oapi.dingtalk.com");
        header.setContentType("application/json");
        if (CollectionUtil.isEmpty(iqcVos)){
            return new ArrayList<>();
        }
        List<String> list = new ArrayList<>();
        String[] strings = iqcVos.stream().map(i -> JSON.toJSONString(i)).toArray(String[]::new);
        for (int i = 0; i < strings.length;) {
            String[] range = Arrays.copyOfRange(strings, i, (i + 50) > strings.length ? strings.length : i + 50);
            i = i + 50;
            BatchSaveFormRequest batchSaveFormRequest = new BatchSaveFormRequest()
                    .setAppType("APP_PH1T78RDMR5CCSCQYXE0")
                    .setAsynchronousExecution(false)
                    .setFormUuid("FORM-E441C788C8C1473582A68B66393DC087Y13E")
                    .setFormDataJsonList(range)
                    .setNoExecuteExpression(false)
                    .setKeepRunningAfterException(true)
                    .setSystemToken("3T866P61PCNFYOT89WFFE5N0SGXT2F2TECJOLT1")
                    .setUserId("16756439299807099");
            DingTalkRequest batchSaveRequest = new DingTalkRequest();
            batchSaveRequest.setBody(batchSaveFormRequest);
            batchSaveRequest.setHeader(header);
            BatchSaveFormDataResponse batchSaveFormDataResponse = yidaApiService.batchSave(batchSaveRequest);
            list.addAll(batchSaveFormDataResponse.getBody().getResult());
        }
        return list;
    }

    private Date initDate(){
        Calendar calendar= Calendar.getInstance();
        calendar.set(YEAR, MONTH, DAY);
        return calendar.getTime();
    }
}
