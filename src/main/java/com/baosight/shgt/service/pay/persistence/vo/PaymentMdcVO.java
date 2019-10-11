package com.baosight.shgt.service.pay.persistence.vo;

import java.math.BigDecimal;

public class PaymentMdcVO
{
    private String segNo;
    private Long commandId;
    private String commandNo;
    private String commandBatchNo;
    private String channelCode;
    private String channelDesc;
    private String loanBank;
    private Long applicationId;
    private String payerCode;
    private String payerName;
    private String payerRole;
    private String payeeAccountNo;
    private String payeeAccountOpenOrg;
    private String payeeCode;
    private String payeeName;
    private String finOrgCode;
    private String finOrgName;
    private String payCurrency;
    private BigDecimal exchangeRate;
    private BigDecimal payTotalAmount;
    private BigDecimal rmbTotalAmount;
    private String payType;
    private Long applyDetailId;
    private Long dependNoteId;
    private String dependNoteCode;
    private String dependNoteDcode;
    private String dependDesc;
    private String dependExtraDesc;
    private Integer payQuantity;
    private BigDecimal payWeight;
    private BigDecimal payAmount;
    private BigDecimal distributionAmount;
    private BigDecimal distributeInterest;
    private String dependDNoteDtype;
    private String guaranteeDetail;
    private BigDecimal collectionDetailId;
    private String payeeCodeD;
    private String payeeNameD;
    private Long bankBillId;
    private String bankBillNo;
    private String tempInfo;
    private String commandInfo;
    private String depencyType;
    private BigDecimal counterFee;

    public String getSegNo()
    {
        return this.segNo; }
    public Long getCommandId() { return this.commandId; }
    public String getCommandNo() { return this.commandNo; }
    public String getCommandBatchNo() { return this.commandBatchNo; }
    public String getChannelCode() { return this.channelCode; }
    public String getChannelDesc() { return this.channelDesc; }
    public String getLoanBank() { return this.loanBank; }
    public Long getApplicationId() { return this.applicationId; }
    public String getPayerCode() { return this.payerCode; }
    public String getPayerName() { return this.payerName; }
    public String getPayerRole() { return this.payerRole; }
    public String getPayeeAccountNo() { return this.payeeAccountNo; }
    public String getPayeeAccountOpenOrg() { return this.payeeAccountOpenOrg; }
    public String getPayeeCode() { return this.payeeCode; }
    public String getPayeeName() { return this.payeeName; }
    public String getFinOrgCode() { return this.finOrgCode; }
    public String getFinOrgName() { return this.finOrgName; }
    public String getPayCurrency() { return this.payCurrency; }
    public BigDecimal getExchangeRate() { return this.exchangeRate; }
    public BigDecimal getPayTotalAmount() { return this.payTotalAmount; }
    public BigDecimal getRmbTotalAmount() { return this.rmbTotalAmount; }
    public String getPayType() { return this.payType; }
    public Long getApplyDetailId() {
        return this.applyDetailId; }
    public Long getDependNoteId() { return this.dependNoteId; }
    public String getDependNoteCode() { return this.dependNoteCode; }
    public String getDependNoteDcode() { return this.dependNoteDcode; }
    public String getDependDesc() { return this.dependDesc; }
    public String getDependExtraDesc() { return this.dependExtraDesc; }
    public Integer getPayQuantity() { return this.payQuantity; }
    public BigDecimal getPayWeight() { return this.payWeight; }
    public BigDecimal getPayAmount() { return this.payAmount; }
    public BigDecimal getDistributionAmount() { return this.distributionAmount; }
    public BigDecimal getDistributeInterest() { return this.distributeInterest; }
    public String getDependDNoteDtype() {
        return this.dependDNoteDtype; }
    public String getGuaranteeDetail() { return this.guaranteeDetail; }
    public BigDecimal getCollectionDetailId() { return this.collectionDetailId; }
    public String getPayeeCodeD() {
        return this.payeeCodeD; }
    public String getPayeeNameD() { return this.payeeNameD; }


    public Long getBankBillId()
    {
        return this.bankBillId; }
    public String getBankBillNo() { return this.bankBillNo; }
    public String getTempInfo() {
        return this.tempInfo; }
    public String getCommandInfo() { return this.commandInfo; }
    public String getDepencyType() { return this.depencyType; }
    public BigDecimal getCounterFee() { return this.counterFee; }


    public void setSegNo(String segNo)
    {
        this.segNo = segNo; }
    public void setCommandId(Long commandId) { this.commandId = commandId; }
    public void setCommandNo(String commandNo) { this.commandNo = commandNo; }
    public void setCommandBatchNo(String commandBatchNo) { this.commandBatchNo = commandBatchNo; }
    public void setChannelCode(String channelCode) { this.channelCode = channelCode; }
    public void setChannelDesc(String channelDesc) { this.channelDesc = channelDesc; }
    public void setLoanBank(String loanBank) { this.loanBank = loanBank; }
    public void setApplicationId(Long applicationId) { this.applicationId = applicationId; }
    public void setPayerCode(String payerCode) { this.payerCode = payerCode; }
    public void setPayerName(String payerName) { this.payerName = payerName; }
    public void setPayerRole(String payerRole) { this.payerRole = payerRole; }
    public void setPayeeAccountNo(String payeeAccountNo) { this.payeeAccountNo = payeeAccountNo; }
    public void setPayeeAccountOpenOrg(String payeeAccountOpenOrg) { this.payeeAccountOpenOrg = payeeAccountOpenOrg; }
    public void setPayeeCode(String payeeCode) { this.payeeCode = payeeCode; }
    public void setPayeeName(String payeeName) { this.payeeName = payeeName; }
    public void setFinOrgCode(String finOrgCode) { this.finOrgCode = finOrgCode; }
    public void setFinOrgName(String finOrgName) { this.finOrgName = finOrgName; }
    public void setPayCurrency(String payCurrency) { this.payCurrency = payCurrency; }
    public void setExchangeRate(BigDecimal exchangeRate) { this.exchangeRate = exchangeRate; }
    public void setPayTotalAmount(BigDecimal payTotalAmount) { this.payTotalAmount = payTotalAmount; }
    public void setRmbTotalAmount(BigDecimal rmbTotalAmount) { this.rmbTotalAmount = rmbTotalAmount; }
    public void setPayType(String payType) { this.payType = payType; }
    public void setApplyDetailId(Long applyDetailId) { this.applyDetailId = applyDetailId; }
    public void setDependNoteId(Long dependNoteId) { this.dependNoteId = dependNoteId; }
    public void setDependNoteCode(String dependNoteCode) { this.dependNoteCode = dependNoteCode; }
    public void setDependNoteDcode(String dependNoteDcode) { this.dependNoteDcode = dependNoteDcode; }
    public void setDependDesc(String dependDesc) { this.dependDesc = dependDesc; }
    public void setDependExtraDesc(String dependExtraDesc) { this.dependExtraDesc = dependExtraDesc; }
    public void setPayQuantity(Integer payQuantity) { this.payQuantity = payQuantity; }
    public void setPayWeight(BigDecimal payWeight) { this.payWeight = payWeight; }
    public void setPayAmount(BigDecimal payAmount) { this.payAmount = payAmount; }
    public void setDistributionAmount(BigDecimal distributionAmount) { this.distributionAmount = distributionAmount; }
    public void setDistributeInterest(BigDecimal distributeInterest) { this.distributeInterest = distributeInterest; }
    public void setDependDNoteDtype(String dependDNoteDtype) { this.dependDNoteDtype = dependDNoteDtype; }
    public void setGuaranteeDetail(String guaranteeDetail) { this.guaranteeDetail = guaranteeDetail; }
    public void setCollectionDetailId(BigDecimal collectionDetailId) { this.collectionDetailId = collectionDetailId; }
    public void setPayeeCodeD(String payeeCodeD) { this.payeeCodeD = payeeCodeD; }
    public void setPayeeNameD(String payeeNameD) { this.payeeNameD = payeeNameD; }
    public void setBankBillId(Long bankBillId) { this.bankBillId = bankBillId; }
    public void setBankBillNo(String bankBillNo) { this.bankBillNo = bankBillNo; }
    public void setTempInfo(String tempInfo) { this.tempInfo = tempInfo; }
    public void setCommandInfo(String commandInfo) { this.commandInfo = commandInfo; }
    public void setDepencyType(String depencyType) { this.depencyType = depencyType; }
    public void setCounterFee(BigDecimal counterFee) { this.counterFee = counterFee; }

}