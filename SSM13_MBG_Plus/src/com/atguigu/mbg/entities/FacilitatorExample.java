package com.atguigu.mbg.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FacilitatorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FacilitatorExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFacIdIsNull() {
            addCriterion("fac_id is null");
            return (Criteria) this;
        }

        public Criteria andFacIdIsNotNull() {
            addCriterion("fac_id is not null");
            return (Criteria) this;
        }

        public Criteria andFacIdEqualTo(String value) {
            addCriterion("fac_id =", value, "facId");
            return (Criteria) this;
        }

        public Criteria andFacIdNotEqualTo(String value) {
            addCriterion("fac_id <>", value, "facId");
            return (Criteria) this;
        }

        public Criteria andFacIdGreaterThan(String value) {
            addCriterion("fac_id >", value, "facId");
            return (Criteria) this;
        }

        public Criteria andFacIdGreaterThanOrEqualTo(String value) {
            addCriterion("fac_id >=", value, "facId");
            return (Criteria) this;
        }

        public Criteria andFacIdLessThan(String value) {
            addCriterion("fac_id <", value, "facId");
            return (Criteria) this;
        }

        public Criteria andFacIdLessThanOrEqualTo(String value) {
            addCriterion("fac_id <=", value, "facId");
            return (Criteria) this;
        }

        public Criteria andFacIdLike(String value) {
            addCriterion("fac_id like", value, "facId");
            return (Criteria) this;
        }

        public Criteria andFacIdNotLike(String value) {
            addCriterion("fac_id not like", value, "facId");
            return (Criteria) this;
        }

        public Criteria andFacIdIn(List<String> values) {
            addCriterion("fac_id in", values, "facId");
            return (Criteria) this;
        }

        public Criteria andFacIdNotIn(List<String> values) {
            addCriterion("fac_id not in", values, "facId");
            return (Criteria) this;
        }

        public Criteria andFacIdBetween(String value1, String value2) {
            addCriterion("fac_id between", value1, value2, "facId");
            return (Criteria) this;
        }

        public Criteria andFacIdNotBetween(String value1, String value2) {
            addCriterion("fac_id not between", value1, value2, "facId");
            return (Criteria) this;
        }

        public Criteria andFacContactsNameIsNull() {
            addCriterion("fac_contacts_name is null");
            return (Criteria) this;
        }

        public Criteria andFacContactsNameIsNotNull() {
            addCriterion("fac_contacts_name is not null");
            return (Criteria) this;
        }

        public Criteria andFacContactsNameEqualTo(String value) {
            addCriterion("fac_contacts_name =", value, "facContactsName");
            return (Criteria) this;
        }

        public Criteria andFacContactsNameNotEqualTo(String value) {
            addCriterion("fac_contacts_name <>", value, "facContactsName");
            return (Criteria) this;
        }

        public Criteria andFacContactsNameGreaterThan(String value) {
            addCriterion("fac_contacts_name >", value, "facContactsName");
            return (Criteria) this;
        }

        public Criteria andFacContactsNameGreaterThanOrEqualTo(String value) {
            addCriterion("fac_contacts_name >=", value, "facContactsName");
            return (Criteria) this;
        }

        public Criteria andFacContactsNameLessThan(String value) {
            addCriterion("fac_contacts_name <", value, "facContactsName");
            return (Criteria) this;
        }

        public Criteria andFacContactsNameLessThanOrEqualTo(String value) {
            addCriterion("fac_contacts_name <=", value, "facContactsName");
            return (Criteria) this;
        }

        public Criteria andFacContactsNameLike(String value) {
            addCriterion("fac_contacts_name like", value, "facContactsName");
            return (Criteria) this;
        }

        public Criteria andFacContactsNameNotLike(String value) {
            addCriterion("fac_contacts_name not like", value, "facContactsName");
            return (Criteria) this;
        }

        public Criteria andFacContactsNameIn(List<String> values) {
            addCriterion("fac_contacts_name in", values, "facContactsName");
            return (Criteria) this;
        }

        public Criteria andFacContactsNameNotIn(List<String> values) {
            addCriterion("fac_contacts_name not in", values, "facContactsName");
            return (Criteria) this;
        }

        public Criteria andFacContactsNameBetween(String value1, String value2) {
            addCriterion("fac_contacts_name between", value1, value2, "facContactsName");
            return (Criteria) this;
        }

        public Criteria andFacContactsNameNotBetween(String value1, String value2) {
            addCriterion("fac_contacts_name not between", value1, value2, "facContactsName");
            return (Criteria) this;
        }

        public Criteria andFacContactsPhoneIsNull() {
            addCriterion("fac_contacts_phone is null");
            return (Criteria) this;
        }

        public Criteria andFacContactsPhoneIsNotNull() {
            addCriterion("fac_contacts_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFacContactsPhoneEqualTo(String value) {
            addCriterion("fac_contacts_phone =", value, "facContactsPhone");
            return (Criteria) this;
        }

        public Criteria andFacContactsPhoneNotEqualTo(String value) {
            addCriterion("fac_contacts_phone <>", value, "facContactsPhone");
            return (Criteria) this;
        }

        public Criteria andFacContactsPhoneGreaterThan(String value) {
            addCriterion("fac_contacts_phone >", value, "facContactsPhone");
            return (Criteria) this;
        }

        public Criteria andFacContactsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("fac_contacts_phone >=", value, "facContactsPhone");
            return (Criteria) this;
        }

        public Criteria andFacContactsPhoneLessThan(String value) {
            addCriterion("fac_contacts_phone <", value, "facContactsPhone");
            return (Criteria) this;
        }

        public Criteria andFacContactsPhoneLessThanOrEqualTo(String value) {
            addCriterion("fac_contacts_phone <=", value, "facContactsPhone");
            return (Criteria) this;
        }

        public Criteria andFacContactsPhoneLike(String value) {
            addCriterion("fac_contacts_phone like", value, "facContactsPhone");
            return (Criteria) this;
        }

        public Criteria andFacContactsPhoneNotLike(String value) {
            addCriterion("fac_contacts_phone not like", value, "facContactsPhone");
            return (Criteria) this;
        }

        public Criteria andFacContactsPhoneIn(List<String> values) {
            addCriterion("fac_contacts_phone in", values, "facContactsPhone");
            return (Criteria) this;
        }

        public Criteria andFacContactsPhoneNotIn(List<String> values) {
            addCriterion("fac_contacts_phone not in", values, "facContactsPhone");
            return (Criteria) this;
        }

        public Criteria andFacContactsPhoneBetween(String value1, String value2) {
            addCriterion("fac_contacts_phone between", value1, value2, "facContactsPhone");
            return (Criteria) this;
        }

        public Criteria andFacContactsPhoneNotBetween(String value1, String value2) {
            addCriterion("fac_contacts_phone not between", value1, value2, "facContactsPhone");
            return (Criteria) this;
        }

        public Criteria andFacVerifyCodeIsNull() {
            addCriterion("fac_verify_code is null");
            return (Criteria) this;
        }

        public Criteria andFacVerifyCodeIsNotNull() {
            addCriterion("fac_verify_code is not null");
            return (Criteria) this;
        }

        public Criteria andFacVerifyCodeEqualTo(String value) {
            addCriterion("fac_verify_code =", value, "facVerifyCode");
            return (Criteria) this;
        }

        public Criteria andFacVerifyCodeNotEqualTo(String value) {
            addCriterion("fac_verify_code <>", value, "facVerifyCode");
            return (Criteria) this;
        }

        public Criteria andFacVerifyCodeGreaterThan(String value) {
            addCriterion("fac_verify_code >", value, "facVerifyCode");
            return (Criteria) this;
        }

        public Criteria andFacVerifyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fac_verify_code >=", value, "facVerifyCode");
            return (Criteria) this;
        }

        public Criteria andFacVerifyCodeLessThan(String value) {
            addCriterion("fac_verify_code <", value, "facVerifyCode");
            return (Criteria) this;
        }

        public Criteria andFacVerifyCodeLessThanOrEqualTo(String value) {
            addCriterion("fac_verify_code <=", value, "facVerifyCode");
            return (Criteria) this;
        }

        public Criteria andFacVerifyCodeLike(String value) {
            addCriterion("fac_verify_code like", value, "facVerifyCode");
            return (Criteria) this;
        }

        public Criteria andFacVerifyCodeNotLike(String value) {
            addCriterion("fac_verify_code not like", value, "facVerifyCode");
            return (Criteria) this;
        }

        public Criteria andFacVerifyCodeIn(List<String> values) {
            addCriterion("fac_verify_code in", values, "facVerifyCode");
            return (Criteria) this;
        }

        public Criteria andFacVerifyCodeNotIn(List<String> values) {
            addCriterion("fac_verify_code not in", values, "facVerifyCode");
            return (Criteria) this;
        }

        public Criteria andFacVerifyCodeBetween(String value1, String value2) {
            addCriterion("fac_verify_code between", value1, value2, "facVerifyCode");
            return (Criteria) this;
        }

        public Criteria andFacVerifyCodeNotBetween(String value1, String value2) {
            addCriterion("fac_verify_code not between", value1, value2, "facVerifyCode");
            return (Criteria) this;
        }

        public Criteria andFacJointIsNull() {
            addCriterion("fac_joint is null");
            return (Criteria) this;
        }

        public Criteria andFacJointIsNotNull() {
            addCriterion("fac_joint is not null");
            return (Criteria) this;
        }

        public Criteria andFacJointEqualTo(Byte value) {
            addCriterion("fac_joint =", value, "facJoint");
            return (Criteria) this;
        }

        public Criteria andFacJointNotEqualTo(Byte value) {
            addCriterion("fac_joint <>", value, "facJoint");
            return (Criteria) this;
        }

        public Criteria andFacJointGreaterThan(Byte value) {
            addCriterion("fac_joint >", value, "facJoint");
            return (Criteria) this;
        }

        public Criteria andFacJointGreaterThanOrEqualTo(Byte value) {
            addCriterion("fac_joint >=", value, "facJoint");
            return (Criteria) this;
        }

        public Criteria andFacJointLessThan(Byte value) {
            addCriterion("fac_joint <", value, "facJoint");
            return (Criteria) this;
        }

        public Criteria andFacJointLessThanOrEqualTo(Byte value) {
            addCriterion("fac_joint <=", value, "facJoint");
            return (Criteria) this;
        }

        public Criteria andFacJointIn(List<Byte> values) {
            addCriterion("fac_joint in", values, "facJoint");
            return (Criteria) this;
        }

        public Criteria andFacJointNotIn(List<Byte> values) {
            addCriterion("fac_joint not in", values, "facJoint");
            return (Criteria) this;
        }

        public Criteria andFacJointBetween(Byte value1, Byte value2) {
            addCriterion("fac_joint between", value1, value2, "facJoint");
            return (Criteria) this;
        }

        public Criteria andFacJointNotBetween(Byte value1, Byte value2) {
            addCriterion("fac_joint not between", value1, value2, "facJoint");
            return (Criteria) this;
        }

        public Criteria andFacJointPhoneIsNull() {
            addCriterion("fac_joint_phone is null");
            return (Criteria) this;
        }

        public Criteria andFacJointPhoneIsNotNull() {
            addCriterion("fac_joint_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFacJointPhoneEqualTo(String value) {
            addCriterion("fac_joint_phone =", value, "facJointPhone");
            return (Criteria) this;
        }

        public Criteria andFacJointPhoneNotEqualTo(String value) {
            addCriterion("fac_joint_phone <>", value, "facJointPhone");
            return (Criteria) this;
        }

        public Criteria andFacJointPhoneGreaterThan(String value) {
            addCriterion("fac_joint_phone >", value, "facJointPhone");
            return (Criteria) this;
        }

        public Criteria andFacJointPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("fac_joint_phone >=", value, "facJointPhone");
            return (Criteria) this;
        }

        public Criteria andFacJointPhoneLessThan(String value) {
            addCriterion("fac_joint_phone <", value, "facJointPhone");
            return (Criteria) this;
        }

        public Criteria andFacJointPhoneLessThanOrEqualTo(String value) {
            addCriterion("fac_joint_phone <=", value, "facJointPhone");
            return (Criteria) this;
        }

        public Criteria andFacJointPhoneLike(String value) {
            addCriterion("fac_joint_phone like", value, "facJointPhone");
            return (Criteria) this;
        }

        public Criteria andFacJointPhoneNotLike(String value) {
            addCriterion("fac_joint_phone not like", value, "facJointPhone");
            return (Criteria) this;
        }

        public Criteria andFacJointPhoneIn(List<String> values) {
            addCriterion("fac_joint_phone in", values, "facJointPhone");
            return (Criteria) this;
        }

        public Criteria andFacJointPhoneNotIn(List<String> values) {
            addCriterion("fac_joint_phone not in", values, "facJointPhone");
            return (Criteria) this;
        }

        public Criteria andFacJointPhoneBetween(String value1, String value2) {
            addCriterion("fac_joint_phone between", value1, value2, "facJointPhone");
            return (Criteria) this;
        }

        public Criteria andFacJointPhoneNotBetween(String value1, String value2) {
            addCriterion("fac_joint_phone not between", value1, value2, "facJointPhone");
            return (Criteria) this;
        }

        public Criteria andFacRecommendCodeIsNull() {
            addCriterion("fac_recommend_code is null");
            return (Criteria) this;
        }

        public Criteria andFacRecommendCodeIsNotNull() {
            addCriterion("fac_recommend_code is not null");
            return (Criteria) this;
        }

        public Criteria andFacRecommendCodeEqualTo(String value) {
            addCriterion("fac_recommend_code =", value, "facRecommendCode");
            return (Criteria) this;
        }

        public Criteria andFacRecommendCodeNotEqualTo(String value) {
            addCriterion("fac_recommend_code <>", value, "facRecommendCode");
            return (Criteria) this;
        }

        public Criteria andFacRecommendCodeGreaterThan(String value) {
            addCriterion("fac_recommend_code >", value, "facRecommendCode");
            return (Criteria) this;
        }

        public Criteria andFacRecommendCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fac_recommend_code >=", value, "facRecommendCode");
            return (Criteria) this;
        }

        public Criteria andFacRecommendCodeLessThan(String value) {
            addCriterion("fac_recommend_code <", value, "facRecommendCode");
            return (Criteria) this;
        }

        public Criteria andFacRecommendCodeLessThanOrEqualTo(String value) {
            addCriterion("fac_recommend_code <=", value, "facRecommendCode");
            return (Criteria) this;
        }

        public Criteria andFacRecommendCodeLike(String value) {
            addCriterion("fac_recommend_code like", value, "facRecommendCode");
            return (Criteria) this;
        }

        public Criteria andFacRecommendCodeNotLike(String value) {
            addCriterion("fac_recommend_code not like", value, "facRecommendCode");
            return (Criteria) this;
        }

        public Criteria andFacRecommendCodeIn(List<String> values) {
            addCriterion("fac_recommend_code in", values, "facRecommendCode");
            return (Criteria) this;
        }

        public Criteria andFacRecommendCodeNotIn(List<String> values) {
            addCriterion("fac_recommend_code not in", values, "facRecommendCode");
            return (Criteria) this;
        }

        public Criteria andFacRecommendCodeBetween(String value1, String value2) {
            addCriterion("fac_recommend_code between", value1, value2, "facRecommendCode");
            return (Criteria) this;
        }

        public Criteria andFacRecommendCodeNotBetween(String value1, String value2) {
            addCriterion("fac_recommend_code not between", value1, value2, "facRecommendCode");
            return (Criteria) this;
        }

        public Criteria andFacMyselfCodeIsNull() {
            addCriterion("fac_myself_code is null");
            return (Criteria) this;
        }

        public Criteria andFacMyselfCodeIsNotNull() {
            addCriterion("fac_myself_code is not null");
            return (Criteria) this;
        }

        public Criteria andFacMyselfCodeEqualTo(String value) {
            addCriterion("fac_myself_code =", value, "facMyselfCode");
            return (Criteria) this;
        }

        public Criteria andFacMyselfCodeNotEqualTo(String value) {
            addCriterion("fac_myself_code <>", value, "facMyselfCode");
            return (Criteria) this;
        }

        public Criteria andFacMyselfCodeGreaterThan(String value) {
            addCriterion("fac_myself_code >", value, "facMyselfCode");
            return (Criteria) this;
        }

        public Criteria andFacMyselfCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fac_myself_code >=", value, "facMyselfCode");
            return (Criteria) this;
        }

        public Criteria andFacMyselfCodeLessThan(String value) {
            addCriterion("fac_myself_code <", value, "facMyselfCode");
            return (Criteria) this;
        }

        public Criteria andFacMyselfCodeLessThanOrEqualTo(String value) {
            addCriterion("fac_myself_code <=", value, "facMyselfCode");
            return (Criteria) this;
        }

        public Criteria andFacMyselfCodeLike(String value) {
            addCriterion("fac_myself_code like", value, "facMyselfCode");
            return (Criteria) this;
        }

        public Criteria andFacMyselfCodeNotLike(String value) {
            addCriterion("fac_myself_code not like", value, "facMyselfCode");
            return (Criteria) this;
        }

        public Criteria andFacMyselfCodeIn(List<String> values) {
            addCriterion("fac_myself_code in", values, "facMyselfCode");
            return (Criteria) this;
        }

        public Criteria andFacMyselfCodeNotIn(List<String> values) {
            addCriterion("fac_myself_code not in", values, "facMyselfCode");
            return (Criteria) this;
        }

        public Criteria andFacMyselfCodeBetween(String value1, String value2) {
            addCriterion("fac_myself_code between", value1, value2, "facMyselfCode");
            return (Criteria) this;
        }

        public Criteria andFacMyselfCodeNotBetween(String value1, String value2) {
            addCriterion("fac_myself_code not between", value1, value2, "facMyselfCode");
            return (Criteria) this;
        }

        public Criteria andFacTypeIsNull() {
            addCriterion("fac_type is null");
            return (Criteria) this;
        }

        public Criteria andFacTypeIsNotNull() {
            addCriterion("fac_type is not null");
            return (Criteria) this;
        }

        public Criteria andFacTypeEqualTo(Byte value) {
            addCriterion("fac_type =", value, "facType");
            return (Criteria) this;
        }

        public Criteria andFacTypeNotEqualTo(Byte value) {
            addCriterion("fac_type <>", value, "facType");
            return (Criteria) this;
        }

        public Criteria andFacTypeGreaterThan(Byte value) {
            addCriterion("fac_type >", value, "facType");
            return (Criteria) this;
        }

        public Criteria andFacTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("fac_type >=", value, "facType");
            return (Criteria) this;
        }

        public Criteria andFacTypeLessThan(Byte value) {
            addCriterion("fac_type <", value, "facType");
            return (Criteria) this;
        }

        public Criteria andFacTypeLessThanOrEqualTo(Byte value) {
            addCriterion("fac_type <=", value, "facType");
            return (Criteria) this;
        }

        public Criteria andFacTypeIn(List<Byte> values) {
            addCriterion("fac_type in", values, "facType");
            return (Criteria) this;
        }

        public Criteria andFacTypeNotIn(List<Byte> values) {
            addCriterion("fac_type not in", values, "facType");
            return (Criteria) this;
        }

        public Criteria andFacTypeBetween(Byte value1, Byte value2) {
            addCriterion("fac_type between", value1, value2, "facType");
            return (Criteria) this;
        }

        public Criteria andFacTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("fac_type not between", value1, value2, "facType");
            return (Criteria) this;
        }

        public Criteria andFacLicenseTypeIsNull() {
            addCriterion("fac_license_type is null");
            return (Criteria) this;
        }

        public Criteria andFacLicenseTypeIsNotNull() {
            addCriterion("fac_license_type is not null");
            return (Criteria) this;
        }

        public Criteria andFacLicenseTypeEqualTo(Byte value) {
            addCriterion("fac_license_type =", value, "facLicenseType");
            return (Criteria) this;
        }

        public Criteria andFacLicenseTypeNotEqualTo(Byte value) {
            addCriterion("fac_license_type <>", value, "facLicenseType");
            return (Criteria) this;
        }

        public Criteria andFacLicenseTypeGreaterThan(Byte value) {
            addCriterion("fac_license_type >", value, "facLicenseType");
            return (Criteria) this;
        }

        public Criteria andFacLicenseTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("fac_license_type >=", value, "facLicenseType");
            return (Criteria) this;
        }

        public Criteria andFacLicenseTypeLessThan(Byte value) {
            addCriterion("fac_license_type <", value, "facLicenseType");
            return (Criteria) this;
        }

        public Criteria andFacLicenseTypeLessThanOrEqualTo(Byte value) {
            addCriterion("fac_license_type <=", value, "facLicenseType");
            return (Criteria) this;
        }

        public Criteria andFacLicenseTypeIn(List<Byte> values) {
            addCriterion("fac_license_type in", values, "facLicenseType");
            return (Criteria) this;
        }

        public Criteria andFacLicenseTypeNotIn(List<Byte> values) {
            addCriterion("fac_license_type not in", values, "facLicenseType");
            return (Criteria) this;
        }

        public Criteria andFacLicenseTypeBetween(Byte value1, Byte value2) {
            addCriterion("fac_license_type between", value1, value2, "facLicenseType");
            return (Criteria) this;
        }

        public Criteria andFacLicenseTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("fac_license_type not between", value1, value2, "facLicenseType");
            return (Criteria) this;
        }

        public Criteria andFacLicensePictureUrlIsNull() {
            addCriterion("fac_license_picture_url is null");
            return (Criteria) this;
        }

        public Criteria andFacLicensePictureUrlIsNotNull() {
            addCriterion("fac_license_picture_url is not null");
            return (Criteria) this;
        }

        public Criteria andFacLicensePictureUrlEqualTo(String value) {
            addCriterion("fac_license_picture_url =", value, "facLicensePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacLicensePictureUrlNotEqualTo(String value) {
            addCriterion("fac_license_picture_url <>", value, "facLicensePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacLicensePictureUrlGreaterThan(String value) {
            addCriterion("fac_license_picture_url >", value, "facLicensePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacLicensePictureUrlGreaterThanOrEqualTo(String value) {
            addCriterion("fac_license_picture_url >=", value, "facLicensePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacLicensePictureUrlLessThan(String value) {
            addCriterion("fac_license_picture_url <", value, "facLicensePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacLicensePictureUrlLessThanOrEqualTo(String value) {
            addCriterion("fac_license_picture_url <=", value, "facLicensePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacLicensePictureUrlLike(String value) {
            addCriterion("fac_license_picture_url like", value, "facLicensePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacLicensePictureUrlNotLike(String value) {
            addCriterion("fac_license_picture_url not like", value, "facLicensePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacLicensePictureUrlIn(List<String> values) {
            addCriterion("fac_license_picture_url in", values, "facLicensePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacLicensePictureUrlNotIn(List<String> values) {
            addCriterion("fac_license_picture_url not in", values, "facLicensePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacLicensePictureUrlBetween(String value1, String value2) {
            addCriterion("fac_license_picture_url between", value1, value2, "facLicensePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacLicensePictureUrlNotBetween(String value1, String value2) {
            addCriterion("fac_license_picture_url not between", value1, value2, "facLicensePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacCountryNameIsNull() {
            addCriterion("fac_country_name is null");
            return (Criteria) this;
        }

        public Criteria andFacCountryNameIsNotNull() {
            addCriterion("fac_country_name is not null");
            return (Criteria) this;
        }

        public Criteria andFacCountryNameEqualTo(String value) {
            addCriterion("fac_country_name =", value, "facCountryName");
            return (Criteria) this;
        }

        public Criteria andFacCountryNameNotEqualTo(String value) {
            addCriterion("fac_country_name <>", value, "facCountryName");
            return (Criteria) this;
        }

        public Criteria andFacCountryNameGreaterThan(String value) {
            addCriterion("fac_country_name >", value, "facCountryName");
            return (Criteria) this;
        }

        public Criteria andFacCountryNameGreaterThanOrEqualTo(String value) {
            addCriterion("fac_country_name >=", value, "facCountryName");
            return (Criteria) this;
        }

        public Criteria andFacCountryNameLessThan(String value) {
            addCriterion("fac_country_name <", value, "facCountryName");
            return (Criteria) this;
        }

        public Criteria andFacCountryNameLessThanOrEqualTo(String value) {
            addCriterion("fac_country_name <=", value, "facCountryName");
            return (Criteria) this;
        }

        public Criteria andFacCountryNameLike(String value) {
            addCriterion("fac_country_name like", value, "facCountryName");
            return (Criteria) this;
        }

        public Criteria andFacCountryNameNotLike(String value) {
            addCriterion("fac_country_name not like", value, "facCountryName");
            return (Criteria) this;
        }

        public Criteria andFacCountryNameIn(List<String> values) {
            addCriterion("fac_country_name in", values, "facCountryName");
            return (Criteria) this;
        }

        public Criteria andFacCountryNameNotIn(List<String> values) {
            addCriterion("fac_country_name not in", values, "facCountryName");
            return (Criteria) this;
        }

        public Criteria andFacCountryNameBetween(String value1, String value2) {
            addCriterion("fac_country_name between", value1, value2, "facCountryName");
            return (Criteria) this;
        }

        public Criteria andFacCountryNameNotBetween(String value1, String value2) {
            addCriterion("fac_country_name not between", value1, value2, "facCountryName");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCodeIsNull() {
            addCriterion("fac_license_code is null");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCodeIsNotNull() {
            addCriterion("fac_license_code is not null");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCodeEqualTo(String value) {
            addCriterion("fac_license_code =", value, "facLicenseCode");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCodeNotEqualTo(String value) {
            addCriterion("fac_license_code <>", value, "facLicenseCode");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCodeGreaterThan(String value) {
            addCriterion("fac_license_code >", value, "facLicenseCode");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fac_license_code >=", value, "facLicenseCode");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCodeLessThan(String value) {
            addCriterion("fac_license_code <", value, "facLicenseCode");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCodeLessThanOrEqualTo(String value) {
            addCriterion("fac_license_code <=", value, "facLicenseCode");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCodeLike(String value) {
            addCriterion("fac_license_code like", value, "facLicenseCode");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCodeNotLike(String value) {
            addCriterion("fac_license_code not like", value, "facLicenseCode");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCodeIn(List<String> values) {
            addCriterion("fac_license_code in", values, "facLicenseCode");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCodeNotIn(List<String> values) {
            addCriterion("fac_license_code not in", values, "facLicenseCode");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCodeBetween(String value1, String value2) {
            addCriterion("fac_license_code between", value1, value2, "facLicenseCode");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCodeNotBetween(String value1, String value2) {
            addCriterion("fac_license_code not between", value1, value2, "facLicenseCode");
            return (Criteria) this;
        }

        public Criteria andFacLicenseProvinceIsNull() {
            addCriterion("fac_license_province is null");
            return (Criteria) this;
        }

        public Criteria andFacLicenseProvinceIsNotNull() {
            addCriterion("fac_license_province is not null");
            return (Criteria) this;
        }

        public Criteria andFacLicenseProvinceEqualTo(String value) {
            addCriterion("fac_license_province =", value, "facLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andFacLicenseProvinceNotEqualTo(String value) {
            addCriterion("fac_license_province <>", value, "facLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andFacLicenseProvinceGreaterThan(String value) {
            addCriterion("fac_license_province >", value, "facLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andFacLicenseProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("fac_license_province >=", value, "facLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andFacLicenseProvinceLessThan(String value) {
            addCriterion("fac_license_province <", value, "facLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andFacLicenseProvinceLessThanOrEqualTo(String value) {
            addCriterion("fac_license_province <=", value, "facLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andFacLicenseProvinceLike(String value) {
            addCriterion("fac_license_province like", value, "facLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andFacLicenseProvinceNotLike(String value) {
            addCriterion("fac_license_province not like", value, "facLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andFacLicenseProvinceIn(List<String> values) {
            addCriterion("fac_license_province in", values, "facLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andFacLicenseProvinceNotIn(List<String> values) {
            addCriterion("fac_license_province not in", values, "facLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andFacLicenseProvinceBetween(String value1, String value2) {
            addCriterion("fac_license_province between", value1, value2, "facLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andFacLicenseProvinceNotBetween(String value1, String value2) {
            addCriterion("fac_license_province not between", value1, value2, "facLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCityIsNull() {
            addCriterion("fac_license_city is null");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCityIsNotNull() {
            addCriterion("fac_license_city is not null");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCityEqualTo(String value) {
            addCriterion("fac_license_city =", value, "facLicenseCity");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCityNotEqualTo(String value) {
            addCriterion("fac_license_city <>", value, "facLicenseCity");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCityGreaterThan(String value) {
            addCriterion("fac_license_city >", value, "facLicenseCity");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCityGreaterThanOrEqualTo(String value) {
            addCriterion("fac_license_city >=", value, "facLicenseCity");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCityLessThan(String value) {
            addCriterion("fac_license_city <", value, "facLicenseCity");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCityLessThanOrEqualTo(String value) {
            addCriterion("fac_license_city <=", value, "facLicenseCity");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCityLike(String value) {
            addCriterion("fac_license_city like", value, "facLicenseCity");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCityNotLike(String value) {
            addCriterion("fac_license_city not like", value, "facLicenseCity");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCityIn(List<String> values) {
            addCriterion("fac_license_city in", values, "facLicenseCity");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCityNotIn(List<String> values) {
            addCriterion("fac_license_city not in", values, "facLicenseCity");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCityBetween(String value1, String value2) {
            addCriterion("fac_license_city between", value1, value2, "facLicenseCity");
            return (Criteria) this;
        }

        public Criteria andFacLicenseCityNotBetween(String value1, String value2) {
            addCriterion("fac_license_city not between", value1, value2, "facLicenseCity");
            return (Criteria) this;
        }

        public Criteria andFacLicenseDistrictIsNull() {
            addCriterion("fac_license_district is null");
            return (Criteria) this;
        }

        public Criteria andFacLicenseDistrictIsNotNull() {
            addCriterion("fac_license_district is not null");
            return (Criteria) this;
        }

        public Criteria andFacLicenseDistrictEqualTo(String value) {
            addCriterion("fac_license_district =", value, "facLicenseDistrict");
            return (Criteria) this;
        }

        public Criteria andFacLicenseDistrictNotEqualTo(String value) {
            addCriterion("fac_license_district <>", value, "facLicenseDistrict");
            return (Criteria) this;
        }

        public Criteria andFacLicenseDistrictGreaterThan(String value) {
            addCriterion("fac_license_district >", value, "facLicenseDistrict");
            return (Criteria) this;
        }

        public Criteria andFacLicenseDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("fac_license_district >=", value, "facLicenseDistrict");
            return (Criteria) this;
        }

        public Criteria andFacLicenseDistrictLessThan(String value) {
            addCriterion("fac_license_district <", value, "facLicenseDistrict");
            return (Criteria) this;
        }

        public Criteria andFacLicenseDistrictLessThanOrEqualTo(String value) {
            addCriterion("fac_license_district <=", value, "facLicenseDistrict");
            return (Criteria) this;
        }

        public Criteria andFacLicenseDistrictLike(String value) {
            addCriterion("fac_license_district like", value, "facLicenseDistrict");
            return (Criteria) this;
        }

        public Criteria andFacLicenseDistrictNotLike(String value) {
            addCriterion("fac_license_district not like", value, "facLicenseDistrict");
            return (Criteria) this;
        }

        public Criteria andFacLicenseDistrictIn(List<String> values) {
            addCriterion("fac_license_district in", values, "facLicenseDistrict");
            return (Criteria) this;
        }

        public Criteria andFacLicenseDistrictNotIn(List<String> values) {
            addCriterion("fac_license_district not in", values, "facLicenseDistrict");
            return (Criteria) this;
        }

        public Criteria andFacLicenseDistrictBetween(String value1, String value2) {
            addCriterion("fac_license_district between", value1, value2, "facLicenseDistrict");
            return (Criteria) this;
        }

        public Criteria andFacLicenseDistrictNotBetween(String value1, String value2) {
            addCriterion("fac_license_district not between", value1, value2, "facLicenseDistrict");
            return (Criteria) this;
        }

        public Criteria andFacLicenseAddressIsNull() {
            addCriterion("fac_license_address is null");
            return (Criteria) this;
        }

        public Criteria andFacLicenseAddressIsNotNull() {
            addCriterion("fac_license_address is not null");
            return (Criteria) this;
        }

        public Criteria andFacLicenseAddressEqualTo(String value) {
            addCriterion("fac_license_address =", value, "facLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andFacLicenseAddressNotEqualTo(String value) {
            addCriterion("fac_license_address <>", value, "facLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andFacLicenseAddressGreaterThan(String value) {
            addCriterion("fac_license_address >", value, "facLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andFacLicenseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("fac_license_address >=", value, "facLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andFacLicenseAddressLessThan(String value) {
            addCriterion("fac_license_address <", value, "facLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andFacLicenseAddressLessThanOrEqualTo(String value) {
            addCriterion("fac_license_address <=", value, "facLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andFacLicenseAddressLike(String value) {
            addCriterion("fac_license_address like", value, "facLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andFacLicenseAddressNotLike(String value) {
            addCriterion("fac_license_address not like", value, "facLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andFacLicenseAddressIn(List<String> values) {
            addCriterion("fac_license_address in", values, "facLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andFacLicenseAddressNotIn(List<String> values) {
            addCriterion("fac_license_address not in", values, "facLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andFacLicenseAddressBetween(String value1, String value2) {
            addCriterion("fac_license_address between", value1, value2, "facLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andFacLicenseAddressNotBetween(String value1, String value2) {
            addCriterion("fac_license_address not between", value1, value2, "facLicenseAddress");
            return (Criteria) this;
        }

        public Criteria andFacCreateTimeIsNull() {
            addCriterion("fac_create_time is null");
            return (Criteria) this;
        }

        public Criteria andFacCreateTimeIsNotNull() {
            addCriterion("fac_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andFacCreateTimeEqualTo(Date value) {
            addCriterion("fac_create_time =", value, "facCreateTime");
            return (Criteria) this;
        }

        public Criteria andFacCreateTimeNotEqualTo(Date value) {
            addCriterion("fac_create_time <>", value, "facCreateTime");
            return (Criteria) this;
        }

        public Criteria andFacCreateTimeGreaterThan(Date value) {
            addCriterion("fac_create_time >", value, "facCreateTime");
            return (Criteria) this;
        }

        public Criteria andFacCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fac_create_time >=", value, "facCreateTime");
            return (Criteria) this;
        }

        public Criteria andFacCreateTimeLessThan(Date value) {
            addCriterion("fac_create_time <", value, "facCreateTime");
            return (Criteria) this;
        }

        public Criteria andFacCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("fac_create_time <=", value, "facCreateTime");
            return (Criteria) this;
        }

        public Criteria andFacCreateTimeIn(List<Date> values) {
            addCriterion("fac_create_time in", values, "facCreateTime");
            return (Criteria) this;
        }

        public Criteria andFacCreateTimeNotIn(List<Date> values) {
            addCriterion("fac_create_time not in", values, "facCreateTime");
            return (Criteria) this;
        }

        public Criteria andFacCreateTimeBetween(Date value1, Date value2) {
            addCriterion("fac_create_time between", value1, value2, "facCreateTime");
            return (Criteria) this;
        }

        public Criteria andFacCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("fac_create_time not between", value1, value2, "facCreateTime");
            return (Criteria) this;
        }

        public Criteria andFacStartTimeIsNull() {
            addCriterion("fac_start_time is null");
            return (Criteria) this;
        }

        public Criteria andFacStartTimeIsNotNull() {
            addCriterion("fac_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andFacStartTimeEqualTo(Date value) {
            addCriterion("fac_start_time =", value, "facStartTime");
            return (Criteria) this;
        }

        public Criteria andFacStartTimeNotEqualTo(Date value) {
            addCriterion("fac_start_time <>", value, "facStartTime");
            return (Criteria) this;
        }

        public Criteria andFacStartTimeGreaterThan(Date value) {
            addCriterion("fac_start_time >", value, "facStartTime");
            return (Criteria) this;
        }

        public Criteria andFacStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fac_start_time >=", value, "facStartTime");
            return (Criteria) this;
        }

        public Criteria andFacStartTimeLessThan(Date value) {
            addCriterion("fac_start_time <", value, "facStartTime");
            return (Criteria) this;
        }

        public Criteria andFacStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("fac_start_time <=", value, "facStartTime");
            return (Criteria) this;
        }

        public Criteria andFacStartTimeIn(List<Date> values) {
            addCriterion("fac_start_time in", values, "facStartTime");
            return (Criteria) this;
        }

        public Criteria andFacStartTimeNotIn(List<Date> values) {
            addCriterion("fac_start_time not in", values, "facStartTime");
            return (Criteria) this;
        }

        public Criteria andFacStartTimeBetween(Date value1, Date value2) {
            addCriterion("fac_start_time between", value1, value2, "facStartTime");
            return (Criteria) this;
        }

        public Criteria andFacStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("fac_start_time not between", value1, value2, "facStartTime");
            return (Criteria) this;
        }

        public Criteria andFacEndTimeIsNull() {
            addCriterion("fac_end_time is null");
            return (Criteria) this;
        }

        public Criteria andFacEndTimeIsNotNull() {
            addCriterion("fac_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andFacEndTimeEqualTo(Date value) {
            addCriterion("fac_end_time =", value, "facEndTime");
            return (Criteria) this;
        }

        public Criteria andFacEndTimeNotEqualTo(Date value) {
            addCriterion("fac_end_time <>", value, "facEndTime");
            return (Criteria) this;
        }

        public Criteria andFacEndTimeGreaterThan(Date value) {
            addCriterion("fac_end_time >", value, "facEndTime");
            return (Criteria) this;
        }

        public Criteria andFacEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fac_end_time >=", value, "facEndTime");
            return (Criteria) this;
        }

        public Criteria andFacEndTimeLessThan(Date value) {
            addCriterion("fac_end_time <", value, "facEndTime");
            return (Criteria) this;
        }

        public Criteria andFacEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("fac_end_time <=", value, "facEndTime");
            return (Criteria) this;
        }

        public Criteria andFacEndTimeIn(List<Date> values) {
            addCriterion("fac_end_time in", values, "facEndTime");
            return (Criteria) this;
        }

        public Criteria andFacEndTimeNotIn(List<Date> values) {
            addCriterion("fac_end_time not in", values, "facEndTime");
            return (Criteria) this;
        }

        public Criteria andFacEndTimeBetween(Date value1, Date value2) {
            addCriterion("fac_end_time between", value1, value2, "facEndTime");
            return (Criteria) this;
        }

        public Criteria andFacEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("fac_end_time not between", value1, value2, "facEndTime");
            return (Criteria) this;
        }

        public Criteria andFacRegisteredAssetsIsNull() {
            addCriterion("fac_registered_assets is null");
            return (Criteria) this;
        }

        public Criteria andFacRegisteredAssetsIsNotNull() {
            addCriterion("fac_registered_assets is not null");
            return (Criteria) this;
        }

        public Criteria andFacRegisteredAssetsEqualTo(Double value) {
            addCriterion("fac_registered_assets =", value, "facRegisteredAssets");
            return (Criteria) this;
        }

        public Criteria andFacRegisteredAssetsNotEqualTo(Double value) {
            addCriterion("fac_registered_assets <>", value, "facRegisteredAssets");
            return (Criteria) this;
        }

        public Criteria andFacRegisteredAssetsGreaterThan(Double value) {
            addCriterion("fac_registered_assets >", value, "facRegisteredAssets");
            return (Criteria) this;
        }

        public Criteria andFacRegisteredAssetsGreaterThanOrEqualTo(Double value) {
            addCriterion("fac_registered_assets >=", value, "facRegisteredAssets");
            return (Criteria) this;
        }

        public Criteria andFacRegisteredAssetsLessThan(Double value) {
            addCriterion("fac_registered_assets <", value, "facRegisteredAssets");
            return (Criteria) this;
        }

        public Criteria andFacRegisteredAssetsLessThanOrEqualTo(Double value) {
            addCriterion("fac_registered_assets <=", value, "facRegisteredAssets");
            return (Criteria) this;
        }

        public Criteria andFacRegisteredAssetsIn(List<Double> values) {
            addCriterion("fac_registered_assets in", values, "facRegisteredAssets");
            return (Criteria) this;
        }

        public Criteria andFacRegisteredAssetsNotIn(List<Double> values) {
            addCriterion("fac_registered_assets not in", values, "facRegisteredAssets");
            return (Criteria) this;
        }

        public Criteria andFacRegisteredAssetsBetween(Double value1, Double value2) {
            addCriterion("fac_registered_assets between", value1, value2, "facRegisteredAssets");
            return (Criteria) this;
        }

        public Criteria andFacRegisteredAssetsNotBetween(Double value1, Double value2) {
            addCriterion("fac_registered_assets not between", value1, value2, "facRegisteredAssets");
            return (Criteria) this;
        }

        public Criteria andFacBusinessScopeIsNull() {
            addCriterion("fac_business_scope is null");
            return (Criteria) this;
        }

        public Criteria andFacBusinessScopeIsNotNull() {
            addCriterion("fac_business_scope is not null");
            return (Criteria) this;
        }

        public Criteria andFacBusinessScopeEqualTo(String value) {
            addCriterion("fac_business_scope =", value, "facBusinessScope");
            return (Criteria) this;
        }

        public Criteria andFacBusinessScopeNotEqualTo(String value) {
            addCriterion("fac_business_scope <>", value, "facBusinessScope");
            return (Criteria) this;
        }

        public Criteria andFacBusinessScopeGreaterThan(String value) {
            addCriterion("fac_business_scope >", value, "facBusinessScope");
            return (Criteria) this;
        }

        public Criteria andFacBusinessScopeGreaterThanOrEqualTo(String value) {
            addCriterion("fac_business_scope >=", value, "facBusinessScope");
            return (Criteria) this;
        }

        public Criteria andFacBusinessScopeLessThan(String value) {
            addCriterion("fac_business_scope <", value, "facBusinessScope");
            return (Criteria) this;
        }

        public Criteria andFacBusinessScopeLessThanOrEqualTo(String value) {
            addCriterion("fac_business_scope <=", value, "facBusinessScope");
            return (Criteria) this;
        }

        public Criteria andFacBusinessScopeLike(String value) {
            addCriterion("fac_business_scope like", value, "facBusinessScope");
            return (Criteria) this;
        }

        public Criteria andFacBusinessScopeNotLike(String value) {
            addCriterion("fac_business_scope not like", value, "facBusinessScope");
            return (Criteria) this;
        }

        public Criteria andFacBusinessScopeIn(List<String> values) {
            addCriterion("fac_business_scope in", values, "facBusinessScope");
            return (Criteria) this;
        }

        public Criteria andFacBusinessScopeNotIn(List<String> values) {
            addCriterion("fac_business_scope not in", values, "facBusinessScope");
            return (Criteria) this;
        }

        public Criteria andFacBusinessScopeBetween(String value1, String value2) {
            addCriterion("fac_business_scope between", value1, value2, "facBusinessScope");
            return (Criteria) this;
        }

        public Criteria andFacBusinessScopeNotBetween(String value1, String value2) {
            addCriterion("fac_business_scope not between", value1, value2, "facBusinessScope");
            return (Criteria) this;
        }

        public Criteria andFacCertificateTypeIsNull() {
            addCriterion("fac_certificate_type is null");
            return (Criteria) this;
        }

        public Criteria andFacCertificateTypeIsNotNull() {
            addCriterion("fac_certificate_type is not null");
            return (Criteria) this;
        }

        public Criteria andFacCertificateTypeEqualTo(Byte value) {
            addCriterion("fac_certificate_type =", value, "facCertificateType");
            return (Criteria) this;
        }

        public Criteria andFacCertificateTypeNotEqualTo(Byte value) {
            addCriterion("fac_certificate_type <>", value, "facCertificateType");
            return (Criteria) this;
        }

        public Criteria andFacCertificateTypeGreaterThan(Byte value) {
            addCriterion("fac_certificate_type >", value, "facCertificateType");
            return (Criteria) this;
        }

        public Criteria andFacCertificateTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("fac_certificate_type >=", value, "facCertificateType");
            return (Criteria) this;
        }

        public Criteria andFacCertificateTypeLessThan(Byte value) {
            addCriterion("fac_certificate_type <", value, "facCertificateType");
            return (Criteria) this;
        }

        public Criteria andFacCertificateTypeLessThanOrEqualTo(Byte value) {
            addCriterion("fac_certificate_type <=", value, "facCertificateType");
            return (Criteria) this;
        }

        public Criteria andFacCertificateTypeIn(List<Byte> values) {
            addCriterion("fac_certificate_type in", values, "facCertificateType");
            return (Criteria) this;
        }

        public Criteria andFacCertificateTypeNotIn(List<Byte> values) {
            addCriterion("fac_certificate_type not in", values, "facCertificateType");
            return (Criteria) this;
        }

        public Criteria andFacCertificateTypeBetween(Byte value1, Byte value2) {
            addCriterion("fac_certificate_type between", value1, value2, "facCertificateType");
            return (Criteria) this;
        }

        public Criteria andFacCertificateTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("fac_certificate_type not between", value1, value2, "facCertificateType");
            return (Criteria) this;
        }

        public Criteria andFacCertificatePictureUrlIsNull() {
            addCriterion("fac_certificate_picture_url is null");
            return (Criteria) this;
        }

        public Criteria andFacCertificatePictureUrlIsNotNull() {
            addCriterion("fac_certificate_picture_url is not null");
            return (Criteria) this;
        }

        public Criteria andFacCertificatePictureUrlEqualTo(String value) {
            addCriterion("fac_certificate_picture_url =", value, "facCertificatePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacCertificatePictureUrlNotEqualTo(String value) {
            addCriterion("fac_certificate_picture_url <>", value, "facCertificatePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacCertificatePictureUrlGreaterThan(String value) {
            addCriterion("fac_certificate_picture_url >", value, "facCertificatePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacCertificatePictureUrlGreaterThanOrEqualTo(String value) {
            addCriterion("fac_certificate_picture_url >=", value, "facCertificatePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacCertificatePictureUrlLessThan(String value) {
            addCriterion("fac_certificate_picture_url <", value, "facCertificatePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacCertificatePictureUrlLessThanOrEqualTo(String value) {
            addCriterion("fac_certificate_picture_url <=", value, "facCertificatePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacCertificatePictureUrlLike(String value) {
            addCriterion("fac_certificate_picture_url like", value, "facCertificatePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacCertificatePictureUrlNotLike(String value) {
            addCriterion("fac_certificate_picture_url not like", value, "facCertificatePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacCertificatePictureUrlIn(List<String> values) {
            addCriterion("fac_certificate_picture_url in", values, "facCertificatePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacCertificatePictureUrlNotIn(List<String> values) {
            addCriterion("fac_certificate_picture_url not in", values, "facCertificatePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacCertificatePictureUrlBetween(String value1, String value2) {
            addCriterion("fac_certificate_picture_url between", value1, value2, "facCertificatePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacCertificatePictureUrlNotBetween(String value1, String value2) {
            addCriterion("fac_certificate_picture_url not between", value1, value2, "facCertificatePictureUrl");
            return (Criteria) this;
        }

        public Criteria andFacLegalNameIsNull() {
            addCriterion("fac_legal_name is null");
            return (Criteria) this;
        }

        public Criteria andFacLegalNameIsNotNull() {
            addCriterion("fac_legal_name is not null");
            return (Criteria) this;
        }

        public Criteria andFacLegalNameEqualTo(String value) {
            addCriterion("fac_legal_name =", value, "facLegalName");
            return (Criteria) this;
        }

        public Criteria andFacLegalNameNotEqualTo(String value) {
            addCriterion("fac_legal_name <>", value, "facLegalName");
            return (Criteria) this;
        }

        public Criteria andFacLegalNameGreaterThan(String value) {
            addCriterion("fac_legal_name >", value, "facLegalName");
            return (Criteria) this;
        }

        public Criteria andFacLegalNameGreaterThanOrEqualTo(String value) {
            addCriterion("fac_legal_name >=", value, "facLegalName");
            return (Criteria) this;
        }

        public Criteria andFacLegalNameLessThan(String value) {
            addCriterion("fac_legal_name <", value, "facLegalName");
            return (Criteria) this;
        }

        public Criteria andFacLegalNameLessThanOrEqualTo(String value) {
            addCriterion("fac_legal_name <=", value, "facLegalName");
            return (Criteria) this;
        }

        public Criteria andFacLegalNameLike(String value) {
            addCriterion("fac_legal_name like", value, "facLegalName");
            return (Criteria) this;
        }

        public Criteria andFacLegalNameNotLike(String value) {
            addCriterion("fac_legal_name not like", value, "facLegalName");
            return (Criteria) this;
        }

        public Criteria andFacLegalNameIn(List<String> values) {
            addCriterion("fac_legal_name in", values, "facLegalName");
            return (Criteria) this;
        }

        public Criteria andFacLegalNameNotIn(List<String> values) {
            addCriterion("fac_legal_name not in", values, "facLegalName");
            return (Criteria) this;
        }

        public Criteria andFacLegalNameBetween(String value1, String value2) {
            addCriterion("fac_legal_name between", value1, value2, "facLegalName");
            return (Criteria) this;
        }

        public Criteria andFacLegalNameNotBetween(String value1, String value2) {
            addCriterion("fac_legal_name not between", value1, value2, "facLegalName");
            return (Criteria) this;
        }

        public Criteria andFacCertificateCodeIsNull() {
            addCriterion("fac_certificate_code is null");
            return (Criteria) this;
        }

        public Criteria andFacCertificateCodeIsNotNull() {
            addCriterion("fac_certificate_code is not null");
            return (Criteria) this;
        }

        public Criteria andFacCertificateCodeEqualTo(String value) {
            addCriterion("fac_certificate_code =", value, "facCertificateCode");
            return (Criteria) this;
        }

        public Criteria andFacCertificateCodeNotEqualTo(String value) {
            addCriterion("fac_certificate_code <>", value, "facCertificateCode");
            return (Criteria) this;
        }

        public Criteria andFacCertificateCodeGreaterThan(String value) {
            addCriterion("fac_certificate_code >", value, "facCertificateCode");
            return (Criteria) this;
        }

        public Criteria andFacCertificateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fac_certificate_code >=", value, "facCertificateCode");
            return (Criteria) this;
        }

        public Criteria andFacCertificateCodeLessThan(String value) {
            addCriterion("fac_certificate_code <", value, "facCertificateCode");
            return (Criteria) this;
        }

        public Criteria andFacCertificateCodeLessThanOrEqualTo(String value) {
            addCriterion("fac_certificate_code <=", value, "facCertificateCode");
            return (Criteria) this;
        }

        public Criteria andFacCertificateCodeLike(String value) {
            addCriterion("fac_certificate_code like", value, "facCertificateCode");
            return (Criteria) this;
        }

        public Criteria andFacCertificateCodeNotLike(String value) {
            addCriterion("fac_certificate_code not like", value, "facCertificateCode");
            return (Criteria) this;
        }

        public Criteria andFacCertificateCodeIn(List<String> values) {
            addCriterion("fac_certificate_code in", values, "facCertificateCode");
            return (Criteria) this;
        }

        public Criteria andFacCertificateCodeNotIn(List<String> values) {
            addCriterion("fac_certificate_code not in", values, "facCertificateCode");
            return (Criteria) this;
        }

        public Criteria andFacCertificateCodeBetween(String value1, String value2) {
            addCriterion("fac_certificate_code between", value1, value2, "facCertificateCode");
            return (Criteria) this;
        }

        public Criteria andFacCertificateCodeNotBetween(String value1, String value2) {
            addCriterion("fac_certificate_code not between", value1, value2, "facCertificateCode");
            return (Criteria) this;
        }

        public Criteria andFacCertificateStartTimeIsNull() {
            addCriterion("fac_certificate_start_time is null");
            return (Criteria) this;
        }

        public Criteria andFacCertificateStartTimeIsNotNull() {
            addCriterion("fac_certificate_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andFacCertificateStartTimeEqualTo(Date value) {
            addCriterion("fac_certificate_start_time =", value, "facCertificateStartTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateStartTimeNotEqualTo(Date value) {
            addCriterion("fac_certificate_start_time <>", value, "facCertificateStartTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateStartTimeGreaterThan(Date value) {
            addCriterion("fac_certificate_start_time >", value, "facCertificateStartTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fac_certificate_start_time >=", value, "facCertificateStartTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateStartTimeLessThan(Date value) {
            addCriterion("fac_certificate_start_time <", value, "facCertificateStartTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("fac_certificate_start_time <=", value, "facCertificateStartTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateStartTimeIn(List<Date> values) {
            addCriterion("fac_certificate_start_time in", values, "facCertificateStartTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateStartTimeNotIn(List<Date> values) {
            addCriterion("fac_certificate_start_time not in", values, "facCertificateStartTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateStartTimeBetween(Date value1, Date value2) {
            addCriterion("fac_certificate_start_time between", value1, value2, "facCertificateStartTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("fac_certificate_start_time not between", value1, value2, "facCertificateStartTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateEndTimeIsNull() {
            addCriterion("fac_certificate_end_time is null");
            return (Criteria) this;
        }

        public Criteria andFacCertificateEndTimeIsNotNull() {
            addCriterion("fac_certificate_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andFacCertificateEndTimeEqualTo(Date value) {
            addCriterion("fac_certificate_end_time =", value, "facCertificateEndTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateEndTimeNotEqualTo(Date value) {
            addCriterion("fac_certificate_end_time <>", value, "facCertificateEndTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateEndTimeGreaterThan(Date value) {
            addCriterion("fac_certificate_end_time >", value, "facCertificateEndTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fac_certificate_end_time >=", value, "facCertificateEndTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateEndTimeLessThan(Date value) {
            addCriterion("fac_certificate_end_time <", value, "facCertificateEndTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("fac_certificate_end_time <=", value, "facCertificateEndTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateEndTimeIn(List<Date> values) {
            addCriterion("fac_certificate_end_time in", values, "facCertificateEndTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateEndTimeNotIn(List<Date> values) {
            addCriterion("fac_certificate_end_time not in", values, "facCertificateEndTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateEndTimeBetween(Date value1, Date value2) {
            addCriterion("fac_certificate_end_time between", value1, value2, "facCertificateEndTime");
            return (Criteria) this;
        }

        public Criteria andFacCertificateEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("fac_certificate_end_time not between", value1, value2, "facCertificateEndTime");
            return (Criteria) this;
        }

        public Criteria andFacCompanyProvinceIsNull() {
            addCriterion("fac_company_province is null");
            return (Criteria) this;
        }

        public Criteria andFacCompanyProvinceIsNotNull() {
            addCriterion("fac_company_province is not null");
            return (Criteria) this;
        }

        public Criteria andFacCompanyProvinceEqualTo(String value) {
            addCriterion("fac_company_province =", value, "facCompanyProvince");
            return (Criteria) this;
        }

        public Criteria andFacCompanyProvinceNotEqualTo(String value) {
            addCriterion("fac_company_province <>", value, "facCompanyProvince");
            return (Criteria) this;
        }

        public Criteria andFacCompanyProvinceGreaterThan(String value) {
            addCriterion("fac_company_province >", value, "facCompanyProvince");
            return (Criteria) this;
        }

        public Criteria andFacCompanyProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("fac_company_province >=", value, "facCompanyProvince");
            return (Criteria) this;
        }

        public Criteria andFacCompanyProvinceLessThan(String value) {
            addCriterion("fac_company_province <", value, "facCompanyProvince");
            return (Criteria) this;
        }

        public Criteria andFacCompanyProvinceLessThanOrEqualTo(String value) {
            addCriterion("fac_company_province <=", value, "facCompanyProvince");
            return (Criteria) this;
        }

        public Criteria andFacCompanyProvinceLike(String value) {
            addCriterion("fac_company_province like", value, "facCompanyProvince");
            return (Criteria) this;
        }

        public Criteria andFacCompanyProvinceNotLike(String value) {
            addCriterion("fac_company_province not like", value, "facCompanyProvince");
            return (Criteria) this;
        }

        public Criteria andFacCompanyProvinceIn(List<String> values) {
            addCriterion("fac_company_province in", values, "facCompanyProvince");
            return (Criteria) this;
        }

        public Criteria andFacCompanyProvinceNotIn(List<String> values) {
            addCriterion("fac_company_province not in", values, "facCompanyProvince");
            return (Criteria) this;
        }

        public Criteria andFacCompanyProvinceBetween(String value1, String value2) {
            addCriterion("fac_company_province between", value1, value2, "facCompanyProvince");
            return (Criteria) this;
        }

        public Criteria andFacCompanyProvinceNotBetween(String value1, String value2) {
            addCriterion("fac_company_province not between", value1, value2, "facCompanyProvince");
            return (Criteria) this;
        }

        public Criteria andFacCompanyCityIsNull() {
            addCriterion("fac_company_city is null");
            return (Criteria) this;
        }

        public Criteria andFacCompanyCityIsNotNull() {
            addCriterion("fac_company_city is not null");
            return (Criteria) this;
        }

        public Criteria andFacCompanyCityEqualTo(String value) {
            addCriterion("fac_company_city =", value, "facCompanyCity");
            return (Criteria) this;
        }

        public Criteria andFacCompanyCityNotEqualTo(String value) {
            addCriterion("fac_company_city <>", value, "facCompanyCity");
            return (Criteria) this;
        }

        public Criteria andFacCompanyCityGreaterThan(String value) {
            addCriterion("fac_company_city >", value, "facCompanyCity");
            return (Criteria) this;
        }

        public Criteria andFacCompanyCityGreaterThanOrEqualTo(String value) {
            addCriterion("fac_company_city >=", value, "facCompanyCity");
            return (Criteria) this;
        }

        public Criteria andFacCompanyCityLessThan(String value) {
            addCriterion("fac_company_city <", value, "facCompanyCity");
            return (Criteria) this;
        }

        public Criteria andFacCompanyCityLessThanOrEqualTo(String value) {
            addCriterion("fac_company_city <=", value, "facCompanyCity");
            return (Criteria) this;
        }

        public Criteria andFacCompanyCityLike(String value) {
            addCriterion("fac_company_city like", value, "facCompanyCity");
            return (Criteria) this;
        }

        public Criteria andFacCompanyCityNotLike(String value) {
            addCriterion("fac_company_city not like", value, "facCompanyCity");
            return (Criteria) this;
        }

        public Criteria andFacCompanyCityIn(List<String> values) {
            addCriterion("fac_company_city in", values, "facCompanyCity");
            return (Criteria) this;
        }

        public Criteria andFacCompanyCityNotIn(List<String> values) {
            addCriterion("fac_company_city not in", values, "facCompanyCity");
            return (Criteria) this;
        }

        public Criteria andFacCompanyCityBetween(String value1, String value2) {
            addCriterion("fac_company_city between", value1, value2, "facCompanyCity");
            return (Criteria) this;
        }

        public Criteria andFacCompanyCityNotBetween(String value1, String value2) {
            addCriterion("fac_company_city not between", value1, value2, "facCompanyCity");
            return (Criteria) this;
        }

        public Criteria andFacCompanyDistrictIsNull() {
            addCriterion("fac_company_district is null");
            return (Criteria) this;
        }

        public Criteria andFacCompanyDistrictIsNotNull() {
            addCriterion("fac_company_district is not null");
            return (Criteria) this;
        }

        public Criteria andFacCompanyDistrictEqualTo(String value) {
            addCriterion("fac_company_district =", value, "facCompanyDistrict");
            return (Criteria) this;
        }

        public Criteria andFacCompanyDistrictNotEqualTo(String value) {
            addCriterion("fac_company_district <>", value, "facCompanyDistrict");
            return (Criteria) this;
        }

        public Criteria andFacCompanyDistrictGreaterThan(String value) {
            addCriterion("fac_company_district >", value, "facCompanyDistrict");
            return (Criteria) this;
        }

        public Criteria andFacCompanyDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("fac_company_district >=", value, "facCompanyDistrict");
            return (Criteria) this;
        }

        public Criteria andFacCompanyDistrictLessThan(String value) {
            addCriterion("fac_company_district <", value, "facCompanyDistrict");
            return (Criteria) this;
        }

        public Criteria andFacCompanyDistrictLessThanOrEqualTo(String value) {
            addCriterion("fac_company_district <=", value, "facCompanyDistrict");
            return (Criteria) this;
        }

        public Criteria andFacCompanyDistrictLike(String value) {
            addCriterion("fac_company_district like", value, "facCompanyDistrict");
            return (Criteria) this;
        }

        public Criteria andFacCompanyDistrictNotLike(String value) {
            addCriterion("fac_company_district not like", value, "facCompanyDistrict");
            return (Criteria) this;
        }

        public Criteria andFacCompanyDistrictIn(List<String> values) {
            addCriterion("fac_company_district in", values, "facCompanyDistrict");
            return (Criteria) this;
        }

        public Criteria andFacCompanyDistrictNotIn(List<String> values) {
            addCriterion("fac_company_district not in", values, "facCompanyDistrict");
            return (Criteria) this;
        }

        public Criteria andFacCompanyDistrictBetween(String value1, String value2) {
            addCriterion("fac_company_district between", value1, value2, "facCompanyDistrict");
            return (Criteria) this;
        }

        public Criteria andFacCompanyDistrictNotBetween(String value1, String value2) {
            addCriterion("fac_company_district not between", value1, value2, "facCompanyDistrict");
            return (Criteria) this;
        }

        public Criteria andFacCompanyAddressIsNull() {
            addCriterion("fac_company_address is null");
            return (Criteria) this;
        }

        public Criteria andFacCompanyAddressIsNotNull() {
            addCriterion("fac_company_address is not null");
            return (Criteria) this;
        }

        public Criteria andFacCompanyAddressEqualTo(String value) {
            addCriterion("fac_company_address =", value, "facCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andFacCompanyAddressNotEqualTo(String value) {
            addCriterion("fac_company_address <>", value, "facCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andFacCompanyAddressGreaterThan(String value) {
            addCriterion("fac_company_address >", value, "facCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andFacCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("fac_company_address >=", value, "facCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andFacCompanyAddressLessThan(String value) {
            addCriterion("fac_company_address <", value, "facCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andFacCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("fac_company_address <=", value, "facCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andFacCompanyAddressLike(String value) {
            addCriterion("fac_company_address like", value, "facCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andFacCompanyAddressNotLike(String value) {
            addCriterion("fac_company_address not like", value, "facCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andFacCompanyAddressIn(List<String> values) {
            addCriterion("fac_company_address in", values, "facCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andFacCompanyAddressNotIn(List<String> values) {
            addCriterion("fac_company_address not in", values, "facCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andFacCompanyAddressBetween(String value1, String value2) {
            addCriterion("fac_company_address between", value1, value2, "facCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andFacCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("fac_company_address not between", value1, value2, "facCompanyAddress");
            return (Criteria) this;
        }

        public Criteria andFacCompanyPhoneIsNull() {
            addCriterion("fac_company_phone is null");
            return (Criteria) this;
        }

        public Criteria andFacCompanyPhoneIsNotNull() {
            addCriterion("fac_company_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFacCompanyPhoneEqualTo(String value) {
            addCriterion("fac_company_phone =", value, "facCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andFacCompanyPhoneNotEqualTo(String value) {
            addCriterion("fac_company_phone <>", value, "facCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andFacCompanyPhoneGreaterThan(String value) {
            addCriterion("fac_company_phone >", value, "facCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andFacCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("fac_company_phone >=", value, "facCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andFacCompanyPhoneLessThan(String value) {
            addCriterion("fac_company_phone <", value, "facCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andFacCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("fac_company_phone <=", value, "facCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andFacCompanyPhoneLike(String value) {
            addCriterion("fac_company_phone like", value, "facCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andFacCompanyPhoneNotLike(String value) {
            addCriterion("fac_company_phone not like", value, "facCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andFacCompanyPhoneIn(List<String> values) {
            addCriterion("fac_company_phone in", values, "facCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andFacCompanyPhoneNotIn(List<String> values) {
            addCriterion("fac_company_phone not in", values, "facCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andFacCompanyPhoneBetween(String value1, String value2) {
            addCriterion("fac_company_phone between", value1, value2, "facCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andFacCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("fac_company_phone not between", value1, value2, "facCompanyPhone");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyNameIsNull() {
            addCriterion("fac_emergency_name is null");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyNameIsNotNull() {
            addCriterion("fac_emergency_name is not null");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyNameEqualTo(String value) {
            addCriterion("fac_emergency_name =", value, "facEmergencyName");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyNameNotEqualTo(String value) {
            addCriterion("fac_emergency_name <>", value, "facEmergencyName");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyNameGreaterThan(String value) {
            addCriterion("fac_emergency_name >", value, "facEmergencyName");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyNameGreaterThanOrEqualTo(String value) {
            addCriterion("fac_emergency_name >=", value, "facEmergencyName");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyNameLessThan(String value) {
            addCriterion("fac_emergency_name <", value, "facEmergencyName");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyNameLessThanOrEqualTo(String value) {
            addCriterion("fac_emergency_name <=", value, "facEmergencyName");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyNameLike(String value) {
            addCriterion("fac_emergency_name like", value, "facEmergencyName");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyNameNotLike(String value) {
            addCriterion("fac_emergency_name not like", value, "facEmergencyName");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyNameIn(List<String> values) {
            addCriterion("fac_emergency_name in", values, "facEmergencyName");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyNameNotIn(List<String> values) {
            addCriterion("fac_emergency_name not in", values, "facEmergencyName");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyNameBetween(String value1, String value2) {
            addCriterion("fac_emergency_name between", value1, value2, "facEmergencyName");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyNameNotBetween(String value1, String value2) {
            addCriterion("fac_emergency_name not between", value1, value2, "facEmergencyName");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyPhoneIsNull() {
            addCriterion("fac_emergency_phone is null");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyPhoneIsNotNull() {
            addCriterion("fac_emergency_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyPhoneEqualTo(String value) {
            addCriterion("fac_emergency_phone =", value, "facEmergencyPhone");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyPhoneNotEqualTo(String value) {
            addCriterion("fac_emergency_phone <>", value, "facEmergencyPhone");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyPhoneGreaterThan(String value) {
            addCriterion("fac_emergency_phone >", value, "facEmergencyPhone");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("fac_emergency_phone >=", value, "facEmergencyPhone");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyPhoneLessThan(String value) {
            addCriterion("fac_emergency_phone <", value, "facEmergencyPhone");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyPhoneLessThanOrEqualTo(String value) {
            addCriterion("fac_emergency_phone <=", value, "facEmergencyPhone");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyPhoneLike(String value) {
            addCriterion("fac_emergency_phone like", value, "facEmergencyPhone");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyPhoneNotLike(String value) {
            addCriterion("fac_emergency_phone not like", value, "facEmergencyPhone");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyPhoneIn(List<String> values) {
            addCriterion("fac_emergency_phone in", values, "facEmergencyPhone");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyPhoneNotIn(List<String> values) {
            addCriterion("fac_emergency_phone not in", values, "facEmergencyPhone");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyPhoneBetween(String value1, String value2) {
            addCriterion("fac_emergency_phone between", value1, value2, "facEmergencyPhone");
            return (Criteria) this;
        }

        public Criteria andFacEmergencyPhoneNotBetween(String value1, String value2) {
            addCriterion("fac_emergency_phone not between", value1, value2, "facEmergencyPhone");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationCodeIsNull() {
            addCriterion("fac_organization_code is null");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationCodeIsNotNull() {
            addCriterion("fac_organization_code is not null");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationCodeEqualTo(String value) {
            addCriterion("fac_organization_code =", value, "facOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationCodeNotEqualTo(String value) {
            addCriterion("fac_organization_code <>", value, "facOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationCodeGreaterThan(String value) {
            addCriterion("fac_organization_code >", value, "facOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fac_organization_code >=", value, "facOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationCodeLessThan(String value) {
            addCriterion("fac_organization_code <", value, "facOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationCodeLessThanOrEqualTo(String value) {
            addCriterion("fac_organization_code <=", value, "facOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationCodeLike(String value) {
            addCriterion("fac_organization_code like", value, "facOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationCodeNotLike(String value) {
            addCriterion("fac_organization_code not like", value, "facOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationCodeIn(List<String> values) {
            addCriterion("fac_organization_code in", values, "facOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationCodeNotIn(List<String> values) {
            addCriterion("fac_organization_code not in", values, "facOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationCodeBetween(String value1, String value2) {
            addCriterion("fac_organization_code between", value1, value2, "facOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationCodeNotBetween(String value1, String value2) {
            addCriterion("fac_organization_code not between", value1, value2, "facOrganizationCode");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationStartTimeIsNull() {
            addCriterion("fac_organization_start_time is null");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationStartTimeIsNotNull() {
            addCriterion("fac_organization_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationStartTimeEqualTo(Date value) {
            addCriterion("fac_organization_start_time =", value, "facOrganizationStartTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationStartTimeNotEqualTo(Date value) {
            addCriterion("fac_organization_start_time <>", value, "facOrganizationStartTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationStartTimeGreaterThan(Date value) {
            addCriterion("fac_organization_start_time >", value, "facOrganizationStartTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fac_organization_start_time >=", value, "facOrganizationStartTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationStartTimeLessThan(Date value) {
            addCriterion("fac_organization_start_time <", value, "facOrganizationStartTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("fac_organization_start_time <=", value, "facOrganizationStartTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationStartTimeIn(List<Date> values) {
            addCriterion("fac_organization_start_time in", values, "facOrganizationStartTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationStartTimeNotIn(List<Date> values) {
            addCriterion("fac_organization_start_time not in", values, "facOrganizationStartTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationStartTimeBetween(Date value1, Date value2) {
            addCriterion("fac_organization_start_time between", value1, value2, "facOrganizationStartTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("fac_organization_start_time not between", value1, value2, "facOrganizationStartTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationEndTimeIsNull() {
            addCriterion("fac_organization_end_time is null");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationEndTimeIsNotNull() {
            addCriterion("fac_organization_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationEndTimeEqualTo(Date value) {
            addCriterion("fac_organization_end_time =", value, "facOrganizationEndTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationEndTimeNotEqualTo(Date value) {
            addCriterion("fac_organization_end_time <>", value, "facOrganizationEndTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationEndTimeGreaterThan(Date value) {
            addCriterion("fac_organization_end_time >", value, "facOrganizationEndTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fac_organization_end_time >=", value, "facOrganizationEndTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationEndTimeLessThan(Date value) {
            addCriterion("fac_organization_end_time <", value, "facOrganizationEndTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("fac_organization_end_time <=", value, "facOrganizationEndTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationEndTimeIn(List<Date> values) {
            addCriterion("fac_organization_end_time in", values, "facOrganizationEndTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationEndTimeNotIn(List<Date> values) {
            addCriterion("fac_organization_end_time not in", values, "facOrganizationEndTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationEndTimeBetween(Date value1, Date value2) {
            addCriterion("fac_organization_end_time between", value1, value2, "facOrganizationEndTime");
            return (Criteria) this;
        }

        public Criteria andFacOrganizationEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("fac_organization_end_time not between", value1, value2, "facOrganizationEndTime");
            return (Criteria) this;
        }

        public Criteria andFacBankNameIsNull() {
            addCriterion("fac_bank_name is null");
            return (Criteria) this;
        }

        public Criteria andFacBankNameIsNotNull() {
            addCriterion("fac_bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andFacBankNameEqualTo(String value) {
            addCriterion("fac_bank_name =", value, "facBankName");
            return (Criteria) this;
        }

        public Criteria andFacBankNameNotEqualTo(String value) {
            addCriterion("fac_bank_name <>", value, "facBankName");
            return (Criteria) this;
        }

        public Criteria andFacBankNameGreaterThan(String value) {
            addCriterion("fac_bank_name >", value, "facBankName");
            return (Criteria) this;
        }

        public Criteria andFacBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("fac_bank_name >=", value, "facBankName");
            return (Criteria) this;
        }

        public Criteria andFacBankNameLessThan(String value) {
            addCriterion("fac_bank_name <", value, "facBankName");
            return (Criteria) this;
        }

        public Criteria andFacBankNameLessThanOrEqualTo(String value) {
            addCriterion("fac_bank_name <=", value, "facBankName");
            return (Criteria) this;
        }

        public Criteria andFacBankNameLike(String value) {
            addCriterion("fac_bank_name like", value, "facBankName");
            return (Criteria) this;
        }

        public Criteria andFacBankNameNotLike(String value) {
            addCriterion("fac_bank_name not like", value, "facBankName");
            return (Criteria) this;
        }

        public Criteria andFacBankNameIn(List<String> values) {
            addCriterion("fac_bank_name in", values, "facBankName");
            return (Criteria) this;
        }

        public Criteria andFacBankNameNotIn(List<String> values) {
            addCriterion("fac_bank_name not in", values, "facBankName");
            return (Criteria) this;
        }

        public Criteria andFacBankNameBetween(String value1, String value2) {
            addCriterion("fac_bank_name between", value1, value2, "facBankName");
            return (Criteria) this;
        }

        public Criteria andFacBankNameNotBetween(String value1, String value2) {
            addCriterion("fac_bank_name not between", value1, value2, "facBankName");
            return (Criteria) this;
        }

        public Criteria andFacAccountUrlIsNull() {
            addCriterion("fac_account_url is null");
            return (Criteria) this;
        }

        public Criteria andFacAccountUrlIsNotNull() {
            addCriterion("fac_account_url is not null");
            return (Criteria) this;
        }

        public Criteria andFacAccountUrlEqualTo(String value) {
            addCriterion("fac_account_url =", value, "facAccountUrl");
            return (Criteria) this;
        }

        public Criteria andFacAccountUrlNotEqualTo(String value) {
            addCriterion("fac_account_url <>", value, "facAccountUrl");
            return (Criteria) this;
        }

        public Criteria andFacAccountUrlGreaterThan(String value) {
            addCriterion("fac_account_url >", value, "facAccountUrl");
            return (Criteria) this;
        }

        public Criteria andFacAccountUrlGreaterThanOrEqualTo(String value) {
            addCriterion("fac_account_url >=", value, "facAccountUrl");
            return (Criteria) this;
        }

        public Criteria andFacAccountUrlLessThan(String value) {
            addCriterion("fac_account_url <", value, "facAccountUrl");
            return (Criteria) this;
        }

        public Criteria andFacAccountUrlLessThanOrEqualTo(String value) {
            addCriterion("fac_account_url <=", value, "facAccountUrl");
            return (Criteria) this;
        }

        public Criteria andFacAccountUrlLike(String value) {
            addCriterion("fac_account_url like", value, "facAccountUrl");
            return (Criteria) this;
        }

        public Criteria andFacAccountUrlNotLike(String value) {
            addCriterion("fac_account_url not like", value, "facAccountUrl");
            return (Criteria) this;
        }

        public Criteria andFacAccountUrlIn(List<String> values) {
            addCriterion("fac_account_url in", values, "facAccountUrl");
            return (Criteria) this;
        }

        public Criteria andFacAccountUrlNotIn(List<String> values) {
            addCriterion("fac_account_url not in", values, "facAccountUrl");
            return (Criteria) this;
        }

        public Criteria andFacAccountUrlBetween(String value1, String value2) {
            addCriterion("fac_account_url between", value1, value2, "facAccountUrl");
            return (Criteria) this;
        }

        public Criteria andFacAccountUrlNotBetween(String value1, String value2) {
            addCriterion("fac_account_url not between", value1, value2, "facAccountUrl");
            return (Criteria) this;
        }

        public Criteria andFacAccountNumberIsNull() {
            addCriterion("fac_account_number is null");
            return (Criteria) this;
        }

        public Criteria andFacAccountNumberIsNotNull() {
            addCriterion("fac_account_number is not null");
            return (Criteria) this;
        }

        public Criteria andFacAccountNumberEqualTo(String value) {
            addCriterion("fac_account_number =", value, "facAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFacAccountNumberNotEqualTo(String value) {
            addCriterion("fac_account_number <>", value, "facAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFacAccountNumberGreaterThan(String value) {
            addCriterion("fac_account_number >", value, "facAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFacAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("fac_account_number >=", value, "facAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFacAccountNumberLessThan(String value) {
            addCriterion("fac_account_number <", value, "facAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFacAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("fac_account_number <=", value, "facAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFacAccountNumberLike(String value) {
            addCriterion("fac_account_number like", value, "facAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFacAccountNumberNotLike(String value) {
            addCriterion("fac_account_number not like", value, "facAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFacAccountNumberIn(List<String> values) {
            addCriterion("fac_account_number in", values, "facAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFacAccountNumberNotIn(List<String> values) {
            addCriterion("fac_account_number not in", values, "facAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFacAccountNumberBetween(String value1, String value2) {
            addCriterion("fac_account_number between", value1, value2, "facAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFacAccountNumberNotBetween(String value1, String value2) {
            addCriterion("fac_account_number not between", value1, value2, "facAccountNumber");
            return (Criteria) this;
        }

        public Criteria andFacStrategyIsNull() {
            addCriterion("fac_strategy is null");
            return (Criteria) this;
        }

        public Criteria andFacStrategyIsNotNull() {
            addCriterion("fac_strategy is not null");
            return (Criteria) this;
        }

        public Criteria andFacStrategyEqualTo(Byte value) {
            addCriterion("fac_strategy =", value, "facStrategy");
            return (Criteria) this;
        }

        public Criteria andFacStrategyNotEqualTo(Byte value) {
            addCriterion("fac_strategy <>", value, "facStrategy");
            return (Criteria) this;
        }

        public Criteria andFacStrategyGreaterThan(Byte value) {
            addCriterion("fac_strategy >", value, "facStrategy");
            return (Criteria) this;
        }

        public Criteria andFacStrategyGreaterThanOrEqualTo(Byte value) {
            addCriterion("fac_strategy >=", value, "facStrategy");
            return (Criteria) this;
        }

        public Criteria andFacStrategyLessThan(Byte value) {
            addCriterion("fac_strategy <", value, "facStrategy");
            return (Criteria) this;
        }

        public Criteria andFacStrategyLessThanOrEqualTo(Byte value) {
            addCriterion("fac_strategy <=", value, "facStrategy");
            return (Criteria) this;
        }

        public Criteria andFacStrategyIn(List<Byte> values) {
            addCriterion("fac_strategy in", values, "facStrategy");
            return (Criteria) this;
        }

        public Criteria andFacStrategyNotIn(List<Byte> values) {
            addCriterion("fac_strategy not in", values, "facStrategy");
            return (Criteria) this;
        }

        public Criteria andFacStrategyBetween(Byte value1, Byte value2) {
            addCriterion("fac_strategy between", value1, value2, "facStrategy");
            return (Criteria) this;
        }

        public Criteria andFacStrategyNotBetween(Byte value1, Byte value2) {
            addCriterion("fac_strategy not between", value1, value2, "facStrategy");
            return (Criteria) this;
        }

        public Criteria andParentFacIdIsNull() {
            addCriterion("parent_fac_id is null");
            return (Criteria) this;
        }

        public Criteria andParentFacIdIsNotNull() {
            addCriterion("parent_fac_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentFacIdEqualTo(String value) {
            addCriterion("parent_fac_id =", value, "parentFacId");
            return (Criteria) this;
        }

        public Criteria andParentFacIdNotEqualTo(String value) {
            addCriterion("parent_fac_id <>", value, "parentFacId");
            return (Criteria) this;
        }

        public Criteria andParentFacIdGreaterThan(String value) {
            addCriterion("parent_fac_id >", value, "parentFacId");
            return (Criteria) this;
        }

        public Criteria andParentFacIdGreaterThanOrEqualTo(String value) {
            addCriterion("parent_fac_id >=", value, "parentFacId");
            return (Criteria) this;
        }

        public Criteria andParentFacIdLessThan(String value) {
            addCriterion("parent_fac_id <", value, "parentFacId");
            return (Criteria) this;
        }

        public Criteria andParentFacIdLessThanOrEqualTo(String value) {
            addCriterion("parent_fac_id <=", value, "parentFacId");
            return (Criteria) this;
        }

        public Criteria andParentFacIdLike(String value) {
            addCriterion("parent_fac_id like", value, "parentFacId");
            return (Criteria) this;
        }

        public Criteria andParentFacIdNotLike(String value) {
            addCriterion("parent_fac_id not like", value, "parentFacId");
            return (Criteria) this;
        }

        public Criteria andParentFacIdIn(List<String> values) {
            addCriterion("parent_fac_id in", values, "parentFacId");
            return (Criteria) this;
        }

        public Criteria andParentFacIdNotIn(List<String> values) {
            addCriterion("parent_fac_id not in", values, "parentFacId");
            return (Criteria) this;
        }

        public Criteria andParentFacIdBetween(String value1, String value2) {
            addCriterion("parent_fac_id between", value1, value2, "parentFacId");
            return (Criteria) this;
        }

        public Criteria andParentFacIdNotBetween(String value1, String value2) {
            addCriterion("parent_fac_id not between", value1, value2, "parentFacId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andFacReserved1IsNull() {
            addCriterion("fac_reserved1 is null");
            return (Criteria) this;
        }

        public Criteria andFacReserved1IsNotNull() {
            addCriterion("fac_reserved1 is not null");
            return (Criteria) this;
        }

        public Criteria andFacReserved1EqualTo(String value) {
            addCriterion("fac_reserved1 =", value, "facReserved1");
            return (Criteria) this;
        }

        public Criteria andFacReserved1NotEqualTo(String value) {
            addCriterion("fac_reserved1 <>", value, "facReserved1");
            return (Criteria) this;
        }

        public Criteria andFacReserved1GreaterThan(String value) {
            addCriterion("fac_reserved1 >", value, "facReserved1");
            return (Criteria) this;
        }

        public Criteria andFacReserved1GreaterThanOrEqualTo(String value) {
            addCriterion("fac_reserved1 >=", value, "facReserved1");
            return (Criteria) this;
        }

        public Criteria andFacReserved1LessThan(String value) {
            addCriterion("fac_reserved1 <", value, "facReserved1");
            return (Criteria) this;
        }

        public Criteria andFacReserved1LessThanOrEqualTo(String value) {
            addCriterion("fac_reserved1 <=", value, "facReserved1");
            return (Criteria) this;
        }

        public Criteria andFacReserved1Like(String value) {
            addCriterion("fac_reserved1 like", value, "facReserved1");
            return (Criteria) this;
        }

        public Criteria andFacReserved1NotLike(String value) {
            addCriterion("fac_reserved1 not like", value, "facReserved1");
            return (Criteria) this;
        }

        public Criteria andFacReserved1In(List<String> values) {
            addCriterion("fac_reserved1 in", values, "facReserved1");
            return (Criteria) this;
        }

        public Criteria andFacReserved1NotIn(List<String> values) {
            addCriterion("fac_reserved1 not in", values, "facReserved1");
            return (Criteria) this;
        }

        public Criteria andFacReserved1Between(String value1, String value2) {
            addCriterion("fac_reserved1 between", value1, value2, "facReserved1");
            return (Criteria) this;
        }

        public Criteria andFacReserved1NotBetween(String value1, String value2) {
            addCriterion("fac_reserved1 not between", value1, value2, "facReserved1");
            return (Criteria) this;
        }

        public Criteria andFacReserved2IsNull() {
            addCriterion("fac_reserved2 is null");
            return (Criteria) this;
        }

        public Criteria andFacReserved2IsNotNull() {
            addCriterion("fac_reserved2 is not null");
            return (Criteria) this;
        }

        public Criteria andFacReserved2EqualTo(String value) {
            addCriterion("fac_reserved2 =", value, "facReserved2");
            return (Criteria) this;
        }

        public Criteria andFacReserved2NotEqualTo(String value) {
            addCriterion("fac_reserved2 <>", value, "facReserved2");
            return (Criteria) this;
        }

        public Criteria andFacReserved2GreaterThan(String value) {
            addCriterion("fac_reserved2 >", value, "facReserved2");
            return (Criteria) this;
        }

        public Criteria andFacReserved2GreaterThanOrEqualTo(String value) {
            addCriterion("fac_reserved2 >=", value, "facReserved2");
            return (Criteria) this;
        }

        public Criteria andFacReserved2LessThan(String value) {
            addCriterion("fac_reserved2 <", value, "facReserved2");
            return (Criteria) this;
        }

        public Criteria andFacReserved2LessThanOrEqualTo(String value) {
            addCriterion("fac_reserved2 <=", value, "facReserved2");
            return (Criteria) this;
        }

        public Criteria andFacReserved2Like(String value) {
            addCriterion("fac_reserved2 like", value, "facReserved2");
            return (Criteria) this;
        }

        public Criteria andFacReserved2NotLike(String value) {
            addCriterion("fac_reserved2 not like", value, "facReserved2");
            return (Criteria) this;
        }

        public Criteria andFacReserved2In(List<String> values) {
            addCriterion("fac_reserved2 in", values, "facReserved2");
            return (Criteria) this;
        }

        public Criteria andFacReserved2NotIn(List<String> values) {
            addCriterion("fac_reserved2 not in", values, "facReserved2");
            return (Criteria) this;
        }

        public Criteria andFacReserved2Between(String value1, String value2) {
            addCriterion("fac_reserved2 between", value1, value2, "facReserved2");
            return (Criteria) this;
        }

        public Criteria andFacReserved2NotBetween(String value1, String value2) {
            addCriterion("fac_reserved2 not between", value1, value2, "facReserved2");
            return (Criteria) this;
        }

        public Criteria andFacReserved3IsNull() {
            addCriterion("fac_reserved3 is null");
            return (Criteria) this;
        }

        public Criteria andFacReserved3IsNotNull() {
            addCriterion("fac_reserved3 is not null");
            return (Criteria) this;
        }

        public Criteria andFacReserved3EqualTo(String value) {
            addCriterion("fac_reserved3 =", value, "facReserved3");
            return (Criteria) this;
        }

        public Criteria andFacReserved3NotEqualTo(String value) {
            addCriterion("fac_reserved3 <>", value, "facReserved3");
            return (Criteria) this;
        }

        public Criteria andFacReserved3GreaterThan(String value) {
            addCriterion("fac_reserved3 >", value, "facReserved3");
            return (Criteria) this;
        }

        public Criteria andFacReserved3GreaterThanOrEqualTo(String value) {
            addCriterion("fac_reserved3 >=", value, "facReserved3");
            return (Criteria) this;
        }

        public Criteria andFacReserved3LessThan(String value) {
            addCriterion("fac_reserved3 <", value, "facReserved3");
            return (Criteria) this;
        }

        public Criteria andFacReserved3LessThanOrEqualTo(String value) {
            addCriterion("fac_reserved3 <=", value, "facReserved3");
            return (Criteria) this;
        }

        public Criteria andFacReserved3Like(String value) {
            addCriterion("fac_reserved3 like", value, "facReserved3");
            return (Criteria) this;
        }

        public Criteria andFacReserved3NotLike(String value) {
            addCriterion("fac_reserved3 not like", value, "facReserved3");
            return (Criteria) this;
        }

        public Criteria andFacReserved3In(List<String> values) {
            addCriterion("fac_reserved3 in", values, "facReserved3");
            return (Criteria) this;
        }

        public Criteria andFacReserved3NotIn(List<String> values) {
            addCriterion("fac_reserved3 not in", values, "facReserved3");
            return (Criteria) this;
        }

        public Criteria andFacReserved3Between(String value1, String value2) {
            addCriterion("fac_reserved3 between", value1, value2, "facReserved3");
            return (Criteria) this;
        }

        public Criteria andFacReserved3NotBetween(String value1, String value2) {
            addCriterion("fac_reserved3 not between", value1, value2, "facReserved3");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}