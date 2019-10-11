package com.baosight.shgt.service.support.persistence.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TCsClaims
{
    private Integer id;
    private String claimCode;
    private String claimBatchCode;
    private String queryType;
    private String claimType;
    private String reparationsMethod;
    private String treatMethod;
    private String status;
    private String buyerCode;
    private String buyerName;
    private String buyerContactName;
    private String buyerContactPhone;
    private String providerCode;
    private String providerName;
    private String providerContactName;
    private String providerContactPhone;
    private Integer orderId;
    private Integer orderDetailId;
    private String orderCode;
    private String orderDetailCode;
    private String orderStatus;
    private Integer packCounts;
    private String invoiceObjectCode;
    private String invoiceObjectName;
    private BigDecimal orderAmount;
    private BigDecimal customerPayAmount;
    private BigDecimal couponDiscountAmount;
    private BigDecimal couponMlsq;
    private BigDecimal taxRate;
    private BigDecimal penaltyAmount;
    private BigDecimal penaltyAmountRate;
    private Integer resourceId;
    private Integer packId;
    private String packCode;
    private String factoryResCode;
    private String resourceType;
    private String packType;
    private String slaType;
    private String productTypeCode;
    private String productTypeName;
    private String shopSign;
    private String spec;
    private String techStandard;
    private String manufactureName;
    private String qualityGrade;
    private BigDecimal weight;
    private String deliveryFlag;
    private String goodsLocationProv;
    private String goodsLocationCity;
    private String goodsLocationArea;
    private String goodsLocationDetail;
    private BigDecimal lessWeight;
    private String invoiceStatus;
    private String beNeedRedInvoice;
    private String beNeedRedLetter;
    private String beReceiveRedLetter;
    private String redLetterAutitStatus;
    private String redLetterAutitMsg;
    private String redLetterNo;
    private Date redLetterRecordDate;
    private Date redInvoiceReceiveDate;
    private String beOriginalProvider;
    private String applicationReason;
    private String applicationReasonConfirm;
    private String applicationNotes;
    private String auditCode;
    private Date auditDate;
    private String auditComments;
    private Date cancleDate;
    private String rejectComments;
    private Integer bggfId;
    private String bggfNum;
    private String batchAttaid;
    private String backupsJson;
    private Date overdueDateBuyer;
    private String beOverdue;
    private Date transferDate;
    private String transferType;
    private String businessType;
    private String claimProposer;
    private Date overdueDate;
    private Integer consulationNumber;
    private String platformInterventionFlag;
    private String beAgent;
    private String distributor;
    private String distributorFlag;
    private BigDecimal perReparationsAt;
    private BigDecimal complaintReparationsAt;
    private String beGoodsBack;
    private String beBuyerReturned;
    private Date confirmBuyerReturnedDate;
    private String selfSupportFlag;
    private String prointsFinishFlag;
    private String goodsFinishFlag;
    private String settlementFinishFlag;
    private String capitalFinishFlag;
    private String beQuickClaim;
    private String quickReason;
    private String providerPenaltyStatus;
    private BigDecimal providerPenaltyAmount;
    private Integer reparationsId;
    private Object jsonCloum;
    private Date createDate;
    private String createPerson;
    private Date modiDate;
    private String modiPerson;
    private Short dateVersion;

    public Integer getId()
    {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClaimCode() {
        return this.claimCode;
    }

    public void setClaimCode(String claimCode) {
        this.claimCode = (claimCode == null ? null : claimCode.trim());
    }

    public String getClaimBatchCode() {
        return this.claimBatchCode;
    }

    public void setClaimBatchCode(String claimBatchCode) {
        this.claimBatchCode = (claimBatchCode == null ? null : claimBatchCode.trim());
    }

    public String getQueryType() {
        return this.queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = (queryType == null ? null : queryType.trim());
    }

    public String getClaimType() {
        return this.claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = (claimType == null ? null : claimType.trim());
    }

    public String getReparationsMethod() {
        return this.reparationsMethod;
    }

    public void setReparationsMethod(String reparationsMethod) {
        this.reparationsMethod = (reparationsMethod == null ? null : reparationsMethod.trim());
    }

    public String getTreatMethod() {
        return this.treatMethod;
    }

    public void setTreatMethod(String treatMethod) {
        this.treatMethod = (treatMethod == null ? null : treatMethod.trim());
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = (status == null ? null : status.trim());
    }

    public String getBuyerCode() {
        return this.buyerCode;
    }

    public void setBuyerCode(String buyerCode) {
        this.buyerCode = (buyerCode == null ? null : buyerCode.trim());
    }

    public String getBuyerName() {
        return this.buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = (buyerName == null ? null : buyerName.trim());
    }

    public String getBuyerContactName() {
        return this.buyerContactName;
    }

    public void setBuyerContactName(String buyerContactName) {
        this.buyerContactName = (buyerContactName == null ? null : buyerContactName.trim());
    }

    public String getBuyerContactPhone() {
        return this.buyerContactPhone;
    }

    public void setBuyerContactPhone(String buyerContactPhone) {
        this.buyerContactPhone = (buyerContactPhone == null ? null : buyerContactPhone.trim());
    }

    public String getProviderCode() {
        return this.providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = (providerCode == null ? null : providerCode.trim());
    }

    public String getProviderName() {
        return this.providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = (providerName == null ? null : providerName.trim());
    }

    public String getProviderContactName() {
        return this.providerContactName;
    }

    public void setProviderContactName(String providerContactName) {
        this.providerContactName = (providerContactName == null ? null : providerContactName.trim());
    }

    public String getProviderContactPhone() {
        return this.providerContactPhone;
    }

    public void setProviderContactPhone(String providerContactPhone) {
        this.providerContactPhone = (providerContactPhone == null ? null : providerContactPhone.trim());
    }

    public Integer getOrderId() {
        return this.orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderDetailId() {
        return this.orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getOrderCode() {
        return this.orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = (orderCode == null ? null : orderCode.trim());
    }

    public String getOrderDetailCode() {
        return this.orderDetailCode;
    }

    public void setOrderDetailCode(String orderDetailCode) {
        this.orderDetailCode = (orderDetailCode == null ? null : orderDetailCode.trim());
    }

    public String getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = (orderStatus == null ? null : orderStatus.trim());
    }

    public Integer getPackCounts() {
        return this.packCounts;
    }

    public void setPackCounts(Integer packCounts) {
        this.packCounts = packCounts;
    }

    public String getInvoiceObjectCode() {
        return this.invoiceObjectCode;
    }

    public void setInvoiceObjectCode(String invoiceObjectCode) {
        this.invoiceObjectCode = (invoiceObjectCode == null ? null : invoiceObjectCode.trim());
    }

    public String getInvoiceObjectName() {
        return this.invoiceObjectName;
    }

    public void setInvoiceObjectName(String invoiceObjectName) {
        this.invoiceObjectName = (invoiceObjectName == null ? null : invoiceObjectName.trim());
    }

    public BigDecimal getOrderAmount() {
        return this.orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getCustomerPayAmount() {
        return this.customerPayAmount;
    }

    public void setCustomerPayAmount(BigDecimal customerPayAmount) {
        this.customerPayAmount = customerPayAmount;
    }

    public BigDecimal getCouponDiscountAmount() {
        return this.couponDiscountAmount;
    }

    public void setCouponDiscountAmount(BigDecimal couponDiscountAmount) {
        this.couponDiscountAmount = couponDiscountAmount;
    }

    public BigDecimal getCouponMlsq() {
        return this.couponMlsq;
    }

    public void setCouponMlsq(BigDecimal couponMlsq) {
        this.couponMlsq = couponMlsq;
    }

    public BigDecimal getTaxRate() {
        return this.taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getPenaltyAmount() {
        return this.penaltyAmount;
    }

    public void setPenaltyAmount(BigDecimal penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    public BigDecimal getPenaltyAmountRate() {
        return this.penaltyAmountRate;
    }

    public void setPenaltyAmountRate(BigDecimal penaltyAmountRate) {
        this.penaltyAmountRate = penaltyAmountRate;
    }

    public Integer getResourceId() {
        return this.resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getPackId() {
        return this.packId;
    }

    public void setPackId(Integer packId) {
        this.packId = packId;
    }

    public String getPackCode() {
        return this.packCode;
    }

    public void setPackCode(String packCode) {
        this.packCode = (packCode == null ? null : packCode.trim());
    }

    public String getFactoryResCode() {
        return this.factoryResCode;
    }

    public void setFactoryResCode(String factoryResCode) {
        this.factoryResCode = (factoryResCode == null ? null : factoryResCode.trim());
    }

    public String getResourceType() {
        return this.resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = (resourceType == null ? null : resourceType.trim());
    }

    public String getPackType() {
        return this.packType;
    }

    public void setPackType(String packType) {
        this.packType = (packType == null ? null : packType.trim());
    }

    public String getSlaType() {
        return this.slaType;
    }

    public void setSlaType(String slaType) {
        this.slaType = (slaType == null ? null : slaType.trim());
    }

    public String getProductTypeCode() {
        return this.productTypeCode;
    }

    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = (productTypeCode == null ? null : productTypeCode.trim());
    }

    public String getProductTypeName() {
        return this.productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = (productTypeName == null ? null : productTypeName.trim());
    }

    public String getShopSign() {
        return this.shopSign;
    }

    public void setShopSign(String shopSign) {
        this.shopSign = (shopSign == null ? null : shopSign.trim());
    }

    public String getSpec() {
        return this.spec;
    }

    public void setSpec(String spec) {
        this.spec = (spec == null ? null : spec.trim());
    }

    public String getTechStandard() {
        return this.techStandard;
    }

    public void setTechStandard(String techStandard) {
        this.techStandard = (techStandard == null ? null : techStandard.trim());
    }

    public String getManufactureName() {
        return this.manufactureName;
    }

    public void setManufactureName(String manufactureName) {
        this.manufactureName = (manufactureName == null ? null : manufactureName.trim());
    }

    public String getQualityGrade() {
        return this.qualityGrade;
    }

    public void setQualityGrade(String qualityGrade) {
        this.qualityGrade = (qualityGrade == null ? null : qualityGrade.trim());
    }

    public BigDecimal getWeight() {
        return this.weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getDeliveryFlag() {
        return this.deliveryFlag;
    }

    public void setDeliveryFlag(String deliveryFlag) {
        this.deliveryFlag = (deliveryFlag == null ? null : deliveryFlag.trim());
    }

    public String getGoodsLocationProv() {
        return this.goodsLocationProv;
    }

    public void setGoodsLocationProv(String goodsLocationProv) {
        this.goodsLocationProv = (goodsLocationProv == null ? null : goodsLocationProv.trim());
    }

    public String getGoodsLocationCity() {
        return this.goodsLocationCity;
    }

    public void setGoodsLocationCity(String goodsLocationCity) {
        this.goodsLocationCity = (goodsLocationCity == null ? null : goodsLocationCity.trim());
    }

    public String getGoodsLocationArea() {
        return this.goodsLocationArea;
    }

    public void setGoodsLocationArea(String goodsLocationArea) {
        this.goodsLocationArea = (goodsLocationArea == null ? null : goodsLocationArea.trim());
    }

    public String getGoodsLocationDetail() {
        return this.goodsLocationDetail;
    }

    public void setGoodsLocationDetail(String goodsLocationDetail) {
        this.goodsLocationDetail = (goodsLocationDetail == null ? null : goodsLocationDetail.trim());
    }

    public BigDecimal getLessWeight() {
        return this.lessWeight;
    }

    public void setLessWeight(BigDecimal lessWeight) {
        this.lessWeight = lessWeight;
    }

    public String getInvoiceStatus() {
        return this.invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = (invoiceStatus == null ? null : invoiceStatus.trim());
    }

    public String getBeNeedRedInvoice() {
        return this.beNeedRedInvoice;
    }

    public void setBeNeedRedInvoice(String beNeedRedInvoice) {
        this.beNeedRedInvoice = (beNeedRedInvoice == null ? null : beNeedRedInvoice.trim());
    }

    public String getBeNeedRedLetter() {
        return this.beNeedRedLetter;
    }

    public void setBeNeedRedLetter(String beNeedRedLetter) {
        this.beNeedRedLetter = (beNeedRedLetter == null ? null : beNeedRedLetter.trim());
    }

    public String getBeReceiveRedLetter() {
        return this.beReceiveRedLetter;
    }

    public void setBeReceiveRedLetter(String beReceiveRedLetter) {
        this.beReceiveRedLetter = (beReceiveRedLetter == null ? null : beReceiveRedLetter.trim());
    }

    public String getRedLetterAutitStatus() {
        return this.redLetterAutitStatus;
    }

    public void setRedLetterAutitStatus(String redLetterAutitStatus) {
        this.redLetterAutitStatus = (redLetterAutitStatus == null ? null : redLetterAutitStatus.trim());
    }

    public String getRedLetterAutitMsg() {
        return this.redLetterAutitMsg;
    }

    public void setRedLetterAutitMsg(String redLetterAutitMsg) {
        this.redLetterAutitMsg = (redLetterAutitMsg == null ? null : redLetterAutitMsg.trim());
    }

    public String getRedLetterNo() {
        return this.redLetterNo;
    }

    public void setRedLetterNo(String redLetterNo) {
        this.redLetterNo = (redLetterNo == null ? null : redLetterNo.trim());
    }

    public Date getRedLetterRecordDate() {
        return this.redLetterRecordDate;
    }

    public void setRedLetterRecordDate(Date redLetterRecordDate) {
        this.redLetterRecordDate = redLetterRecordDate;
    }

    public Date getRedInvoiceReceiveDate() {
        return this.redInvoiceReceiveDate;
    }

    public void setRedInvoiceReceiveDate(Date redInvoiceReceiveDate) {
        this.redInvoiceReceiveDate = redInvoiceReceiveDate;
    }

    public String getBeOriginalProvider() {
        return this.beOriginalProvider;
    }

    public void setBeOriginalProvider(String beOriginalProvider) {
        this.beOriginalProvider = (beOriginalProvider == null ? null : beOriginalProvider.trim());
    }

    public String getApplicationReason() {
        return this.applicationReason;
    }

    public void setApplicationReason(String applicationReason) {
        this.applicationReason = (applicationReason == null ? null : applicationReason.trim());
    }

    public String getApplicationReasonConfirm() {
        return this.applicationReasonConfirm;
    }

    public void setApplicationReasonConfirm(String applicationReasonConfirm) {
        this.applicationReasonConfirm = (applicationReasonConfirm == null ? null : applicationReasonConfirm.trim());
    }

    public String getApplicationNotes() {
        return this.applicationNotes;
    }

    public void setApplicationNotes(String applicationNotes) {
        this.applicationNotes = (applicationNotes == null ? null : applicationNotes.trim());
    }

    public String getAuditCode() {
        return this.auditCode;
    }

    public void setAuditCode(String auditCode) {
        this.auditCode = (auditCode == null ? null : auditCode.trim());
    }

    public Date getAuditDate() {
        return this.auditDate;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public String getAuditComments() {
        return this.auditComments;
    }

    public void setAuditComments(String auditComments) {
        this.auditComments = (auditComments == null ? null : auditComments.trim());
    }

    public Date getCancleDate() {
        return this.cancleDate;
    }

    public void setCancleDate(Date cancleDate) {
        this.cancleDate = cancleDate;
    }

    public String getRejectComments() {
        return this.rejectComments;
    }

    public void setRejectComments(String rejectComments) {
        this.rejectComments = (rejectComments == null ? null : rejectComments.trim());
    }

    public Integer getBggfId() {
        return this.bggfId;
    }

    public void setBggfId(Integer bggfId) {
        this.bggfId = bggfId;
    }

    public String getBggfNum() {
        return this.bggfNum;
    }

    public void setBggfNum(String bggfNum) {
        this.bggfNum = (bggfNum == null ? null : bggfNum.trim());
    }

    public String getBatchAttaid() {
        return this.batchAttaid;
    }

    public void setBatchAttaid(String batchAttaid) {
        this.batchAttaid = (batchAttaid == null ? null : batchAttaid.trim());
    }

    public String getBackupsJson() {
        return this.backupsJson;
    }

    public void setBackupsJson(String backupsJson) {
        this.backupsJson = backupsJson;
    }

    public Date getOverdueDateBuyer() {
        return this.overdueDateBuyer;
    }

    public void setOverdueDateBuyer(Date overdueDateBuyer) {
        this.overdueDateBuyer = overdueDateBuyer;
    }

    public String getBeOverdue() {
        return this.beOverdue;
    }

    public void setBeOverdue(String beOverdue) {
        this.beOverdue = (beOverdue == null ? null : beOverdue.trim());
    }

    public Date getTransferDate() {
        return this.transferDate;
    }

    public void setTransferDate(Date transferDate) {
        this.transferDate = transferDate;
    }

    public String getTransferType() {
        return this.transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = (transferType == null ? null : transferType.trim());
    }

    public String getBusinessType() {
        return this.businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = (businessType == null ? null : businessType.trim());
    }

    public String getClaimProposer() {
        return this.claimProposer;
    }

    public void setClaimProposer(String claimProposer) {
        this.claimProposer = (claimProposer == null ? null : claimProposer.trim());
    }

    public Date getOverdueDate() {
        return this.overdueDate;
    }

    public void setOverdueDate(Date overdueDate) {
        this.overdueDate = overdueDate;
    }

    public Integer getConsulationNumber() {
        return this.consulationNumber;
    }

    public void setConsulationNumber(Integer consulationNumber) {
        this.consulationNumber = consulationNumber;
    }

    public String getPlatformInterventionFlag() {
        return this.platformInterventionFlag;
    }

    public void setPlatformInterventionFlag(String platformInterventionFlag) {
        this.platformInterventionFlag = (platformInterventionFlag == null ? null : platformInterventionFlag.trim());
    }

    public String getBeAgent() {
        return this.beAgent;
    }

    public void setBeAgent(String beAgent) {
        this.beAgent = (beAgent == null ? null : beAgent.trim());
    }

    public String getDistributor() {
        return this.distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = (distributor == null ? null : distributor.trim());
    }

    public String getDistributorFlag() {
        return this.distributorFlag;
    }

    public void setDistributorFlag(String distributorFlag) {
        this.distributorFlag = (distributorFlag == null ? null : distributorFlag.trim());
    }

    public BigDecimal getPerReparationsAt() {
        return this.perReparationsAt;
    }

    public void setPerReparationsAt(BigDecimal perReparationsAt) {
        this.perReparationsAt = perReparationsAt;
    }

    public BigDecimal getComplaintReparationsAt() {
        return this.complaintReparationsAt;
    }

    public void setComplaintReparationsAt(BigDecimal complaintReparationsAt) {
        this.complaintReparationsAt = complaintReparationsAt;
    }

    public String getBeGoodsBack() {
        return this.beGoodsBack;
    }

    public void setBeGoodsBack(String beGoodsBack) {
        this.beGoodsBack = (beGoodsBack == null ? null : beGoodsBack.trim());
    }

    public String getBeBuyerReturned() {
        return this.beBuyerReturned;
    }

    public void setBeBuyerReturned(String beBuyerReturned) {
        this.beBuyerReturned = (beBuyerReturned == null ? null : beBuyerReturned.trim());
    }

    public Date getConfirmBuyerReturnedDate() {
        return this.confirmBuyerReturnedDate;
    }

    public void setConfirmBuyerReturnedDate(Date confirmBuyerReturnedDate) {
        this.confirmBuyerReturnedDate = confirmBuyerReturnedDate;
    }

    public String getSelfSupportFlag() {
        return this.selfSupportFlag;
    }

    public void setSelfSupportFlag(String selfSupportFlag) {
        this.selfSupportFlag = (selfSupportFlag == null ? null : selfSupportFlag.trim());
    }

    public String getProintsFinishFlag() {
        return this.prointsFinishFlag;
    }

    public void setProintsFinishFlag(String prointsFinishFlag) {
        this.prointsFinishFlag = (prointsFinishFlag == null ? null : prointsFinishFlag.trim());
    }

    public String getGoodsFinishFlag() {
        return this.goodsFinishFlag;
    }

    public void setGoodsFinishFlag(String goodsFinishFlag) {
        this.goodsFinishFlag = (goodsFinishFlag == null ? null : goodsFinishFlag.trim());
    }

    public String getSettlementFinishFlag() {
        return this.settlementFinishFlag;
    }

    public void setSettlementFinishFlag(String settlementFinishFlag) {
        this.settlementFinishFlag = (settlementFinishFlag == null ? null : settlementFinishFlag.trim());
    }

    public String getCapitalFinishFlag() {
        return this.capitalFinishFlag;
    }

    public void setCapitalFinishFlag(String capitalFinishFlag) {
        this.capitalFinishFlag = (capitalFinishFlag == null ? null : capitalFinishFlag.trim());
    }

    public String getBeQuickClaim() {
        return this.beQuickClaim;
    }

    public void setBeQuickClaim(String beQuickClaim) {
        this.beQuickClaim = (beQuickClaim == null ? null : beQuickClaim.trim());
    }

    public String getQuickReason() {
        return this.quickReason;
    }

    public void setQuickReason(String quickReason) {
        this.quickReason = (quickReason == null ? null : quickReason.trim());
    }

    public String getProviderPenaltyStatus() {
        return this.providerPenaltyStatus;
    }

    public void setProviderPenaltyStatus(String providerPenaltyStatus) {
        this.providerPenaltyStatus = (providerPenaltyStatus == null ? null : providerPenaltyStatus.trim());
    }

    public BigDecimal getProviderPenaltyAmount() {
        return this.providerPenaltyAmount;
    }

    public void setProviderPenaltyAmount(BigDecimal providerPenaltyAmount) {
        this.providerPenaltyAmount = providerPenaltyAmount;
    }

    public Integer getReparationsId() {
        return this.reparationsId;
    }

    public void setReparationsId(Integer reparationsId) {
        this.reparationsId = reparationsId;
    }

    public Object getJsonCloum() {
        return this.jsonCloum;
    }

    public void setJsonCloum(Object jsonCloum) {
        this.jsonCloum = jsonCloum;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreatePerson() {
        return this.createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = (createPerson == null ? null : createPerson.trim());
    }

    public Date getModiDate() {
        return this.modiDate;
    }

    public void setModiDate(Date modiDate) {
        this.modiDate = modiDate;
    }

    public String getModiPerson() {
        return this.modiPerson;
    }

    public void setModiPerson(String modiPerson) {
        this.modiPerson = (modiPerson == null ? null : modiPerson.trim());
    }

    public Short getDateVersion() {
        return this.dateVersion;
    }

    public void setDateVersion(Short dateVersion) {
        this.dateVersion = dateVersion;
    }
}