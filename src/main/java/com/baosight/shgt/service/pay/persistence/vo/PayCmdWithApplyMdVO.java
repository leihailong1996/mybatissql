package com.baosight.shgt.service.pay.persistence.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class PayCmdWithApplyMdVO
        implements Serializable
{
    private Long applicationId;
    private String segNo;
    private String payerCode;
    private String payerName;
    private String payerUserCode;
    private String payerRole;
    private String payeeOrgCode;
    private String payeeOrgName;
    private String payeeAccountNo;
    private String payeeAccountOpenOrg;
    private String payType;
    private String isMergedPay;
    private String isLoanAllowed;
    private String plannedPayTime;
    private String payCurrency;
    private BigDecimal payTotalAmount;
    private BigDecimal exchangeRate;
    private BigDecimal rmbTotalAmount;
    private String applicant;
    private String applyTime;
    private String approver;
    private String approveTime;
    private String applyStatus;
    private String applyFrom;
    private Long applyDetailId;
    private String depencyType;
    private Long dependNoteId;
    private String dependNoteCode;
    private String dependNoteDcode;
    private String dependDesc;
    private String dependExtraDesc;
    private Integer payQuantity;
    private BigDecimal payWeight;
    private BigDecimal payAmountD;
    private BigDecimal payInterest;
    private String payeeCodeD;
    private String payeeNameD;
    private Long applyDDetailId;
    private Long dependDNoteId;
    private String dependDNoteCode;
    private String dependDNoteDCode;
    private String dependNoteExtra1;
    private String dependNoteExtra2;
    private String dependNoteExtra3;
    private String dependNoteExtra4;
    private String dependNoteExtra5;
    private BigDecimal payQuantityDC;
    private BigDecimal payWeightDC;
    private BigDecimal payAmountDC;
    private BigDecimal payInterestDC;
    private Long commandId;
    private String commandNo;
    private String commandBatchNo;
    private String channelCode;
    private String payCurrencyCmd;
    private BigDecimal exchangeRateCmd;
    private BigDecimal payAmountCmd;
    private BigDecimal rmbAmount;
    private BigDecimal counterFee;
    private String commandStatus;
    private String bookPayFlag;
    private String actualPayDate;
    private String loanBank;
    private String payeeCode;
    private String payeeName;
    private String createDate;
    private String tempInfo;

    public Long getApplicationId()
    {
        return this.applicationId;
    }

    public String getSegNo()
    {
        return this.segNo;
    }

    public String getPayerCode()
    {
        return this.payerCode;
    }

    public String getPayerName()
    {
        return this.payerName;
    }

    public String getPayerUserCode()
    {
        return this.payerUserCode;
    }

    public String getPayerRole()
    {
        return this.payerRole;
    }

    public String getPayeeOrgCode()
    {
        return this.payeeOrgCode;
    }

    public String getPayeeOrgName()
    {
        return this.payeeOrgName;
    }

    public String getPayeeAccountNo()
    {
        return this.payeeAccountNo;
    }

    public String getPayeeAccountOpenOrg()
    {
        return this.payeeAccountOpenOrg;
    }

    public String getPayType()
    {
        return this.payType;
    }

    public String getIsMergedPay()
    {
        return this.isMergedPay;
    }

    public String getIsLoanAllowed()
    {
        return this.isLoanAllowed;
    }

    public String getPlannedPayTime()
    {
        return this.plannedPayTime;
    }

    public String getPayCurrency()
    {
        return this.payCurrency;
    }

    public BigDecimal getPayTotalAmount()
    {
        return this.payTotalAmount;
    }

    public BigDecimal getExchangeRate()
    {
        return this.exchangeRate;
    }

    public BigDecimal getRmbTotalAmount()
    {
        return this.rmbTotalAmount;
    }

    public String getApplicant()
    {
        return this.applicant;
    }

    public String getApplyTime()
    {
        return this.applyTime;
    }

    public String getApprover()
    {
        return this.approver;
    }

    public String getApproveTime()
    {
        return this.approveTime;
    }

    public String getApplyStatus()
    {
        return this.applyStatus;
    }

    public String getApplyFrom()
    {
        return this.applyFrom;
    }

    public Long getApplyDetailId()
    {
        return this.applyDetailId;
    }

    public String getDepencyType()
    {
        return this.depencyType;
    }

    public Long getDependNoteId()
    {
        return this.dependNoteId;
    }

    public String getDependNoteCode()
    {
        return this.dependNoteCode;
    }

    public String getDependNoteDcode()
    {
        return this.dependNoteDcode;
    }

    public String getDependDesc()
    {
        return this.dependDesc;
    }

    public String getDependExtraDesc()
    {
        return this.dependExtraDesc;
    }

    public Integer getPayQuantity()
    {
        return this.payQuantity;
    }

    public BigDecimal getPayWeight()
    {
        return this.payWeight;
    }

    public BigDecimal getPayAmountD()
    {
        return this.payAmountD;
    }

    public BigDecimal getPayInterest()
    {
        return this.payInterest;
    }

    public String getPayeeCodeD()
    {
        return this.payeeCodeD;
    }

    public String getPayeeNameD()
    {
        return this.payeeNameD;
    }

    public Long getApplyDDetailId()
    {
        return this.applyDDetailId; }
    public Long getDependDNoteId() { return this.dependDNoteId; }
    public String getDependDNoteCode() { return this.dependDNoteCode; }
    public String getDependDNoteDCode() { return this.dependDNoteDCode; }
    public String getDependNoteExtra1() { return this.dependNoteExtra1; }
    public String getDependNoteExtra2() { return this.dependNoteExtra2; }
    public String getDependNoteExtra3() { return this.dependNoteExtra3; }
    public String getDependNoteExtra4() { return this.dependNoteExtra4; }
    public String getDependNoteExtra5() { return this.dependNoteExtra5; }
    public BigDecimal getPayQuantityDC() { return this.payQuantityDC; }
    public BigDecimal getPayWeightDC() { return this.payWeightDC; }
    public BigDecimal getPayAmountDC() { return this.payAmountDC; }
    public BigDecimal getPayInterestDC() { return this.payInterestDC; }


    public Long getCommandId()
    {
        return this.commandId;
    }

    public String getCommandNo()
    {
        return this.commandNo;
    }

    public String getCommandBatchNo()
    {
        return this.commandBatchNo;
    }

    public String getChannelCode()
    {
        return this.channelCode;
    }

    public String getPayCurrencyCmd()
    {
        return this.payCurrencyCmd;
    }

    public BigDecimal getExchangeRateCmd()
    {
        return this.exchangeRateCmd;
    }

    public BigDecimal getPayAmountCmd()
    {
        return this.payAmountCmd;
    }

    public BigDecimal getRmbAmount()
    {
        return this.rmbAmount;
    }

    public BigDecimal getCounterFee()
    {
        return this.counterFee;
    }

    public String getCommandStatus()
    {
        return this.commandStatus;
    }

    public String getBookPayFlag()
    {
        return this.bookPayFlag;
    }

    public String getActualPayDate()
    {
        return this.actualPayDate;
    }

    public String getLoanBank()
    {
        return this.loanBank;
    }

    public String getPayeeCode()
    {
        return this.payeeCode;
    }

    public String getPayeeName()
    {
        return this.payeeName;
    }
    public String getCreateDate() { return this.createDate; }
    public String getTempInfo() {
        return this.tempInfo;
    }

    public void setApplicationId(Long applicationId)
    {
        this.applicationId = applicationId; }
    public void setSegNo(String segNo) { this.segNo = segNo; }
    public void setPayerCode(String payerCode) { this.payerCode = payerCode; }
    public void setPayerName(String payerName) { this.payerName = payerName; }
    public void setPayerUserCode(String payerUserCode) { this.payerUserCode = payerUserCode; }
    public void setPayerRole(String payerRole) { this.payerRole = payerRole; }
    public void setPayeeOrgCode(String payeeOrgCode) { this.payeeOrgCode = payeeOrgCode; }
    public void setPayeeOrgName(String payeeOrgName) { this.payeeOrgName = payeeOrgName; }
    public void setPayeeAccountNo(String payeeAccountNo) { this.payeeAccountNo = payeeAccountNo; }
    public void setPayeeAccountOpenOrg(String payeeAccountOpenOrg) { this.payeeAccountOpenOrg = payeeAccountOpenOrg; }
    public void setPayType(String payType) { this.payType = payType; }
    public void setIsMergedPay(String isMergedPay) { this.isMergedPay = isMergedPay; }
    public void setIsLoanAllowed(String isLoanAllowed) { this.isLoanAllowed = isLoanAllowed; }
    public void setPlannedPayTime(String plannedPayTime) { this.plannedPayTime = plannedPayTime; }
    public void setPayCurrency(String payCurrency) { this.payCurrency = payCurrency; }
    public void setPayTotalAmount(BigDecimal payTotalAmount) { this.payTotalAmount = payTotalAmount; }
    public void setExchangeRate(BigDecimal exchangeRate) { this.exchangeRate = exchangeRate; }
    public void setRmbTotalAmount(BigDecimal rmbTotalAmount) { this.rmbTotalAmount = rmbTotalAmount; }
    public void setApplicant(String applicant) { this.applicant = applicant; }
    public void setApplyTime(String applyTime) { this.applyTime = applyTime; }
    public void setApprover(String approver) { this.approver = approver; }
    public void setApproveTime(String approveTime) { this.approveTime = approveTime; }
    public void setApplyStatus(String applyStatus) { this.applyStatus = applyStatus; }
    public void setApplyFrom(String applyFrom) { this.applyFrom = applyFrom; }
    public void setApplyDetailId(Long applyDetailId) { this.applyDetailId = applyDetailId; }
    public void setDepencyType(String depencyType) { this.depencyType = depencyType; }
    public void setDependNoteId(Long dependNoteId) { this.dependNoteId = dependNoteId; }
    public void setDependNoteCode(String dependNoteCode) { this.dependNoteCode = dependNoteCode; }
    public void setDependNoteDcode(String dependNoteDcode) { this.dependNoteDcode = dependNoteDcode; }
    public void setDependDesc(String dependDesc) { this.dependDesc = dependDesc; }
    public void setDependExtraDesc(String dependExtraDesc) { this.dependExtraDesc = dependExtraDesc; }
    public void setPayQuantity(Integer payQuantity) { this.payQuantity = payQuantity; }
    public void setPayWeight(BigDecimal payWeight) { this.payWeight = payWeight; }
    public void setPayAmountD(BigDecimal payAmountD) { this.payAmountD = payAmountD; }
    public void setPayInterest(BigDecimal payInterest) { this.payInterest = payInterest; }
    public void setPayeeCodeD(String payeeCodeD) { this.payeeCodeD = payeeCodeD; }
    public void setPayeeNameD(String payeeNameD) { this.payeeNameD = payeeNameD; }
    public void setApplyDDetailId(Long applyDDetailId) { this.applyDDetailId = applyDDetailId; }
    public void setDependDNoteId(Long dependDNoteId) { this.dependDNoteId = dependDNoteId; }
    public void setDependDNoteCode(String dependDNoteCode) { this.dependDNoteCode = dependDNoteCode; }
    public void setDependDNoteDCode(String dependDNoteDCode) { this.dependDNoteDCode = dependDNoteDCode; }
    public void setDependNoteExtra1(String dependNoteExtra1) { this.dependNoteExtra1 = dependNoteExtra1; }
    public void setDependNoteExtra2(String dependNoteExtra2) { this.dependNoteExtra2 = dependNoteExtra2; }
    public void setDependNoteExtra3(String dependNoteExtra3) { this.dependNoteExtra3 = dependNoteExtra3; }
    public void setDependNoteExtra4(String dependNoteExtra4) { this.dependNoteExtra4 = dependNoteExtra4; }
    public void setDependNoteExtra5(String dependNoteExtra5) { this.dependNoteExtra5 = dependNoteExtra5; }
    public void setPayQuantityDC(BigDecimal payQuantityDC) { this.payQuantityDC = payQuantityDC; }
    public void setPayWeightDC(BigDecimal payWeightDC) { this.payWeightDC = payWeightDC; }
    public void setPayAmountDC(BigDecimal payAmountDC) { this.payAmountDC = payAmountDC; }
    public void setPayInterestDC(BigDecimal payInterestDC) { this.payInterestDC = payInterestDC; }
    public void setCommandId(Long commandId) { this.commandId = commandId; }
    public void setCommandNo(String commandNo) { this.commandNo = commandNo; }
    public void setCommandBatchNo(String commandBatchNo) { this.commandBatchNo = commandBatchNo; }
    public void setChannelCode(String channelCode) { this.channelCode = channelCode; }
    public void setPayCurrencyCmd(String payCurrencyCmd) { this.payCurrencyCmd = payCurrencyCmd; }
    public void setExchangeRateCmd(BigDecimal exchangeRateCmd) { this.exchangeRateCmd = exchangeRateCmd; }
    public void setPayAmountCmd(BigDecimal payAmountCmd) { this.payAmountCmd = payAmountCmd; }
    public void setRmbAmount(BigDecimal rmbAmount) { this.rmbAmount = rmbAmount; }
    public void setCounterFee(BigDecimal counterFee) { this.counterFee = counterFee; }
    public void setCommandStatus(String commandStatus) { this.commandStatus = commandStatus; }
    public void setBookPayFlag(String bookPayFlag) { this.bookPayFlag = bookPayFlag; }
    public void setActualPayDate(String actualPayDate) { this.actualPayDate = actualPayDate; }
    public void setLoanBank(String loanBank) { this.loanBank = loanBank; }
    public void setPayeeCode(String payeeCode) { this.payeeCode = payeeCode; }
    public void setPayeeName(String payeeName) { this.payeeName = payeeName; }
    public void setCreateDate(String createDate) { this.createDate = createDate; }
    public void setTempInfo(String tempInfo) { this.tempInfo = tempInfo; }

}