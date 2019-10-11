package com.baosight.shgt.service.support.persistence.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TCsReparations
{
    private Integer id;
    private String reparationsCode;
    private BigDecimal reparationsAmountAt;
    private BigDecimal reparationsAmount;
    private String reparationsComments;
    private String beGetReparationsProtocol;
    private Date dissentDealDate;
    private BigDecimal customerGrade;
    private String reparationsSubmitter;
    private Date reparationsSubmitDate;
    private String reparationsModifier;
    private Date reparationsModifyDate;
    private String reparationsAuditor;
    private Date reparationsAuditDate;
    private Date reparationsUploadDate;
    private Date reparationsProtocolCreateDate;
    private String createPerson;
    private Date createDate;
    private String modiPerson;
    private Date modiDate;
    private Short dateVersion;

    public Integer getId()
    {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReparationsCode() {
        return this.reparationsCode;
    }

    public void setReparationsCode(String reparationsCode) {
        this.reparationsCode = (reparationsCode == null ? null : reparationsCode.trim());
    }

    public BigDecimal getReparationsAmountAt() {
        return this.reparationsAmountAt;
    }

    public void setReparationsAmountAt(BigDecimal reparationsAmountAt) {
        this.reparationsAmountAt = reparationsAmountAt;
    }

    public BigDecimal getReparationsAmount() {
        return this.reparationsAmount;
    }

    public void setReparationsAmount(BigDecimal reparationsAmount) {
        this.reparationsAmount = reparationsAmount;
    }

    public String getReparationsComments() {
        return this.reparationsComments;
    }

    public void setReparationsComments(String reparationsComments) {
        this.reparationsComments = (reparationsComments == null ? null : reparationsComments.trim());
    }

    public String getBeGetReparationsProtocol() {
        return this.beGetReparationsProtocol;
    }

    public void setBeGetReparationsProtocol(String beGetReparationsProtocol) {
        this.beGetReparationsProtocol = (beGetReparationsProtocol == null ? null : beGetReparationsProtocol.trim());
    }

    public Date getDissentDealDate() {
        return this.dissentDealDate;
    }

    public void setDissentDealDate(Date dissentDealDate) {
        this.dissentDealDate = dissentDealDate;
    }

    public BigDecimal getCustomerGrade() {
        return this.customerGrade;
    }

    public void setCustomerGrade(BigDecimal customerGrade) {
        this.customerGrade = customerGrade;
    }

    public String getReparationsSubmitter() {
        return this.reparationsSubmitter;
    }

    public void setReparationsSubmitter(String reparationsSubmitter) {
        this.reparationsSubmitter = (reparationsSubmitter == null ? null : reparationsSubmitter.trim());
    }

    public Date getReparationsSubmitDate() {
        return this.reparationsSubmitDate;
    }

    public void setReparationsSubmitDate(Date reparationsSubmitDate) {
        this.reparationsSubmitDate = reparationsSubmitDate;
    }

    public String getReparationsModifier() {
        return this.reparationsModifier;
    }

    public void setReparationsModifier(String reparationsModifier) {
        this.reparationsModifier = (reparationsModifier == null ? null : reparationsModifier.trim());
    }

    public Date getReparationsModifyDate() {
        return this.reparationsModifyDate;
    }

    public void setReparationsModifyDate(Date reparationsModifyDate) {
        this.reparationsModifyDate = reparationsModifyDate;
    }

    public String getReparationsAuditor() {
        return this.reparationsAuditor;
    }

    public void setReparationsAuditor(String reparationsAuditor) {
        this.reparationsAuditor = (reparationsAuditor == null ? null : reparationsAuditor.trim());
    }

    public Date getReparationsAuditDate() {
        return this.reparationsAuditDate;
    }

    public void setReparationsAuditDate(Date reparationsAuditDate) {
        this.reparationsAuditDate = reparationsAuditDate;
    }

    public Date getReparationsUploadDate() {
        return this.reparationsUploadDate;
    }

    public void setReparationsUploadDate(Date reparationsUploadDate) {
        this.reparationsUploadDate = reparationsUploadDate;
    }

    public Date getReparationsProtocolCreateDate() {
        return this.reparationsProtocolCreateDate;
    }

    public void setReparationsProtocolCreateDate(Date reparationsProtocolCreateDate) {
        this.reparationsProtocolCreateDate = reparationsProtocolCreateDate;
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

    public Short getDateVersion() {
        return this.dateVersion;
    }

    public void setDateVersion(Short dateVersion) {
        this.dateVersion = dateVersion;
    }
}