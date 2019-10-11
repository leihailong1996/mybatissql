package com.baosight.shgt.service.pay.persistence.entity;

import java.io.Serializable;
import java.util.Date;

public class PayApplyRevoke
        implements Serializable
{
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String payerCode;
    private String payeeCode;
    private String segNo;
    private String payType;
    private Date recodeTime;

    public Integer getId()
    {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayerCode() {
        return this.payerCode;
    }

    public void setPayerCode(String payerCode) {
        this.payerCode = (payerCode == null ? null : payerCode.trim());
    }

    public String getPayeeCode() {
        return this.payeeCode;
    }

    public void setPayeeCode(String payeeCode) {
        this.payeeCode = (payeeCode == null ? null : payeeCode.trim());
    }

    public String getSegNo() {
        return this.segNo;
    }

    public void setSegNo(String segNo) {
        this.segNo = (segNo == null ? null : segNo.trim());
    }

    public String getPayType() {
        return this.payType;
    }

    public void setPayType(String payType) {
        this.payType = (payType == null ? null : payType.trim());
    }

    public Date getRecodeTime() {
        return this.recodeTime;
    }

    public void setRecodeTime(Date recodeTime) {
        this.recodeTime = recodeTime;
    }
}