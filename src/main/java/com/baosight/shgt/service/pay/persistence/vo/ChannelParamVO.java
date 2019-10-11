package com.baosight.shgt.service.pay.persistence.vo;

import java.io.Serializable;
import javax.validation.constraints.NotNull;

public class ChannelParamVO
        implements Serializable
{
    private String segNo;
    private String payType;

    @NotNull(message="付款客户代码不能为空")
    private String payerCode;
    private String payerName;

    public String getSegNo()
    {
        return this.segNo;
    }

    public String getPayType()
    {
        return this.payType;
    }

    public String getPayerCode()
    {
        return this.payerCode;
    }

    public String getPayerName()
    {
        return this.payerName;
    }

    public void setSegNo(String segNo)
    {
        this.segNo = segNo; }
    public void setPayType(String payType) { this.payType = payType; }
    public void setPayerCode(String payerCode) { this.payerCode = payerCode; }
    public void setPayerName(String payerName) { this.payerName = payerName; }

}