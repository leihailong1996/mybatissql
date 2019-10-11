package com.baosight.shgt.service.support.persistence.entity;

import java.math.BigDecimal;
import java.util.Date;

public class TCsDissent
{
    private Integer id;
    private Integer claimId;
    private String claimType;
    private String dissentType;
    private String dissentName;
    private String dissentLevel;
    private String dissentPosition;
    private BigDecimal dissentWeight;
    private String dissentUsage;
    private String dissentConfirm;
    private String dissentConfirmPerson;
    private Date dissentConfirmDate;
    private String dissentConfirmSegno;
    private String dissentConfirmProvinceCode;
    private String dissentConfirmProvinceName;
    private String dissentConfirmCityCode;
    private String dissentConfirmCityName;
    private String dissentConfirmAreaCode;
    private String dissentConfirmAreaName;
    private String dissentConfirmDetailAddress;
    private String dissentUser;
    private String dissentUserType;
    private String dissentUserMobile;
    private String dissentDescription;
    private String dissentDescriptionPerson;
    private Date dissentDescriptionDate;
    private String dissentDescriptionSegno;
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

    public Integer getClaimId() {
        return this.claimId;
    }

    public void setClaimId(Integer claimId) {
        this.claimId = claimId;
    }

    public String getClaimType() {
        return this.claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = (claimType == null ? null : claimType.trim());
    }

    public String getDissentType() {
        return this.dissentType;
    }

    public void setDissentType(String dissentType) {
        this.dissentType = (dissentType == null ? null : dissentType.trim());
    }

    public String getDissentName() {
        return this.dissentName;
    }

    public void setDissentName(String dissentName) {
        this.dissentName = (dissentName == null ? null : dissentName.trim());
    }

    public String getDissentLevel() {
        return this.dissentLevel;
    }

    public void setDissentLevel(String dissentLevel) {
        this.dissentLevel = (dissentLevel == null ? null : dissentLevel.trim());
    }

    public String getDissentPosition() {
        return this.dissentPosition;
    }

    public void setDissentPosition(String dissentPosition) {
        this.dissentPosition = (dissentPosition == null ? null : dissentPosition.trim());
    }

    public BigDecimal getDissentWeight() {
        return this.dissentWeight;
    }

    public void setDissentWeight(BigDecimal dissentWeight) {
        this.dissentWeight = dissentWeight;
    }

    public String getDissentUsage() {
        return this.dissentUsage;
    }

    public void setDissentUsage(String dissentUsage) {
        this.dissentUsage = (dissentUsage == null ? null : dissentUsage.trim());
    }

    public String getDissentConfirm() {
        return this.dissentConfirm;
    }

    public void setDissentConfirm(String dissentConfirm) {
        this.dissentConfirm = (dissentConfirm == null ? null : dissentConfirm.trim());
    }

    public String getDissentConfirmPerson() {
        return this.dissentConfirmPerson;
    }

    public void setDissentConfirmPerson(String dissentConfirmPerson) {
        this.dissentConfirmPerson = (dissentConfirmPerson == null ? null : dissentConfirmPerson.trim());
    }

    public Date getDissentConfirmDate() {
        return this.dissentConfirmDate;
    }

    public void setDissentConfirmDate(Date dissentConfirmDate) {
        this.dissentConfirmDate = dissentConfirmDate;
    }

    public String getDissentConfirmSegno() {
        return this.dissentConfirmSegno;
    }

    public void setDissentConfirmSegno(String dissentConfirmSegno) {
        this.dissentConfirmSegno = (dissentConfirmSegno == null ? null : dissentConfirmSegno.trim());
    }

    public String getDissentConfirmProvinceCode() {
        return this.dissentConfirmProvinceCode;
    }

    public void setDissentConfirmProvinceCode(String dissentConfirmProvinceCode) {
        this.dissentConfirmProvinceCode = (dissentConfirmProvinceCode == null ? null : dissentConfirmProvinceCode.trim());
    }

    public String getDissentConfirmProvinceName() {
        return this.dissentConfirmProvinceName;
    }

    public void setDissentConfirmProvinceName(String dissentConfirmProvinceName) {
        this.dissentConfirmProvinceName = (dissentConfirmProvinceName == null ? null : dissentConfirmProvinceName.trim());
    }

    public String getDissentConfirmCityCode() {
        return this.dissentConfirmCityCode;
    }

    public void setDissentConfirmCityCode(String dissentConfirmCityCode) {
        this.dissentConfirmCityCode = (dissentConfirmCityCode == null ? null : dissentConfirmCityCode.trim());
    }

    public String getDissentConfirmCityName() {
        return this.dissentConfirmCityName;
    }

    public void setDissentConfirmCityName(String dissentConfirmCityName) {
        this.dissentConfirmCityName = (dissentConfirmCityName == null ? null : dissentConfirmCityName.trim());
    }

    public String getDissentConfirmAreaCode() {
        return this.dissentConfirmAreaCode;
    }

    public void setDissentConfirmAreaCode(String dissentConfirmAreaCode) {
        this.dissentConfirmAreaCode = (dissentConfirmAreaCode == null ? null : dissentConfirmAreaCode.trim());
    }

    public String getDissentConfirmAreaName() {
        return this.dissentConfirmAreaName;
    }

    public void setDissentConfirmAreaName(String dissentConfirmAreaName) {
        this.dissentConfirmAreaName = (dissentConfirmAreaName == null ? null : dissentConfirmAreaName.trim());
    }

    public String getDissentConfirmDetailAddress() {
        return this.dissentConfirmDetailAddress;
    }

    public void setDissentConfirmDetailAddress(String dissentConfirmDetailAddress) {
        this.dissentConfirmDetailAddress = (dissentConfirmDetailAddress == null ? null : dissentConfirmDetailAddress.trim());
    }

    public String getDissentUser() {
        return this.dissentUser;
    }

    public void setDissentUser(String dissentUser) {
        this.dissentUser = (dissentUser == null ? null : dissentUser.trim());
    }

    public String getDissentUserType() {
        return this.dissentUserType;
    }

    public void setDissentUserType(String dissentUserType) {
        this.dissentUserType = (dissentUserType == null ? null : dissentUserType.trim());
    }

    public String getDissentUserMobile() {
        return this.dissentUserMobile;
    }

    public void setDissentUserMobile(String dissentUserMobile) {
        this.dissentUserMobile = (dissentUserMobile == null ? null : dissentUserMobile.trim());
    }

    public String getDissentDescription() {
        return this.dissentDescription;
    }

    public void setDissentDescription(String dissentDescription) {
        this.dissentDescription = (dissentDescription == null ? null : dissentDescription.trim());
    }

    public String getDissentDescriptionPerson() {
        return this.dissentDescriptionPerson;
    }

    public void setDissentDescriptionPerson(String dissentDescriptionPerson) {
        this.dissentDescriptionPerson = (dissentDescriptionPerson == null ? null : dissentDescriptionPerson.trim());
    }

    public Date getDissentDescriptionDate() {
        return this.dissentDescriptionDate;
    }

    public void setDissentDescriptionDate(Date dissentDescriptionDate) {
        this.dissentDescriptionDate = dissentDescriptionDate;
    }

    public String getDissentDescriptionSegno() {
        return this.dissentDescriptionSegno;
    }

    public void setDissentDescriptionSegno(String dissentDescriptionSegno) {
        this.dissentDescriptionSegno = (dissentDescriptionSegno == null ? null : dissentDescriptionSegno.trim());
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