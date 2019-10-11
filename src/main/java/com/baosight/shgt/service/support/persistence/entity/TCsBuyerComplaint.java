package com.baosight.shgt.service.support.persistence.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TCsBuyerComplaint
        implements Serializable
{
    private static final long serialVersionUID = 1L;
    private Long buyerComplaintId;
    private String complaintCode;
    private String siteCode;
    private String orderId;
    private String orderCode;
    private Long orderPackId;
    private Long orderDetailId;
    private String orderDetailCode;
    private Long resourceId;
    private String packCode;
    private String factoryResCode;
    private String resourceType;
    private String packType;
    private String productTypeCode;
    private String productTypeName;
    private String shopSign;
    private String spec;
    private String techStandard;
    private String weight;
    private String weightUnit;
    private String deliveryFlag;
    private String orderAmount;
    private String customerPayAmount;
    private String couponDiscountAmount;
    private String invoiceFlag;
    private String redInvoiceFlag;
    private String invoiceObjectCode;
    private String invoiceObjectName;
    private String actDeliveryWeight;
    private String lessWeight;
    private String complaintReasonType;
    private String buyerContactName;
    private String buyerContactPhone;
    private String provinceCode;
    private String provinceName;
    private String cityCode;
    private String cityName;
    private String countyCode;
    private String countyName;
    private String actLocation;
    private String complaintContent;
    private String complaintDate;
    private String buyerCode;
    private String buyerName;
    private String providerCode;
    private String providerName;
    private String complaintStatus;
    private String complaintCancleDate;
    private String complaintAuditorCode;
    private String complaintAuditDate;
    private String complaintAuditReason;
    private String receptionDate;
    private String appellateBatchCode;
    private Long buyerReparationsId;
    private String buyerReparationsCode;
    private Long providerReparationsId;
    private String providerReparationsCode;
    private String isOriginalProvider;
    private String originalProviderCode;
    private String originalProviderName;
    private Long complaintBggfId;
    private String orderStatus;
    private String packNums;
    private String warehouseCode;
    private String batchAppealAttaid;
    private String warehouseName;
    private String providerContact;
    private String providerContactPhone;
    private String penaltyAmt;
    private String penaltyAmtRate;
    private String slaType;
    private String queryType;
    private String rejectCntent;
    private String returnContent;
    private String isSmsRemind;
    private String finalUser;
    private String finalUserContactWay;
    private String payCouponDiscountStatus;
    private String dealPenaltyStatus;
    private String dealPenaltyAmount;
    private String bgOrderNum;
    private String perReparationsAt;
    private String couponMlsq;
    private String stockFlag;
    private String complaintReparationsAt;
    private String isGetRedLetter;
    private String redLetterNo;
    private String redLetterNoDate;
    private String redInvoiceDate;
    private String complaintIsPay;
    private String complaintIsPayDate;
    private String complaintReturnedGoods;
    private String sendReturnedGoodsDate;
    private String complaintGoodsIsback;
    private String complaintGoodsIsbackDate;
    private String payCouponAmount;
    private String importFlag;
    private String qualityGrade;
    private String manufactureName;
    private String platformInvoiceFrom;
    private String platformInvoiceFromName;
    private String createDate;
    private String createPerson;
    private String modiPerson;
    private String modiDate;
    private String quickClaim;
    private String quickReason;
    private List<Long> buyerComplaintIdList;
    private List<Long> orderDetailIdList;
    private String queryStatusList;
    private String checkOrderPackIdIsNull;
    private TCsBuyerComplaintExpandInfo expandInfo;
    private String auditStatus;
    private String reparationsMethod;
    private  String allotCode;
    private  String allotDate;
    private  String acceptCode;
    private  String acceptDate;
    private  String agentTag;
    private  String branchStatus;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAllotCode() {
        return allotCode;
    }

    public void setAllotCode(String allotCode) {
        this.allotCode = allotCode;
    }

    public String getAllotDate() {
        return allotDate;
    }

    public void setAllotDate(String allotDate) {
        this.allotDate = allotDate;
    }

    public String getAcceptCode() {
        return acceptCode;
    }

    public void setAcceptCode(String acceptCode) {
        this.acceptCode = acceptCode;
    }

    public String getAcceptDate() {
        return acceptDate;
    }

    public void setAcceptDate(String acceptDate) {
        this.acceptDate = acceptDate;
    }

    public String getAgentTag() {
        return agentTag;
    }

    public void setAgentTag(String agentTag) {
        this.agentTag = agentTag;
    }

    public String getBranchStatus() {
        return branchStatus;
    }

    public void setBranchStatus(String branchStatus) {
        this.branchStatus = branchStatus;
    }

    public Map<String, Object> toHashMap()
    {
        Map map = new HashMap();
        map.put("buyerComplaintId", this.buyerComplaintId);
        map.put("complaintCode", this.complaintCode);
        map.put("siteCode", this.siteCode);
        map.put("orderId", this.orderId);
        map.put("orderCode", this.orderCode);
        map.put("orderPackId", this.orderPackId);
        map.put("orderDetailId", this.orderDetailId);
        map.put("orderDetailCode", this.orderDetailCode);
        map.put("resourceId", this.resourceId);
        map.put("packCode", this.packCode);
        map.put("factoryResCode", this.factoryResCode);
        map.put("resourceType", this.resourceType);
        map.put("packType", this.packType);
        map.put("productTypeCode", this.productTypeCode);
        map.put("productTypeName", this.productTypeName);
        map.put("shopSign", this.shopSign);
        map.put("spec", this.spec);
        map.put("techStandard", this.techStandard);
        map.put("weight", this.weight);
        map.put("weightUnit", this.weightUnit);
        map.put("deliveryFlag", this.deliveryFlag);
        map.put("orderAmount", this.orderAmount);
        map.put("customerPayAmount", this.customerPayAmount);
        map.put("couponDiscountAmount", this.couponDiscountAmount);
        map.put("invoiceFlag", this.invoiceFlag);
        map.put("redInvoiceFlag", this.redInvoiceFlag);
        map.put("invoiceObjectCode", this.invoiceObjectCode);
        map.put("invoiceObjectName", this.invoiceObjectName);
        map.put("actDeliveryWeight", this.actDeliveryWeight);
        map.put("lessWeight", this.lessWeight);
        map.put("complaintReasonType", this.complaintReasonType);
        map.put("buyerContactName", this.buyerContactName);
        map.put("buyerContactPhone", this.buyerContactPhone);
        map.put("provinceCode", this.provinceCode);
        map.put("provinceName", this.provinceName);
        map.put("cityCode", this.cityCode);
        map.put("cityName", this.cityName);
        map.put("countyCode", this.countyCode);
        map.put("countyName", this.countyName);
        map.put("actLocation", this.actLocation);
        map.put("complaintContent", this.complaintContent);
        map.put("complaintDate", this.complaintDate);
        map.put("buyerCode", this.buyerCode);
        map.put("buyerName", this.buyerName);
        map.put("providerCode", this.providerCode);
        map.put("providerName", this.providerName);
        map.put("complaintStatus", this.complaintStatus);
        map.put("complaintCancleDate", this.complaintCancleDate);
        map.put("complaintAuditorCode", this.complaintAuditorCode);
        map.put("complaintAuditDate", this.complaintAuditDate);
        map.put("complaintAuditReason", this.complaintAuditReason);
        map.put("receptionDate", this.receptionDate);
        map.put("appellateBatchCode", this.appellateBatchCode);
        map.put("buyerReparationsId", this.buyerReparationsId);
        map.put("buyerReparationsCode", this.buyerReparationsCode);
        map.put("providerReparationsId", this.providerReparationsId);
        map.put("providerReparationsCode", this.providerReparationsCode);
        map.put("isOriginalProvider", this.isOriginalProvider);
        map.put("originalProviderCode", this.originalProviderCode);
        map.put("originalProviderName", this.originalProviderName);
        map.put("complaintBggfId", this.complaintBggfId);
        map.put("orderStatus", this.orderStatus);
        map.put("packNums", this.packNums);
        map.put("warehouseCode", this.warehouseCode);
        map.put("batchAppealAttaid", this.batchAppealAttaid);
        map.put("warehouseName", this.warehouseName);
        map.put("providerContact", this.providerContact);
        map.put("providerContactPhone", this.providerContactPhone);
        map.put("penaltyAmt", this.penaltyAmt);
        map.put("penaltyAmtRate", this.penaltyAmtRate);
        map.put("slaType", this.slaType);
        map.put("queryType", this.queryType);
        map.put("rejectCntent", this.rejectCntent);
        map.put("returnContent", this.returnContent);
        map.put("isSmsRemind", this.isSmsRemind);
        map.put("finalUser", this.finalUser);
        map.put("finalUserContactWay", this.finalUserContactWay);
        map.put("payCouponDiscountStatus", this.payCouponDiscountStatus);
        map.put("dealPenaltyStatus", this.dealPenaltyStatus);
        map.put("dealPenaltyAmount", this.dealPenaltyAmount);
        map.put("bgOrderNum", this.bgOrderNum);
        map.put("perReparationsAt", this.perReparationsAt);
        map.put("complaintReparationsAt", this.complaintReparationsAt);
        map.put("isGetRedLetter", this.isGetRedLetter);
        map.put("redLetterNo", this.redLetterNo);
        map.put("redLetterNoDate", this.redLetterNoDate);
        map.put("redInvoiceDate", this.redInvoiceDate);
        map.put("complaintIsPay", this.complaintIsPay);
        map.put("complaintIsPayDate", this.complaintIsPayDate);
        map.put("complaintReturnedGoods", this.complaintReturnedGoods);
        map.put("sendReturnedGoodsDate", this.sendReturnedGoodsDate);
        map.put("complaintGoodsIsback", this.complaintGoodsIsback);
        map.put("complaintGoodsIsbackDate", this.complaintGoodsIsbackDate);
        map.put("payCouponAmount", this.payCouponAmount);
        map.put("stockFlag", this.stockFlag);
        map.put("manufactureName", this.manufactureName);
        map.put("platformInvoiceFrom", this.platformInvoiceFrom);
        map.put("platformInvoiceFromName", this.platformInvoiceFromName);
        map.put("importFlag", this.importFlag);
        map.put("qualityGrade", this.qualityGrade);
        map.put("createDate", this.createDate);
        map.put("createPerson", this.createPerson);
        map.put("modiPerson", this.modiPerson);
        map.put("modiDate", this.modiDate);
        map.put("quickClaim", this.quickClaim);
        map.put("quickReason", this.quickReason);
        map.put("buyerComplaintIdList", this.buyerComplaintIdList);
        map.put("orderDetailIdList", this.orderDetailIdList);
        map.put("queryStatusList", this.queryStatusList);
        map.put("checkOrderPackIdIsNull", this.checkOrderPackIdIsNull);
        map.put("auditStatus", this.auditStatus);
        map.put("reparationsMethod", this.reparationsMethod);
        return map;
    }

    public void setBuyerComplaintId(Long buyerComplaintId)
    {
        this.buyerComplaintId = buyerComplaintId; }
    public void setComplaintCode(String complaintCode) { this.complaintCode = complaintCode; }
    public void setSiteCode(String siteCode) { this.siteCode = siteCode; }
    public void setOrderId(String orderId) { this.orderId = orderId; }
    public void setOrderCode(String orderCode) { this.orderCode = orderCode; }
    public void setOrderPackId(Long orderPackId) { this.orderPackId = orderPackId; }
    public void setOrderDetailId(Long orderDetailId) { this.orderDetailId = orderDetailId; }
    public void setOrderDetailCode(String orderDetailCode) { this.orderDetailCode = orderDetailCode; }
    public void setResourceId(Long resourceId) { this.resourceId = resourceId; }
    public void setPackCode(String packCode) { this.packCode = packCode; }
    public void setFactoryResCode(String factoryResCode) { this.factoryResCode = factoryResCode; }
    public void setResourceType(String resourceType) { this.resourceType = resourceType; }
    public void setPackType(String packType) { this.packType = packType; }
    public void setProductTypeCode(String productTypeCode) { this.productTypeCode = productTypeCode; }
    public void setProductTypeName(String productTypeName) { this.productTypeName = productTypeName; }
    public void setShopSign(String shopSign) { this.shopSign = shopSign; }
    public void setSpec(String spec) { this.spec = spec; }
    public void setTechStandard(String techStandard) { this.techStandard = techStandard; }
    public void setWeight(String weight) { this.weight = weight; }
    public void setWeightUnit(String weightUnit) { this.weightUnit = weightUnit; }
    public void setDeliveryFlag(String deliveryFlag) { this.deliveryFlag = deliveryFlag; }
    public void setOrderAmount(String orderAmount) { this.orderAmount = orderAmount; }
    public void setCustomerPayAmount(String customerPayAmount) { this.customerPayAmount = customerPayAmount; }
    public void setCouponDiscountAmount(String couponDiscountAmount) { this.couponDiscountAmount = couponDiscountAmount; }
    public void setInvoiceFlag(String invoiceFlag) { this.invoiceFlag = invoiceFlag; }
    public void setRedInvoiceFlag(String redInvoiceFlag) { this.redInvoiceFlag = redInvoiceFlag; }
    public void setInvoiceObjectCode(String invoiceObjectCode) { this.invoiceObjectCode = invoiceObjectCode; }
    public void setInvoiceObjectName(String invoiceObjectName) { this.invoiceObjectName = invoiceObjectName; }
    public void setActDeliveryWeight(String actDeliveryWeight) { this.actDeliveryWeight = actDeliveryWeight; }
    public void setLessWeight(String lessWeight) { this.lessWeight = lessWeight; }
    public void setComplaintReasonType(String complaintReasonType) { this.complaintReasonType = complaintReasonType; }
    public void setBuyerContactName(String buyerContactName) { this.buyerContactName = buyerContactName; }
    public void setBuyerContactPhone(String buyerContactPhone) { this.buyerContactPhone = buyerContactPhone; }
    public void setProvinceCode(String provinceCode) { this.provinceCode = provinceCode; }
    public void setProvinceName(String provinceName) { this.provinceName = provinceName; }
    public void setCityCode(String cityCode) { this.cityCode = cityCode; }
    public void setCityName(String cityName) { this.cityName = cityName; }
    public void setCountyCode(String countyCode) { this.countyCode = countyCode; }
    public void setCountyName(String countyName) { this.countyName = countyName; }
    public void setActLocation(String actLocation) { this.actLocation = actLocation; }
    public void setComplaintContent(String complaintContent) { this.complaintContent = complaintContent; }
    public void setComplaintDate(String complaintDate) { this.complaintDate = complaintDate; }
    public void setBuyerCode(String buyerCode) { this.buyerCode = buyerCode; }
    public void setBuyerName(String buyerName) { this.buyerName = buyerName; }
    public void setProviderCode(String providerCode) { this.providerCode = providerCode; }
    public void setProviderName(String providerName) { this.providerName = providerName; }
    public void setComplaintStatus(String complaintStatus) { this.complaintStatus = complaintStatus; }
    public void setComplaintCancleDate(String complaintCancleDate) { this.complaintCancleDate = complaintCancleDate; }
    public void setComplaintAuditorCode(String complaintAuditorCode) { this.complaintAuditorCode = complaintAuditorCode; }
    public void setComplaintAuditDate(String complaintAuditDate) { this.complaintAuditDate = complaintAuditDate; }
    public void setComplaintAuditReason(String complaintAuditReason) { this.complaintAuditReason = complaintAuditReason; }
    public void setReceptionDate(String receptionDate) { this.receptionDate = receptionDate; }
    public void setAppellateBatchCode(String appellateBatchCode) { this.appellateBatchCode = appellateBatchCode; }
    public void setBuyerReparationsId(Long buyerReparationsId) { this.buyerReparationsId = buyerReparationsId; }
    public void setBuyerReparationsCode(String buyerReparationsCode) { this.buyerReparationsCode = buyerReparationsCode; }
    public void setProviderReparationsId(Long providerReparationsId) { this.providerReparationsId = providerReparationsId; }
    public void setProviderReparationsCode(String providerReparationsCode) { this.providerReparationsCode = providerReparationsCode; }
    public void setIsOriginalProvider(String isOriginalProvider) { this.isOriginalProvider = isOriginalProvider; }
    public void setOriginalProviderCode(String originalProviderCode) { this.originalProviderCode = originalProviderCode; }
    public void setOriginalProviderName(String originalProviderName) { this.originalProviderName = originalProviderName; }
    public void setComplaintBggfId(Long complaintBggfId) { this.complaintBggfId = complaintBggfId; }
    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }
    public void setPackNums(String packNums) { this.packNums = packNums; }
    public void setWarehouseCode(String warehouseCode) { this.warehouseCode = warehouseCode; }
    public void setBatchAppealAttaid(String batchAppealAttaid) { this.batchAppealAttaid = batchAppealAttaid; }
    public void setWarehouseName(String warehouseName) { this.warehouseName = warehouseName; }
    public void setProviderContact(String providerContact) { this.providerContact = providerContact; }
    public void setProviderContactPhone(String providerContactPhone) { this.providerContactPhone = providerContactPhone; }
    public void setPenaltyAmt(String penaltyAmt) { this.penaltyAmt = penaltyAmt; }
    public void setPenaltyAmtRate(String penaltyAmtRate) { this.penaltyAmtRate = penaltyAmtRate; }
    public void setSlaType(String slaType) { this.slaType = slaType; }
    public void setQueryType(String queryType) { this.queryType = queryType; }
    public void setRejectCntent(String rejectCntent) { this.rejectCntent = rejectCntent; }
    public void setReturnContent(String returnContent) { this.returnContent = returnContent; }
    public void setIsSmsRemind(String isSmsRemind) { this.isSmsRemind = isSmsRemind; }
    public void setFinalUser(String finalUser) { this.finalUser = finalUser; }
    public void setFinalUserContactWay(String finalUserContactWay) { this.finalUserContactWay = finalUserContactWay; }
    public void setPayCouponDiscountStatus(String payCouponDiscountStatus) { this.payCouponDiscountStatus = payCouponDiscountStatus; }
    public void setDealPenaltyStatus(String dealPenaltyStatus) { this.dealPenaltyStatus = dealPenaltyStatus; }
    public void setDealPenaltyAmount(String dealPenaltyAmount) { this.dealPenaltyAmount = dealPenaltyAmount; }
    public void setBgOrderNum(String bgOrderNum) { this.bgOrderNum = bgOrderNum; }
    public void setPerReparationsAt(String perReparationsAt) { this.perReparationsAt = perReparationsAt; }
    public void setCouponMlsq(String couponMlsq) { this.couponMlsq = couponMlsq; }
    public void setStockFlag(String stockFlag) { this.stockFlag = stockFlag; }
    public void setComplaintReparationsAt(String complaintReparationsAt) { this.complaintReparationsAt = complaintReparationsAt; }
    public void setIsGetRedLetter(String isGetRedLetter) { this.isGetRedLetter = isGetRedLetter; }
    public void setRedLetterNo(String redLetterNo) { this.redLetterNo = redLetterNo; }
    public void setRedLetterNoDate(String redLetterNoDate) { this.redLetterNoDate = redLetterNoDate; }
    public void setRedInvoiceDate(String redInvoiceDate) { this.redInvoiceDate = redInvoiceDate; }
    public void setComplaintIsPay(String complaintIsPay) { this.complaintIsPay = complaintIsPay; }
    public void setComplaintIsPayDate(String complaintIsPayDate) { this.complaintIsPayDate = complaintIsPayDate; }
    public void setComplaintReturnedGoods(String complaintReturnedGoods) { this.complaintReturnedGoods = complaintReturnedGoods; }
    public void setSendReturnedGoodsDate(String sendReturnedGoodsDate) { this.sendReturnedGoodsDate = sendReturnedGoodsDate; }
    public void setComplaintGoodsIsback(String complaintGoodsIsback) { this.complaintGoodsIsback = complaintGoodsIsback; }
    public void setComplaintGoodsIsbackDate(String complaintGoodsIsbackDate) { this.complaintGoodsIsbackDate = complaintGoodsIsbackDate; }
    public void setPayCouponAmount(String payCouponAmount) { this.payCouponAmount = payCouponAmount; }
    public void setImportFlag(String importFlag) { this.importFlag = importFlag; }
    public void setQualityGrade(String qualityGrade) { this.qualityGrade = qualityGrade; }
    public void setManufactureName(String manufactureName) { this.manufactureName = manufactureName; }
    public void setPlatformInvoiceFrom(String platformInvoiceFrom) { this.platformInvoiceFrom = platformInvoiceFrom; }
    public void setPlatformInvoiceFromName(String platformInvoiceFromName) { this.platformInvoiceFromName = platformInvoiceFromName; }
    public void setCreateDate(String createDate) { this.createDate = createDate; }
    public void setCreatePerson(String createPerson) { this.createPerson = createPerson; }
    public void setModiPerson(String modiPerson) { this.modiPerson = modiPerson; }
    public void setModiDate(String modiDate) { this.modiDate = modiDate; }
    public void setQuickClaim(String quickClaim) { this.quickClaim = quickClaim; }
    public void setQuickReason(String quickReason) { this.quickReason = quickReason; }
    public void setBuyerComplaintIdList(List<Long> buyerComplaintIdList) { this.buyerComplaintIdList = buyerComplaintIdList; }
    public void setOrderDetailIdList(List<Long> orderDetailIdList) { this.orderDetailIdList = orderDetailIdList; }
    public void setQueryStatusList(String queryStatusList) { this.queryStatusList = queryStatusList; }
    public void setCheckOrderPackIdIsNull(String checkOrderPackIdIsNull) { this.checkOrderPackIdIsNull = checkOrderPackIdIsNull; }
    public void setExpandInfo(TCsBuyerComplaintExpandInfo expandInfo) { this.expandInfo = expandInfo; }
    public void setAuditStatus(String auditStatus) { this.auditStatus = auditStatus; }
    public void setReparationsMethod(String reparationsMethod) { this.reparationsMethod = reparationsMethod; }


    public Long getBuyerComplaintId()
    {
        return this.buyerComplaintId;
    }

    public String getComplaintCode() {
        return this.complaintCode;
    }

    public String getSiteCode() {
        return this.siteCode;
    }

    public String getOrderId() {
        return this.orderId;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public Long getOrderPackId() {
        return this.orderPackId;
    }

    public Long getOrderDetailId() {
        return this.orderDetailId;
    }

    public String getOrderDetailCode() {
        return this.orderDetailCode;
    }

    public Long getResourceId() {
        return this.resourceId;
    }

    public String getPackCode() {
        return this.packCode;
    }

    public String getFactoryResCode() {
        return this.factoryResCode;
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public String getPackType() {
        return this.packType;
    }

    public String getProductTypeCode() {
        return this.productTypeCode;
    }

    public String getProductTypeName() {
        return this.productTypeName;
    }

    public String getShopSign() {
        return this.shopSign;
    }

    public String getSpec() {
        return this.spec;
    }

    public String getTechStandard() {
        return this.techStandard;
    }

    public String getWeight() {
        return this.weight;
    }

    public String getWeightUnit() {
        return this.weightUnit;
    }

    public String getDeliveryFlag() {
        return this.deliveryFlag;
    }

    public String getOrderAmount() {
        return this.orderAmount;
    }

    public String getCustomerPayAmount() {
        return this.customerPayAmount;
    }

    public String getCouponDiscountAmount() {
        return this.couponDiscountAmount;
    }

    public String getInvoiceFlag() {
        return this.invoiceFlag;
    }

    public String getRedInvoiceFlag() {
        return this.redInvoiceFlag;
    }

    public String getInvoiceObjectCode() {
        return this.invoiceObjectCode;
    }

    public String getInvoiceObjectName() {
        return this.invoiceObjectName;
    }

    public String getActDeliveryWeight() {
        return this.actDeliveryWeight;
    }

    public String getLessWeight() {
        return this.lessWeight;
    }

    public String getComplaintReasonType() {
        return this.complaintReasonType;
    }

    public String getBuyerContactName() {
        return this.buyerContactName;
    }

    public String getBuyerContactPhone() {
        return this.buyerContactPhone;
    }

    public String getProvinceCode() {
        return this.provinceCode;
    }

    public String getProvinceName() {
        return this.provinceName;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public String getCityName() {
        return this.cityName;
    }

    public String getCountyCode() {
        return this.countyCode;
    }

    public String getCountyName() {
        return this.countyName;
    }

    public String getActLocation() {
        return this.actLocation;
    }

    public String getComplaintContent() {
        return this.complaintContent;
    }

    public String getComplaintDate() {
        return this.complaintDate;
    }

    public String getBuyerCode() {
        return this.buyerCode;
    }

    public String getBuyerName() {
        return this.buyerName;
    }

    public String getProviderCode() {
        return this.providerCode;
    }

    public String getProviderName() {
        return this.providerName;
    }

    public String getComplaintStatus() {
        return this.complaintStatus;
    }

    public String getComplaintCancleDate() {
        return this.complaintCancleDate;
    }

    public String getComplaintAuditorCode() {
        return this.complaintAuditorCode;
    }

    public String getComplaintAuditDate() {
        return this.complaintAuditDate;
    }

    public String getComplaintAuditReason() {
        return this.complaintAuditReason;
    }

    public String getReceptionDate() {
        return this.receptionDate;
    }

    public String getAppellateBatchCode() {
        return this.appellateBatchCode;
    }

    public Long getBuyerReparationsId() {
        return this.buyerReparationsId;
    }

    public String getBuyerReparationsCode() {
        return this.buyerReparationsCode;
    }

    public Long getProviderReparationsId() {
        return this.providerReparationsId;
    }

    public String getProviderReparationsCode() {
        return this.providerReparationsCode;
    }

    public String getIsOriginalProvider() {
        return this.isOriginalProvider;
    }

    public String getOriginalProviderCode() {
        return this.originalProviderCode;
    }

    public String getOriginalProviderName() {
        return this.originalProviderName;
    }

    public Long getComplaintBggfId() {
        return this.complaintBggfId;
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public String getPackNums() {
        return this.packNums;
    }

    public String getWarehouseCode() {
        return this.warehouseCode;
    }

    public String getBatchAppealAttaid() {
        return this.batchAppealAttaid;
    }

    public String getWarehouseName() {
        return this.warehouseName;
    }

    public String getProviderContact() {
        return this.providerContact;
    }

    public String getProviderContactPhone() {
        return this.providerContactPhone;
    }

    public String getPenaltyAmt() {
        return this.penaltyAmt;
    }

    public String getPenaltyAmtRate() {
        return this.penaltyAmtRate;
    }

    public String getSlaType() {
        return this.slaType;
    }

    public String getQueryType() {
        return this.queryType;
    }

    public String getRejectCntent() {
        return this.rejectCntent;
    }

    public String getReturnContent() {
        return this.returnContent;
    }

    public String getIsSmsRemind() {
        return this.isSmsRemind;
    }

    public String getFinalUser() {
        return this.finalUser;
    }

    public String getFinalUserContactWay() {
        return this.finalUserContactWay;
    }

    public String getPayCouponDiscountStatus() {
        return this.payCouponDiscountStatus;
    }

    public String getDealPenaltyStatus() {
        return this.dealPenaltyStatus;
    }

    public String getDealPenaltyAmount() {
        return this.dealPenaltyAmount;
    }

    public String getBgOrderNum() {
        return this.bgOrderNum;
    }

    public String getPerReparationsAt() {
        return this.perReparationsAt;
    }

    public String getCouponMlsq() {
        return this.couponMlsq;
    }
    public String getStockFlag() { return this.stockFlag; }

    public String getComplaintReparationsAt()
    {
        return this.complaintReparationsAt;
    }

    public String getIsGetRedLetter() {
        return this.isGetRedLetter;
    }

    public String getRedLetterNo() {
        return this.redLetterNo;
    }

    public String getRedLetterNoDate() {
        return this.redLetterNoDate;
    }

    public String getRedInvoiceDate() {
        return this.redInvoiceDate;
    }

    public String getComplaintIsPay() {
        return this.complaintIsPay;
    }

    public String getComplaintIsPayDate() {
        return this.complaintIsPayDate;
    }

    public String getComplaintReturnedGoods() {
        return this.complaintReturnedGoods;
    }

    public String getSendReturnedGoodsDate() {
        return this.sendReturnedGoodsDate;
    }

    public String getComplaintGoodsIsback() {
        return this.complaintGoodsIsback;
    }

    public String getComplaintGoodsIsbackDate() {
        return this.complaintGoodsIsbackDate;
    }

    public String getPayCouponAmount() {
        return this.payCouponAmount;
    }

    public String getImportFlag() {
        return this.importFlag;
    }
    public String getQualityGrade() { return this.qualityGrade; }
    public String getManufactureName() {
        return this.manufactureName;
    }
    public String getPlatformInvoiceFrom() { return this.platformInvoiceFrom; }
    public String getPlatformInvoiceFromName() {
        return this.platformInvoiceFromName;
    }

    public String getCreateDate() {
        return this.createDate;
    }

    public String getCreatePerson() {
        return this.createPerson;
    }

    public String getModiPerson() {
        return this.modiPerson;
    }

    public String getModiDate() {
        return this.modiDate;
    }

    public String getQuickClaim() {
        return this.quickClaim;
    }

    public String getQuickReason()
    {
        return this.quickReason;
    }
    public List<Long> getBuyerComplaintIdList() { return this.buyerComplaintIdList; }
    public List<Long> getOrderDetailIdList() {
        return this.orderDetailIdList;
    }

    public String getQueryStatusList()
    {
        return this.queryStatusList;
    }
    public String getCheckOrderPackIdIsNull() { return this.checkOrderPackIdIsNull; }
    public TCsBuyerComplaintExpandInfo getExpandInfo() {
        return this.expandInfo;
    }

    public String getAuditStatus()
    {
        return this.auditStatus;
    }
    public String getReparationsMethod() { return this.reparationsMethod; }

}