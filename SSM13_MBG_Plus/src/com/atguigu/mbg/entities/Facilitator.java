package com.atguigu.mbg.entities;

import java.util.Date;

public class Facilitator {
    private String facId;

    private String facContactsName;

    private String facContactsPhone;

    private String facVerifyCode;

    private Byte facJoint;

    private String facJointPhone;

    private String facRecommendCode;

    private String facMyselfCode;

    private Byte facType;

    private Byte facLicenseType;

    private String facLicensePictureUrl;

    private String facCountryName;

    private String facLicenseCode;

    private String facLicenseProvince;

    private String facLicenseCity;

    private String facLicenseDistrict;

    private String facLicenseAddress;

    private Date facCreateTime;

    private Date facStartTime;

    private Date facEndTime;

    private Double facRegisteredAssets;

    private String facBusinessScope;

    private Byte facCertificateType;

    private String facCertificatePictureUrl;

    private String facLegalName;

    private String facCertificateCode;

    private Date facCertificateStartTime;

    private Date facCertificateEndTime;

    private String facCompanyProvince;

    private String facCompanyCity;

    private String facCompanyDistrict;

    private String facCompanyAddress;

    private String facCompanyPhone;

    private String facEmergencyName;

    private String facEmergencyPhone;

    private String facOrganizationCode;

    private Date facOrganizationStartTime;

    private Date facOrganizationEndTime;

    private String facBankName;

    private String facAccountUrl;

    private String facAccountNumber;

    private Byte facStrategy;

    private String parentFacId;

    private Date createTime;

    private String facReserved1;

    private String facReserved2;

    private String facReserved3;

    public String getFacId() {
        return facId;
    }

    public void setFacId(String facId) {
        this.facId = facId == null ? null : facId.trim();
    }

    public String getFacContactsName() {
        return facContactsName;
    }

    public void setFacContactsName(String facContactsName) {
        this.facContactsName = facContactsName == null ? null : facContactsName.trim();
    }

    public String getFacContactsPhone() {
        return facContactsPhone;
    }

    public void setFacContactsPhone(String facContactsPhone) {
        this.facContactsPhone = facContactsPhone == null ? null : facContactsPhone.trim();
    }

    public String getFacVerifyCode() {
        return facVerifyCode;
    }

    public void setFacVerifyCode(String facVerifyCode) {
        this.facVerifyCode = facVerifyCode == null ? null : facVerifyCode.trim();
    }

    public Byte getFacJoint() {
        return facJoint;
    }

    public void setFacJoint(Byte facJoint) {
        this.facJoint = facJoint;
    }

    public String getFacJointPhone() {
        return facJointPhone;
    }

    public void setFacJointPhone(String facJointPhone) {
        this.facJointPhone = facJointPhone == null ? null : facJointPhone.trim();
    }

    public String getFacRecommendCode() {
        return facRecommendCode;
    }

    public void setFacRecommendCode(String facRecommendCode) {
        this.facRecommendCode = facRecommendCode == null ? null : facRecommendCode.trim();
    }

    public String getFacMyselfCode() {
        return facMyselfCode;
    }

    public void setFacMyselfCode(String facMyselfCode) {
        this.facMyselfCode = facMyselfCode == null ? null : facMyselfCode.trim();
    }

    public Byte getFacType() {
        return facType;
    }

    public void setFacType(Byte facType) {
        this.facType = facType;
    }

    public Byte getFacLicenseType() {
        return facLicenseType;
    }

    public void setFacLicenseType(Byte facLicenseType) {
        this.facLicenseType = facLicenseType;
    }

    public String getFacLicensePictureUrl() {
        return facLicensePictureUrl;
    }

    public void setFacLicensePictureUrl(String facLicensePictureUrl) {
        this.facLicensePictureUrl = facLicensePictureUrl == null ? null : facLicensePictureUrl.trim();
    }

    public String getFacCountryName() {
        return facCountryName;
    }

    public void setFacCountryName(String facCountryName) {
        this.facCountryName = facCountryName == null ? null : facCountryName.trim();
    }

    public String getFacLicenseCode() {
        return facLicenseCode;
    }

    public void setFacLicenseCode(String facLicenseCode) {
        this.facLicenseCode = facLicenseCode == null ? null : facLicenseCode.trim();
    }

    public String getFacLicenseProvince() {
        return facLicenseProvince;
    }

    public void setFacLicenseProvince(String facLicenseProvince) {
        this.facLicenseProvince = facLicenseProvince == null ? null : facLicenseProvince.trim();
    }

    public String getFacLicenseCity() {
        return facLicenseCity;
    }

    public void setFacLicenseCity(String facLicenseCity) {
        this.facLicenseCity = facLicenseCity == null ? null : facLicenseCity.trim();
    }

    public String getFacLicenseDistrict() {
        return facLicenseDistrict;
    }

    public void setFacLicenseDistrict(String facLicenseDistrict) {
        this.facLicenseDistrict = facLicenseDistrict == null ? null : facLicenseDistrict.trim();
    }

    public String getFacLicenseAddress() {
        return facLicenseAddress;
    }

    public void setFacLicenseAddress(String facLicenseAddress) {
        this.facLicenseAddress = facLicenseAddress == null ? null : facLicenseAddress.trim();
    }

    public Date getFacCreateTime() {
        return facCreateTime;
    }

    public void setFacCreateTime(Date facCreateTime) {
        this.facCreateTime = facCreateTime;
    }

    public Date getFacStartTime() {
        return facStartTime;
    }

    public void setFacStartTime(Date facStartTime) {
        this.facStartTime = facStartTime;
    }

    public Date getFacEndTime() {
        return facEndTime;
    }

    public void setFacEndTime(Date facEndTime) {
        this.facEndTime = facEndTime;
    }

    public Double getFacRegisteredAssets() {
        return facRegisteredAssets;
    }

    public void setFacRegisteredAssets(Double facRegisteredAssets) {
        this.facRegisteredAssets = facRegisteredAssets;
    }

    public String getFacBusinessScope() {
        return facBusinessScope;
    }

    public void setFacBusinessScope(String facBusinessScope) {
        this.facBusinessScope = facBusinessScope == null ? null : facBusinessScope.trim();
    }

    public Byte getFacCertificateType() {
        return facCertificateType;
    }

    public void setFacCertificateType(Byte facCertificateType) {
        this.facCertificateType = facCertificateType;
    }

    public String getFacCertificatePictureUrl() {
        return facCertificatePictureUrl;
    }

    public void setFacCertificatePictureUrl(String facCertificatePictureUrl) {
        this.facCertificatePictureUrl = facCertificatePictureUrl == null ? null : facCertificatePictureUrl.trim();
    }

    public String getFacLegalName() {
        return facLegalName;
    }

    public void setFacLegalName(String facLegalName) {
        this.facLegalName = facLegalName == null ? null : facLegalName.trim();
    }

    public String getFacCertificateCode() {
        return facCertificateCode;
    }

    public void setFacCertificateCode(String facCertificateCode) {
        this.facCertificateCode = facCertificateCode == null ? null : facCertificateCode.trim();
    }

    public Date getFacCertificateStartTime() {
        return facCertificateStartTime;
    }

    public void setFacCertificateStartTime(Date facCertificateStartTime) {
        this.facCertificateStartTime = facCertificateStartTime;
    }

    public Date getFacCertificateEndTime() {
        return facCertificateEndTime;
    }

    public void setFacCertificateEndTime(Date facCertificateEndTime) {
        this.facCertificateEndTime = facCertificateEndTime;
    }

    public String getFacCompanyProvince() {
        return facCompanyProvince;
    }

    public void setFacCompanyProvince(String facCompanyProvince) {
        this.facCompanyProvince = facCompanyProvince == null ? null : facCompanyProvince.trim();
    }

    public String getFacCompanyCity() {
        return facCompanyCity;
    }

    public void setFacCompanyCity(String facCompanyCity) {
        this.facCompanyCity = facCompanyCity == null ? null : facCompanyCity.trim();
    }

    public String getFacCompanyDistrict() {
        return facCompanyDistrict;
    }

    public void setFacCompanyDistrict(String facCompanyDistrict) {
        this.facCompanyDistrict = facCompanyDistrict == null ? null : facCompanyDistrict.trim();
    }

    public String getFacCompanyAddress() {
        return facCompanyAddress;
    }

    public void setFacCompanyAddress(String facCompanyAddress) {
        this.facCompanyAddress = facCompanyAddress == null ? null : facCompanyAddress.trim();
    }

    public String getFacCompanyPhone() {
        return facCompanyPhone;
    }

    public void setFacCompanyPhone(String facCompanyPhone) {
        this.facCompanyPhone = facCompanyPhone == null ? null : facCompanyPhone.trim();
    }

    public String getFacEmergencyName() {
        return facEmergencyName;
    }

    public void setFacEmergencyName(String facEmergencyName) {
        this.facEmergencyName = facEmergencyName == null ? null : facEmergencyName.trim();
    }

    public String getFacEmergencyPhone() {
        return facEmergencyPhone;
    }

    public void setFacEmergencyPhone(String facEmergencyPhone) {
        this.facEmergencyPhone = facEmergencyPhone == null ? null : facEmergencyPhone.trim();
    }

    public String getFacOrganizationCode() {
        return facOrganizationCode;
    }

    public void setFacOrganizationCode(String facOrganizationCode) {
        this.facOrganizationCode = facOrganizationCode == null ? null : facOrganizationCode.trim();
    }

    public Date getFacOrganizationStartTime() {
        return facOrganizationStartTime;
    }

    public void setFacOrganizationStartTime(Date facOrganizationStartTime) {
        this.facOrganizationStartTime = facOrganizationStartTime;
    }

    public Date getFacOrganizationEndTime() {
        return facOrganizationEndTime;
    }

    public void setFacOrganizationEndTime(Date facOrganizationEndTime) {
        this.facOrganizationEndTime = facOrganizationEndTime;
    }

    public String getFacBankName() {
        return facBankName;
    }

    public void setFacBankName(String facBankName) {
        this.facBankName = facBankName == null ? null : facBankName.trim();
    }

    public String getFacAccountUrl() {
        return facAccountUrl;
    }

    public void setFacAccountUrl(String facAccountUrl) {
        this.facAccountUrl = facAccountUrl == null ? null : facAccountUrl.trim();
    }

    public String getFacAccountNumber() {
        return facAccountNumber;
    }

    public void setFacAccountNumber(String facAccountNumber) {
        this.facAccountNumber = facAccountNumber == null ? null : facAccountNumber.trim();
    }

    public Byte getFacStrategy() {
        return facStrategy;
    }

    public void setFacStrategy(Byte facStrategy) {
        this.facStrategy = facStrategy;
    }

    public String getParentFacId() {
        return parentFacId;
    }

    public void setParentFacId(String parentFacId) {
        this.parentFacId = parentFacId == null ? null : parentFacId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFacReserved1() {
        return facReserved1;
    }

    public void setFacReserved1(String facReserved1) {
        this.facReserved1 = facReserved1 == null ? null : facReserved1.trim();
    }

    public String getFacReserved2() {
        return facReserved2;
    }

    public void setFacReserved2(String facReserved2) {
        this.facReserved2 = facReserved2 == null ? null : facReserved2.trim();
    }

    public String getFacReserved3() {
        return facReserved3;
    }

    public void setFacReserved3(String facReserved3) {
        this.facReserved3 = facReserved3 == null ? null : facReserved3.trim();
    }
}