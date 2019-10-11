package com.baosight.shgt.service.pay.persistence.vo;

import java.io.Serializable;
import java.math.BigDecimal;

public class PayCommandVO
        implements Serializable
{
    private Long applicationId;
    private Long commandId;
    private String commandNo;
    private String applyStatus;
    private String commandStatus;
    private String payerCode;
    private String payeeCode;
    private Long sysId;
    private BigDecimal payAmount;
    private BigDecimal payInterest;
    private String channelCode;
    private String channelDesc;
    private String[] channelCodeArray;
    private String loanBank;
    private String channelType;
    private Long bankBillId;
    private String bankBillNo;
    private String bankBillDate;
    private String commandInfo;
    private BigDecimal counterFee;
    private String serviceFee;



    public Long getApplicationId()
    {
        return this.applicationId;
    }
    public Long getCommandId() { return this.commandId; }

    public String getCommandNo()
    {
        return this.commandNo;
    }

    public String getApplyStatus()
    {
        return this.applyStatus;
    }

    public String getCommandStatus()
    {
        return this.commandStatus;
    }

    public String getPayerCode()
    {
        return this.payerCode;
    }

    public String getPayeeCode()
    {
        return this.payeeCode;
    }

    public Long getSysId()
    {
        return this.sysId;
    }

    public BigDecimal getPayAmount()
    {
        return this.payAmount;
    }

    public BigDecimal getPayInterest()
    {
        return this.payInterest;
    }

    public String getChannelCode()
    {
        return this.channelCode; }
    public String getChannelDesc() { return this.channelDesc; }
    public String[] getChannelCodeArray() { return this.channelCodeArray; }


    public String getLoanBank()
    {
        return this.loanBank;
    }

    public String getChannelType()
    {
        return this.channelType;
    }

    public Long getBankBillId()
    {
        return this.bankBillId; }
    public String getBankBillNo() { return this.bankBillNo; }
    public String getBankBillDate() { return this.bankBillDate; }


    public String getCommandInfo()
    {
        return this.commandInfo;
    }

    public BigDecimal getCounterFee()
    {
        return this.counterFee;
    }

    public String getServiceFee()
    {
        return this.serviceFee;
    }

    public void setApplicationId(Long applicationId)
    {
        this.applicationId = applicationId; }
    public void setCommandId(Long commandId) { this.commandId = commandId; }
    public void setCommandNo(String commandNo) { this.commandNo = commandNo; }
    public void setApplyStatus(String applyStatus) { this.applyStatus = applyStatus; }
    public void setCommandStatus(String commandStatus) { this.commandStatus = commandStatus; }
    public void setPayerCode(String payerCode) { this.payerCode = payerCode; }
    public void setPayeeCode(String payeeCode) { this.payeeCode = payeeCode; }
    public void setSysId(Long sysId) { this.sysId = sysId; }
    public void setPayAmount(BigDecimal payAmount) { this.payAmount = payAmount; }
    public void setPayInterest(BigDecimal payInterest) { this.payInterest = payInterest; }
    public void setChannelCode(String channelCode) { this.channelCode = channelCode; }
    public void setChannelDesc(String channelDesc) { this.channelDesc = channelDesc; }
    public void setChannelCodeArray(String[] channelCodeArray) { this.channelCodeArray = channelCodeArray; }
    public void setLoanBank(String loanBank) { this.loanBank = loanBank; }
    public void setChannelType(String channelType) { this.channelType = channelType; }
    public void setBankBillId(Long bankBillId) { this.bankBillId = bankBillId; }
    public void setBankBillNo(String bankBillNo) { this.bankBillNo = bankBillNo; }
    public void setBankBillDate(String bankBillDate) { this.bankBillDate = bankBillDate; }
    public void setCommandInfo(String commandInfo) { this.commandInfo = commandInfo; }
    public void setCounterFee(BigDecimal counterFee) { this.counterFee = counterFee; }
    public void setServiceFee(String serviceFee) { this.serviceFee = serviceFee; }

}