package com.baosight.shgt.service.support.persistence.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TCsClaimsBggfExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public TCsClaimsBggfExample()
    {
        this.oredCriteria = new ArrayList();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return this.orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return this.distinct;
    }

    public List<Criteria> getOredCriteria() {
        return this.oredCriteria;
    }

    public void or(Criteria criteria) {
        this.oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        this.oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (this.oredCriteria.size() == 0) {
            this.oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        this.oredCriteria.clear();
        this.orderByClause = null;
        this.distinct = false;
    }

    public static class Criterion
    {
        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;
        private String typeHandler;

        public String getCondition()
        {
            return this.condition;
        }

        public Object getValue() {
            return this.value;
        }

        public Object getSecondValue() {
            return this.secondValue;
        }

        public boolean isNoValue() {
            return this.noValue;
        }

        public boolean isSingleValue() {
            return this.singleValue;
        }

        public boolean isBetweenValue() {
            return this.betweenValue;
        }

        public boolean isListValue() {
            return this.listValue;
        }

        public String getTypeHandler() {
            return this.typeHandler;
        }

        protected Criterion(String condition)
        {
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler)
        {
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if ((value instanceof List))
                this.listValue = true;
            else
                this.singleValue = true;
        }

        protected Criterion(String condition, Object value)
        {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler)
        {
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

    public static class Criteria extends TCsClaimsBggfExample.GeneratedCriteria
    {
    }

    protected static abstract class GeneratedCriteria
    {
        protected List<TCsClaimsBggfExample.Criterion> criteria;

        protected GeneratedCriteria()
        {
            this.criteria = new ArrayList();
        }

        public boolean isValid() {
            return this.criteria.size() > 0;
        }

        public List<TCsClaimsBggfExample.Criterion> getAllCriteria() {
            return this.criteria;
        }

        public List<TCsClaimsBggfExample.Criterion> getCriteria() {
            return this.criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            this.criteria.add(new TCsClaimsBggfExample.Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            this.criteria.add(new TCsClaimsBggfExample.Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if ((value1 == null) || (value2 == null)) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            this.criteria.add(new TCsClaimsBggfExample.Criterion(condition, value1, value2));
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfIdIsNull() {
            addCriterion("complaint_bggf_id is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfIdIsNotNull() {
            addCriterion("complaint_bggf_id is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfIdEqualTo(Long value) {
            addCriterion("complaint_bggf_id =", value, "complaintBggfId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfIdNotEqualTo(Long value) {
            addCriterion("complaint_bggf_id <>", value, "complaintBggfId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfIdGreaterThan(Long value) {
            addCriterion("complaint_bggf_id >", value, "complaintBggfId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfIdGreaterThanOrEqualTo(Long value) {
            addCriterion("complaint_bggf_id >=", value, "complaintBggfId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfIdLessThan(Long value) {
            addCriterion("complaint_bggf_id <", value, "complaintBggfId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfIdLessThanOrEqualTo(Long value) {
            addCriterion("complaint_bggf_id <=", value, "complaintBggfId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfIdIn(List<Long> values) {
            addCriterion("complaint_bggf_id in", values, "complaintBggfId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfIdNotIn(List<Long> values) {
            addCriterion("complaint_bggf_id not in", values, "complaintBggfId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfIdBetween(Long value1, Long value2) {
            addCriterion("complaint_bggf_id between", value1, value2, "complaintBggfId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfIdNotBetween(Long value1, Long value2) {
            addCriterion("complaint_bggf_id not between", value1, value2, "complaintBggfId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfCodeIsNull() {
            addCriterion("complaint_bggf_code is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfCodeIsNotNull() {
            addCriterion("complaint_bggf_code is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfCodeEqualTo(String value) {
            addCriterion("complaint_bggf_code =", value, "complaintBggfCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfCodeNotEqualTo(String value) {
            addCriterion("complaint_bggf_code <>", value, "complaintBggfCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfCodeGreaterThan(String value) {
            addCriterion("complaint_bggf_code >", value, "complaintBggfCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfCodeGreaterThanOrEqualTo(String value) {
            addCriterion("complaint_bggf_code >=", value, "complaintBggfCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfCodeLessThan(String value) {
            addCriterion("complaint_bggf_code <", value, "complaintBggfCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfCodeLessThanOrEqualTo(String value) {
            addCriterion("complaint_bggf_code <=", value, "complaintBggfCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfCodeLike(String value) {
            addCriterion("complaint_bggf_code like", value, "complaintBggfCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfCodeNotLike(String value) {
            addCriterion("complaint_bggf_code not like", value, "complaintBggfCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfCodeIn(List<String> values) {
            addCriterion("complaint_bggf_code in", values, "complaintBggfCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfCodeNotIn(List<String> values) {
            addCriterion("complaint_bggf_code not in", values, "complaintBggfCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfCodeBetween(String value1, String value2) {
            addCriterion("complaint_bggf_code between", value1, value2, "complaintBggfCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplaintBggfCodeNotBetween(String value1, String value2) {
            addCriterion("complaint_bggf_code not between", value1, value2, "complaintBggfCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationSourceIsNull() {
            addCriterion("information_source is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationSourceIsNotNull() {
            addCriterion("information_source is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationSourceEqualTo(String value) {
            addCriterion("information_source =", value, "informationSource");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationSourceNotEqualTo(String value) {
            addCriterion("information_source <>", value, "informationSource");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationSourceGreaterThan(String value) {
            addCriterion("information_source >", value, "informationSource");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationSourceGreaterThanOrEqualTo(String value) {
            addCriterion("information_source >=", value, "informationSource");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationSourceLessThan(String value) {
            addCriterion("information_source <", value, "informationSource");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationSourceLessThanOrEqualTo(String value) {
            addCriterion("information_source <=", value, "informationSource");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationSourceLike(String value) {
            addCriterion("information_source like", value, "informationSource");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationSourceNotLike(String value) {
            addCriterion("information_source not like", value, "informationSource");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationSourceIn(List<String> values) {
            addCriterion("information_source in", values, "informationSource");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationSourceNotIn(List<String> values) {
            addCriterion("information_source not in", values, "informationSource");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationSourceBetween(String value1, String value2) {
            addCriterion("information_source between", value1, value2, "informationSource");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationSourceNotBetween(String value1, String value2) {
            addCriterion("information_source not between", value1, value2, "informationSource");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationNumExIsNull() {
            addCriterion("information_num_ex is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationNumExIsNotNull() {
            addCriterion("information_num_ex is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationNumExEqualTo(String value) {
            addCriterion("information_num_ex =", value, "informationNumEx");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationNumExNotEqualTo(String value) {
            addCriterion("information_num_ex <>", value, "informationNumEx");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationNumExGreaterThan(String value) {
            addCriterion("information_num_ex >", value, "informationNumEx");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationNumExGreaterThanOrEqualTo(String value) {
            addCriterion("information_num_ex >=", value, "informationNumEx");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationNumExLessThan(String value) {
            addCriterion("information_num_ex <", value, "informationNumEx");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationNumExLessThanOrEqualTo(String value) {
            addCriterion("information_num_ex <=", value, "informationNumEx");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationNumExLike(String value) {
            addCriterion("information_num_ex like", value, "informationNumEx");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationNumExNotLike(String value) {
            addCriterion("information_num_ex not like", value, "informationNumEx");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationNumExIn(List<String> values) {
            addCriterion("information_num_ex in", values, "informationNumEx");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationNumExNotIn(List<String> values) {
            addCriterion("information_num_ex not in", values, "informationNumEx");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationNumExBetween(String value1, String value2) {
            addCriterion("information_num_ex between", value1, value2, "informationNumEx");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationNumExNotBetween(String value1, String value2) {
            addCriterion("information_num_ex not between", value1, value2, "informationNumEx");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCompanyAliasIsNull() {
            addCriterion("company_alias is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCompanyAliasIsNotNull() {
            addCriterion("company_alias is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCompanyAliasEqualTo(String value) {
            addCriterion("company_alias =", value, "companyAlias");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCompanyAliasNotEqualTo(String value) {
            addCriterion("company_alias <>", value, "companyAlias");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCompanyAliasGreaterThan(String value) {
            addCriterion("company_alias >", value, "companyAlias");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCompanyAliasGreaterThanOrEqualTo(String value) {
            addCriterion("company_alias >=", value, "companyAlias");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCompanyAliasLessThan(String value) {
            addCriterion("company_alias <", value, "companyAlias");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCompanyAliasLessThanOrEqualTo(String value) {
            addCriterion("company_alias <=", value, "companyAlias");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCompanyAliasLike(String value) {
            addCriterion("company_alias like", value, "companyAlias");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCompanyAliasNotLike(String value) {
            addCriterion("company_alias not like", value, "companyAlias");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCompanyAliasIn(List<String> values) {
            addCriterion("company_alias in", values, "companyAlias");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCompanyAliasNotIn(List<String> values) {
            addCriterion("company_alias not in", values, "companyAlias");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCompanyAliasBetween(String value1, String value2) {
            addCriterion("company_alias between", value1, value2, "companyAlias");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCompanyAliasNotBetween(String value1, String value2) {
            addCriterion("company_alias not between", value1, value2, "companyAlias");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationKindIsNull() {
            addCriterion("information_kind is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationKindIsNotNull() {
            addCriterion("information_kind is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationKindEqualTo(String value) {
            addCriterion("information_kind =", value, "informationKind");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationKindNotEqualTo(String value) {
            addCriterion("information_kind <>", value, "informationKind");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationKindGreaterThan(String value) {
            addCriterion("information_kind >", value, "informationKind");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationKindGreaterThanOrEqualTo(String value) {
            addCriterion("information_kind >=", value, "informationKind");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationKindLessThan(String value) {
            addCriterion("information_kind <", value, "informationKind");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationKindLessThanOrEqualTo(String value) {
            addCriterion("information_kind <=", value, "informationKind");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationKindLike(String value) {
            addCriterion("information_kind like", value, "informationKind");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationKindNotLike(String value) {
            addCriterion("information_kind not like", value, "informationKind");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationKindIn(List<String> values) {
            addCriterion("information_kind in", values, "informationKind");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationKindNotIn(List<String> values) {
            addCriterion("information_kind not in", values, "informationKind");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationKindBetween(String value1, String value2) {
            addCriterion("information_kind between", value1, value2, "informationKind");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationKindNotBetween(String value1, String value2) {
            addCriterion("information_kind not between", value1, value2, "informationKind");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationTypeIsNull() {
            addCriterion("information_type is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationTypeIsNotNull() {
            addCriterion("information_type is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationTypeEqualTo(String value) {
            addCriterion("information_type =", value, "informationType");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationTypeNotEqualTo(String value) {
            addCriterion("information_type <>", value, "informationType");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationTypeGreaterThan(String value) {
            addCriterion("information_type >", value, "informationType");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("information_type >=", value, "informationType");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationTypeLessThan(String value) {
            addCriterion("information_type <", value, "informationType");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationTypeLessThanOrEqualTo(String value) {
            addCriterion("information_type <=", value, "informationType");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationTypeLike(String value) {
            addCriterion("information_type like", value, "informationType");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationTypeNotLike(String value) {
            addCriterion("information_type not like", value, "informationType");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationTypeIn(List<String> values) {
            addCriterion("information_type in", values, "informationType");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationTypeNotIn(List<String> values) {
            addCriterion("information_type not in", values, "informationType");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationTypeBetween(String value1, String value2) {
            addCriterion("information_type between", value1, value2, "informationType");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationTypeNotBetween(String value1, String value2) {
            addCriterion("information_type not between", value1, value2, "informationType");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andProdCodeIsNull() {
            addCriterion("prod_code is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andProdCodeIsNotNull() {
            addCriterion("prod_code is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andProdCodeEqualTo(String value) {
            addCriterion("prod_code =", value, "prodCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andProdCodeNotEqualTo(String value) {
            addCriterion("prod_code <>", value, "prodCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andProdCodeGreaterThan(String value) {
            addCriterion("prod_code >", value, "prodCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andProdCodeGreaterThanOrEqualTo(String value) {
            addCriterion("prod_code >=", value, "prodCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andProdCodeLessThan(String value) {
            addCriterion("prod_code <", value, "prodCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andProdCodeLessThanOrEqualTo(String value) {
            addCriterion("prod_code <=", value, "prodCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andProdCodeLike(String value) {
            addCriterion("prod_code like", value, "prodCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andProdCodeNotLike(String value) {
            addCriterion("prod_code not like", value, "prodCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andProdCodeIn(List<String> values) {
            addCriterion("prod_code in", values, "prodCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andProdCodeNotIn(List<String> values) {
            addCriterion("prod_code not in", values, "prodCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andProdCodeBetween(String value1, String value2) {
            addCriterion("prod_code between", value1, value2, "prodCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andProdCodeNotBetween(String value1, String value2) {
            addCriterion("prod_code not between", value1, value2, "prodCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationAbstractIsNull() {
            addCriterion("information_abstract is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationAbstractIsNotNull() {
            addCriterion("information_abstract is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationAbstractEqualTo(String value) {
            addCriterion("information_abstract =", value, "informationAbstract");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationAbstractNotEqualTo(String value) {
            addCriterion("information_abstract <>", value, "informationAbstract");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationAbstractGreaterThan(String value) {
            addCriterion("information_abstract >", value, "informationAbstract");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("information_abstract >=", value, "informationAbstract");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationAbstractLessThan(String value) {
            addCriterion("information_abstract <", value, "informationAbstract");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationAbstractLessThanOrEqualTo(String value) {
            addCriterion("information_abstract <=", value, "informationAbstract");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationAbstractLike(String value) {
            addCriterion("information_abstract like", value, "informationAbstract");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationAbstractNotLike(String value) {
            addCriterion("information_abstract not like", value, "informationAbstract");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationAbstractIn(List<String> values) {
            addCriterion("information_abstract in", values, "informationAbstract");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationAbstractNotIn(List<String> values) {
            addCriterion("information_abstract not in", values, "informationAbstract");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationAbstractBetween(String value1, String value2) {
            addCriterion("information_abstract between", value1, value2, "informationAbstract");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationAbstractNotBetween(String value1, String value2) {
            addCriterion("information_abstract not between", value1, value2, "informationAbstract");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationUrgDegreeIsNull() {
            addCriterion("information_urg_degree is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationUrgDegreeIsNotNull() {
            addCriterion("information_urg_degree is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationUrgDegreeEqualTo(String value) {
            addCriterion("information_urg_degree =", value, "informationUrgDegree");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationUrgDegreeNotEqualTo(String value) {
            addCriterion("information_urg_degree <>", value, "informationUrgDegree");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationUrgDegreeGreaterThan(String value) {
            addCriterion("information_urg_degree >", value, "informationUrgDegree");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationUrgDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("information_urg_degree >=", value, "informationUrgDegree");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationUrgDegreeLessThan(String value) {
            addCriterion("information_urg_degree <", value, "informationUrgDegree");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationUrgDegreeLessThanOrEqualTo(String value) {
            addCriterion("information_urg_degree <=", value, "informationUrgDegree");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationUrgDegreeLike(String value) {
            addCriterion("information_urg_degree like", value, "informationUrgDegree");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationUrgDegreeNotLike(String value) {
            addCriterion("information_urg_degree not like", value, "informationUrgDegree");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationUrgDegreeIn(List<String> values) {
            addCriterion("information_urg_degree in", values, "informationUrgDegree");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationUrgDegreeNotIn(List<String> values) {
            addCriterion("information_urg_degree not in", values, "informationUrgDegree");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationUrgDegreeBetween(String value1, String value2) {
            addCriterion("information_urg_degree between", value1, value2, "informationUrgDegree");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationUrgDegreeNotBetween(String value1, String value2) {
            addCriterion("information_urg_degree not between", value1, value2, "informationUrgDegree");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationDateIsNull() {
            addCriterion("information_date is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationDateIsNotNull() {
            addCriterion("information_date is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationDateEqualTo(String value) {
            addCriterion("information_date =", value, "informationDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationDateNotEqualTo(String value) {
            addCriterion("information_date <>", value, "informationDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationDateGreaterThan(String value) {
            addCriterion("information_date >", value, "informationDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationDateGreaterThanOrEqualTo(String value) {
            addCriterion("information_date >=", value, "informationDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationDateLessThan(String value) {
            addCriterion("information_date <", value, "informationDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationDateLessThanOrEqualTo(String value) {
            addCriterion("information_date <=", value, "informationDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationDateLike(String value) {
            addCriterion("information_date like", value, "informationDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationDateNotLike(String value) {
            addCriterion("information_date not like", value, "informationDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationDateIn(List<String> values) {
            addCriterion("information_date in", values, "informationDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationDateNotIn(List<String> values) {
            addCriterion("information_date not in", values, "informationDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationDateBetween(String value1, String value2) {
            addCriterion("information_date between", value1, value2, "informationDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationDateNotBetween(String value1, String value2) {
            addCriterion("information_date not between", value1, value2, "informationDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationContentIsNull() {
            addCriterion("information_content is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationContentIsNotNull() {
            addCriterion("information_content is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationContentEqualTo(String value) {
            addCriterion("information_content =", value, "informationContent");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationContentNotEqualTo(String value) {
            addCriterion("information_content <>", value, "informationContent");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationContentGreaterThan(String value) {
            addCriterion("information_content >", value, "informationContent");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationContentGreaterThanOrEqualTo(String value) {
            addCriterion("information_content >=", value, "informationContent");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationContentLessThan(String value) {
            addCriterion("information_content <", value, "informationContent");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationContentLessThanOrEqualTo(String value) {
            addCriterion("information_content <=", value, "informationContent");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationContentLike(String value) {
            addCriterion("information_content like", value, "informationContent");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationContentNotLike(String value) {
            addCriterion("information_content not like", value, "informationContent");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationContentIn(List<String> values) {
            addCriterion("information_content in", values, "informationContent");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationContentNotIn(List<String> values) {
            addCriterion("information_content not in", values, "informationContent");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationContentBetween(String value1, String value2) {
            addCriterion("information_content between", value1, value2, "informationContent");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInformationContentNotBetween(String value1, String value2) {
            addCriterion("information_content not between", value1, value2, "informationContent");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNumIsNull() {
            addCriterion("ord_user_num is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNumIsNotNull() {
            addCriterion("ord_user_num is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNumEqualTo(String value) {
            addCriterion("ord_user_num =", value, "ordUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNumNotEqualTo(String value) {
            addCriterion("ord_user_num <>", value, "ordUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNumGreaterThan(String value) {
            addCriterion("ord_user_num >", value, "ordUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNumGreaterThanOrEqualTo(String value) {
            addCriterion("ord_user_num >=", value, "ordUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNumLessThan(String value) {
            addCriterion("ord_user_num <", value, "ordUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNumLessThanOrEqualTo(String value) {
            addCriterion("ord_user_num <=", value, "ordUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNumLike(String value) {
            addCriterion("ord_user_num like", value, "ordUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNumNotLike(String value) {
            addCriterion("ord_user_num not like", value, "ordUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNumIn(List<String> values) {
            addCriterion("ord_user_num in", values, "ordUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNumNotIn(List<String> values) {
            addCriterion("ord_user_num not in", values, "ordUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNumBetween(String value1, String value2) {
            addCriterion("ord_user_num between", value1, value2, "ordUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNumNotBetween(String value1, String value2) {
            addCriterion("ord_user_num not between", value1, value2, "ordUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNameIsNull() {
            addCriterion("ord_user_name is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNameIsNotNull() {
            addCriterion("ord_user_name is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNameEqualTo(String value) {
            addCriterion("ord_user_name =", value, "ordUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNameNotEqualTo(String value) {
            addCriterion("ord_user_name <>", value, "ordUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNameGreaterThan(String value) {
            addCriterion("ord_user_name >", value, "ordUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("ord_user_name >=", value, "ordUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNameLessThan(String value) {
            addCriterion("ord_user_name <", value, "ordUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNameLessThanOrEqualTo(String value) {
            addCriterion("ord_user_name <=", value, "ordUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNameLike(String value) {
            addCriterion("ord_user_name like", value, "ordUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNameNotLike(String value) {
            addCriterion("ord_user_name not like", value, "ordUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNameIn(List<String> values) {
            addCriterion("ord_user_name in", values, "ordUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNameNotIn(List<String> values) {
            addCriterion("ord_user_name not in", values, "ordUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNameBetween(String value1, String value2) {
            addCriterion("ord_user_name between", value1, value2, "ordUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrdUserNameNotBetween(String value1, String value2) {
            addCriterion("ord_user_name not between", value1, value2, "ordUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaRequireAmtIsNull() {
            addCriterion("rma_require_amt is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaRequireAmtIsNotNull() {
            addCriterion("rma_require_amt is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaRequireAmtEqualTo(BigDecimal value) {
            addCriterion("rma_require_amt =", value, "rmaRequireAmt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaRequireAmtNotEqualTo(BigDecimal value) {
            addCriterion("rma_require_amt <>", value, "rmaRequireAmt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaRequireAmtGreaterThan(BigDecimal value) {
            addCriterion("rma_require_amt >", value, "rmaRequireAmt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaRequireAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rma_require_amt >=", value, "rmaRequireAmt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaRequireAmtLessThan(BigDecimal value) {
            addCriterion("rma_require_amt <", value, "rmaRequireAmt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaRequireAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rma_require_amt <=", value, "rmaRequireAmt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaRequireAmtIn(List<BigDecimal> values) {
            addCriterion("rma_require_amt in", values, "rmaRequireAmt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaRequireAmtNotIn(List<BigDecimal> values) {
            addCriterion("rma_require_amt not in", values, "rmaRequireAmt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaRequireAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rma_require_amt between", value1, value2, "rmaRequireAmt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaRequireAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rma_require_amt not between", value1, value2, "rmaRequireAmt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNumIsNull() {
            addCriterion("fin_user_num is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNumIsNotNull() {
            addCriterion("fin_user_num is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNumEqualTo(String value) {
            addCriterion("fin_user_num =", value, "finUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNumNotEqualTo(String value) {
            addCriterion("fin_user_num <>", value, "finUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNumGreaterThan(String value) {
            addCriterion("fin_user_num >", value, "finUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNumGreaterThanOrEqualTo(String value) {
            addCriterion("fin_user_num >=", value, "finUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNumLessThan(String value) {
            addCriterion("fin_user_num <", value, "finUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNumLessThanOrEqualTo(String value) {
            addCriterion("fin_user_num <=", value, "finUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNumLike(String value) {
            addCriterion("fin_user_num like", value, "finUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNumNotLike(String value) {
            addCriterion("fin_user_num not like", value, "finUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNumIn(List<String> values) {
            addCriterion("fin_user_num in", values, "finUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNumNotIn(List<String> values) {
            addCriterion("fin_user_num not in", values, "finUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNumBetween(String value1, String value2) {
            addCriterion("fin_user_num between", value1, value2, "finUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNumNotBetween(String value1, String value2) {
            addCriterion("fin_user_num not between", value1, value2, "finUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNameIsNull() {
            addCriterion("fin_user_name is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNameIsNotNull() {
            addCriterion("fin_user_name is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNameEqualTo(String value) {
            addCriterion("fin_user_name =", value, "finUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNameNotEqualTo(String value) {
            addCriterion("fin_user_name <>", value, "finUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNameGreaterThan(String value) {
            addCriterion("fin_user_name >", value, "finUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("fin_user_name >=", value, "finUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNameLessThan(String value) {
            addCriterion("fin_user_name <", value, "finUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNameLessThanOrEqualTo(String value) {
            addCriterion("fin_user_name <=", value, "finUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNameLike(String value) {
            addCriterion("fin_user_name like", value, "finUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNameNotLike(String value) {
            addCriterion("fin_user_name not like", value, "finUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNameIn(List<String> values) {
            addCriterion("fin_user_name in", values, "finUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNameNotIn(List<String> values) {
            addCriterion("fin_user_name not in", values, "finUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNameBetween(String value1, String value2) {
            addCriterion("fin_user_name between", value1, value2, "finUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andFinUserNameNotBetween(String value1, String value2) {
            addCriterion("fin_user_name not between", value1, value2, "finUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplainRequireWtIsNull() {
            addCriterion("complain_require_wt is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplainRequireWtIsNotNull() {
            addCriterion("complain_require_wt is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplainRequireWtEqualTo(BigDecimal value) {
            addCriterion("complain_require_wt =", value, "complainRequireWt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplainRequireWtNotEqualTo(BigDecimal value) {
            addCriterion("complain_require_wt <>", value, "complainRequireWt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplainRequireWtGreaterThan(BigDecimal value) {
            addCriterion("complain_require_wt >", value, "complainRequireWt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplainRequireWtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("complain_require_wt >=", value, "complainRequireWt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplainRequireWtLessThan(BigDecimal value) {
            addCriterion("complain_require_wt <", value, "complainRequireWt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplainRequireWtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("complain_require_wt <=", value, "complainRequireWt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplainRequireWtIn(List<BigDecimal> values) {
            addCriterion("complain_require_wt in", values, "complainRequireWt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplainRequireWtNotIn(List<BigDecimal> values) {
            addCriterion("complain_require_wt not in", values, "complainRequireWt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplainRequireWtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("complain_require_wt between", value1, value2, "complainRequireWt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andComplainRequireWtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("complain_require_wt not between", value1, value2, "complainRequireWt");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePictureNumIsNull() {
            addCriterion("create_picture_num is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePictureNumIsNotNull() {
            addCriterion("create_picture_num is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePictureNumEqualTo(Short value) {
            addCriterion("create_picture_num =", value, "createPictureNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePictureNumNotEqualTo(Short value) {
            addCriterion("create_picture_num <>", value, "createPictureNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePictureNumGreaterThan(Short value) {
            addCriterion("create_picture_num >", value, "createPictureNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePictureNumGreaterThanOrEqualTo(Short value) {
            addCriterion("create_picture_num >=", value, "createPictureNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePictureNumLessThan(Short value) {
            addCriterion("create_picture_num <", value, "createPictureNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePictureNumLessThanOrEqualTo(Short value) {
            addCriterion("create_picture_num <=", value, "createPictureNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePictureNumIn(List<Short> values) {
            addCriterion("create_picture_num in", values, "createPictureNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePictureNumNotIn(List<Short> values) {
            addCriterion("create_picture_num not in", values, "createPictureNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePictureNumBetween(Short value1, Short value2) {
            addCriterion("create_picture_num between", value1, value2, "createPictureNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePictureNumNotBetween(Short value1, Short value2) {
            addCriterion("create_picture_num not between", value1, value2, "createPictureNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateTempleteNumIsNull() {
            addCriterion("create_templete_num is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateTempleteNumIsNotNull() {
            addCriterion("create_templete_num is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateTempleteNumEqualTo(Short value) {
            addCriterion("create_templete_num =", value, "createTempleteNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateTempleteNumNotEqualTo(Short value) {
            addCriterion("create_templete_num <>", value, "createTempleteNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateTempleteNumGreaterThan(Short value) {
            addCriterion("create_templete_num >", value, "createTempleteNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateTempleteNumGreaterThanOrEqualTo(Short value) {
            addCriterion("create_templete_num >=", value, "createTempleteNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateTempleteNumLessThan(Short value) {
            addCriterion("create_templete_num <", value, "createTempleteNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateTempleteNumLessThanOrEqualTo(Short value) {
            addCriterion("create_templete_num <=", value, "createTempleteNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateTempleteNumIn(List<Short> values) {
            addCriterion("create_templete_num in", values, "createTempleteNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateTempleteNumNotIn(List<Short> values) {
            addCriterion("create_templete_num not in", values, "createTempleteNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateTempleteNumBetween(Short value1, Short value2) {
            addCriterion("create_templete_num between", value1, value2, "createTempleteNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateTempleteNumNotBetween(Short value1, Short value2) {
            addCriterion("create_templete_num not between", value1, value2, "createTempleteNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andStorePlaceIsNull() {
            addCriterion("store_place is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andStorePlaceIsNotNull() {
            addCriterion("store_place is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andStorePlaceEqualTo(String value) {
            addCriterion("store_place =", value, "storePlace");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andStorePlaceNotEqualTo(String value) {
            addCriterion("store_place <>", value, "storePlace");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andStorePlaceGreaterThan(String value) {
            addCriterion("store_place >", value, "storePlace");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andStorePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("store_place >=", value, "storePlace");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andStorePlaceLessThan(String value) {
            addCriterion("store_place <", value, "storePlace");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andStorePlaceLessThanOrEqualTo(String value) {
            addCriterion("store_place <=", value, "storePlace");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andStorePlaceLike(String value) {
            addCriterion("store_place like", value, "storePlace");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andStorePlaceNotLike(String value) {
            addCriterion("store_place not like", value, "storePlace");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andStorePlaceIn(List<String> values) {
            addCriterion("store_place in", values, "storePlace");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andStorePlaceNotIn(List<String> values) {
            addCriterion("store_place not in", values, "storePlace");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andStorePlaceBetween(String value1, String value2) {
            addCriterion("store_place between", value1, value2, "storePlace");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andStorePlaceNotBetween(String value1, String value2) {
            addCriterion("store_place not between", value1, value2, "storePlace");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andNewComplainFlageIsNull() {
            addCriterion("new_complain_flage is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andNewComplainFlageIsNotNull() {
            addCriterion("new_complain_flage is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andNewComplainFlageEqualTo(String value) {
            addCriterion("new_complain_flage =", value, "newComplainFlage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andNewComplainFlageNotEqualTo(String value) {
            addCriterion("new_complain_flage <>", value, "newComplainFlage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andNewComplainFlageGreaterThan(String value) {
            addCriterion("new_complain_flage >", value, "newComplainFlage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andNewComplainFlageGreaterThanOrEqualTo(String value) {
            addCriterion("new_complain_flage >=", value, "newComplainFlage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andNewComplainFlageLessThan(String value) {
            addCriterion("new_complain_flage <", value, "newComplainFlage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andNewComplainFlageLessThanOrEqualTo(String value) {
            addCriterion("new_complain_flage <=", value, "newComplainFlage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andNewComplainFlageLike(String value) {
            addCriterion("new_complain_flage like", value, "newComplainFlage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andNewComplainFlageNotLike(String value) {
            addCriterion("new_complain_flage not like", value, "newComplainFlage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andNewComplainFlageIn(List<String> values) {
            addCriterion("new_complain_flage in", values, "newComplainFlage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andNewComplainFlageNotIn(List<String> values) {
            addCriterion("new_complain_flage not in", values, "newComplainFlage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andNewComplainFlageBetween(String value1, String value2) {
            addCriterion("new_complain_flage between", value1, value2, "newComplainFlage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andNewComplainFlageNotBetween(String value1, String value2) {
            addCriterion("new_complain_flage not between", value1, value2, "newComplainFlage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInitialComplainFlagIsNull() {
            addCriterion("initial_complain_flag is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInitialComplainFlagIsNotNull() {
            addCriterion("initial_complain_flag is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInitialComplainFlagEqualTo(String value) {
            addCriterion("initial_complain_flag =", value, "initialComplainFlag");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInitialComplainFlagNotEqualTo(String value) {
            addCriterion("initial_complain_flag <>", value, "initialComplainFlag");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInitialComplainFlagGreaterThan(String value) {
            addCriterion("initial_complain_flag >", value, "initialComplainFlag");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInitialComplainFlagGreaterThanOrEqualTo(String value) {
            addCriterion("initial_complain_flag >=", value, "initialComplainFlag");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInitialComplainFlagLessThan(String value) {
            addCriterion("initial_complain_flag <", value, "initialComplainFlag");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInitialComplainFlagLessThanOrEqualTo(String value) {
            addCriterion("initial_complain_flag <=", value, "initialComplainFlag");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInitialComplainFlagLike(String value) {
            addCriterion("initial_complain_flag like", value, "initialComplainFlag");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInitialComplainFlagNotLike(String value) {
            addCriterion("initial_complain_flag not like", value, "initialComplainFlag");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInitialComplainFlagIn(List<String> values) {
            addCriterion("initial_complain_flag in", values, "initialComplainFlag");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInitialComplainFlagNotIn(List<String> values) {
            addCriterion("initial_complain_flag not in", values, "initialComplainFlag");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInitialComplainFlagBetween(String value1, String value2) {
            addCriterion("initial_complain_flag between", value1, value2, "initialComplainFlag");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInitialComplainFlagNotBetween(String value1, String value2) {
            addCriterion("initial_complain_flag not between", value1, value2, "initialComplainFlag");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactPersonIsNull() {
            addCriterion("contact_person is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactPersonIsNotNull() {
            addCriterion("contact_person is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactPersonEqualTo(String value) {
            addCriterion("contact_person =", value, "contactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactPersonNotEqualTo(String value) {
            addCriterion("contact_person <>", value, "contactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactPersonGreaterThan(String value) {
            addCriterion("contact_person >", value, "contactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("contact_person >=", value, "contactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactPersonLessThan(String value) {
            addCriterion("contact_person <", value, "contactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactPersonLessThanOrEqualTo(String value) {
            addCriterion("contact_person <=", value, "contactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactPersonLike(String value) {
            addCriterion("contact_person like", value, "contactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactPersonNotLike(String value) {
            addCriterion("contact_person not like", value, "contactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactPersonIn(List<String> values) {
            addCriterion("contact_person in", values, "contactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactPersonNotIn(List<String> values) {
            addCriterion("contact_person not in", values, "contactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactPersonBetween(String value1, String value2) {
            addCriterion("contact_person between", value1, value2, "contactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactPersonNotBetween(String value1, String value2) {
            addCriterion("contact_person not between", value1, value2, "contactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactTelIsNull() {
            addCriterion("contact_tel is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactTelIsNotNull() {
            addCriterion("contact_tel is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactTelEqualTo(String value) {
            addCriterion("contact_tel =", value, "contactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactTelNotEqualTo(String value) {
            addCriterion("contact_tel <>", value, "contactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactTelGreaterThan(String value) {
            addCriterion("contact_tel >", value, "contactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactTelGreaterThanOrEqualTo(String value) {
            addCriterion("contact_tel >=", value, "contactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactTelLessThan(String value) {
            addCriterion("contact_tel <", value, "contactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactTelLessThanOrEqualTo(String value) {
            addCriterion("contact_tel <=", value, "contactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactTelLike(String value) {
            addCriterion("contact_tel like", value, "contactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactTelNotLike(String value) {
            addCriterion("contact_tel not like", value, "contactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactTelIn(List<String> values) {
            addCriterion("contact_tel in", values, "contactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactTelNotIn(List<String> values) {
            addCriterion("contact_tel not in", values, "contactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactTelBetween(String value1, String value2) {
            addCriterion("contact_tel between", value1, value2, "contactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactTelNotBetween(String value1, String value2) {
            addCriterion("contact_tel not between", value1, value2, "contactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactFaxIsNull() {
            addCriterion("contact_fax is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactFaxIsNotNull() {
            addCriterion("contact_fax is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactFaxEqualTo(String value) {
            addCriterion("contact_fax =", value, "contactFax");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactFaxNotEqualTo(String value) {
            addCriterion("contact_fax <>", value, "contactFax");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactFaxGreaterThan(String value) {
            addCriterion("contact_fax >", value, "contactFax");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactFaxGreaterThanOrEqualTo(String value) {
            addCriterion("contact_fax >=", value, "contactFax");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactFaxLessThan(String value) {
            addCriterion("contact_fax <", value, "contactFax");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactFaxLessThanOrEqualTo(String value) {
            addCriterion("contact_fax <=", value, "contactFax");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactFaxLike(String value) {
            addCriterion("contact_fax like", value, "contactFax");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactFaxNotLike(String value) {
            addCriterion("contact_fax not like", value, "contactFax");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactFaxIn(List<String> values) {
            addCriterion("contact_fax in", values, "contactFax");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactFaxNotIn(List<String> values) {
            addCriterion("contact_fax not in", values, "contactFax");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactFaxBetween(String value1, String value2) {
            addCriterion("contact_fax between", value1, value2, "contactFax");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactFaxNotBetween(String value1, String value2) {
            addCriterion("contact_fax not between", value1, value2, "contactFax");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactMethodIsNull() {
            addCriterion("contact_method is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactMethodIsNotNull() {
            addCriterion("contact_method is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactMethodEqualTo(String value) {
            addCriterion("contact_method =", value, "contactMethod");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactMethodNotEqualTo(String value) {
            addCriterion("contact_method <>", value, "contactMethod");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactMethodGreaterThan(String value) {
            addCriterion("contact_method >", value, "contactMethod");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactMethodGreaterThanOrEqualTo(String value) {
            addCriterion("contact_method >=", value, "contactMethod");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactMethodLessThan(String value) {
            addCriterion("contact_method <", value, "contactMethod");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactMethodLessThanOrEqualTo(String value) {
            addCriterion("contact_method <=", value, "contactMethod");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactMethodLike(String value) {
            addCriterion("contact_method like", value, "contactMethod");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactMethodNotLike(String value) {
            addCriterion("contact_method not like", value, "contactMethod");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactMethodIn(List<String> values) {
            addCriterion("contact_method in", values, "contactMethod");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactMethodNotIn(List<String> values) {
            addCriterion("contact_method not in", values, "contactMethod");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactMethodBetween(String value1, String value2) {
            addCriterion("contact_method between", value1, value2, "contactMethod");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContactMethodNotBetween(String value1, String value2) {
            addCriterion("contact_method not between", value1, value2, "contactMethod");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactPersonIsNull() {
            addCriterion("region_contact_person is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactPersonIsNotNull() {
            addCriterion("region_contact_person is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactPersonEqualTo(String value) {
            addCriterion("region_contact_person =", value, "regionContactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactPersonNotEqualTo(String value) {
            addCriterion("region_contact_person <>", value, "regionContactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactPersonGreaterThan(String value) {
            addCriterion("region_contact_person >", value, "regionContactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("region_contact_person >=", value, "regionContactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactPersonLessThan(String value) {
            addCriterion("region_contact_person <", value, "regionContactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactPersonLessThanOrEqualTo(String value) {
            addCriterion("region_contact_person <=", value, "regionContactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactPersonLike(String value) {
            addCriterion("region_contact_person like", value, "regionContactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactPersonNotLike(String value) {
            addCriterion("region_contact_person not like", value, "regionContactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactPersonIn(List<String> values) {
            addCriterion("region_contact_person in", values, "regionContactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactPersonNotIn(List<String> values) {
            addCriterion("region_contact_person not in", values, "regionContactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactPersonBetween(String value1, String value2) {
            addCriterion("region_contact_person between", value1, value2, "regionContactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactPersonNotBetween(String value1, String value2) {
            addCriterion("region_contact_person not between", value1, value2, "regionContactPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactTelIsNull() {
            addCriterion("region_contact_tel is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactTelIsNotNull() {
            addCriterion("region_contact_tel is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactTelEqualTo(String value) {
            addCriterion("region_contact_tel =", value, "regionContactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactTelNotEqualTo(String value) {
            addCriterion("region_contact_tel <>", value, "regionContactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactTelGreaterThan(String value) {
            addCriterion("region_contact_tel >", value, "regionContactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactTelGreaterThanOrEqualTo(String value) {
            addCriterion("region_contact_tel >=", value, "regionContactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactTelLessThan(String value) {
            addCriterion("region_contact_tel <", value, "regionContactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactTelLessThanOrEqualTo(String value) {
            addCriterion("region_contact_tel <=", value, "regionContactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactTelLike(String value) {
            addCriterion("region_contact_tel like", value, "regionContactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactTelNotLike(String value) {
            addCriterion("region_contact_tel not like", value, "regionContactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactTelIn(List<String> values) {
            addCriterion("region_contact_tel in", values, "regionContactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactTelNotIn(List<String> values) {
            addCriterion("region_contact_tel not in", values, "regionContactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactTelBetween(String value1, String value2) {
            addCriterion("region_contact_tel between", value1, value2, "regionContactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRegionContactTelNotBetween(String value1, String value2) {
            addCriterion("region_contact_tel not between", value1, value2, "regionContactTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonCodeIsNull() {
            addCriterion("input_person_code is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonCodeIsNotNull() {
            addCriterion("input_person_code is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonCodeEqualTo(String value) {
            addCriterion("input_person_code =", value, "inputPersonCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonCodeNotEqualTo(String value) {
            addCriterion("input_person_code <>", value, "inputPersonCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonCodeGreaterThan(String value) {
            addCriterion("input_person_code >", value, "inputPersonCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonCodeGreaterThanOrEqualTo(String value) {
            addCriterion("input_person_code >=", value, "inputPersonCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonCodeLessThan(String value) {
            addCriterion("input_person_code <", value, "inputPersonCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonCodeLessThanOrEqualTo(String value) {
            addCriterion("input_person_code <=", value, "inputPersonCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonCodeLike(String value) {
            addCriterion("input_person_code like", value, "inputPersonCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonCodeNotLike(String value) {
            addCriterion("input_person_code not like", value, "inputPersonCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonCodeIn(List<String> values) {
            addCriterion("input_person_code in", values, "inputPersonCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonCodeNotIn(List<String> values) {
            addCriterion("input_person_code not in", values, "inputPersonCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonCodeBetween(String value1, String value2) {
            addCriterion("input_person_code between", value1, value2, "inputPersonCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonCodeNotBetween(String value1, String value2) {
            addCriterion("input_person_code not between", value1, value2, "inputPersonCode");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonNameIsNull() {
            addCriterion("input_person_name is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonNameIsNotNull() {
            addCriterion("input_person_name is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonNameEqualTo(String value) {
            addCriterion("input_person_name =", value, "inputPersonName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonNameNotEqualTo(String value) {
            addCriterion("input_person_name <>", value, "inputPersonName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonNameGreaterThan(String value) {
            addCriterion("input_person_name >", value, "inputPersonName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("input_person_name >=", value, "inputPersonName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonNameLessThan(String value) {
            addCriterion("input_person_name <", value, "inputPersonName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonNameLessThanOrEqualTo(String value) {
            addCriterion("input_person_name <=", value, "inputPersonName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonNameLike(String value) {
            addCriterion("input_person_name like", value, "inputPersonName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonNameNotLike(String value) {
            addCriterion("input_person_name not like", value, "inputPersonName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonNameIn(List<String> values) {
            addCriterion("input_person_name in", values, "inputPersonName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonNameNotIn(List<String> values) {
            addCriterion("input_person_name not in", values, "inputPersonName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonNameBetween(String value1, String value2) {
            addCriterion("input_person_name between", value1, value2, "inputPersonName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonNameNotBetween(String value1, String value2) {
            addCriterion("input_person_name not between", value1, value2, "inputPersonName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonDeptIsNull() {
            addCriterion("input_person_dept is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonDeptIsNotNull() {
            addCriterion("input_person_dept is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonDeptEqualTo(String value) {
            addCriterion("input_person_dept =", value, "inputPersonDept");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonDeptNotEqualTo(String value) {
            addCriterion("input_person_dept <>", value, "inputPersonDept");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonDeptGreaterThan(String value) {
            addCriterion("input_person_dept >", value, "inputPersonDept");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonDeptGreaterThanOrEqualTo(String value) {
            addCriterion("input_person_dept >=", value, "inputPersonDept");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonDeptLessThan(String value) {
            addCriterion("input_person_dept <", value, "inputPersonDept");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonDeptLessThanOrEqualTo(String value) {
            addCriterion("input_person_dept <=", value, "inputPersonDept");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonDeptLike(String value) {
            addCriterion("input_person_dept like", value, "inputPersonDept");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonDeptNotLike(String value) {
            addCriterion("input_person_dept not like", value, "inputPersonDept");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonDeptIn(List<String> values) {
            addCriterion("input_person_dept in", values, "inputPersonDept");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonDeptNotIn(List<String> values) {
            addCriterion("input_person_dept not in", values, "inputPersonDept");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonDeptBetween(String value1, String value2) {
            addCriterion("input_person_dept between", value1, value2, "inputPersonDept");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonDeptNotBetween(String value1, String value2) {
            addCriterion("input_person_dept not between", value1, value2, "inputPersonDept");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonTelIsNull() {
            addCriterion("input_person_tel is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonTelIsNotNull() {
            addCriterion("input_person_tel is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonTelEqualTo(String value) {
            addCriterion("input_person_tel =", value, "inputPersonTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonTelNotEqualTo(String value) {
            addCriterion("input_person_tel <>", value, "inputPersonTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonTelGreaterThan(String value) {
            addCriterion("input_person_tel >", value, "inputPersonTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonTelGreaterThanOrEqualTo(String value) {
            addCriterion("input_person_tel >=", value, "inputPersonTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonTelLessThan(String value) {
            addCriterion("input_person_tel <", value, "inputPersonTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonTelLessThanOrEqualTo(String value) {
            addCriterion("input_person_tel <=", value, "inputPersonTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonTelLike(String value) {
            addCriterion("input_person_tel like", value, "inputPersonTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonTelNotLike(String value) {
            addCriterion("input_person_tel not like", value, "inputPersonTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonTelIn(List<String> values) {
            addCriterion("input_person_tel in", values, "inputPersonTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonTelNotIn(List<String> values) {
            addCriterion("input_person_tel not in", values, "inputPersonTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonTelBetween(String value1, String value2) {
            addCriterion("input_person_tel between", value1, value2, "inputPersonTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputPersonTelNotBetween(String value1, String value2) {
            addCriterion("input_person_tel not between", value1, value2, "inputPersonTel");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputDateIsNull() {
            addCriterion("input_date is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputDateIsNotNull() {
            addCriterion("input_date is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputDateEqualTo(String value) {
            addCriterion("input_date =", value, "inputDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputDateNotEqualTo(String value) {
            addCriterion("input_date <>", value, "inputDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputDateGreaterThan(String value) {
            addCriterion("input_date >", value, "inputDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputDateGreaterThanOrEqualTo(String value) {
            addCriterion("input_date >=", value, "inputDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputDateLessThan(String value) {
            addCriterion("input_date <", value, "inputDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputDateLessThanOrEqualTo(String value) {
            addCriterion("input_date <=", value, "inputDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputDateLike(String value) {
            addCriterion("input_date like", value, "inputDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputDateNotLike(String value) {
            addCriterion("input_date not like", value, "inputDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputDateIn(List<String> values) {
            addCriterion("input_date in", values, "inputDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputDateNotIn(List<String> values) {
            addCriterion("input_date not in", values, "inputDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputDateBetween(String value1, String value2) {
            addCriterion("input_date between", value1, value2, "inputDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andInputDateNotBetween(String value1, String value2) {
            addCriterion("input_date not between", value1, value2, "inputDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode1IsNull() {
            addCriterion("defect_code_1 is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode1IsNotNull() {
            addCriterion("defect_code_1 is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode1EqualTo(String value) {
            addCriterion("defect_code_1 =", value, "defectCode1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode1NotEqualTo(String value) {
            addCriterion("defect_code_1 <>", value, "defectCode1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode1GreaterThan(String value) {
            addCriterion("defect_code_1 >", value, "defectCode1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode1GreaterThanOrEqualTo(String value) {
            addCriterion("defect_code_1 >=", value, "defectCode1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode1LessThan(String value) {
            addCriterion("defect_code_1 <", value, "defectCode1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode1LessThanOrEqualTo(String value) {
            addCriterion("defect_code_1 <=", value, "defectCode1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode1Like(String value) {
            addCriterion("defect_code_1 like", value, "defectCode1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode1NotLike(String value) {
            addCriterion("defect_code_1 not like", value, "defectCode1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode1In(List<String> values) {
            addCriterion("defect_code_1 in", values, "defectCode1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode1NotIn(List<String> values) {
            addCriterion("defect_code_1 not in", values, "defectCode1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode1Between(String value1, String value2) {
            addCriterion("defect_code_1 between", value1, value2, "defectCode1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode1NotBetween(String value1, String value2) {
            addCriterion("defect_code_1 not between", value1, value2, "defectCode1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition1IsNull() {
            addCriterion("defect_position_1 is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition1IsNotNull() {
            addCriterion("defect_position_1 is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition1EqualTo(String value) {
            addCriterion("defect_position_1 =", value, "defectPosition1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition1NotEqualTo(String value) {
            addCriterion("defect_position_1 <>", value, "defectPosition1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition1GreaterThan(String value) {
            addCriterion("defect_position_1 >", value, "defectPosition1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition1GreaterThanOrEqualTo(String value) {
            addCriterion("defect_position_1 >=", value, "defectPosition1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition1LessThan(String value) {
            addCriterion("defect_position_1 <", value, "defectPosition1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition1LessThanOrEqualTo(String value) {
            addCriterion("defect_position_1 <=", value, "defectPosition1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition1Like(String value) {
            addCriterion("defect_position_1 like", value, "defectPosition1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition1NotLike(String value) {
            addCriterion("defect_position_1 not like", value, "defectPosition1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition1In(List<String> values) {
            addCriterion("defect_position_1 in", values, "defectPosition1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition1NotIn(List<String> values) {
            addCriterion("defect_position_1 not in", values, "defectPosition1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition1Between(String value1, String value2) {
            addCriterion("defect_position_1 between", value1, value2, "defectPosition1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition1NotBetween(String value1, String value2) {
            addCriterion("defect_position_1 not between", value1, value2, "defectPosition1");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode2IsNull() {
            addCriterion("defect_code_2 is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode2IsNotNull() {
            addCriterion("defect_code_2 is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode2EqualTo(String value) {
            addCriterion("defect_code_2 =", value, "defectCode2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode2NotEqualTo(String value) {
            addCriterion("defect_code_2 <>", value, "defectCode2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode2GreaterThan(String value) {
            addCriterion("defect_code_2 >", value, "defectCode2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode2GreaterThanOrEqualTo(String value) {
            addCriterion("defect_code_2 >=", value, "defectCode2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode2LessThan(String value) {
            addCriterion("defect_code_2 <", value, "defectCode2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode2LessThanOrEqualTo(String value) {
            addCriterion("defect_code_2 <=", value, "defectCode2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode2Like(String value) {
            addCriterion("defect_code_2 like", value, "defectCode2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode2NotLike(String value) {
            addCriterion("defect_code_2 not like", value, "defectCode2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode2In(List<String> values) {
            addCriterion("defect_code_2 in", values, "defectCode2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode2NotIn(List<String> values) {
            addCriterion("defect_code_2 not in", values, "defectCode2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode2Between(String value1, String value2) {
            addCriterion("defect_code_2 between", value1, value2, "defectCode2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectCode2NotBetween(String value1, String value2) {
            addCriterion("defect_code_2 not between", value1, value2, "defectCode2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition2IsNull() {
            addCriterion("defect_position_2 is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition2IsNotNull() {
            addCriterion("defect_position_2 is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition2EqualTo(String value) {
            addCriterion("defect_position_2 =", value, "defectPosition2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition2NotEqualTo(String value) {
            addCriterion("defect_position_2 <>", value, "defectPosition2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition2GreaterThan(String value) {
            addCriterion("defect_position_2 >", value, "defectPosition2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition2GreaterThanOrEqualTo(String value) {
            addCriterion("defect_position_2 >=", value, "defectPosition2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition2LessThan(String value) {
            addCriterion("defect_position_2 <", value, "defectPosition2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition2LessThanOrEqualTo(String value) {
            addCriterion("defect_position_2 <=", value, "defectPosition2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition2Like(String value) {
            addCriterion("defect_position_2 like", value, "defectPosition2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition2NotLike(String value) {
            addCriterion("defect_position_2 not like", value, "defectPosition2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition2In(List<String> values) {
            addCriterion("defect_position_2 in", values, "defectPosition2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition2NotIn(List<String> values) {
            addCriterion("defect_position_2 not in", values, "defectPosition2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition2Between(String value1, String value2) {
            addCriterion("defect_position_2 between", value1, value2, "defectPosition2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDefectPosition2NotBetween(String value1, String value2) {
            addCriterion("defect_position_2 not between", value1, value2, "defectPosition2");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrderNumEqualTo(String value) {
            addCriterion("order_num =", value, "orderNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrderNumNotEqualTo(String value) {
            addCriterion("order_num <>", value, "orderNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrderNumGreaterThan(String value) {
            addCriterion("order_num >", value, "orderNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("order_num >=", value, "orderNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrderNumLessThan(String value) {
            addCriterion("order_num <", value, "orderNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrderNumLessThanOrEqualTo(String value) {
            addCriterion("order_num <=", value, "orderNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrderNumLike(String value) {
            addCriterion("order_num like", value, "orderNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrderNumNotLike(String value) {
            addCriterion("order_num not like", value, "orderNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrderNumIn(List<String> values) {
            addCriterion("order_num in", values, "orderNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrderNumNotIn(List<String> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrderNumBetween(String value1, String value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOrderNumNotBetween(String value1, String value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgInformationNumIsNull() {
            addCriterion("bg_information_num is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgInformationNumIsNotNull() {
            addCriterion("bg_information_num is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgInformationNumEqualTo(String value) {
            addCriterion("bg_information_num =", value, "bgInformationNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgInformationNumNotEqualTo(String value) {
            addCriterion("bg_information_num <>", value, "bgInformationNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgInformationNumGreaterThan(String value) {
            addCriterion("bg_information_num >", value, "bgInformationNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgInformationNumGreaterThanOrEqualTo(String value) {
            addCriterion("bg_information_num >=", value, "bgInformationNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgInformationNumLessThan(String value) {
            addCriterion("bg_information_num <", value, "bgInformationNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgInformationNumLessThanOrEqualTo(String value) {
            addCriterion("bg_information_num <=", value, "bgInformationNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgInformationNumLike(String value) {
            addCriterion("bg_information_num like", value, "bgInformationNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgInformationNumNotLike(String value) {
            addCriterion("bg_information_num not like", value, "bgInformationNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgInformationNumIn(List<String> values) {
            addCriterion("bg_information_num in", values, "bgInformationNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgInformationNumNotIn(List<String> values) {
            addCriterion("bg_information_num not in", values, "bgInformationNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgInformationNumBetween(String value1, String value2) {
            addCriterion("bg_information_num between", value1, value2, "bgInformationNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgInformationNumNotBetween(String value1, String value2) {
            addCriterion("bg_information_num not between", value1, value2, "bgInformationNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andErrorMessageIsNull() {
            addCriterion("error_message is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andErrorMessageIsNotNull() {
            addCriterion("error_message is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andErrorMessageEqualTo(String value) {
            addCriterion("error_message =", value, "errorMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andErrorMessageNotEqualTo(String value) {
            addCriterion("error_message <>", value, "errorMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andErrorMessageGreaterThan(String value) {
            addCriterion("error_message >", value, "errorMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andErrorMessageGreaterThanOrEqualTo(String value) {
            addCriterion("error_message >=", value, "errorMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andErrorMessageLessThan(String value) {
            addCriterion("error_message <", value, "errorMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andErrorMessageLessThanOrEqualTo(String value) {
            addCriterion("error_message <=", value, "errorMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andErrorMessageLike(String value) {
            addCriterion("error_message like", value, "errorMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andErrorMessageNotLike(String value) {
            addCriterion("error_message not like", value, "errorMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andErrorMessageIn(List<String> values) {
            addCriterion("error_message in", values, "errorMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andErrorMessageNotIn(List<String> values) {
            addCriterion("error_message not in", values, "errorMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andErrorMessageBetween(String value1, String value2) {
            addCriterion("error_message between", value1, value2, "errorMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andErrorMessageNotBetween(String value1, String value2) {
            addCriterion("error_message not between", value1, value2, "errorMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andAttachmentsNameIsNull() {
            addCriterion("attachments_name is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andAttachmentsNameIsNotNull() {
            addCriterion("attachments_name is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andAttachmentsNameEqualTo(String value) {
            addCriterion("attachments_name =", value, "attachmentsName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andAttachmentsNameNotEqualTo(String value) {
            addCriterion("attachments_name <>", value, "attachmentsName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andAttachmentsNameGreaterThan(String value) {
            addCriterion("attachments_name >", value, "attachmentsName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andAttachmentsNameGreaterThanOrEqualTo(String value) {
            addCriterion("attachments_name >=", value, "attachmentsName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andAttachmentsNameLessThan(String value) {
            addCriterion("attachments_name <", value, "attachmentsName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andAttachmentsNameLessThanOrEqualTo(String value) {
            addCriterion("attachments_name <=", value, "attachmentsName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andAttachmentsNameLike(String value) {
            addCriterion("attachments_name like", value, "attachmentsName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andAttachmentsNameNotLike(String value) {
            addCriterion("attachments_name not like", value, "attachmentsName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andAttachmentsNameIn(List<String> values) {
            addCriterion("attachments_name in", values, "attachmentsName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andAttachmentsNameNotIn(List<String> values) {
            addCriterion("attachments_name not in", values, "attachmentsName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andAttachmentsNameBetween(String value1, String value2) {
            addCriterion("attachments_name between", value1, value2, "attachmentsName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andAttachmentsNameNotBetween(String value1, String value2) {
            addCriterion("attachments_name not between", value1, value2, "attachmentsName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgTechStandardIsNull() {
            addCriterion("bg_tech_standard is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgTechStandardIsNotNull() {
            addCriterion("bg_tech_standard is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgTechStandardEqualTo(String value) {
            addCriterion("bg_tech_standard =", value, "bgTechStandard");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgTechStandardNotEqualTo(String value) {
            addCriterion("bg_tech_standard <>", value, "bgTechStandard");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgTechStandardGreaterThan(String value) {
            addCriterion("bg_tech_standard >", value, "bgTechStandard");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgTechStandardGreaterThanOrEqualTo(String value) {
            addCriterion("bg_tech_standard >=", value, "bgTechStandard");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgTechStandardLessThan(String value) {
            addCriterion("bg_tech_standard <", value, "bgTechStandard");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgTechStandardLessThanOrEqualTo(String value) {
            addCriterion("bg_tech_standard <=", value, "bgTechStandard");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgTechStandardLike(String value) {
            addCriterion("bg_tech_standard like", value, "bgTechStandard");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgTechStandardNotLike(String value) {
            addCriterion("bg_tech_standard not like", value, "bgTechStandard");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgTechStandardIn(List<String> values) {
            addCriterion("bg_tech_standard in", values, "bgTechStandard");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgTechStandardNotIn(List<String> values) {
            addCriterion("bg_tech_standard not in", values, "bgTechStandard");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgTechStandardBetween(String value1, String value2) {
            addCriterion("bg_tech_standard between", value1, value2, "bgTechStandard");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBgTechStandardNotBetween(String value1, String value2) {
            addCriterion("bg_tech_standard not between", value1, value2, "bgTechStandard");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andReturnMessageIsNull() {
            addCriterion("return_message is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andReturnMessageIsNotNull() {
            addCriterion("return_message is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andReturnMessageEqualTo(String value) {
            addCriterion("return_message =", value, "returnMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andReturnMessageNotEqualTo(String value) {
            addCriterion("return_message <>", value, "returnMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andReturnMessageGreaterThan(String value) {
            addCriterion("return_message >", value, "returnMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andReturnMessageGreaterThanOrEqualTo(String value) {
            addCriterion("return_message >=", value, "returnMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andReturnMessageLessThan(String value) {
            addCriterion("return_message <", value, "returnMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andReturnMessageLessThanOrEqualTo(String value) {
            addCriterion("return_message <=", value, "returnMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andReturnMessageLike(String value) {
            addCriterion("return_message like", value, "returnMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andReturnMessageNotLike(String value) {
            addCriterion("return_message not like", value, "returnMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andReturnMessageIn(List<String> values) {
            addCriterion("return_message in", values, "returnMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andReturnMessageNotIn(List<String> values) {
            addCriterion("return_message not in", values, "returnMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andReturnMessageBetween(String value1, String value2) {
            addCriterion("return_message between", value1, value2, "returnMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andReturnMessageNotBetween(String value1, String value2) {
            addCriterion("return_message not between", value1, value2, "returnMessage");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andMessageDivisionIsNull() {
            addCriterion("message_division is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andMessageDivisionIsNotNull() {
            addCriterion("message_division is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andMessageDivisionEqualTo(String value) {
            addCriterion("message_division =", value, "messageDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andMessageDivisionNotEqualTo(String value) {
            addCriterion("message_division <>", value, "messageDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andMessageDivisionGreaterThan(String value) {
            addCriterion("message_division >", value, "messageDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andMessageDivisionGreaterThanOrEqualTo(String value) {
            addCriterion("message_division >=", value, "messageDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andMessageDivisionLessThan(String value) {
            addCriterion("message_division <", value, "messageDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andMessageDivisionLessThanOrEqualTo(String value) {
            addCriterion("message_division <=", value, "messageDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andMessageDivisionLike(String value) {
            addCriterion("message_division like", value, "messageDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andMessageDivisionNotLike(String value) {
            addCriterion("message_division not like", value, "messageDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andMessageDivisionIn(List<String> values) {
            addCriterion("message_division in", values, "messageDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andMessageDivisionNotIn(List<String> values) {
            addCriterion("message_division not in", values, "messageDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andMessageDivisionBetween(String value1, String value2) {
            addCriterion("message_division between", value1, value2, "messageDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andMessageDivisionNotBetween(String value1, String value2) {
            addCriterion("message_division not between", value1, value2, "messageDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContractNumIsNull() {
            addCriterion("contract_num is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContractNumIsNotNull() {
            addCriterion("contract_num is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContractNumEqualTo(String value) {
            addCriterion("contract_num =", value, "contractNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContractNumNotEqualTo(String value) {
            addCriterion("contract_num <>", value, "contractNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContractNumGreaterThan(String value) {
            addCriterion("contract_num >", value, "contractNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContractNumGreaterThanOrEqualTo(String value) {
            addCriterion("contract_num >=", value, "contractNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContractNumLessThan(String value) {
            addCriterion("contract_num <", value, "contractNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContractNumLessThanOrEqualTo(String value) {
            addCriterion("contract_num <=", value, "contractNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContractNumLike(String value) {
            addCriterion("contract_num like", value, "contractNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContractNumNotLike(String value) {
            addCriterion("contract_num not like", value, "contractNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContractNumIn(List<String> values) {
            addCriterion("contract_num in", values, "contractNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContractNumNotIn(List<String> values) {
            addCriterion("contract_num not in", values, "contractNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContractNumBetween(String value1, String value2) {
            addCriterion("contract_num between", value1, value2, "contractNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andContractNumNotBetween(String value1, String value2) {
            addCriterion("contract_num not between", value1, value2, "contractNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaWeightIsNull() {
            addCriterion("rma_weight is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaWeightIsNotNull() {
            addCriterion("rma_weight is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaWeightEqualTo(BigDecimal value) {
            addCriterion("rma_weight =", value, "rmaWeight");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaWeightNotEqualTo(BigDecimal value) {
            addCriterion("rma_weight <>", value, "rmaWeight");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaWeightGreaterThan(BigDecimal value) {
            addCriterion("rma_weight >", value, "rmaWeight");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rma_weight >=", value, "rmaWeight");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaWeightLessThan(BigDecimal value) {
            addCriterion("rma_weight <", value, "rmaWeight");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rma_weight <=", value, "rmaWeight");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaWeightIn(List<BigDecimal> values) {
            addCriterion("rma_weight in", values, "rmaWeight");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaWeightNotIn(List<BigDecimal> values) {
            addCriterion("rma_weight not in", values, "rmaWeight");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rma_weight between", value1, value2, "rmaWeight");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rma_weight not between", value1, value2, "rmaWeight");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNumIsNull() {
            addCriterion("settle_user_num is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNumIsNotNull() {
            addCriterion("settle_user_num is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNumEqualTo(String value) {
            addCriterion("settle_user_num =", value, "settleUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNumNotEqualTo(String value) {
            addCriterion("settle_user_num <>", value, "settleUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNumGreaterThan(String value) {
            addCriterion("settle_user_num >", value, "settleUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNumGreaterThanOrEqualTo(String value) {
            addCriterion("settle_user_num >=", value, "settleUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNumLessThan(String value) {
            addCriterion("settle_user_num <", value, "settleUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNumLessThanOrEqualTo(String value) {
            addCriterion("settle_user_num <=", value, "settleUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNumLike(String value) {
            addCriterion("settle_user_num like", value, "settleUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNumNotLike(String value) {
            addCriterion("settle_user_num not like", value, "settleUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNumIn(List<String> values) {
            addCriterion("settle_user_num in", values, "settleUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNumNotIn(List<String> values) {
            addCriterion("settle_user_num not in", values, "settleUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNumBetween(String value1, String value2) {
            addCriterion("settle_user_num between", value1, value2, "settleUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNumNotBetween(String value1, String value2) {
            addCriterion("settle_user_num not between", value1, value2, "settleUserNum");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNameIsNull() {
            addCriterion("settle_user_name is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNameIsNotNull() {
            addCriterion("settle_user_name is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNameEqualTo(String value) {
            addCriterion("settle_user_name =", value, "settleUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNameNotEqualTo(String value) {
            addCriterion("settle_user_name <>", value, "settleUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNameGreaterThan(String value) {
            addCriterion("settle_user_name >", value, "settleUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("settle_user_name >=", value, "settleUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNameLessThan(String value) {
            addCriterion("settle_user_name <", value, "settleUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNameLessThanOrEqualTo(String value) {
            addCriterion("settle_user_name <=", value, "settleUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNameLike(String value) {
            addCriterion("settle_user_name like", value, "settleUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNameNotLike(String value) {
            addCriterion("settle_user_name not like", value, "settleUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNameIn(List<String> values) {
            addCriterion("settle_user_name in", values, "settleUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNameNotIn(List<String> values) {
            addCriterion("settle_user_name not in", values, "settleUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNameBetween(String value1, String value2) {
            addCriterion("settle_user_name between", value1, value2, "settleUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSettleUserNameNotBetween(String value1, String value2) {
            addCriterion("settle_user_name not between", value1, value2, "settleUserName");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaTotAmountIsNull() {
            addCriterion("rma_tot_amount is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaTotAmountIsNotNull() {
            addCriterion("rma_tot_amount is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaTotAmountEqualTo(BigDecimal value) {
            addCriterion("rma_tot_amount =", value, "rmaTotAmount");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaTotAmountNotEqualTo(BigDecimal value) {
            addCriterion("rma_tot_amount <>", value, "rmaTotAmount");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaTotAmountGreaterThan(BigDecimal value) {
            addCriterion("rma_tot_amount >", value, "rmaTotAmount");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaTotAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rma_tot_amount >=", value, "rmaTotAmount");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaTotAmountLessThan(BigDecimal value) {
            addCriterion("rma_tot_amount <", value, "rmaTotAmount");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaTotAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rma_tot_amount <=", value, "rmaTotAmount");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaTotAmountIn(List<BigDecimal> values) {
            addCriterion("rma_tot_amount in", values, "rmaTotAmount");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaTotAmountNotIn(List<BigDecimal> values) {
            addCriterion("rma_tot_amount not in", values, "rmaTotAmount");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaTotAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rma_tot_amount between", value1, value2, "rmaTotAmount");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaTotAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rma_tot_amount not between", value1, value2, "rmaTotAmount");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRtntrIncidMarkIsNull() {
            addCriterion("rtntr_incid_mark is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRtntrIncidMarkIsNotNull() {
            addCriterion("rtntr_incid_mark is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRtntrIncidMarkEqualTo(String value) {
            addCriterion("rtntr_incid_mark =", value, "rtntrIncidMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRtntrIncidMarkNotEqualTo(String value) {
            addCriterion("rtntr_incid_mark <>", value, "rtntrIncidMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRtntrIncidMarkGreaterThan(String value) {
            addCriterion("rtntr_incid_mark >", value, "rtntrIncidMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRtntrIncidMarkGreaterThanOrEqualTo(String value) {
            addCriterion("rtntr_incid_mark >=", value, "rtntrIncidMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRtntrIncidMarkLessThan(String value) {
            addCriterion("rtntr_incid_mark <", value, "rtntrIncidMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRtntrIncidMarkLessThanOrEqualTo(String value) {
            addCriterion("rtntr_incid_mark <=", value, "rtntrIncidMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRtntrIncidMarkLike(String value) {
            addCriterion("rtntr_incid_mark like", value, "rtntrIncidMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRtntrIncidMarkNotLike(String value) {
            addCriterion("rtntr_incid_mark not like", value, "rtntrIncidMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRtntrIncidMarkIn(List<String> values) {
            addCriterion("rtntr_incid_mark in", values, "rtntrIncidMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRtntrIncidMarkNotIn(List<String> values) {
            addCriterion("rtntr_incid_mark not in", values, "rtntrIncidMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRtntrIncidMarkBetween(String value1, String value2) {
            addCriterion("rtntr_incid_mark between", value1, value2, "rtntrIncidMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRtntrIncidMarkNotBetween(String value1, String value2) {
            addCriterion("rtntr_incid_mark not between", value1, value2, "rtntrIncidMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcMarkIsNull() {
            addCriterion("rma_proc_mark is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcMarkIsNotNull() {
            addCriterion("rma_proc_mark is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcMarkEqualTo(String value) {
            addCriterion("rma_proc_mark =", value, "rmaProcMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcMarkNotEqualTo(String value) {
            addCriterion("rma_proc_mark <>", value, "rmaProcMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcMarkGreaterThan(String value) {
            addCriterion("rma_proc_mark >", value, "rmaProcMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcMarkGreaterThanOrEqualTo(String value) {
            addCriterion("rma_proc_mark >=", value, "rmaProcMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcMarkLessThan(String value) {
            addCriterion("rma_proc_mark <", value, "rmaProcMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcMarkLessThanOrEqualTo(String value) {
            addCriterion("rma_proc_mark <=", value, "rmaProcMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcMarkLike(String value) {
            addCriterion("rma_proc_mark like", value, "rmaProcMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcMarkNotLike(String value) {
            addCriterion("rma_proc_mark not like", value, "rmaProcMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcMarkIn(List<String> values) {
            addCriterion("rma_proc_mark in", values, "rmaProcMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcMarkNotIn(List<String> values) {
            addCriterion("rma_proc_mark not in", values, "rmaProcMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcMarkBetween(String value1, String value2) {
            addCriterion("rma_proc_mark between", value1, value2, "rmaProcMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcMarkNotBetween(String value1, String value2) {
            addCriterion("rma_proc_mark not between", value1, value2, "rmaProcMark");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcDescIsNull() {
            addCriterion("rma_proc_desc is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcDescIsNotNull() {
            addCriterion("rma_proc_desc is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcDescEqualTo(String value) {
            addCriterion("rma_proc_desc =", value, "rmaProcDesc");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcDescNotEqualTo(String value) {
            addCriterion("rma_proc_desc <>", value, "rmaProcDesc");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcDescGreaterThan(String value) {
            addCriterion("rma_proc_desc >", value, "rmaProcDesc");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcDescGreaterThanOrEqualTo(String value) {
            addCriterion("rma_proc_desc >=", value, "rmaProcDesc");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcDescLessThan(String value) {
            addCriterion("rma_proc_desc <", value, "rmaProcDesc");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcDescLessThanOrEqualTo(String value) {
            addCriterion("rma_proc_desc <=", value, "rmaProcDesc");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcDescLike(String value) {
            addCriterion("rma_proc_desc like", value, "rmaProcDesc");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcDescNotLike(String value) {
            addCriterion("rma_proc_desc not like", value, "rmaProcDesc");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcDescIn(List<String> values) {
            addCriterion("rma_proc_desc in", values, "rmaProcDesc");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcDescNotIn(List<String> values) {
            addCriterion("rma_proc_desc not in", values, "rmaProcDesc");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcDescBetween(String value1, String value2) {
            addCriterion("rma_proc_desc between", value1, value2, "rmaProcDesc");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRmaProcDescNotBetween(String value1, String value2) {
            addCriterion("rma_proc_desc not between", value1, value2, "rmaProcDesc");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOpDivisionIsNull() {
            addCriterion("op_division is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOpDivisionIsNotNull() {
            addCriterion("op_division is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOpDivisionEqualTo(String value) {
            addCriterion("op_division =", value, "opDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOpDivisionNotEqualTo(String value) {
            addCriterion("op_division <>", value, "opDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOpDivisionGreaterThan(String value) {
            addCriterion("op_division >", value, "opDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOpDivisionGreaterThanOrEqualTo(String value) {
            addCriterion("op_division >=", value, "opDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOpDivisionLessThan(String value) {
            addCriterion("op_division <", value, "opDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOpDivisionLessThanOrEqualTo(String value) {
            addCriterion("op_division <=", value, "opDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOpDivisionLike(String value) {
            addCriterion("op_division like", value, "opDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOpDivisionNotLike(String value) {
            addCriterion("op_division not like", value, "opDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOpDivisionIn(List<String> values) {
            addCriterion("op_division in", values, "opDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOpDivisionNotIn(List<String> values) {
            addCriterion("op_division not in", values, "opDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOpDivisionBetween(String value1, String value2) {
            addCriterion("op_division between", value1, value2, "opDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andOpDivisionNotBetween(String value1, String value2) {
            addCriterion("op_division not between", value1, value2, "opDivision");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDealtStatusIsNull() {
            addCriterion("dealt_status is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDealtStatusIsNotNull() {
            addCriterion("dealt_status is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDealtStatusEqualTo(String value) {
            addCriterion("dealt_status =", value, "dealtStatus");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDealtStatusNotEqualTo(String value) {
            addCriterion("dealt_status <>", value, "dealtStatus");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDealtStatusGreaterThan(String value) {
            addCriterion("dealt_status >", value, "dealtStatus");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDealtStatusGreaterThanOrEqualTo(String value) {
            addCriterion("dealt_status >=", value, "dealtStatus");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDealtStatusLessThan(String value) {
            addCriterion("dealt_status <", value, "dealtStatus");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDealtStatusLessThanOrEqualTo(String value) {
            addCriterion("dealt_status <=", value, "dealtStatus");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDealtStatusLike(String value) {
            addCriterion("dealt_status like", value, "dealtStatus");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDealtStatusNotLike(String value) {
            addCriterion("dealt_status not like", value, "dealtStatus");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDealtStatusIn(List<String> values) {
            addCriterion("dealt_status in", values, "dealtStatus");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDealtStatusNotIn(List<String> values) {
            addCriterion("dealt_status not in", values, "dealtStatus");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDealtStatusBetween(String value1, String value2) {
            addCriterion("dealt_status between", value1, value2, "dealtStatus");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andDealtStatusNotBetween(String value1, String value2) {
            addCriterion("dealt_status not between", value1, value2, "dealtStatus");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSysDateIsNull() {
            addCriterion("sys_date is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSysDateIsNotNull() {
            addCriterion("sys_date is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSysDateEqualTo(String value) {
            addCriterion("sys_date =", value, "sysDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSysDateNotEqualTo(String value) {
            addCriterion("sys_date <>", value, "sysDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSysDateGreaterThan(String value) {
            addCriterion("sys_date >", value, "sysDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSysDateGreaterThanOrEqualTo(String value) {
            addCriterion("sys_date >=", value, "sysDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSysDateLessThan(String value) {
            addCriterion("sys_date <", value, "sysDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSysDateLessThanOrEqualTo(String value) {
            addCriterion("sys_date <=", value, "sysDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSysDateLike(String value) {
            addCriterion("sys_date like", value, "sysDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSysDateNotLike(String value) {
            addCriterion("sys_date not like", value, "sysDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSysDateIn(List<String> values) {
            addCriterion("sys_date in", values, "sysDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSysDateNotIn(List<String> values) {
            addCriterion("sys_date not in", values, "sysDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSysDateBetween(String value1, String value2) {
            addCriterion("sys_date between", value1, value2, "sysDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andSysDateNotBetween(String value1, String value2) {
            addCriterion("sys_date not between", value1, value2, "sysDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRequiredCompletionDateIsNull() {
            addCriterion("required_completion_date is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRequiredCompletionDateIsNotNull() {
            addCriterion("required_completion_date is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRequiredCompletionDateEqualTo(String value) {
            addCriterion("required_completion_date =", value, "requiredCompletionDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRequiredCompletionDateNotEqualTo(String value) {
            addCriterion("required_completion_date <>", value, "requiredCompletionDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRequiredCompletionDateGreaterThan(String value) {
            addCriterion("required_completion_date >", value, "requiredCompletionDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRequiredCompletionDateGreaterThanOrEqualTo(String value) {
            addCriterion("required_completion_date >=", value, "requiredCompletionDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRequiredCompletionDateLessThan(String value) {
            addCriterion("required_completion_date <", value, "requiredCompletionDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRequiredCompletionDateLessThanOrEqualTo(String value) {
            addCriterion("required_completion_date <=", value, "requiredCompletionDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRequiredCompletionDateLike(String value) {
            addCriterion("required_completion_date like", value, "requiredCompletionDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRequiredCompletionDateNotLike(String value) {
            addCriterion("required_completion_date not like", value, "requiredCompletionDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRequiredCompletionDateIn(List<String> values) {
            addCriterion("required_completion_date in", values, "requiredCompletionDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRequiredCompletionDateNotIn(List<String> values) {
            addCriterion("required_completion_date not in", values, "requiredCompletionDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRequiredCompletionDateBetween(String value1, String value2) {
            addCriterion("required_completion_date between", value1, value2, "requiredCompletionDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andRequiredCompletionDateNotBetween(String value1, String value2) {
            addCriterion("required_completion_date not between", value1, value2, "requiredCompletionDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBuyerComplaintIdIsNull() {
            addCriterion("buyer_complaint_id is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBuyerComplaintIdIsNotNull() {
            addCriterion("buyer_complaint_id is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBuyerComplaintIdEqualTo(Long value) {
            addCriterion("buyer_complaint_id =", value, "buyerComplaintId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBuyerComplaintIdNotEqualTo(Long value) {
            addCriterion("buyer_complaint_id <>", value, "buyerComplaintId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBuyerComplaintIdGreaterThan(Long value) {
            addCriterion("buyer_complaint_id >", value, "buyerComplaintId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBuyerComplaintIdGreaterThanOrEqualTo(Long value) {
            addCriterion("buyer_complaint_id >=", value, "buyerComplaintId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBuyerComplaintIdLessThan(Long value) {
            addCriterion("buyer_complaint_id <", value, "buyerComplaintId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBuyerComplaintIdLessThanOrEqualTo(Long value) {
            addCriterion("buyer_complaint_id <=", value, "buyerComplaintId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBuyerComplaintIdIn(List<Long> values) {
            addCriterion("buyer_complaint_id in", values, "buyerComplaintId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBuyerComplaintIdNotIn(List<Long> values) {
            addCriterion("buyer_complaint_id not in", values, "buyerComplaintId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBuyerComplaintIdBetween(Long value1, Long value2) {
            addCriterion("buyer_complaint_id between", value1, value2, "buyerComplaintId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andBuyerComplaintIdNotBetween(Long value1, Long value2) {
            addCriterion("buyer_complaint_id not between", value1, value2, "buyerComplaintId");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePersonIsNull() {
            addCriterion("create_person is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePersonIsNotNull() {
            addCriterion("create_person is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePersonEqualTo(String value) {
            addCriterion("create_person =", value, "createPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePersonNotEqualTo(String value) {
            addCriterion("create_person <>", value, "createPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePersonGreaterThan(String value) {
            addCriterion("create_person >", value, "createPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePersonGreaterThanOrEqualTo(String value) {
            addCriterion("create_person >=", value, "createPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePersonLessThan(String value) {
            addCriterion("create_person <", value, "createPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePersonLessThanOrEqualTo(String value) {
            addCriterion("create_person <=", value, "createPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePersonLike(String value) {
            addCriterion("create_person like", value, "createPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePersonNotLike(String value) {
            addCriterion("create_person not like", value, "createPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePersonIn(List<String> values) {
            addCriterion("create_person in", values, "createPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePersonNotIn(List<String> values) {
            addCriterion("create_person not in", values, "createPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePersonBetween(String value1, String value2) {
            addCriterion("create_person between", value1, value2, "createPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreatePersonNotBetween(String value1, String value2) {
            addCriterion("create_person not between", value1, value2, "createPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateDateEqualTo(String value) {
            addCriterion("create_date =", value, "createDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("create_date <>", value, "createDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateDateGreaterThan(String value) {
            addCriterion("create_date >", value, "createDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("create_date >=", value, "createDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateDateLessThan(String value) {
            addCriterion("create_date <", value, "createDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("create_date <=", value, "createDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateDateLike(String value) {
            addCriterion("create_date like", value, "createDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateDateNotLike(String value) {
            addCriterion("create_date not like", value, "createDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateDateIn(List<String> values) {
            addCriterion("create_date in", values, "createDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("create_date not in", values, "createDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiPersonIsNull() {
            addCriterion("modi_person is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiPersonIsNotNull() {
            addCriterion("modi_person is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiPersonEqualTo(String value) {
            addCriterion("modi_person =", value, "modiPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiPersonNotEqualTo(String value) {
            addCriterion("modi_person <>", value, "modiPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiPersonGreaterThan(String value) {
            addCriterion("modi_person >", value, "modiPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiPersonGreaterThanOrEqualTo(String value) {
            addCriterion("modi_person >=", value, "modiPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiPersonLessThan(String value) {
            addCriterion("modi_person <", value, "modiPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiPersonLessThanOrEqualTo(String value) {
            addCriterion("modi_person <=", value, "modiPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiPersonLike(String value) {
            addCriterion("modi_person like", value, "modiPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiPersonNotLike(String value) {
            addCriterion("modi_person not like", value, "modiPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiPersonIn(List<String> values) {
            addCriterion("modi_person in", values, "modiPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiPersonNotIn(List<String> values) {
            addCriterion("modi_person not in", values, "modiPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiPersonBetween(String value1, String value2) {
            addCriterion("modi_person between", value1, value2, "modiPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiPersonNotBetween(String value1, String value2) {
            addCriterion("modi_person not between", value1, value2, "modiPerson");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiDateIsNull() {
            addCriterion("modi_date is null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiDateIsNotNull() {
            addCriterion("modi_date is not null");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiDateEqualTo(String value) {
            addCriterion("modi_date =", value, "modiDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiDateNotEqualTo(String value) {
            addCriterion("modi_date <>", value, "modiDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiDateGreaterThan(String value) {
            addCriterion("modi_date >", value, "modiDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiDateGreaterThanOrEqualTo(String value) {
            addCriterion("modi_date >=", value, "modiDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiDateLessThan(String value) {
            addCriterion("modi_date <", value, "modiDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiDateLessThanOrEqualTo(String value) {
            addCriterion("modi_date <=", value, "modiDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiDateLike(String value) {
            addCriterion("modi_date like", value, "modiDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiDateNotLike(String value) {
            addCriterion("modi_date not like", value, "modiDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiDateIn(List<String> values) {
            addCriterion("modi_date in", values, "modiDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiDateNotIn(List<String> values) {
            addCriterion("modi_date not in", values, "modiDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiDateBetween(String value1, String value2) {
            addCriterion("modi_date between", value1, value2, "modiDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }

        public TCsClaimsBggfExample.Criteria andModiDateNotBetween(String value1, String value2) {
            addCriterion("modi_date not between", value1, value2, "modiDate");
            return (TCsClaimsBggfExample.Criteria)this;
        }
    }
}