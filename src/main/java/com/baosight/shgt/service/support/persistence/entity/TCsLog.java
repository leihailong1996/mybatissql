package com.baosight.shgt.service.support.persistence.entity;

import java.util.Date;

public class TCsLog
{
    private Integer id;
    private String claimCode;
    private String logType;
    private String logName;
    private String innerLogInfo;
    private String buyerNextInfo;
    private String providerNextInfo;
    private Short nextStepDays;
    private String isDisabled;
    private String createRole;
    private String createPerson;
    private Date createDate;
    private String modiPerson;
    private Date modiDate;

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

    public String getLogType() {
        return this.logType;
    }

    public void setLogType(String logType) {
        this.logType = (logType == null ? null : logType.trim());
    }

    public String getLogName() {
        return this.logName;
    }

    public void setLogName(String logName) {
        this.logName = (logName == null ? null : logName.trim());
    }

    public String getInnerLogInfo() {
        return this.innerLogInfo;
    }

    public void setInnerLogInfo(String innerLogInfo) {
        this.innerLogInfo = (innerLogInfo == null ? null : innerLogInfo.trim());
    }

    public String getBuyerNextInfo() {
        return this.buyerNextInfo;
    }

    public void setBuyerNextInfo(String buyerNextInfo) {
        this.buyerNextInfo = (buyerNextInfo == null ? null : buyerNextInfo.trim());
    }

    public String getProviderNextInfo() {
        return this.providerNextInfo;
    }

    public void setProviderNextInfo(String providerNextInfo) {
        this.providerNextInfo = (providerNextInfo == null ? null : providerNextInfo.trim());
    }

    public Short getNextStepDays() {
        return this.nextStepDays;
    }

    public void setNextStepDays(Short nextStepDays) {
        this.nextStepDays = nextStepDays;
    }

    public String getIsDisabled() {
        return this.isDisabled;
    }

    public void setIsDisabled(String isDisabled) {
        this.isDisabled = (isDisabled == null ? null : isDisabled.trim());
    }

    public String getCreateRole() {
        return this.createRole;
    }

    public void setCreateRole(String createRole) {
        this.createRole = (createRole == null ? null : createRole.trim());
    }

    public String getCreatePerson() {
        return this.createPerson;
    }

    public void setCreatePerson(String createPerson) {
        this.createPerson = (createPerson == null ? null : createPerson.trim());
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getModiPerson() {
        return this.modiPerson;
    }

    public void setModiPerson(String modiPerson) {
        this.modiPerson = (modiPerson == null ? null : modiPerson.trim());
    }

    public Date getModiDate() {
        return this.modiDate;
    }

    public void setModiDate(Date modiDate) {
        this.modiDate = modiDate;
    }
}