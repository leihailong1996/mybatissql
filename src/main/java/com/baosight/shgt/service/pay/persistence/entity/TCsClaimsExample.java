package com.baosight.shgt.service.support.persistence.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TCsClaimsExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public TCsClaimsExample()
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

    public static class Criteria extends TCsClaimsExample.GeneratedCriteria
    {
    }

    protected static abstract class GeneratedCriteria
    {
        protected List<TCsClaimsExample.Criterion> criteria;

        protected GeneratedCriteria()
        {
            this.criteria = new ArrayList();
        }

        public boolean isValid() {
            return this.criteria.size() > 0;
        }

        public List<TCsClaimsExample.Criterion> getAllCriteria() {
            return this.criteria;
        }

        public List<TCsClaimsExample.Criterion> getCriteria() {
            return this.criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            this.criteria.add(new TCsClaimsExample.Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            this.criteria.add(new TCsClaimsExample.Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if ((value1 == null) || (value2 == null)) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            this.criteria.add(new TCsClaimsExample.Criterion(condition, value1, value2));
        }

        public TCsClaimsExample.Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimCodeIsNull() {
            addCriterion("CLAIM_CODE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimCodeIsNotNull() {
            addCriterion("CLAIM_CODE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimCodeEqualTo(String value) {
            addCriterion("CLAIM_CODE =", value, "claimCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimCodeNotEqualTo(String value) {
            addCriterion("CLAIM_CODE <>", value, "claimCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimCodeGreaterThan(String value) {
            addCriterion("CLAIM_CODE >", value, "claimCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLAIM_CODE >=", value, "claimCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimCodeLessThan(String value) {
            addCriterion("CLAIM_CODE <", value, "claimCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimCodeLessThanOrEqualTo(String value) {
            addCriterion("CLAIM_CODE <=", value, "claimCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimCodeLike(String value) {
            addCriterion("CLAIM_CODE like", value, "claimCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimCodeNotLike(String value) {
            addCriterion("CLAIM_CODE not like", value, "claimCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimCodeIn(List<String> values) {
            addCriterion("CLAIM_CODE in", values, "claimCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimCodeNotIn(List<String> values) {
            addCriterion("CLAIM_CODE not in", values, "claimCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimCodeBetween(String value1, String value2) {
            addCriterion("CLAIM_CODE between", value1, value2, "claimCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimCodeNotBetween(String value1, String value2) {
            addCriterion("CLAIM_CODE not between", value1, value2, "claimCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimBatchCodeIsNull() {
            addCriterion("CLAIM_BATCH_CODE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimBatchCodeIsNotNull() {
            addCriterion("CLAIM_BATCH_CODE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimBatchCodeEqualTo(String value) {
            addCriterion("CLAIM_BATCH_CODE =", value, "claimBatchCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimBatchCodeNotEqualTo(String value) {
            addCriterion("CLAIM_BATCH_CODE <>", value, "claimBatchCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimBatchCodeGreaterThan(String value) {
            addCriterion("CLAIM_BATCH_CODE >", value, "claimBatchCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimBatchCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CLAIM_BATCH_CODE >=", value, "claimBatchCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimBatchCodeLessThan(String value) {
            addCriterion("CLAIM_BATCH_CODE <", value, "claimBatchCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimBatchCodeLessThanOrEqualTo(String value) {
            addCriterion("CLAIM_BATCH_CODE <=", value, "claimBatchCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimBatchCodeLike(String value) {
            addCriterion("CLAIM_BATCH_CODE like", value, "claimBatchCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimBatchCodeNotLike(String value) {
            addCriterion("CLAIM_BATCH_CODE not like", value, "claimBatchCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimBatchCodeIn(List<String> values) {
            addCriterion("CLAIM_BATCH_CODE in", values, "claimBatchCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimBatchCodeNotIn(List<String> values) {
            addCriterion("CLAIM_BATCH_CODE not in", values, "claimBatchCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimBatchCodeBetween(String value1, String value2) {
            addCriterion("CLAIM_BATCH_CODE between", value1, value2, "claimBatchCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimBatchCodeNotBetween(String value1, String value2) {
            addCriterion("CLAIM_BATCH_CODE not between", value1, value2, "claimBatchCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQueryTypeIsNull() {
            addCriterion("QUERY_TYPE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQueryTypeIsNotNull() {
            addCriterion("QUERY_TYPE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQueryTypeEqualTo(String value) {
            addCriterion("QUERY_TYPE =", value, "queryType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQueryTypeNotEqualTo(String value) {
            addCriterion("QUERY_TYPE <>", value, "queryType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQueryTypeGreaterThan(String value) {
            addCriterion("QUERY_TYPE >", value, "queryType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQueryTypeGreaterThanOrEqualTo(String value) {
            addCriterion("QUERY_TYPE >=", value, "queryType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQueryTypeLessThan(String value) {
            addCriterion("QUERY_TYPE <", value, "queryType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQueryTypeLessThanOrEqualTo(String value) {
            addCriterion("QUERY_TYPE <=", value, "queryType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQueryTypeLike(String value) {
            addCriterion("QUERY_TYPE like", value, "queryType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQueryTypeNotLike(String value) {
            addCriterion("QUERY_TYPE not like", value, "queryType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQueryTypeIn(List<String> values) {
            addCriterion("QUERY_TYPE in", values, "queryType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQueryTypeNotIn(List<String> values) {
            addCriterion("QUERY_TYPE not in", values, "queryType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQueryTypeBetween(String value1, String value2) {
            addCriterion("QUERY_TYPE between", value1, value2, "queryType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQueryTypeNotBetween(String value1, String value2) {
            addCriterion("QUERY_TYPE not between", value1, value2, "queryType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimTypeIsNull() {
            addCriterion("CLAIM_TYPE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimTypeIsNotNull() {
            addCriterion("CLAIM_TYPE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimTypeEqualTo(String value) {
            addCriterion("CLAIM_TYPE =", value, "claimType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimTypeNotEqualTo(String value) {
            addCriterion("CLAIM_TYPE <>", value, "claimType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimTypeGreaterThan(String value) {
            addCriterion("CLAIM_TYPE >", value, "claimType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CLAIM_TYPE >=", value, "claimType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimTypeLessThan(String value) {
            addCriterion("CLAIM_TYPE <", value, "claimType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimTypeLessThanOrEqualTo(String value) {
            addCriterion("CLAIM_TYPE <=", value, "claimType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimTypeLike(String value) {
            addCriterion("CLAIM_TYPE like", value, "claimType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimTypeNotLike(String value) {
            addCriterion("CLAIM_TYPE not like", value, "claimType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimTypeIn(List<String> values) {
            addCriterion("CLAIM_TYPE in", values, "claimType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimTypeNotIn(List<String> values) {
            addCriterion("CLAIM_TYPE not in", values, "claimType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimTypeBetween(String value1, String value2) {
            addCriterion("CLAIM_TYPE between", value1, value2, "claimType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimTypeNotBetween(String value1, String value2) {
            addCriterion("CLAIM_TYPE not between", value1, value2, "claimType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsMethodIsNull() {
            addCriterion("REPARATIONS_METHOD is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsMethodIsNotNull() {
            addCriterion("REPARATIONS_METHOD is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsMethodEqualTo(String value) {
            addCriterion("REPARATIONS_METHOD =", value, "reparationsMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsMethodNotEqualTo(String value) {
            addCriterion("REPARATIONS_METHOD <>", value, "reparationsMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsMethodGreaterThan(String value) {
            addCriterion("REPARATIONS_METHOD >", value, "reparationsMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsMethodGreaterThanOrEqualTo(String value) {
            addCriterion("REPARATIONS_METHOD >=", value, "reparationsMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsMethodLessThan(String value) {
            addCriterion("REPARATIONS_METHOD <", value, "reparationsMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsMethodLessThanOrEqualTo(String value) {
            addCriterion("REPARATIONS_METHOD <=", value, "reparationsMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsMethodLike(String value) {
            addCriterion("REPARATIONS_METHOD like", value, "reparationsMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsMethodNotLike(String value) {
            addCriterion("REPARATIONS_METHOD not like", value, "reparationsMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsMethodIn(List<String> values) {
            addCriterion("REPARATIONS_METHOD in", values, "reparationsMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsMethodNotIn(List<String> values) {
            addCriterion("REPARATIONS_METHOD not in", values, "reparationsMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsMethodBetween(String value1, String value2) {
            addCriterion("REPARATIONS_METHOD between", value1, value2, "reparationsMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsMethodNotBetween(String value1, String value2) {
            addCriterion("REPARATIONS_METHOD not between", value1, value2, "reparationsMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTreatMethodIsNull() {
            addCriterion("TREAT_METHOD is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTreatMethodIsNotNull() {
            addCriterion("TREAT_METHOD is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTreatMethodEqualTo(String value) {
            addCriterion("TREAT_METHOD =", value, "treatMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTreatMethodNotEqualTo(String value) {
            addCriterion("TREAT_METHOD <>", value, "treatMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTreatMethodGreaterThan(String value) {
            addCriterion("TREAT_METHOD >", value, "treatMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTreatMethodGreaterThanOrEqualTo(String value) {
            addCriterion("TREAT_METHOD >=", value, "treatMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTreatMethodLessThan(String value) {
            addCriterion("TREAT_METHOD <", value, "treatMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTreatMethodLessThanOrEqualTo(String value) {
            addCriterion("TREAT_METHOD <=", value, "treatMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTreatMethodLike(String value) {
            addCriterion("TREAT_METHOD like", value, "treatMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTreatMethodNotLike(String value) {
            addCriterion("TREAT_METHOD not like", value, "treatMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTreatMethodIn(List<String> values) {
            addCriterion("TREAT_METHOD in", values, "treatMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTreatMethodNotIn(List<String> values) {
            addCriterion("TREAT_METHOD not in", values, "treatMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTreatMethodBetween(String value1, String value2) {
            addCriterion("TREAT_METHOD between", value1, value2, "treatMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTreatMethodNotBetween(String value1, String value2) {
            addCriterion("TREAT_METHOD not between", value1, value2, "treatMethod");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerCodeIsNull() {
            addCriterion("BUYER_CODE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerCodeIsNotNull() {
            addCriterion("BUYER_CODE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerCodeEqualTo(String value) {
            addCriterion("BUYER_CODE =", value, "buyerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerCodeNotEqualTo(String value) {
            addCriterion("BUYER_CODE <>", value, "buyerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerCodeGreaterThan(String value) {
            addCriterion("BUYER_CODE >", value, "buyerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_CODE >=", value, "buyerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerCodeLessThan(String value) {
            addCriterion("BUYER_CODE <", value, "buyerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerCodeLessThanOrEqualTo(String value) {
            addCriterion("BUYER_CODE <=", value, "buyerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerCodeLike(String value) {
            addCriterion("BUYER_CODE like", value, "buyerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerCodeNotLike(String value) {
            addCriterion("BUYER_CODE not like", value, "buyerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerCodeIn(List<String> values) {
            addCriterion("BUYER_CODE in", values, "buyerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerCodeNotIn(List<String> values) {
            addCriterion("BUYER_CODE not in", values, "buyerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerCodeBetween(String value1, String value2) {
            addCriterion("BUYER_CODE between", value1, value2, "buyerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerCodeNotBetween(String value1, String value2) {
            addCriterion("BUYER_CODE not between", value1, value2, "buyerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerNameIsNull() {
            addCriterion("BUYER_NAME is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerNameIsNotNull() {
            addCriterion("BUYER_NAME is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerNameEqualTo(String value) {
            addCriterion("BUYER_NAME =", value, "buyerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerNameNotEqualTo(String value) {
            addCriterion("BUYER_NAME <>", value, "buyerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerNameGreaterThan(String value) {
            addCriterion("BUYER_NAME >", value, "buyerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_NAME >=", value, "buyerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerNameLessThan(String value) {
            addCriterion("BUYER_NAME <", value, "buyerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerNameLessThanOrEqualTo(String value) {
            addCriterion("BUYER_NAME <=", value, "buyerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerNameLike(String value) {
            addCriterion("BUYER_NAME like", value, "buyerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerNameNotLike(String value) {
            addCriterion("BUYER_NAME not like", value, "buyerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerNameIn(List<String> values) {
            addCriterion("BUYER_NAME in", values, "buyerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerNameNotIn(List<String> values) {
            addCriterion("BUYER_NAME not in", values, "buyerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerNameBetween(String value1, String value2) {
            addCriterion("BUYER_NAME between", value1, value2, "buyerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerNameNotBetween(String value1, String value2) {
            addCriterion("BUYER_NAME not between", value1, value2, "buyerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactNameIsNull() {
            addCriterion("BUYER_CONTACT_NAME is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactNameIsNotNull() {
            addCriterion("BUYER_CONTACT_NAME is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactNameEqualTo(String value) {
            addCriterion("BUYER_CONTACT_NAME =", value, "buyerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactNameNotEqualTo(String value) {
            addCriterion("BUYER_CONTACT_NAME <>", value, "buyerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactNameGreaterThan(String value) {
            addCriterion("BUYER_CONTACT_NAME >", value, "buyerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_CONTACT_NAME >=", value, "buyerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactNameLessThan(String value) {
            addCriterion("BUYER_CONTACT_NAME <", value, "buyerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactNameLessThanOrEqualTo(String value) {
            addCriterion("BUYER_CONTACT_NAME <=", value, "buyerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactNameLike(String value) {
            addCriterion("BUYER_CONTACT_NAME like", value, "buyerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactNameNotLike(String value) {
            addCriterion("BUYER_CONTACT_NAME not like", value, "buyerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactNameIn(List<String> values) {
            addCriterion("BUYER_CONTACT_NAME in", values, "buyerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactNameNotIn(List<String> values) {
            addCriterion("BUYER_CONTACT_NAME not in", values, "buyerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactNameBetween(String value1, String value2) {
            addCriterion("BUYER_CONTACT_NAME between", value1, value2, "buyerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactNameNotBetween(String value1, String value2) {
            addCriterion("BUYER_CONTACT_NAME not between", value1, value2, "buyerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactPhoneIsNull() {
            addCriterion("BUYER_CONTACT_PHONE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactPhoneIsNotNull() {
            addCriterion("BUYER_CONTACT_PHONE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactPhoneEqualTo(String value) {
            addCriterion("BUYER_CONTACT_PHONE =", value, "buyerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactPhoneNotEqualTo(String value) {
            addCriterion("BUYER_CONTACT_PHONE <>", value, "buyerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactPhoneGreaterThan(String value) {
            addCriterion("BUYER_CONTACT_PHONE >", value, "buyerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("BUYER_CONTACT_PHONE >=", value, "buyerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactPhoneLessThan(String value) {
            addCriterion("BUYER_CONTACT_PHONE <", value, "buyerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("BUYER_CONTACT_PHONE <=", value, "buyerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactPhoneLike(String value) {
            addCriterion("BUYER_CONTACT_PHONE like", value, "buyerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactPhoneNotLike(String value) {
            addCriterion("BUYER_CONTACT_PHONE not like", value, "buyerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactPhoneIn(List<String> values) {
            addCriterion("BUYER_CONTACT_PHONE in", values, "buyerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactPhoneNotIn(List<String> values) {
            addCriterion("BUYER_CONTACT_PHONE not in", values, "buyerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactPhoneBetween(String value1, String value2) {
            addCriterion("BUYER_CONTACT_PHONE between", value1, value2, "buyerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBuyerContactPhoneNotBetween(String value1, String value2) {
            addCriterion("BUYER_CONTACT_PHONE not between", value1, value2, "buyerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderCodeIsNull() {
            addCriterion("PROVIDER_CODE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderCodeIsNotNull() {
            addCriterion("PROVIDER_CODE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderCodeEqualTo(String value) {
            addCriterion("PROVIDER_CODE =", value, "providerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderCodeNotEqualTo(String value) {
            addCriterion("PROVIDER_CODE <>", value, "providerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderCodeGreaterThan(String value) {
            addCriterion("PROVIDER_CODE >", value, "providerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVIDER_CODE >=", value, "providerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderCodeLessThan(String value) {
            addCriterion("PROVIDER_CODE <", value, "providerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderCodeLessThanOrEqualTo(String value) {
            addCriterion("PROVIDER_CODE <=", value, "providerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderCodeLike(String value) {
            addCriterion("PROVIDER_CODE like", value, "providerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderCodeNotLike(String value) {
            addCriterion("PROVIDER_CODE not like", value, "providerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderCodeIn(List<String> values) {
            addCriterion("PROVIDER_CODE in", values, "providerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderCodeNotIn(List<String> values) {
            addCriterion("PROVIDER_CODE not in", values, "providerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderCodeBetween(String value1, String value2) {
            addCriterion("PROVIDER_CODE between", value1, value2, "providerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderCodeNotBetween(String value1, String value2) {
            addCriterion("PROVIDER_CODE not between", value1, value2, "providerCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderNameIsNull() {
            addCriterion("PROVIDER_NAME is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderNameIsNotNull() {
            addCriterion("PROVIDER_NAME is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderNameEqualTo(String value) {
            addCriterion("PROVIDER_NAME =", value, "providerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderNameNotEqualTo(String value) {
            addCriterion("PROVIDER_NAME <>", value, "providerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderNameGreaterThan(String value) {
            addCriterion("PROVIDER_NAME >", value, "providerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROVIDER_NAME >=", value, "providerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderNameLessThan(String value) {
            addCriterion("PROVIDER_NAME <", value, "providerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderNameLessThanOrEqualTo(String value) {
            addCriterion("PROVIDER_NAME <=", value, "providerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderNameLike(String value) {
            addCriterion("PROVIDER_NAME like", value, "providerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderNameNotLike(String value) {
            addCriterion("PROVIDER_NAME not like", value, "providerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderNameIn(List<String> values) {
            addCriterion("PROVIDER_NAME in", values, "providerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderNameNotIn(List<String> values) {
            addCriterion("PROVIDER_NAME not in", values, "providerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderNameBetween(String value1, String value2) {
            addCriterion("PROVIDER_NAME between", value1, value2, "providerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderNameNotBetween(String value1, String value2) {
            addCriterion("PROVIDER_NAME not between", value1, value2, "providerName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactNameIsNull() {
            addCriterion("PROVIDER_CONTACT_NAME is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactNameIsNotNull() {
            addCriterion("PROVIDER_CONTACT_NAME is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactNameEqualTo(String value) {
            addCriterion("PROVIDER_CONTACT_NAME =", value, "providerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactNameNotEqualTo(String value) {
            addCriterion("PROVIDER_CONTACT_NAME <>", value, "providerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactNameGreaterThan(String value) {
            addCriterion("PROVIDER_CONTACT_NAME >", value, "providerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROVIDER_CONTACT_NAME >=", value, "providerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactNameLessThan(String value) {
            addCriterion("PROVIDER_CONTACT_NAME <", value, "providerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactNameLessThanOrEqualTo(String value) {
            addCriterion("PROVIDER_CONTACT_NAME <=", value, "providerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactNameLike(String value) {
            addCriterion("PROVIDER_CONTACT_NAME like", value, "providerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactNameNotLike(String value) {
            addCriterion("PROVIDER_CONTACT_NAME not like", value, "providerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactNameIn(List<String> values) {
            addCriterion("PROVIDER_CONTACT_NAME in", values, "providerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactNameNotIn(List<String> values) {
            addCriterion("PROVIDER_CONTACT_NAME not in", values, "providerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactNameBetween(String value1, String value2) {
            addCriterion("PROVIDER_CONTACT_NAME between", value1, value2, "providerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactNameNotBetween(String value1, String value2) {
            addCriterion("PROVIDER_CONTACT_NAME not between", value1, value2, "providerContactName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactPhoneIsNull() {
            addCriterion("PROVIDER_CONTACT_PHONE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactPhoneIsNotNull() {
            addCriterion("PROVIDER_CONTACT_PHONE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactPhoneEqualTo(String value) {
            addCriterion("PROVIDER_CONTACT_PHONE =", value, "providerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactPhoneNotEqualTo(String value) {
            addCriterion("PROVIDER_CONTACT_PHONE <>", value, "providerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactPhoneGreaterThan(String value) {
            addCriterion("PROVIDER_CONTACT_PHONE >", value, "providerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PROVIDER_CONTACT_PHONE >=", value, "providerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactPhoneLessThan(String value) {
            addCriterion("PROVIDER_CONTACT_PHONE <", value, "providerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("PROVIDER_CONTACT_PHONE <=", value, "providerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactPhoneLike(String value) {
            addCriterion("PROVIDER_CONTACT_PHONE like", value, "providerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactPhoneNotLike(String value) {
            addCriterion("PROVIDER_CONTACT_PHONE not like", value, "providerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactPhoneIn(List<String> values) {
            addCriterion("PROVIDER_CONTACT_PHONE in", values, "providerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactPhoneNotIn(List<String> values) {
            addCriterion("PROVIDER_CONTACT_PHONE not in", values, "providerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactPhoneBetween(String value1, String value2) {
            addCriterion("PROVIDER_CONTACT_PHONE between", value1, value2, "providerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderContactPhoneNotBetween(String value1, String value2) {
            addCriterion("PROVIDER_CONTACT_PHONE not between", value1, value2, "providerContactPhone");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderIdLessThan(Integer value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailIdIsNull() {
            addCriterion("ORDER_DETAIL_ID is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailIdIsNotNull() {
            addCriterion("ORDER_DETAIL_ID is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailIdEqualTo(Integer value) {
            addCriterion("ORDER_DETAIL_ID =", value, "orderDetailId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailIdNotEqualTo(Integer value) {
            addCriterion("ORDER_DETAIL_ID <>", value, "orderDetailId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailIdGreaterThan(Integer value) {
            addCriterion("ORDER_DETAIL_ID >", value, "orderDetailId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_DETAIL_ID >=", value, "orderDetailId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailIdLessThan(Integer value) {
            addCriterion("ORDER_DETAIL_ID <", value, "orderDetailId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_DETAIL_ID <=", value, "orderDetailId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailIdIn(List<Integer> values) {
            addCriterion("ORDER_DETAIL_ID in", values, "orderDetailId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailIdNotIn(List<Integer> values) {
            addCriterion("ORDER_DETAIL_ID not in", values, "orderDetailId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_DETAIL_ID between", value1, value2, "orderDetailId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_DETAIL_ID not between", value1, value2, "orderDetailId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderCodeIsNull() {
            addCriterion("ORDER_CODE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderCodeIsNotNull() {
            addCriterion("ORDER_CODE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderCodeEqualTo(String value) {
            addCriterion("ORDER_CODE =", value, "orderCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderCodeNotEqualTo(String value) {
            addCriterion("ORDER_CODE <>", value, "orderCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderCodeGreaterThan(String value) {
            addCriterion("ORDER_CODE >", value, "orderCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CODE >=", value, "orderCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderCodeLessThan(String value) {
            addCriterion("ORDER_CODE <", value, "orderCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderCodeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CODE <=", value, "orderCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderCodeLike(String value) {
            addCriterion("ORDER_CODE like", value, "orderCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderCodeNotLike(String value) {
            addCriterion("ORDER_CODE not like", value, "orderCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderCodeIn(List<String> values) {
            addCriterion("ORDER_CODE in", values, "orderCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderCodeNotIn(List<String> values) {
            addCriterion("ORDER_CODE not in", values, "orderCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderCodeBetween(String value1, String value2) {
            addCriterion("ORDER_CODE between", value1, value2, "orderCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderCodeNotBetween(String value1, String value2) {
            addCriterion("ORDER_CODE not between", value1, value2, "orderCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailCodeIsNull() {
            addCriterion("ORDER_DETAIL_CODE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailCodeIsNotNull() {
            addCriterion("ORDER_DETAIL_CODE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailCodeEqualTo(String value) {
            addCriterion("ORDER_DETAIL_CODE =", value, "orderDetailCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailCodeNotEqualTo(String value) {
            addCriterion("ORDER_DETAIL_CODE <>", value, "orderDetailCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailCodeGreaterThan(String value) {
            addCriterion("ORDER_DETAIL_CODE >", value, "orderDetailCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_DETAIL_CODE >=", value, "orderDetailCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailCodeLessThan(String value) {
            addCriterion("ORDER_DETAIL_CODE <", value, "orderDetailCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailCodeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_DETAIL_CODE <=", value, "orderDetailCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailCodeLike(String value) {
            addCriterion("ORDER_DETAIL_CODE like", value, "orderDetailCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailCodeNotLike(String value) {
            addCriterion("ORDER_DETAIL_CODE not like", value, "orderDetailCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailCodeIn(List<String> values) {
            addCriterion("ORDER_DETAIL_CODE in", values, "orderDetailCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailCodeNotIn(List<String> values) {
            addCriterion("ORDER_DETAIL_CODE not in", values, "orderDetailCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailCodeBetween(String value1, String value2) {
            addCriterion("ORDER_DETAIL_CODE between", value1, value2, "orderDetailCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderDetailCodeNotBetween(String value1, String value2) {
            addCriterion("ORDER_DETAIL_CODE not between", value1, value2, "orderDetailCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderStatusIsNull() {
            addCriterion("ORDER_STATUS is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderStatusIsNotNull() {
            addCriterion("ORDER_STATUS is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderStatusEqualTo(String value) {
            addCriterion("ORDER_STATUS =", value, "orderStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("ORDER_STATUS <>", value, "orderStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("ORDER_STATUS >", value, "orderStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS >=", value, "orderStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderStatusLessThan(String value) {
            addCriterion("ORDER_STATUS <", value, "orderStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS <=", value, "orderStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderStatusLike(String value) {
            addCriterion("ORDER_STATUS like", value, "orderStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderStatusNotLike(String value) {
            addCriterion("ORDER_STATUS not like", value, "orderStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderStatusIn(List<String> values) {
            addCriterion("ORDER_STATUS in", values, "orderStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("ORDER_STATUS not in", values, "orderStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS between", value1, value2, "orderStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS not between", value1, value2, "orderStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCountsIsNull() {
            addCriterion("PACK_COUNTS is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCountsIsNotNull() {
            addCriterion("PACK_COUNTS is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCountsEqualTo(Integer value) {
            addCriterion("PACK_COUNTS =", value, "packCounts");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCountsNotEqualTo(Integer value) {
            addCriterion("PACK_COUNTS <>", value, "packCounts");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCountsGreaterThan(Integer value) {
            addCriterion("PACK_COUNTS >", value, "packCounts");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCountsGreaterThanOrEqualTo(Integer value) {
            addCriterion("PACK_COUNTS >=", value, "packCounts");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCountsLessThan(Integer value) {
            addCriterion("PACK_COUNTS <", value, "packCounts");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCountsLessThanOrEqualTo(Integer value) {
            addCriterion("PACK_COUNTS <=", value, "packCounts");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCountsIn(List<Integer> values) {
            addCriterion("PACK_COUNTS in", values, "packCounts");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCountsNotIn(List<Integer> values) {
            addCriterion("PACK_COUNTS not in", values, "packCounts");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCountsBetween(Integer value1, Integer value2) {
            addCriterion("PACK_COUNTS between", value1, value2, "packCounts");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCountsNotBetween(Integer value1, Integer value2) {
            addCriterion("PACK_COUNTS not between", value1, value2, "packCounts");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectCodeIsNull() {
            addCriterion("INVOICE_OBJECT_CODE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectCodeIsNotNull() {
            addCriterion("INVOICE_OBJECT_CODE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectCodeEqualTo(String value) {
            addCriterion("INVOICE_OBJECT_CODE =", value, "invoiceObjectCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectCodeNotEqualTo(String value) {
            addCriterion("INVOICE_OBJECT_CODE <>", value, "invoiceObjectCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectCodeGreaterThan(String value) {
            addCriterion("INVOICE_OBJECT_CODE >", value, "invoiceObjectCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_OBJECT_CODE >=", value, "invoiceObjectCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectCodeLessThan(String value) {
            addCriterion("INVOICE_OBJECT_CODE <", value, "invoiceObjectCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectCodeLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_OBJECT_CODE <=", value, "invoiceObjectCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectCodeLike(String value) {
            addCriterion("INVOICE_OBJECT_CODE like", value, "invoiceObjectCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectCodeNotLike(String value) {
            addCriterion("INVOICE_OBJECT_CODE not like", value, "invoiceObjectCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectCodeIn(List<String> values) {
            addCriterion("INVOICE_OBJECT_CODE in", values, "invoiceObjectCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectCodeNotIn(List<String> values) {
            addCriterion("INVOICE_OBJECT_CODE not in", values, "invoiceObjectCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectCodeBetween(String value1, String value2) {
            addCriterion("INVOICE_OBJECT_CODE between", value1, value2, "invoiceObjectCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectCodeNotBetween(String value1, String value2) {
            addCriterion("INVOICE_OBJECT_CODE not between", value1, value2, "invoiceObjectCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectNameIsNull() {
            addCriterion("INVOICE_OBJECT_NAME is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectNameIsNotNull() {
            addCriterion("INVOICE_OBJECT_NAME is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectNameEqualTo(String value) {
            addCriterion("INVOICE_OBJECT_NAME =", value, "invoiceObjectName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectNameNotEqualTo(String value) {
            addCriterion("INVOICE_OBJECT_NAME <>", value, "invoiceObjectName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectNameGreaterThan(String value) {
            addCriterion("INVOICE_OBJECT_NAME >", value, "invoiceObjectName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_OBJECT_NAME >=", value, "invoiceObjectName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectNameLessThan(String value) {
            addCriterion("INVOICE_OBJECT_NAME <", value, "invoiceObjectName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectNameLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_OBJECT_NAME <=", value, "invoiceObjectName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectNameLike(String value) {
            addCriterion("INVOICE_OBJECT_NAME like", value, "invoiceObjectName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectNameNotLike(String value) {
            addCriterion("INVOICE_OBJECT_NAME not like", value, "invoiceObjectName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectNameIn(List<String> values) {
            addCriterion("INVOICE_OBJECT_NAME in", values, "invoiceObjectName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectNameNotIn(List<String> values) {
            addCriterion("INVOICE_OBJECT_NAME not in", values, "invoiceObjectName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectNameBetween(String value1, String value2) {
            addCriterion("INVOICE_OBJECT_NAME between", value1, value2, "invoiceObjectName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceObjectNameNotBetween(String value1, String value2) {
            addCriterion("INVOICE_OBJECT_NAME not between", value1, value2, "invoiceObjectName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderAmountIsNull() {
            addCriterion("ORDER_AMOUNT is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderAmountIsNotNull() {
            addCriterion("ORDER_AMOUNT is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT =", value, "orderAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT <>", value, "orderAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("ORDER_AMOUNT >", value, "orderAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT >=", value, "orderAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("ORDER_AMOUNT <", value, "orderAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_AMOUNT <=", value, "orderAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("ORDER_AMOUNT in", values, "orderAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_AMOUNT not in", values, "orderAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_AMOUNT between", value1, value2, "orderAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_AMOUNT not between", value1, value2, "orderAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCustomerPayAmountIsNull() {
            addCriterion("CUSTOMER_PAY_AMOUNT is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCustomerPayAmountIsNotNull() {
            addCriterion("CUSTOMER_PAY_AMOUNT is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCustomerPayAmountEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_PAY_AMOUNT =", value, "customerPayAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCustomerPayAmountNotEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_PAY_AMOUNT <>", value, "customerPayAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCustomerPayAmountGreaterThan(BigDecimal value) {
            addCriterion("CUSTOMER_PAY_AMOUNT >", value, "customerPayAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCustomerPayAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_PAY_AMOUNT >=", value, "customerPayAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCustomerPayAmountLessThan(BigDecimal value) {
            addCriterion("CUSTOMER_PAY_AMOUNT <", value, "customerPayAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCustomerPayAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CUSTOMER_PAY_AMOUNT <=", value, "customerPayAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCustomerPayAmountIn(List<BigDecimal> values) {
            addCriterion("CUSTOMER_PAY_AMOUNT in", values, "customerPayAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCustomerPayAmountNotIn(List<BigDecimal> values) {
            addCriterion("CUSTOMER_PAY_AMOUNT not in", values, "customerPayAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCustomerPayAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMER_PAY_AMOUNT between", value1, value2, "customerPayAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCustomerPayAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CUSTOMER_PAY_AMOUNT not between", value1, value2, "customerPayAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponDiscountAmountIsNull() {
            addCriterion("COUPON_DISCOUNT_AMOUNT is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponDiscountAmountIsNotNull() {
            addCriterion("COUPON_DISCOUNT_AMOUNT is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("COUPON_DISCOUNT_AMOUNT =", value, "couponDiscountAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("COUPON_DISCOUNT_AMOUNT <>", value, "couponDiscountAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("COUPON_DISCOUNT_AMOUNT >", value, "couponDiscountAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COUPON_DISCOUNT_AMOUNT >=", value, "couponDiscountAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponDiscountAmountLessThan(BigDecimal value) {
            addCriterion("COUPON_DISCOUNT_AMOUNT <", value, "couponDiscountAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COUPON_DISCOUNT_AMOUNT <=", value, "couponDiscountAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("COUPON_DISCOUNT_AMOUNT in", values, "couponDiscountAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("COUPON_DISCOUNT_AMOUNT not in", values, "couponDiscountAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUPON_DISCOUNT_AMOUNT between", value1, value2, "couponDiscountAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUPON_DISCOUNT_AMOUNT not between", value1, value2, "couponDiscountAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponMlsqIsNull() {
            addCriterion("COUPON_MLSQ is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponMlsqIsNotNull() {
            addCriterion("COUPON_MLSQ is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponMlsqEqualTo(BigDecimal value) {
            addCriterion("COUPON_MLSQ =", value, "couponMlsq");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponMlsqNotEqualTo(BigDecimal value) {
            addCriterion("COUPON_MLSQ <>", value, "couponMlsq");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponMlsqGreaterThan(BigDecimal value) {
            addCriterion("COUPON_MLSQ >", value, "couponMlsq");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponMlsqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COUPON_MLSQ >=", value, "couponMlsq");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponMlsqLessThan(BigDecimal value) {
            addCriterion("COUPON_MLSQ <", value, "couponMlsq");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponMlsqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COUPON_MLSQ <=", value, "couponMlsq");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponMlsqIn(List<BigDecimal> values) {
            addCriterion("COUPON_MLSQ in", values, "couponMlsq");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponMlsqNotIn(List<BigDecimal> values) {
            addCriterion("COUPON_MLSQ not in", values, "couponMlsq");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponMlsqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUPON_MLSQ between", value1, value2, "couponMlsq");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCouponMlsqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUPON_MLSQ not between", value1, value2, "couponMlsq");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTaxRateIsNull() {
            addCriterion("TAX_RATE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTaxRateIsNotNull() {
            addCriterion("TAX_RATE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTaxRateEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE =", value, "taxRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTaxRateNotEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE <>", value, "taxRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTaxRateGreaterThan(BigDecimal value) {
            addCriterion("TAX_RATE >", value, "taxRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTaxRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE >=", value, "taxRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTaxRateLessThan(BigDecimal value) {
            addCriterion("TAX_RATE <", value, "taxRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTaxRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TAX_RATE <=", value, "taxRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTaxRateIn(List<BigDecimal> values) {
            addCriterion("TAX_RATE in", values, "taxRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTaxRateNotIn(List<BigDecimal> values) {
            addCriterion("TAX_RATE not in", values, "taxRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTaxRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_RATE between", value1, value2, "taxRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTaxRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TAX_RATE not between", value1, value2, "taxRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountIsNull() {
            addCriterion("PENALTY_AMOUNT is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountIsNotNull() {
            addCriterion("PENALTY_AMOUNT is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountEqualTo(BigDecimal value) {
            addCriterion("PENALTY_AMOUNT =", value, "penaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountNotEqualTo(BigDecimal value) {
            addCriterion("PENALTY_AMOUNT <>", value, "penaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountGreaterThan(BigDecimal value) {
            addCriterion("PENALTY_AMOUNT >", value, "penaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PENALTY_AMOUNT >=", value, "penaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountLessThan(BigDecimal value) {
            addCriterion("PENALTY_AMOUNT <", value, "penaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PENALTY_AMOUNT <=", value, "penaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountIn(List<BigDecimal> values) {
            addCriterion("PENALTY_AMOUNT in", values, "penaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountNotIn(List<BigDecimal> values) {
            addCriterion("PENALTY_AMOUNT not in", values, "penaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PENALTY_AMOUNT between", value1, value2, "penaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PENALTY_AMOUNT not between", value1, value2, "penaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountRateIsNull() {
            addCriterion("PENALTY_AMOUNT_RATE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountRateIsNotNull() {
            addCriterion("PENALTY_AMOUNT_RATE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountRateEqualTo(BigDecimal value) {
            addCriterion("PENALTY_AMOUNT_RATE =", value, "penaltyAmountRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountRateNotEqualTo(BigDecimal value) {
            addCriterion("PENALTY_AMOUNT_RATE <>", value, "penaltyAmountRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountRateGreaterThan(BigDecimal value) {
            addCriterion("PENALTY_AMOUNT_RATE >", value, "penaltyAmountRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PENALTY_AMOUNT_RATE >=", value, "penaltyAmountRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountRateLessThan(BigDecimal value) {
            addCriterion("PENALTY_AMOUNT_RATE <", value, "penaltyAmountRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PENALTY_AMOUNT_RATE <=", value, "penaltyAmountRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountRateIn(List<BigDecimal> values) {
            addCriterion("PENALTY_AMOUNT_RATE in", values, "penaltyAmountRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountRateNotIn(List<BigDecimal> values) {
            addCriterion("PENALTY_AMOUNT_RATE not in", values, "penaltyAmountRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PENALTY_AMOUNT_RATE between", value1, value2, "penaltyAmountRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPenaltyAmountRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PENALTY_AMOUNT_RATE not between", value1, value2, "penaltyAmountRate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceIdIsNull() {
            addCriterion("RESOURCE_ID is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceIdIsNotNull() {
            addCriterion("RESOURCE_ID is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceIdEqualTo(Integer value) {
            addCriterion("RESOURCE_ID =", value, "resourceId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceIdNotEqualTo(Integer value) {
            addCriterion("RESOURCE_ID <>", value, "resourceId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceIdGreaterThan(Integer value) {
            addCriterion("RESOURCE_ID >", value, "resourceId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RESOURCE_ID >=", value, "resourceId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceIdLessThan(Integer value) {
            addCriterion("RESOURCE_ID <", value, "resourceId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceIdLessThanOrEqualTo(Integer value) {
            addCriterion("RESOURCE_ID <=", value, "resourceId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceIdIn(List<Integer> values) {
            addCriterion("RESOURCE_ID in", values, "resourceId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceIdNotIn(List<Integer> values) {
            addCriterion("RESOURCE_ID not in", values, "resourceId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceIdBetween(Integer value1, Integer value2) {
            addCriterion("RESOURCE_ID between", value1, value2, "resourceId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RESOURCE_ID not between", value1, value2, "resourceId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackIdIsNull() {
            addCriterion("PACK_ID is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackIdIsNotNull() {
            addCriterion("PACK_ID is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackIdEqualTo(Integer value) {
            addCriterion("PACK_ID =", value, "packId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackIdNotEqualTo(Integer value) {
            addCriterion("PACK_ID <>", value, "packId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackIdGreaterThan(Integer value) {
            addCriterion("PACK_ID >", value, "packId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PACK_ID >=", value, "packId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackIdLessThan(Integer value) {
            addCriterion("PACK_ID <", value, "packId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackIdLessThanOrEqualTo(Integer value) {
            addCriterion("PACK_ID <=", value, "packId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackIdIn(List<Integer> values) {
            addCriterion("PACK_ID in", values, "packId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackIdNotIn(List<Integer> values) {
            addCriterion("PACK_ID not in", values, "packId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackIdBetween(Integer value1, Integer value2) {
            addCriterion("PACK_ID between", value1, value2, "packId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PACK_ID not between", value1, value2, "packId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCodeIsNull() {
            addCriterion("PACK_CODE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCodeIsNotNull() {
            addCriterion("PACK_CODE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCodeEqualTo(String value) {
            addCriterion("PACK_CODE =", value, "packCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCodeNotEqualTo(String value) {
            addCriterion("PACK_CODE <>", value, "packCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCodeGreaterThan(String value) {
            addCriterion("PACK_CODE >", value, "packCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PACK_CODE >=", value, "packCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCodeLessThan(String value) {
            addCriterion("PACK_CODE <", value, "packCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCodeLessThanOrEqualTo(String value) {
            addCriterion("PACK_CODE <=", value, "packCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCodeLike(String value) {
            addCriterion("PACK_CODE like", value, "packCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCodeNotLike(String value) {
            addCriterion("PACK_CODE not like", value, "packCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCodeIn(List<String> values) {
            addCriterion("PACK_CODE in", values, "packCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCodeNotIn(List<String> values) {
            addCriterion("PACK_CODE not in", values, "packCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCodeBetween(String value1, String value2) {
            addCriterion("PACK_CODE between", value1, value2, "packCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackCodeNotBetween(String value1, String value2) {
            addCriterion("PACK_CODE not between", value1, value2, "packCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andFactoryResCodeIsNull() {
            addCriterion("FACTORY_RES_CODE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andFactoryResCodeIsNotNull() {
            addCriterion("FACTORY_RES_CODE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andFactoryResCodeEqualTo(String value) {
            addCriterion("FACTORY_RES_CODE =", value, "factoryResCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andFactoryResCodeNotEqualTo(String value) {
            addCriterion("FACTORY_RES_CODE <>", value, "factoryResCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andFactoryResCodeGreaterThan(String value) {
            addCriterion("FACTORY_RES_CODE >", value, "factoryResCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andFactoryResCodeGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORY_RES_CODE >=", value, "factoryResCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andFactoryResCodeLessThan(String value) {
            addCriterion("FACTORY_RES_CODE <", value, "factoryResCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andFactoryResCodeLessThanOrEqualTo(String value) {
            addCriterion("FACTORY_RES_CODE <=", value, "factoryResCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andFactoryResCodeLike(String value) {
            addCriterion("FACTORY_RES_CODE like", value, "factoryResCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andFactoryResCodeNotLike(String value) {
            addCriterion("FACTORY_RES_CODE not like", value, "factoryResCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andFactoryResCodeIn(List<String> values) {
            addCriterion("FACTORY_RES_CODE in", values, "factoryResCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andFactoryResCodeNotIn(List<String> values) {
            addCriterion("FACTORY_RES_CODE not in", values, "factoryResCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andFactoryResCodeBetween(String value1, String value2) {
            addCriterion("FACTORY_RES_CODE between", value1, value2, "factoryResCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andFactoryResCodeNotBetween(String value1, String value2) {
            addCriterion("FACTORY_RES_CODE not between", value1, value2, "factoryResCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceTypeIsNull() {
            addCriterion("RESOURCE_TYPE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceTypeIsNotNull() {
            addCriterion("RESOURCE_TYPE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceTypeEqualTo(String value) {
            addCriterion("RESOURCE_TYPE =", value, "resourceType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceTypeNotEqualTo(String value) {
            addCriterion("RESOURCE_TYPE <>", value, "resourceType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceTypeGreaterThan(String value) {
            addCriterion("RESOURCE_TYPE >", value, "resourceType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RESOURCE_TYPE >=", value, "resourceType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceTypeLessThan(String value) {
            addCriterion("RESOURCE_TYPE <", value, "resourceType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceTypeLessThanOrEqualTo(String value) {
            addCriterion("RESOURCE_TYPE <=", value, "resourceType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceTypeLike(String value) {
            addCriterion("RESOURCE_TYPE like", value, "resourceType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceTypeNotLike(String value) {
            addCriterion("RESOURCE_TYPE not like", value, "resourceType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceTypeIn(List<String> values) {
            addCriterion("RESOURCE_TYPE in", values, "resourceType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceTypeNotIn(List<String> values) {
            addCriterion("RESOURCE_TYPE not in", values, "resourceType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceTypeBetween(String value1, String value2) {
            addCriterion("RESOURCE_TYPE between", value1, value2, "resourceType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andResourceTypeNotBetween(String value1, String value2) {
            addCriterion("RESOURCE_TYPE not between", value1, value2, "resourceType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackTypeIsNull() {
            addCriterion("PACK_TYPE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackTypeIsNotNull() {
            addCriterion("PACK_TYPE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackTypeEqualTo(String value) {
            addCriterion("PACK_TYPE =", value, "packType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackTypeNotEqualTo(String value) {
            addCriterion("PACK_TYPE <>", value, "packType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackTypeGreaterThan(String value) {
            addCriterion("PACK_TYPE >", value, "packType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PACK_TYPE >=", value, "packType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackTypeLessThan(String value) {
            addCriterion("PACK_TYPE <", value, "packType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackTypeLessThanOrEqualTo(String value) {
            addCriterion("PACK_TYPE <=", value, "packType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackTypeLike(String value) {
            addCriterion("PACK_TYPE like", value, "packType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackTypeNotLike(String value) {
            addCriterion("PACK_TYPE not like", value, "packType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackTypeIn(List<String> values) {
            addCriterion("PACK_TYPE in", values, "packType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackTypeNotIn(List<String> values) {
            addCriterion("PACK_TYPE not in", values, "packType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackTypeBetween(String value1, String value2) {
            addCriterion("PACK_TYPE between", value1, value2, "packType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPackTypeNotBetween(String value1, String value2) {
            addCriterion("PACK_TYPE not between", value1, value2, "packType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSlaTypeIsNull() {
            addCriterion("SLA_TYPE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSlaTypeIsNotNull() {
            addCriterion("SLA_TYPE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSlaTypeEqualTo(String value) {
            addCriterion("SLA_TYPE =", value, "slaType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSlaTypeNotEqualTo(String value) {
            addCriterion("SLA_TYPE <>", value, "slaType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSlaTypeGreaterThan(String value) {
            addCriterion("SLA_TYPE >", value, "slaType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSlaTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SLA_TYPE >=", value, "slaType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSlaTypeLessThan(String value) {
            addCriterion("SLA_TYPE <", value, "slaType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSlaTypeLessThanOrEqualTo(String value) {
            addCriterion("SLA_TYPE <=", value, "slaType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSlaTypeLike(String value) {
            addCriterion("SLA_TYPE like", value, "slaType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSlaTypeNotLike(String value) {
            addCriterion("SLA_TYPE not like", value, "slaType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSlaTypeIn(List<String> values) {
            addCriterion("SLA_TYPE in", values, "slaType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSlaTypeNotIn(List<String> values) {
            addCriterion("SLA_TYPE not in", values, "slaType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSlaTypeBetween(String value1, String value2) {
            addCriterion("SLA_TYPE between", value1, value2, "slaType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSlaTypeNotBetween(String value1, String value2) {
            addCriterion("SLA_TYPE not between", value1, value2, "slaType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeCodeIsNull() {
            addCriterion("PRODUCT_TYPE_CODE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeCodeIsNotNull() {
            addCriterion("PRODUCT_TYPE_CODE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeCodeEqualTo(String value) {
            addCriterion("PRODUCT_TYPE_CODE =", value, "productTypeCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeCodeNotEqualTo(String value) {
            addCriterion("PRODUCT_TYPE_CODE <>", value, "productTypeCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeCodeGreaterThan(String value) {
            addCriterion("PRODUCT_TYPE_CODE >", value, "productTypeCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE_CODE >=", value, "productTypeCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeCodeLessThan(String value) {
            addCriterion("PRODUCT_TYPE_CODE <", value, "productTypeCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE_CODE <=", value, "productTypeCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeCodeLike(String value) {
            addCriterion("PRODUCT_TYPE_CODE like", value, "productTypeCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeCodeNotLike(String value) {
            addCriterion("PRODUCT_TYPE_CODE not like", value, "productTypeCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeCodeIn(List<String> values) {
            addCriterion("PRODUCT_TYPE_CODE in", values, "productTypeCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeCodeNotIn(List<String> values) {
            addCriterion("PRODUCT_TYPE_CODE not in", values, "productTypeCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeCodeBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE_CODE between", value1, value2, "productTypeCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeCodeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE_CODE not between", value1, value2, "productTypeCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeNameIsNull() {
            addCriterion("PRODUCT_TYPE_NAME is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeNameIsNotNull() {
            addCriterion("PRODUCT_TYPE_NAME is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeNameEqualTo(String value) {
            addCriterion("PRODUCT_TYPE_NAME =", value, "productTypeName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeNameNotEqualTo(String value) {
            addCriterion("PRODUCT_TYPE_NAME <>", value, "productTypeName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeNameGreaterThan(String value) {
            addCriterion("PRODUCT_TYPE_NAME >", value, "productTypeName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE_NAME >=", value, "productTypeName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeNameLessThan(String value) {
            addCriterion("PRODUCT_TYPE_NAME <", value, "productTypeName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPE_NAME <=", value, "productTypeName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeNameLike(String value) {
            addCriterion("PRODUCT_TYPE_NAME like", value, "productTypeName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeNameNotLike(String value) {
            addCriterion("PRODUCT_TYPE_NAME not like", value, "productTypeName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeNameIn(List<String> values) {
            addCriterion("PRODUCT_TYPE_NAME in", values, "productTypeName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeNameNotIn(List<String> values) {
            addCriterion("PRODUCT_TYPE_NAME not in", values, "productTypeName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE_NAME between", value1, value2, "productTypeName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProductTypeNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPE_NAME not between", value1, value2, "productTypeName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andShopSignIsNull() {
            addCriterion("SHOP_SIGN is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andShopSignIsNotNull() {
            addCriterion("SHOP_SIGN is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andShopSignEqualTo(String value) {
            addCriterion("SHOP_SIGN =", value, "shopSign");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andShopSignNotEqualTo(String value) {
            addCriterion("SHOP_SIGN <>", value, "shopSign");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andShopSignGreaterThan(String value) {
            addCriterion("SHOP_SIGN >", value, "shopSign");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andShopSignGreaterThanOrEqualTo(String value) {
            addCriterion("SHOP_SIGN >=", value, "shopSign");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andShopSignLessThan(String value) {
            addCriterion("SHOP_SIGN <", value, "shopSign");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andShopSignLessThanOrEqualTo(String value) {
            addCriterion("SHOP_SIGN <=", value, "shopSign");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andShopSignLike(String value) {
            addCriterion("SHOP_SIGN like", value, "shopSign");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andShopSignNotLike(String value) {
            addCriterion("SHOP_SIGN not like", value, "shopSign");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andShopSignIn(List<String> values) {
            addCriterion("SHOP_SIGN in", values, "shopSign");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andShopSignNotIn(List<String> values) {
            addCriterion("SHOP_SIGN not in", values, "shopSign");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andShopSignBetween(String value1, String value2) {
            addCriterion("SHOP_SIGN between", value1, value2, "shopSign");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andShopSignNotBetween(String value1, String value2) {
            addCriterion("SHOP_SIGN not between", value1, value2, "shopSign");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSpecIsNull() {
            addCriterion("SPEC is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSpecIsNotNull() {
            addCriterion("SPEC is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSpecEqualTo(String value) {
            addCriterion("SPEC =", value, "spec");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSpecNotEqualTo(String value) {
            addCriterion("SPEC <>", value, "spec");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSpecGreaterThan(String value) {
            addCriterion("SPEC >", value, "spec");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSpecGreaterThanOrEqualTo(String value) {
            addCriterion("SPEC >=", value, "spec");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSpecLessThan(String value) {
            addCriterion("SPEC <", value, "spec");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSpecLessThanOrEqualTo(String value) {
            addCriterion("SPEC <=", value, "spec");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSpecLike(String value) {
            addCriterion("SPEC like", value, "spec");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSpecNotLike(String value) {
            addCriterion("SPEC not like", value, "spec");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSpecIn(List<String> values) {
            addCriterion("SPEC in", values, "spec");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSpecNotIn(List<String> values) {
            addCriterion("SPEC not in", values, "spec");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSpecBetween(String value1, String value2) {
            addCriterion("SPEC between", value1, value2, "spec");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSpecNotBetween(String value1, String value2) {
            addCriterion("SPEC not between", value1, value2, "spec");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTechStandardIsNull() {
            addCriterion("TECH_STANDARD is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTechStandardIsNotNull() {
            addCriterion("TECH_STANDARD is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTechStandardEqualTo(String value) {
            addCriterion("TECH_STANDARD =", value, "techStandard");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTechStandardNotEqualTo(String value) {
            addCriterion("TECH_STANDARD <>", value, "techStandard");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTechStandardGreaterThan(String value) {
            addCriterion("TECH_STANDARD >", value, "techStandard");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTechStandardGreaterThanOrEqualTo(String value) {
            addCriterion("TECH_STANDARD >=", value, "techStandard");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTechStandardLessThan(String value) {
            addCriterion("TECH_STANDARD <", value, "techStandard");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTechStandardLessThanOrEqualTo(String value) {
            addCriterion("TECH_STANDARD <=", value, "techStandard");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTechStandardLike(String value) {
            addCriterion("TECH_STANDARD like", value, "techStandard");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTechStandardNotLike(String value) {
            addCriterion("TECH_STANDARD not like", value, "techStandard");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTechStandardIn(List<String> values) {
            addCriterion("TECH_STANDARD in", values, "techStandard");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTechStandardNotIn(List<String> values) {
            addCriterion("TECH_STANDARD not in", values, "techStandard");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTechStandardBetween(String value1, String value2) {
            addCriterion("TECH_STANDARD between", value1, value2, "techStandard");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTechStandardNotBetween(String value1, String value2) {
            addCriterion("TECH_STANDARD not between", value1, value2, "techStandard");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andManufactureNameIsNull() {
            addCriterion("MANUFACTURE_NAME is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andManufactureNameIsNotNull() {
            addCriterion("MANUFACTURE_NAME is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andManufactureNameEqualTo(String value) {
            addCriterion("MANUFACTURE_NAME =", value, "manufactureName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andManufactureNameNotEqualTo(String value) {
            addCriterion("MANUFACTURE_NAME <>", value, "manufactureName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andManufactureNameGreaterThan(String value) {
            addCriterion("MANUFACTURE_NAME >", value, "manufactureName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andManufactureNameGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTURE_NAME >=", value, "manufactureName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andManufactureNameLessThan(String value) {
            addCriterion("MANUFACTURE_NAME <", value, "manufactureName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andManufactureNameLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTURE_NAME <=", value, "manufactureName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andManufactureNameLike(String value) {
            addCriterion("MANUFACTURE_NAME like", value, "manufactureName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andManufactureNameNotLike(String value) {
            addCriterion("MANUFACTURE_NAME not like", value, "manufactureName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andManufactureNameIn(List<String> values) {
            addCriterion("MANUFACTURE_NAME in", values, "manufactureName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andManufactureNameNotIn(List<String> values) {
            addCriterion("MANUFACTURE_NAME not in", values, "manufactureName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andManufactureNameBetween(String value1, String value2) {
            addCriterion("MANUFACTURE_NAME between", value1, value2, "manufactureName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andManufactureNameNotBetween(String value1, String value2) {
            addCriterion("MANUFACTURE_NAME not between", value1, value2, "manufactureName");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQualityGradeIsNull() {
            addCriterion("QUALITY_GRADE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQualityGradeIsNotNull() {
            addCriterion("QUALITY_GRADE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQualityGradeEqualTo(String value) {
            addCriterion("QUALITY_GRADE =", value, "qualityGrade");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQualityGradeNotEqualTo(String value) {
            addCriterion("QUALITY_GRADE <>", value, "qualityGrade");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQualityGradeGreaterThan(String value) {
            addCriterion("QUALITY_GRADE >", value, "qualityGrade");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQualityGradeGreaterThanOrEqualTo(String value) {
            addCriterion("QUALITY_GRADE >=", value, "qualityGrade");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQualityGradeLessThan(String value) {
            addCriterion("QUALITY_GRADE <", value, "qualityGrade");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQualityGradeLessThanOrEqualTo(String value) {
            addCriterion("QUALITY_GRADE <=", value, "qualityGrade");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQualityGradeLike(String value) {
            addCriterion("QUALITY_GRADE like", value, "qualityGrade");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQualityGradeNotLike(String value) {
            addCriterion("QUALITY_GRADE not like", value, "qualityGrade");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQualityGradeIn(List<String> values) {
            addCriterion("QUALITY_GRADE in", values, "qualityGrade");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQualityGradeNotIn(List<String> values) {
            addCriterion("QUALITY_GRADE not in", values, "qualityGrade");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQualityGradeBetween(String value1, String value2) {
            addCriterion("QUALITY_GRADE between", value1, value2, "qualityGrade");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQualityGradeNotBetween(String value1, String value2) {
            addCriterion("QUALITY_GRADE not between", value1, value2, "qualityGrade");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andWeightIsNull() {
            addCriterion("WEIGHT is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andWeightIsNotNull() {
            addCriterion("WEIGHT is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("WEIGHT =", value, "weight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <>", value, "weight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("WEIGHT >", value, "weight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT >=", value, "weight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("WEIGHT <", value, "weight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <=", value, "weight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("WEIGHT in", values, "weight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("WEIGHT not in", values, "weight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT between", value1, value2, "weight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT not between", value1, value2, "weight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDeliveryFlagIsNull() {
            addCriterion("DELIVERY_FLAG is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDeliveryFlagIsNotNull() {
            addCriterion("DELIVERY_FLAG is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDeliveryFlagEqualTo(String value) {
            addCriterion("DELIVERY_FLAG =", value, "deliveryFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDeliveryFlagNotEqualTo(String value) {
            addCriterion("DELIVERY_FLAG <>", value, "deliveryFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDeliveryFlagGreaterThan(String value) {
            addCriterion("DELIVERY_FLAG >", value, "deliveryFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDeliveryFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_FLAG >=", value, "deliveryFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDeliveryFlagLessThan(String value) {
            addCriterion("DELIVERY_FLAG <", value, "deliveryFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDeliveryFlagLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_FLAG <=", value, "deliveryFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDeliveryFlagLike(String value) {
            addCriterion("DELIVERY_FLAG like", value, "deliveryFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDeliveryFlagNotLike(String value) {
            addCriterion("DELIVERY_FLAG not like", value, "deliveryFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDeliveryFlagIn(List<String> values) {
            addCriterion("DELIVERY_FLAG in", values, "deliveryFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDeliveryFlagNotIn(List<String> values) {
            addCriterion("DELIVERY_FLAG not in", values, "deliveryFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDeliveryFlagBetween(String value1, String value2) {
            addCriterion("DELIVERY_FLAG between", value1, value2, "deliveryFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDeliveryFlagNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_FLAG not between", value1, value2, "deliveryFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationProvIsNull() {
            addCriterion("GOODS_LOCATION_PROV is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationProvIsNotNull() {
            addCriterion("GOODS_LOCATION_PROV is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationProvEqualTo(String value) {
            addCriterion("GOODS_LOCATION_PROV =", value, "goodsLocationProv");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationProvNotEqualTo(String value) {
            addCriterion("GOODS_LOCATION_PROV <>", value, "goodsLocationProv");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationProvGreaterThan(String value) {
            addCriterion("GOODS_LOCATION_PROV >", value, "goodsLocationProv");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationProvGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_LOCATION_PROV >=", value, "goodsLocationProv");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationProvLessThan(String value) {
            addCriterion("GOODS_LOCATION_PROV <", value, "goodsLocationProv");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationProvLessThanOrEqualTo(String value) {
            addCriterion("GOODS_LOCATION_PROV <=", value, "goodsLocationProv");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationProvLike(String value) {
            addCriterion("GOODS_LOCATION_PROV like", value, "goodsLocationProv");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationProvNotLike(String value) {
            addCriterion("GOODS_LOCATION_PROV not like", value, "goodsLocationProv");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationProvIn(List<String> values) {
            addCriterion("GOODS_LOCATION_PROV in", values, "goodsLocationProv");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationProvNotIn(List<String> values) {
            addCriterion("GOODS_LOCATION_PROV not in", values, "goodsLocationProv");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationProvBetween(String value1, String value2) {
            addCriterion("GOODS_LOCATION_PROV between", value1, value2, "goodsLocationProv");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationProvNotBetween(String value1, String value2) {
            addCriterion("GOODS_LOCATION_PROV not between", value1, value2, "goodsLocationProv");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationCityIsNull() {
            addCriterion("GOODS_LOCATION_CITY is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationCityIsNotNull() {
            addCriterion("GOODS_LOCATION_CITY is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationCityEqualTo(String value) {
            addCriterion("GOODS_LOCATION_CITY =", value, "goodsLocationCity");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationCityNotEqualTo(String value) {
            addCriterion("GOODS_LOCATION_CITY <>", value, "goodsLocationCity");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationCityGreaterThan(String value) {
            addCriterion("GOODS_LOCATION_CITY >", value, "goodsLocationCity");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationCityGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_LOCATION_CITY >=", value, "goodsLocationCity");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationCityLessThan(String value) {
            addCriterion("GOODS_LOCATION_CITY <", value, "goodsLocationCity");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationCityLessThanOrEqualTo(String value) {
            addCriterion("GOODS_LOCATION_CITY <=", value, "goodsLocationCity");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationCityLike(String value) {
            addCriterion("GOODS_LOCATION_CITY like", value, "goodsLocationCity");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationCityNotLike(String value) {
            addCriterion("GOODS_LOCATION_CITY not like", value, "goodsLocationCity");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationCityIn(List<String> values) {
            addCriterion("GOODS_LOCATION_CITY in", values, "goodsLocationCity");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationCityNotIn(List<String> values) {
            addCriterion("GOODS_LOCATION_CITY not in", values, "goodsLocationCity");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationCityBetween(String value1, String value2) {
            addCriterion("GOODS_LOCATION_CITY between", value1, value2, "goodsLocationCity");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationCityNotBetween(String value1, String value2) {
            addCriterion("GOODS_LOCATION_CITY not between", value1, value2, "goodsLocationCity");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationAreaIsNull() {
            addCriterion("GOODS_LOCATION_AREA is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationAreaIsNotNull() {
            addCriterion("GOODS_LOCATION_AREA is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationAreaEqualTo(String value) {
            addCriterion("GOODS_LOCATION_AREA =", value, "goodsLocationArea");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationAreaNotEqualTo(String value) {
            addCriterion("GOODS_LOCATION_AREA <>", value, "goodsLocationArea");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationAreaGreaterThan(String value) {
            addCriterion("GOODS_LOCATION_AREA >", value, "goodsLocationArea");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationAreaGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_LOCATION_AREA >=", value, "goodsLocationArea");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationAreaLessThan(String value) {
            addCriterion("GOODS_LOCATION_AREA <", value, "goodsLocationArea");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationAreaLessThanOrEqualTo(String value) {
            addCriterion("GOODS_LOCATION_AREA <=", value, "goodsLocationArea");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationAreaLike(String value) {
            addCriterion("GOODS_LOCATION_AREA like", value, "goodsLocationArea");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationAreaNotLike(String value) {
            addCriterion("GOODS_LOCATION_AREA not like", value, "goodsLocationArea");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationAreaIn(List<String> values) {
            addCriterion("GOODS_LOCATION_AREA in", values, "goodsLocationArea");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationAreaNotIn(List<String> values) {
            addCriterion("GOODS_LOCATION_AREA not in", values, "goodsLocationArea");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationAreaBetween(String value1, String value2) {
            addCriterion("GOODS_LOCATION_AREA between", value1, value2, "goodsLocationArea");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationAreaNotBetween(String value1, String value2) {
            addCriterion("GOODS_LOCATION_AREA not between", value1, value2, "goodsLocationArea");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationDetailIsNull() {
            addCriterion("GOODS_LOCATION_DETAIL is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationDetailIsNotNull() {
            addCriterion("GOODS_LOCATION_DETAIL is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationDetailEqualTo(String value) {
            addCriterion("GOODS_LOCATION_DETAIL =", value, "goodsLocationDetail");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationDetailNotEqualTo(String value) {
            addCriterion("GOODS_LOCATION_DETAIL <>", value, "goodsLocationDetail");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationDetailGreaterThan(String value) {
            addCriterion("GOODS_LOCATION_DETAIL >", value, "goodsLocationDetail");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationDetailGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_LOCATION_DETAIL >=", value, "goodsLocationDetail");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationDetailLessThan(String value) {
            addCriterion("GOODS_LOCATION_DETAIL <", value, "goodsLocationDetail");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationDetailLessThanOrEqualTo(String value) {
            addCriterion("GOODS_LOCATION_DETAIL <=", value, "goodsLocationDetail");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationDetailLike(String value) {
            addCriterion("GOODS_LOCATION_DETAIL like", value, "goodsLocationDetail");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationDetailNotLike(String value) {
            addCriterion("GOODS_LOCATION_DETAIL not like", value, "goodsLocationDetail");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationDetailIn(List<String> values) {
            addCriterion("GOODS_LOCATION_DETAIL in", values, "goodsLocationDetail");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationDetailNotIn(List<String> values) {
            addCriterion("GOODS_LOCATION_DETAIL not in", values, "goodsLocationDetail");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationDetailBetween(String value1, String value2) {
            addCriterion("GOODS_LOCATION_DETAIL between", value1, value2, "goodsLocationDetail");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsLocationDetailNotBetween(String value1, String value2) {
            addCriterion("GOODS_LOCATION_DETAIL not between", value1, value2, "goodsLocationDetail");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andLessWeightIsNull() {
            addCriterion("LESS_WEIGHT is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andLessWeightIsNotNull() {
            addCriterion("LESS_WEIGHT is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andLessWeightEqualTo(BigDecimal value) {
            addCriterion("LESS_WEIGHT =", value, "lessWeight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andLessWeightNotEqualTo(BigDecimal value) {
            addCriterion("LESS_WEIGHT <>", value, "lessWeight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andLessWeightGreaterThan(BigDecimal value) {
            addCriterion("LESS_WEIGHT >", value, "lessWeight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andLessWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LESS_WEIGHT >=", value, "lessWeight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andLessWeightLessThan(BigDecimal value) {
            addCriterion("LESS_WEIGHT <", value, "lessWeight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andLessWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LESS_WEIGHT <=", value, "lessWeight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andLessWeightIn(List<BigDecimal> values) {
            addCriterion("LESS_WEIGHT in", values, "lessWeight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andLessWeightNotIn(List<BigDecimal> values) {
            addCriterion("LESS_WEIGHT not in", values, "lessWeight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andLessWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LESS_WEIGHT between", value1, value2, "lessWeight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andLessWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LESS_WEIGHT not between", value1, value2, "lessWeight");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceStatusIsNull() {
            addCriterion("INVOICE_STATUS is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceStatusIsNotNull() {
            addCriterion("INVOICE_STATUS is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceStatusEqualTo(String value) {
            addCriterion("INVOICE_STATUS =", value, "invoiceStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceStatusNotEqualTo(String value) {
            addCriterion("INVOICE_STATUS <>", value, "invoiceStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceStatusGreaterThan(String value) {
            addCriterion("INVOICE_STATUS >", value, "invoiceStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_STATUS >=", value, "invoiceStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceStatusLessThan(String value) {
            addCriterion("INVOICE_STATUS <", value, "invoiceStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceStatusLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_STATUS <=", value, "invoiceStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceStatusLike(String value) {
            addCriterion("INVOICE_STATUS like", value, "invoiceStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceStatusNotLike(String value) {
            addCriterion("INVOICE_STATUS not like", value, "invoiceStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceStatusIn(List<String> values) {
            addCriterion("INVOICE_STATUS in", values, "invoiceStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceStatusNotIn(List<String> values) {
            addCriterion("INVOICE_STATUS not in", values, "invoiceStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceStatusBetween(String value1, String value2) {
            addCriterion("INVOICE_STATUS between", value1, value2, "invoiceStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andInvoiceStatusNotBetween(String value1, String value2) {
            addCriterion("INVOICE_STATUS not between", value1, value2, "invoiceStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedInvoiceIsNull() {
            addCriterion("BE_NEED_RED_INVOICE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedInvoiceIsNotNull() {
            addCriterion("BE_NEED_RED_INVOICE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedInvoiceEqualTo(String value) {
            addCriterion("BE_NEED_RED_INVOICE =", value, "beNeedRedInvoice");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedInvoiceNotEqualTo(String value) {
            addCriterion("BE_NEED_RED_INVOICE <>", value, "beNeedRedInvoice");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedInvoiceGreaterThan(String value) {
            addCriterion("BE_NEED_RED_INVOICE >", value, "beNeedRedInvoice");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("BE_NEED_RED_INVOICE >=", value, "beNeedRedInvoice");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedInvoiceLessThan(String value) {
            addCriterion("BE_NEED_RED_INVOICE <", value, "beNeedRedInvoice");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedInvoiceLessThanOrEqualTo(String value) {
            addCriterion("BE_NEED_RED_INVOICE <=", value, "beNeedRedInvoice");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedInvoiceLike(String value) {
            addCriterion("BE_NEED_RED_INVOICE like", value, "beNeedRedInvoice");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedInvoiceNotLike(String value) {
            addCriterion("BE_NEED_RED_INVOICE not like", value, "beNeedRedInvoice");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedInvoiceIn(List<String> values) {
            addCriterion("BE_NEED_RED_INVOICE in", values, "beNeedRedInvoice");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedInvoiceNotIn(List<String> values) {
            addCriterion("BE_NEED_RED_INVOICE not in", values, "beNeedRedInvoice");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedInvoiceBetween(String value1, String value2) {
            addCriterion("BE_NEED_RED_INVOICE between", value1, value2, "beNeedRedInvoice");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedInvoiceNotBetween(String value1, String value2) {
            addCriterion("BE_NEED_RED_INVOICE not between", value1, value2, "beNeedRedInvoice");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedLetterIsNull() {
            addCriterion("BE_NEED_RED_LETTER is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedLetterIsNotNull() {
            addCriterion("BE_NEED_RED_LETTER is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedLetterEqualTo(String value) {
            addCriterion("BE_NEED_RED_LETTER =", value, "beNeedRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedLetterNotEqualTo(String value) {
            addCriterion("BE_NEED_RED_LETTER <>", value, "beNeedRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedLetterGreaterThan(String value) {
            addCriterion("BE_NEED_RED_LETTER >", value, "beNeedRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedLetterGreaterThanOrEqualTo(String value) {
            addCriterion("BE_NEED_RED_LETTER >=", value, "beNeedRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedLetterLessThan(String value) {
            addCriterion("BE_NEED_RED_LETTER <", value, "beNeedRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedLetterLessThanOrEqualTo(String value) {
            addCriterion("BE_NEED_RED_LETTER <=", value, "beNeedRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedLetterLike(String value) {
            addCriterion("BE_NEED_RED_LETTER like", value, "beNeedRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedLetterNotLike(String value) {
            addCriterion("BE_NEED_RED_LETTER not like", value, "beNeedRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedLetterIn(List<String> values) {
            addCriterion("BE_NEED_RED_LETTER in", values, "beNeedRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedLetterNotIn(List<String> values) {
            addCriterion("BE_NEED_RED_LETTER not in", values, "beNeedRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedLetterBetween(String value1, String value2) {
            addCriterion("BE_NEED_RED_LETTER between", value1, value2, "beNeedRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeNeedRedLetterNotBetween(String value1, String value2) {
            addCriterion("BE_NEED_RED_LETTER not between", value1, value2, "beNeedRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeReceiveRedLetterIsNull() {
            addCriterion("BE_RECEIVE_RED_LETTER is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeReceiveRedLetterIsNotNull() {
            addCriterion("BE_RECEIVE_RED_LETTER is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeReceiveRedLetterEqualTo(String value) {
            addCriterion("BE_RECEIVE_RED_LETTER =", value, "beReceiveRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeReceiveRedLetterNotEqualTo(String value) {
            addCriterion("BE_RECEIVE_RED_LETTER <>", value, "beReceiveRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeReceiveRedLetterGreaterThan(String value) {
            addCriterion("BE_RECEIVE_RED_LETTER >", value, "beReceiveRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeReceiveRedLetterGreaterThanOrEqualTo(String value) {
            addCriterion("BE_RECEIVE_RED_LETTER >=", value, "beReceiveRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeReceiveRedLetterLessThan(String value) {
            addCriterion("BE_RECEIVE_RED_LETTER <", value, "beReceiveRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeReceiveRedLetterLessThanOrEqualTo(String value) {
            addCriterion("BE_RECEIVE_RED_LETTER <=", value, "beReceiveRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeReceiveRedLetterLike(String value) {
            addCriterion("BE_RECEIVE_RED_LETTER like", value, "beReceiveRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeReceiveRedLetterNotLike(String value) {
            addCriterion("BE_RECEIVE_RED_LETTER not like", value, "beReceiveRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeReceiveRedLetterIn(List<String> values) {
            addCriterion("BE_RECEIVE_RED_LETTER in", values, "beReceiveRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeReceiveRedLetterNotIn(List<String> values) {
            addCriterion("BE_RECEIVE_RED_LETTER not in", values, "beReceiveRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeReceiveRedLetterBetween(String value1, String value2) {
            addCriterion("BE_RECEIVE_RED_LETTER between", value1, value2, "beReceiveRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeReceiveRedLetterNotBetween(String value1, String value2) {
            addCriterion("BE_RECEIVE_RED_LETTER not between", value1, value2, "beReceiveRedLetter");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterAutitStatusIsNull() {
            addCriterion("RED_LETTER_AUTIT_STATUS is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterAutitStatusIsNotNull() {
            addCriterion("RED_LETTER_AUTIT_STATUS is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterAutitStatusEqualTo(String value) {
            addCriterion("RED_LETTER_AUTIT_STATUS =", value, "redLetterAutitStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterAutitStatusNotEqualTo(String value) {
            addCriterion("RED_LETTER_AUTIT_STATUS <>", value, "redLetterAutitStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterAutitStatusGreaterThan(String value) {
            addCriterion("RED_LETTER_AUTIT_STATUS >", value, "redLetterAutitStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterAutitStatusGreaterThanOrEqualTo(String value) {
            addCriterion("RED_LETTER_AUTIT_STATUS >=", value, "redLetterAutitStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterAutitStatusLessThan(String value) {
            addCriterion("RED_LETTER_AUTIT_STATUS <", value, "redLetterAutitStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterAutitStatusLessThanOrEqualTo(String value) {
            addCriterion("RED_LETTER_AUTIT_STATUS <=", value, "redLetterAutitStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterAutitStatusLike(String value) {
            addCriterion("RED_LETTER_AUTIT_STATUS like", value, "redLetterAutitStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterAutitStatusNotLike(String value) {
            addCriterion("RED_LETTER_AUTIT_STATUS not like", value, "redLetterAutitStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterAutitStatusIn(List<String> values) {
            addCriterion("RED_LETTER_AUTIT_STATUS in", values, "redLetterAutitStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterAutitStatusNotIn(List<String> values) {
            addCriterion("RED_LETTER_AUTIT_STATUS not in", values, "redLetterAutitStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterAutitStatusBetween(String value1, String value2) {
            addCriterion("RED_LETTER_AUTIT_STATUS between", value1, value2, "redLetterAutitStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterAutitStatusNotBetween(String value1, String value2) {
            addCriterion("RED_LETTER_AUTIT_STATUS not between", value1, value2, "redLetterAutitStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterNoIsNull() {
            addCriterion("RED_LETTER_NO is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterNoIsNotNull() {
            addCriterion("RED_LETTER_NO is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterNoEqualTo(String value) {
            addCriterion("RED_LETTER_NO =", value, "redLetterNo");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterNoNotEqualTo(String value) {
            addCriterion("RED_LETTER_NO <>", value, "redLetterNo");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterNoGreaterThan(String value) {
            addCriterion("RED_LETTER_NO >", value, "redLetterNo");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterNoGreaterThanOrEqualTo(String value) {
            addCriterion("RED_LETTER_NO >=", value, "redLetterNo");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterNoLessThan(String value) {
            addCriterion("RED_LETTER_NO <", value, "redLetterNo");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterNoLessThanOrEqualTo(String value) {
            addCriterion("RED_LETTER_NO <=", value, "redLetterNo");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterNoLike(String value) {
            addCriterion("RED_LETTER_NO like", value, "redLetterNo");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterNoNotLike(String value) {
            addCriterion("RED_LETTER_NO not like", value, "redLetterNo");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterNoIn(List<String> values) {
            addCriterion("RED_LETTER_NO in", values, "redLetterNo");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterNoNotIn(List<String> values) {
            addCriterion("RED_LETTER_NO not in", values, "redLetterNo");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterNoBetween(String value1, String value2) {
            addCriterion("RED_LETTER_NO between", value1, value2, "redLetterNo");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterNoNotBetween(String value1, String value2) {
            addCriterion("RED_LETTER_NO not between", value1, value2, "redLetterNo");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterRecordDateIsNull() {
            addCriterion("RED_LETTER_RECORD_DATE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterRecordDateIsNotNull() {
            addCriterion("RED_LETTER_RECORD_DATE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterRecordDateEqualTo(Date value) {
            addCriterion("RED_LETTER_RECORD_DATE =", value, "redLetterRecordDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterRecordDateNotEqualTo(Date value) {
            addCriterion("RED_LETTER_RECORD_DATE <>", value, "redLetterRecordDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterRecordDateGreaterThan(Date value) {
            addCriterion("RED_LETTER_RECORD_DATE >", value, "redLetterRecordDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterRecordDateGreaterThanOrEqualTo(Date value) {
            addCriterion("RED_LETTER_RECORD_DATE >=", value, "redLetterRecordDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterRecordDateLessThan(Date value) {
            addCriterion("RED_LETTER_RECORD_DATE <", value, "redLetterRecordDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterRecordDateLessThanOrEqualTo(Date value) {
            addCriterion("RED_LETTER_RECORD_DATE <=", value, "redLetterRecordDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterRecordDateIn(List<Date> values) {
            addCriterion("RED_LETTER_RECORD_DATE in", values, "redLetterRecordDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterRecordDateNotIn(List<Date> values) {
            addCriterion("RED_LETTER_RECORD_DATE not in", values, "redLetterRecordDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterRecordDateBetween(Date value1, Date value2) {
            addCriterion("RED_LETTER_RECORD_DATE between", value1, value2, "redLetterRecordDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedLetterRecordDateNotBetween(Date value1, Date value2) {
            addCriterion("RED_LETTER_RECORD_DATE not between", value1, value2, "redLetterRecordDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedInvoiceReceiveDateIsNull() {
            addCriterion("RED_INVOICE_RECEIVE_DATE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedInvoiceReceiveDateIsNotNull() {
            addCriterion("RED_INVOICE_RECEIVE_DATE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedInvoiceReceiveDateEqualTo(Date value) {
            addCriterion("RED_INVOICE_RECEIVE_DATE =", value, "redInvoiceReceiveDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedInvoiceReceiveDateNotEqualTo(Date value) {
            addCriterion("RED_INVOICE_RECEIVE_DATE <>", value, "redInvoiceReceiveDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedInvoiceReceiveDateGreaterThan(Date value) {
            addCriterion("RED_INVOICE_RECEIVE_DATE >", value, "redInvoiceReceiveDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedInvoiceReceiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("RED_INVOICE_RECEIVE_DATE >=", value, "redInvoiceReceiveDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedInvoiceReceiveDateLessThan(Date value) {
            addCriterion("RED_INVOICE_RECEIVE_DATE <", value, "redInvoiceReceiveDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedInvoiceReceiveDateLessThanOrEqualTo(Date value) {
            addCriterion("RED_INVOICE_RECEIVE_DATE <=", value, "redInvoiceReceiveDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedInvoiceReceiveDateIn(List<Date> values) {
            addCriterion("RED_INVOICE_RECEIVE_DATE in", values, "redInvoiceReceiveDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedInvoiceReceiveDateNotIn(List<Date> values) {
            addCriterion("RED_INVOICE_RECEIVE_DATE not in", values, "redInvoiceReceiveDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedInvoiceReceiveDateBetween(Date value1, Date value2) {
            addCriterion("RED_INVOICE_RECEIVE_DATE between", value1, value2, "redInvoiceReceiveDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRedInvoiceReceiveDateNotBetween(Date value1, Date value2) {
            addCriterion("RED_INVOICE_RECEIVE_DATE not between", value1, value2, "redInvoiceReceiveDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOriginalProviderIsNull() {
            addCriterion("BE_ORIGINAL_PROVIDER is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOriginalProviderIsNotNull() {
            addCriterion("BE_ORIGINAL_PROVIDER is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOriginalProviderEqualTo(String value) {
            addCriterion("BE_ORIGINAL_PROVIDER =", value, "beOriginalProvider");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOriginalProviderNotEqualTo(String value) {
            addCriterion("BE_ORIGINAL_PROVIDER <>", value, "beOriginalProvider");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOriginalProviderGreaterThan(String value) {
            addCriterion("BE_ORIGINAL_PROVIDER >", value, "beOriginalProvider");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOriginalProviderGreaterThanOrEqualTo(String value) {
            addCriterion("BE_ORIGINAL_PROVIDER >=", value, "beOriginalProvider");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOriginalProviderLessThan(String value) {
            addCriterion("BE_ORIGINAL_PROVIDER <", value, "beOriginalProvider");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOriginalProviderLessThanOrEqualTo(String value) {
            addCriterion("BE_ORIGINAL_PROVIDER <=", value, "beOriginalProvider");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOriginalProviderLike(String value) {
            addCriterion("BE_ORIGINAL_PROVIDER like", value, "beOriginalProvider");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOriginalProviderNotLike(String value) {
            addCriterion("BE_ORIGINAL_PROVIDER not like", value, "beOriginalProvider");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOriginalProviderIn(List<String> values) {
            addCriterion("BE_ORIGINAL_PROVIDER in", values, "beOriginalProvider");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOriginalProviderNotIn(List<String> values) {
            addCriterion("BE_ORIGINAL_PROVIDER not in", values, "beOriginalProvider");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOriginalProviderBetween(String value1, String value2) {
            addCriterion("BE_ORIGINAL_PROVIDER between", value1, value2, "beOriginalProvider");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOriginalProviderNotBetween(String value1, String value2) {
            addCriterion("BE_ORIGINAL_PROVIDER not between", value1, value2, "beOriginalProvider");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonIsNull() {
            addCriterion("APPLICATION_REASON is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonIsNotNull() {
            addCriterion("APPLICATION_REASON is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonEqualTo(String value) {
            addCriterion("APPLICATION_REASON =", value, "applicationReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonNotEqualTo(String value) {
            addCriterion("APPLICATION_REASON <>", value, "applicationReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonGreaterThan(String value) {
            addCriterion("APPLICATION_REASON >", value, "applicationReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_REASON >=", value, "applicationReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonLessThan(String value) {
            addCriterion("APPLICATION_REASON <", value, "applicationReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_REASON <=", value, "applicationReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonLike(String value) {
            addCriterion("APPLICATION_REASON like", value, "applicationReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonNotLike(String value) {
            addCriterion("APPLICATION_REASON not like", value, "applicationReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonIn(List<String> values) {
            addCriterion("APPLICATION_REASON in", values, "applicationReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonNotIn(List<String> values) {
            addCriterion("APPLICATION_REASON not in", values, "applicationReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonBetween(String value1, String value2) {
            addCriterion("APPLICATION_REASON between", value1, value2, "applicationReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_REASON not between", value1, value2, "applicationReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonConfirmIsNull() {
            addCriterion("APPLICATION_REASON_CONFIRM is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonConfirmIsNotNull() {
            addCriterion("APPLICATION_REASON_CONFIRM is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonConfirmEqualTo(String value) {
            addCriterion("APPLICATION_REASON_CONFIRM =", value, "applicationReasonConfirm");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonConfirmNotEqualTo(String value) {
            addCriterion("APPLICATION_REASON_CONFIRM <>", value, "applicationReasonConfirm");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonConfirmGreaterThan(String value) {
            addCriterion("APPLICATION_REASON_CONFIRM >", value, "applicationReasonConfirm");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonConfirmGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_REASON_CONFIRM >=", value, "applicationReasonConfirm");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonConfirmLessThan(String value) {
            addCriterion("APPLICATION_REASON_CONFIRM <", value, "applicationReasonConfirm");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonConfirmLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_REASON_CONFIRM <=", value, "applicationReasonConfirm");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonConfirmLike(String value) {
            addCriterion("APPLICATION_REASON_CONFIRM like", value, "applicationReasonConfirm");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonConfirmNotLike(String value) {
            addCriterion("APPLICATION_REASON_CONFIRM not like", value, "applicationReasonConfirm");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonConfirmIn(List<String> values) {
            addCriterion("APPLICATION_REASON_CONFIRM in", values, "applicationReasonConfirm");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonConfirmNotIn(List<String> values) {
            addCriterion("APPLICATION_REASON_CONFIRM not in", values, "applicationReasonConfirm");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonConfirmBetween(String value1, String value2) {
            addCriterion("APPLICATION_REASON_CONFIRM between", value1, value2, "applicationReasonConfirm");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationReasonConfirmNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_REASON_CONFIRM not between", value1, value2, "applicationReasonConfirm");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationNotesIsNull() {
            addCriterion("APPLICATION_NOTES is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationNotesIsNotNull() {
            addCriterion("APPLICATION_NOTES is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationNotesEqualTo(String value) {
            addCriterion("APPLICATION_NOTES =", value, "applicationNotes");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationNotesNotEqualTo(String value) {
            addCriterion("APPLICATION_NOTES <>", value, "applicationNotes");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationNotesGreaterThan(String value) {
            addCriterion("APPLICATION_NOTES >", value, "applicationNotes");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationNotesGreaterThanOrEqualTo(String value) {
            addCriterion("APPLICATION_NOTES >=", value, "applicationNotes");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationNotesLessThan(String value) {
            addCriterion("APPLICATION_NOTES <", value, "applicationNotes");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationNotesLessThanOrEqualTo(String value) {
            addCriterion("APPLICATION_NOTES <=", value, "applicationNotes");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationNotesLike(String value) {
            addCriterion("APPLICATION_NOTES like", value, "applicationNotes");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationNotesNotLike(String value) {
            addCriterion("APPLICATION_NOTES not like", value, "applicationNotes");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationNotesIn(List<String> values) {
            addCriterion("APPLICATION_NOTES in", values, "applicationNotes");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationNotesNotIn(List<String> values) {
            addCriterion("APPLICATION_NOTES not in", values, "applicationNotes");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationNotesBetween(String value1, String value2) {
            addCriterion("APPLICATION_NOTES between", value1, value2, "applicationNotes");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andApplicationNotesNotBetween(String value1, String value2) {
            addCriterion("APPLICATION_NOTES not between", value1, value2, "applicationNotes");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCodeIsNull() {
            addCriterion("AUDIT_CODE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCodeIsNotNull() {
            addCriterion("AUDIT_CODE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCodeEqualTo(String value) {
            addCriterion("AUDIT_CODE =", value, "auditCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCodeNotEqualTo(String value) {
            addCriterion("AUDIT_CODE <>", value, "auditCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCodeGreaterThan(String value) {
            addCriterion("AUDIT_CODE >", value, "auditCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_CODE >=", value, "auditCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCodeLessThan(String value) {
            addCriterion("AUDIT_CODE <", value, "auditCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCodeLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_CODE <=", value, "auditCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCodeLike(String value) {
            addCriterion("AUDIT_CODE like", value, "auditCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCodeNotLike(String value) {
            addCriterion("AUDIT_CODE not like", value, "auditCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCodeIn(List<String> values) {
            addCriterion("AUDIT_CODE in", values, "auditCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCodeNotIn(List<String> values) {
            addCriterion("AUDIT_CODE not in", values, "auditCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCodeBetween(String value1, String value2) {
            addCriterion("AUDIT_CODE between", value1, value2, "auditCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCodeNotBetween(String value1, String value2) {
            addCriterion("AUDIT_CODE not between", value1, value2, "auditCode");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditDateIsNull() {
            addCriterion("AUDIT_DATE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditDateIsNotNull() {
            addCriterion("AUDIT_DATE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditDateEqualTo(Date value) {
            addCriterion("AUDIT_DATE =", value, "auditDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("AUDIT_DATE <>", value, "auditDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("AUDIT_DATE >", value, "auditDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("AUDIT_DATE >=", value, "auditDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditDateLessThan(Date value) {
            addCriterion("AUDIT_DATE <", value, "auditDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("AUDIT_DATE <=", value, "auditDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditDateIn(List<Date> values) {
            addCriterion("AUDIT_DATE in", values, "auditDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("AUDIT_DATE not in", values, "auditDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("AUDIT_DATE between", value1, value2, "auditDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("AUDIT_DATE not between", value1, value2, "auditDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCommentsIsNull() {
            addCriterion("AUDIT_COMMENTS is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCommentsIsNotNull() {
            addCriterion("AUDIT_COMMENTS is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCommentsEqualTo(String value) {
            addCriterion("AUDIT_COMMENTS =", value, "auditComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCommentsNotEqualTo(String value) {
            addCriterion("AUDIT_COMMENTS <>", value, "auditComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCommentsGreaterThan(String value) {
            addCriterion("AUDIT_COMMENTS >", value, "auditComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_COMMENTS >=", value, "auditComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCommentsLessThan(String value) {
            addCriterion("AUDIT_COMMENTS <", value, "auditComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCommentsLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_COMMENTS <=", value, "auditComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCommentsLike(String value) {
            addCriterion("AUDIT_COMMENTS like", value, "auditComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCommentsNotLike(String value) {
            addCriterion("AUDIT_COMMENTS not like", value, "auditComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCommentsIn(List<String> values) {
            addCriterion("AUDIT_COMMENTS in", values, "auditComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCommentsNotIn(List<String> values) {
            addCriterion("AUDIT_COMMENTS not in", values, "auditComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCommentsBetween(String value1, String value2) {
            addCriterion("AUDIT_COMMENTS between", value1, value2, "auditComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andAuditCommentsNotBetween(String value1, String value2) {
            addCriterion("AUDIT_COMMENTS not between", value1, value2, "auditComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCancleDateIsNull() {
            addCriterion("CANCLE_DATE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCancleDateIsNotNull() {
            addCriterion("CANCLE_DATE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCancleDateEqualTo(Date value) {
            addCriterion("CANCLE_DATE =", value, "cancleDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCancleDateNotEqualTo(Date value) {
            addCriterion("CANCLE_DATE <>", value, "cancleDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCancleDateGreaterThan(Date value) {
            addCriterion("CANCLE_DATE >", value, "cancleDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCancleDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CANCLE_DATE >=", value, "cancleDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCancleDateLessThan(Date value) {
            addCriterion("CANCLE_DATE <", value, "cancleDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCancleDateLessThanOrEqualTo(Date value) {
            addCriterion("CANCLE_DATE <=", value, "cancleDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCancleDateIn(List<Date> values) {
            addCriterion("CANCLE_DATE in", values, "cancleDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCancleDateNotIn(List<Date> values) {
            addCriterion("CANCLE_DATE not in", values, "cancleDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCancleDateBetween(Date value1, Date value2) {
            addCriterion("CANCLE_DATE between", value1, value2, "cancleDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCancleDateNotBetween(Date value1, Date value2) {
            addCriterion("CANCLE_DATE not between", value1, value2, "cancleDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRejectCommentsIsNull() {
            addCriterion("REJECT_COMMENTS is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRejectCommentsIsNotNull() {
            addCriterion("REJECT_COMMENTS is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRejectCommentsEqualTo(String value) {
            addCriterion("REJECT_COMMENTS =", value, "rejectComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRejectCommentsNotEqualTo(String value) {
            addCriterion("REJECT_COMMENTS <>", value, "rejectComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRejectCommentsGreaterThan(String value) {
            addCriterion("REJECT_COMMENTS >", value, "rejectComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRejectCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("REJECT_COMMENTS >=", value, "rejectComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRejectCommentsLessThan(String value) {
            addCriterion("REJECT_COMMENTS <", value, "rejectComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRejectCommentsLessThanOrEqualTo(String value) {
            addCriterion("REJECT_COMMENTS <=", value, "rejectComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRejectCommentsLike(String value) {
            addCriterion("REJECT_COMMENTS like", value, "rejectComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRejectCommentsNotLike(String value) {
            addCriterion("REJECT_COMMENTS not like", value, "rejectComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRejectCommentsIn(List<String> values) {
            addCriterion("REJECT_COMMENTS in", values, "rejectComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRejectCommentsNotIn(List<String> values) {
            addCriterion("REJECT_COMMENTS not in", values, "rejectComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRejectCommentsBetween(String value1, String value2) {
            addCriterion("REJECT_COMMENTS between", value1, value2, "rejectComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andRejectCommentsNotBetween(String value1, String value2) {
            addCriterion("REJECT_COMMENTS not between", value1, value2, "rejectComments");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfIdIsNull() {
            addCriterion("BGGF_ID is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfIdIsNotNull() {
            addCriterion("BGGF_ID is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfIdEqualTo(Integer value) {
            addCriterion("BGGF_ID =", value, "bggfId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfIdNotEqualTo(Integer value) {
            addCriterion("BGGF_ID <>", value, "bggfId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfIdGreaterThan(Integer value) {
            addCriterion("BGGF_ID >", value, "bggfId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BGGF_ID >=", value, "bggfId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfIdLessThan(Integer value) {
            addCriterion("BGGF_ID <", value, "bggfId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfIdLessThanOrEqualTo(Integer value) {
            addCriterion("BGGF_ID <=", value, "bggfId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfIdIn(List<Integer> values) {
            addCriterion("BGGF_ID in", values, "bggfId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfIdNotIn(List<Integer> values) {
            addCriterion("BGGF_ID not in", values, "bggfId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfIdBetween(Integer value1, Integer value2) {
            addCriterion("BGGF_ID between", value1, value2, "bggfId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BGGF_ID not between", value1, value2, "bggfId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfNumIsNull() {
            addCriterion("BGGF_NUM is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfNumIsNotNull() {
            addCriterion("BGGF_NUM is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfNumEqualTo(String value) {
            addCriterion("BGGF_NUM =", value, "bggfNum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfNumNotEqualTo(String value) {
            addCriterion("BGGF_NUM <>", value, "bggfNum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfNumGreaterThan(String value) {
            addCriterion("BGGF_NUM >", value, "bggfNum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfNumGreaterThanOrEqualTo(String value) {
            addCriterion("BGGF_NUM >=", value, "bggfNum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfNumLessThan(String value) {
            addCriterion("BGGF_NUM <", value, "bggfNum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfNumLessThanOrEqualTo(String value) {
            addCriterion("BGGF_NUM <=", value, "bggfNum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfNumLike(String value) {
            addCriterion("BGGF_NUM like", value, "bggfNum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfNumNotLike(String value) {
            addCriterion("BGGF_NUM not like", value, "bggfNum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfNumIn(List<String> values) {
            addCriterion("BGGF_NUM in", values, "bggfNum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfNumNotIn(List<String> values) {
            addCriterion("BGGF_NUM not in", values, "bggfNum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfNumBetween(String value1, String value2) {
            addCriterion("BGGF_NUM between", value1, value2, "bggfNum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBggfNumNotBetween(String value1, String value2) {
            addCriterion("BGGF_NUM not between", value1, value2, "bggfNum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBatchAttaidIsNull() {
            addCriterion("BATCH_ATTAID is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBatchAttaidIsNotNull() {
            addCriterion("BATCH_ATTAID is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBatchAttaidEqualTo(String value) {
            addCriterion("BATCH_ATTAID =", value, "batchAttaid");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBatchAttaidNotEqualTo(String value) {
            addCriterion("BATCH_ATTAID <>", value, "batchAttaid");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBatchAttaidGreaterThan(String value) {
            addCriterion("BATCH_ATTAID >", value, "batchAttaid");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBatchAttaidGreaterThanOrEqualTo(String value) {
            addCriterion("BATCH_ATTAID >=", value, "batchAttaid");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBatchAttaidLessThan(String value) {
            addCriterion("BATCH_ATTAID <", value, "batchAttaid");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBatchAttaidLessThanOrEqualTo(String value) {
            addCriterion("BATCH_ATTAID <=", value, "batchAttaid");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBatchAttaidLike(String value) {
            addCriterion("BATCH_ATTAID like", value, "batchAttaid");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBatchAttaidNotLike(String value) {
            addCriterion("BATCH_ATTAID not like", value, "batchAttaid");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBatchAttaidIn(List<String> values) {
            addCriterion("BATCH_ATTAID in", values, "batchAttaid");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBatchAttaidNotIn(List<String> values) {
            addCriterion("BATCH_ATTAID not in", values, "batchAttaid");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBatchAttaidBetween(String value1, String value2) {
            addCriterion("BATCH_ATTAID between", value1, value2, "batchAttaid");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBatchAttaidNotBetween(String value1, String value2) {
            addCriterion("BATCH_ATTAID not between", value1, value2, "batchAttaid");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBackupsJsonIsNull() {
            addCriterion("BACKUPS_JSON is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBackupsJsonIsNotNull() {
            addCriterion("BACKUPS_JSON is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBackupsJsonEqualTo(String value) {
            addCriterion("BACKUPS_JSON =", value, "backupsJson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBackupsJsonNotEqualTo(String value) {
            addCriterion("BACKUPS_JSON <>", value, "backupsJson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBackupsJsonGreaterThan(String value) {
            addCriterion("BACKUPS_JSON >", value, "backupsJson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBackupsJsonGreaterThanOrEqualTo(String value) {
            addCriterion("BACKUPS_JSON >=", value, "backupsJson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBackupsJsonLessThan(String value) {
            addCriterion("BACKUPS_JSON <", value, "backupsJson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBackupsJsonLessThanOrEqualTo(String value) {
            addCriterion("BACKUPS_JSON <=", value, "backupsJson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBackupsJsonIn(List<String> values) {
            addCriterion("BACKUPS_JSON in", values, "backupsJson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBackupsJsonNotIn(List<String> values) {
            addCriterion("BACKUPS_JSON not in", values, "backupsJson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBackupsJsonBetween(String value1, String value2) {
            addCriterion("BACKUPS_JSON between", value1, value2, "backupsJson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBackupsJsonNotBetween(String value1, String value2) {
            addCriterion("BACKUPS_JSON not between", value1, value2, "backupsJson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateBuyerIsNull() {
            addCriterion("OVERDUE_DATE_BUYER is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateBuyerIsNotNull() {
            addCriterion("OVERDUE_DATE_BUYER is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateBuyerEqualTo(Date value) {
            addCriterion("OVERDUE_DATE_BUYER =", value, "overdueDateBuyer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateBuyerNotEqualTo(Date value) {
            addCriterion("OVERDUE_DATE_BUYER <>", value, "overdueDateBuyer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateBuyerGreaterThan(Date value) {
            addCriterion("OVERDUE_DATE_BUYER >", value, "overdueDateBuyer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateBuyerGreaterThanOrEqualTo(Date value) {
            addCriterion("OVERDUE_DATE_BUYER >=", value, "overdueDateBuyer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateBuyerLessThan(Date value) {
            addCriterion("OVERDUE_DATE_BUYER <", value, "overdueDateBuyer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateBuyerLessThanOrEqualTo(Date value) {
            addCriterion("OVERDUE_DATE_BUYER <=", value, "overdueDateBuyer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateBuyerIn(List<Date> values) {
            addCriterion("OVERDUE_DATE_BUYER in", values, "overdueDateBuyer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateBuyerNotIn(List<Date> values) {
            addCriterion("OVERDUE_DATE_BUYER not in", values, "overdueDateBuyer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateBuyerBetween(Date value1, Date value2) {
            addCriterion("OVERDUE_DATE_BUYER between", value1, value2, "overdueDateBuyer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateBuyerNotBetween(Date value1, Date value2) {
            addCriterion("OVERDUE_DATE_BUYER not between", value1, value2, "overdueDateBuyer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOverdueIsNull() {
            addCriterion("BE_OVERDUE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOverdueIsNotNull() {
            addCriterion("BE_OVERDUE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOverdueEqualTo(String value) {
            addCriterion("BE_OVERDUE =", value, "beOverdue");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOverdueNotEqualTo(String value) {
            addCriterion("BE_OVERDUE <>", value, "beOverdue");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOverdueGreaterThan(String value) {
            addCriterion("BE_OVERDUE >", value, "beOverdue");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOverdueGreaterThanOrEqualTo(String value) {
            addCriterion("BE_OVERDUE >=", value, "beOverdue");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOverdueLessThan(String value) {
            addCriterion("BE_OVERDUE <", value, "beOverdue");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOverdueLessThanOrEqualTo(String value) {
            addCriterion("BE_OVERDUE <=", value, "beOverdue");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOverdueLike(String value) {
            addCriterion("BE_OVERDUE like", value, "beOverdue");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOverdueNotLike(String value) {
            addCriterion("BE_OVERDUE not like", value, "beOverdue");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOverdueIn(List<String> values) {
            addCriterion("BE_OVERDUE in", values, "beOverdue");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOverdueNotIn(List<String> values) {
            addCriterion("BE_OVERDUE not in", values, "beOverdue");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOverdueBetween(String value1, String value2) {
            addCriterion("BE_OVERDUE between", value1, value2, "beOverdue");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeOverdueNotBetween(String value1, String value2) {
            addCriterion("BE_OVERDUE not between", value1, value2, "beOverdue");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferDateIsNull() {
            addCriterion("TRANSFER_DATE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferDateIsNotNull() {
            addCriterion("TRANSFER_DATE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferDateEqualTo(Date value) {
            addCriterion("TRANSFER_DATE =", value, "transferDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferDateNotEqualTo(Date value) {
            addCriterion("TRANSFER_DATE <>", value, "transferDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferDateGreaterThan(Date value) {
            addCriterion("TRANSFER_DATE >", value, "transferDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferDateGreaterThanOrEqualTo(Date value) {
            addCriterion("TRANSFER_DATE >=", value, "transferDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferDateLessThan(Date value) {
            addCriterion("TRANSFER_DATE <", value, "transferDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferDateLessThanOrEqualTo(Date value) {
            addCriterion("TRANSFER_DATE <=", value, "transferDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferDateIn(List<Date> values) {
            addCriterion("TRANSFER_DATE in", values, "transferDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferDateNotIn(List<Date> values) {
            addCriterion("TRANSFER_DATE not in", values, "transferDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferDateBetween(Date value1, Date value2) {
            addCriterion("TRANSFER_DATE between", value1, value2, "transferDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferDateNotBetween(Date value1, Date value2) {
            addCriterion("TRANSFER_DATE not between", value1, value2, "transferDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferTypeIsNull() {
            addCriterion("TRANSFER_TYPE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferTypeIsNotNull() {
            addCriterion("TRANSFER_TYPE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferTypeEqualTo(String value) {
            addCriterion("TRANSFER_TYPE =", value, "transferType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferTypeNotEqualTo(String value) {
            addCriterion("TRANSFER_TYPE <>", value, "transferType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferTypeGreaterThan(String value) {
            addCriterion("TRANSFER_TYPE >", value, "transferType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFER_TYPE >=", value, "transferType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferTypeLessThan(String value) {
            addCriterion("TRANSFER_TYPE <", value, "transferType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferTypeLessThanOrEqualTo(String value) {
            addCriterion("TRANSFER_TYPE <=", value, "transferType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferTypeLike(String value) {
            addCriterion("TRANSFER_TYPE like", value, "transferType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferTypeNotLike(String value) {
            addCriterion("TRANSFER_TYPE not like", value, "transferType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferTypeIn(List<String> values) {
            addCriterion("TRANSFER_TYPE in", values, "transferType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferTypeNotIn(List<String> values) {
            addCriterion("TRANSFER_TYPE not in", values, "transferType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferTypeBetween(String value1, String value2) {
            addCriterion("TRANSFER_TYPE between", value1, value2, "transferType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andTransferTypeNotBetween(String value1, String value2) {
            addCriterion("TRANSFER_TYPE not between", value1, value2, "transferType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBusinessTypeIsNull() {
            addCriterion("BUSINESS_TYPE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBusinessTypeIsNotNull() {
            addCriterion("BUSINESS_TYPE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBusinessTypeEqualTo(String value) {
            addCriterion("BUSINESS_TYPE =", value, "businessType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBusinessTypeNotEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <>", value, "businessType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBusinessTypeGreaterThan(String value) {
            addCriterion("BUSINESS_TYPE >", value, "businessType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBusinessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE >=", value, "businessType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBusinessTypeLessThan(String value) {
            addCriterion("BUSINESS_TYPE <", value, "businessType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBusinessTypeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_TYPE <=", value, "businessType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBusinessTypeLike(String value) {
            addCriterion("BUSINESS_TYPE like", value, "businessType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBusinessTypeNotLike(String value) {
            addCriterion("BUSINESS_TYPE not like", value, "businessType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBusinessTypeIn(List<String> values) {
            addCriterion("BUSINESS_TYPE in", values, "businessType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBusinessTypeNotIn(List<String> values) {
            addCriterion("BUSINESS_TYPE not in", values, "businessType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBusinessTypeBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE between", value1, value2, "businessType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBusinessTypeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_TYPE not between", value1, value2, "businessType");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimProposerIsNull() {
            addCriterion("CLAIM_PROPOSER is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimProposerIsNotNull() {
            addCriterion("CLAIM_PROPOSER is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimProposerEqualTo(String value) {
            addCriterion("CLAIM_PROPOSER =", value, "claimProposer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimProposerNotEqualTo(String value) {
            addCriterion("CLAIM_PROPOSER <>", value, "claimProposer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimProposerGreaterThan(String value) {
            addCriterion("CLAIM_PROPOSER >", value, "claimProposer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimProposerGreaterThanOrEqualTo(String value) {
            addCriterion("CLAIM_PROPOSER >=", value, "claimProposer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimProposerLessThan(String value) {
            addCriterion("CLAIM_PROPOSER <", value, "claimProposer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimProposerLessThanOrEqualTo(String value) {
            addCriterion("CLAIM_PROPOSER <=", value, "claimProposer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimProposerLike(String value) {
            addCriterion("CLAIM_PROPOSER like", value, "claimProposer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimProposerNotLike(String value) {
            addCriterion("CLAIM_PROPOSER not like", value, "claimProposer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimProposerIn(List<String> values) {
            addCriterion("CLAIM_PROPOSER in", values, "claimProposer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimProposerNotIn(List<String> values) {
            addCriterion("CLAIM_PROPOSER not in", values, "claimProposer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimProposerBetween(String value1, String value2) {
            addCriterion("CLAIM_PROPOSER between", value1, value2, "claimProposer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andClaimProposerNotBetween(String value1, String value2) {
            addCriterion("CLAIM_PROPOSER not between", value1, value2, "claimProposer");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateIsNull() {
            addCriterion("OVERDUE_DATE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateIsNotNull() {
            addCriterion("OVERDUE_DATE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateEqualTo(Date value) {
            addCriterion("OVERDUE_DATE =", value, "overdueDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateNotEqualTo(Date value) {
            addCriterion("OVERDUE_DATE <>", value, "overdueDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateGreaterThan(Date value) {
            addCriterion("OVERDUE_DATE >", value, "overdueDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateGreaterThanOrEqualTo(Date value) {
            addCriterion("OVERDUE_DATE >=", value, "overdueDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateLessThan(Date value) {
            addCriterion("OVERDUE_DATE <", value, "overdueDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateLessThanOrEqualTo(Date value) {
            addCriterion("OVERDUE_DATE <=", value, "overdueDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateIn(List<Date> values) {
            addCriterion("OVERDUE_DATE in", values, "overdueDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateNotIn(List<Date> values) {
            addCriterion("OVERDUE_DATE not in", values, "overdueDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateBetween(Date value1, Date value2) {
            addCriterion("OVERDUE_DATE between", value1, value2, "overdueDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andOverdueDateNotBetween(Date value1, Date value2) {
            addCriterion("OVERDUE_DATE not between", value1, value2, "overdueDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConsulationNumberIsNull() {
            addCriterion("CONSULATION_NUMBER is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConsulationNumberIsNotNull() {
            addCriterion("CONSULATION_NUMBER is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConsulationNumberEqualTo(Integer value) {
            addCriterion("CONSULATION_NUMBER =", value, "consulationNumber");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConsulationNumberNotEqualTo(Integer value) {
            addCriterion("CONSULATION_NUMBER <>", value, "consulationNumber");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConsulationNumberGreaterThan(Integer value) {
            addCriterion("CONSULATION_NUMBER >", value, "consulationNumber");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConsulationNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONSULATION_NUMBER >=", value, "consulationNumber");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConsulationNumberLessThan(Integer value) {
            addCriterion("CONSULATION_NUMBER <", value, "consulationNumber");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConsulationNumberLessThanOrEqualTo(Integer value) {
            addCriterion("CONSULATION_NUMBER <=", value, "consulationNumber");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConsulationNumberIn(List<Integer> values) {
            addCriterion("CONSULATION_NUMBER in", values, "consulationNumber");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConsulationNumberNotIn(List<Integer> values) {
            addCriterion("CONSULATION_NUMBER not in", values, "consulationNumber");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConsulationNumberBetween(Integer value1, Integer value2) {
            addCriterion("CONSULATION_NUMBER between", value1, value2, "consulationNumber");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConsulationNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("CONSULATION_NUMBER not between", value1, value2, "consulationNumber");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPlatformInterventionFlagIsNull() {
            addCriterion("PLATFORM_INTERVENTION_FLAG is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPlatformInterventionFlagIsNotNull() {
            addCriterion("PLATFORM_INTERVENTION_FLAG is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPlatformInterventionFlagEqualTo(String value) {
            addCriterion("PLATFORM_INTERVENTION_FLAG =", value, "platformInterventionFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPlatformInterventionFlagNotEqualTo(String value) {
            addCriterion("PLATFORM_INTERVENTION_FLAG <>", value, "platformInterventionFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPlatformInterventionFlagGreaterThan(String value) {
            addCriterion("PLATFORM_INTERVENTION_FLAG >", value, "platformInterventionFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPlatformInterventionFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PLATFORM_INTERVENTION_FLAG >=", value, "platformInterventionFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPlatformInterventionFlagLessThan(String value) {
            addCriterion("PLATFORM_INTERVENTION_FLAG <", value, "platformInterventionFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPlatformInterventionFlagLessThanOrEqualTo(String value) {
            addCriterion("PLATFORM_INTERVENTION_FLAG <=", value, "platformInterventionFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPlatformInterventionFlagLike(String value) {
            addCriterion("PLATFORM_INTERVENTION_FLAG like", value, "platformInterventionFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPlatformInterventionFlagNotLike(String value) {
            addCriterion("PLATFORM_INTERVENTION_FLAG not like", value, "platformInterventionFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPlatformInterventionFlagIn(List<String> values) {
            addCriterion("PLATFORM_INTERVENTION_FLAG in", values, "platformInterventionFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPlatformInterventionFlagNotIn(List<String> values) {
            addCriterion("PLATFORM_INTERVENTION_FLAG not in", values, "platformInterventionFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPlatformInterventionFlagBetween(String value1, String value2) {
            addCriterion("PLATFORM_INTERVENTION_FLAG between", value1, value2, "platformInterventionFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPlatformInterventionFlagNotBetween(String value1, String value2) {
            addCriterion("PLATFORM_INTERVENTION_FLAG not between", value1, value2, "platformInterventionFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeAgentIsNull() {
            addCriterion("BE_AGENT is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeAgentIsNotNull() {
            addCriterion("BE_AGENT is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeAgentEqualTo(String value) {
            addCriterion("BE_AGENT =", value, "beAgent");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeAgentNotEqualTo(String value) {
            addCriterion("BE_AGENT <>", value, "beAgent");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeAgentGreaterThan(String value) {
            addCriterion("BE_AGENT >", value, "beAgent");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeAgentGreaterThanOrEqualTo(String value) {
            addCriterion("BE_AGENT >=", value, "beAgent");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeAgentLessThan(String value) {
            addCriterion("BE_AGENT <", value, "beAgent");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeAgentLessThanOrEqualTo(String value) {
            addCriterion("BE_AGENT <=", value, "beAgent");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeAgentLike(String value) {
            addCriterion("BE_AGENT like", value, "beAgent");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeAgentNotLike(String value) {
            addCriterion("BE_AGENT not like", value, "beAgent");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeAgentIn(List<String> values) {
            addCriterion("BE_AGENT in", values, "beAgent");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeAgentNotIn(List<String> values) {
            addCriterion("BE_AGENT not in", values, "beAgent");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeAgentBetween(String value1, String value2) {
            addCriterion("BE_AGENT between", value1, value2, "beAgent");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeAgentNotBetween(String value1, String value2) {
            addCriterion("BE_AGENT not between", value1, value2, "beAgent");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorIsNull() {
            addCriterion("DISTRIBUTOR is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorIsNotNull() {
            addCriterion("DISTRIBUTOR is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorEqualTo(String value) {
            addCriterion("DISTRIBUTOR =", value, "distributor");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorNotEqualTo(String value) {
            addCriterion("DISTRIBUTOR <>", value, "distributor");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorGreaterThan(String value) {
            addCriterion("DISTRIBUTOR >", value, "distributor");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRIBUTOR >=", value, "distributor");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorLessThan(String value) {
            addCriterion("DISTRIBUTOR <", value, "distributor");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorLessThanOrEqualTo(String value) {
            addCriterion("DISTRIBUTOR <=", value, "distributor");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorLike(String value) {
            addCriterion("DISTRIBUTOR like", value, "distributor");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorNotLike(String value) {
            addCriterion("DISTRIBUTOR not like", value, "distributor");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorIn(List<String> values) {
            addCriterion("DISTRIBUTOR in", values, "distributor");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorNotIn(List<String> values) {
            addCriterion("DISTRIBUTOR not in", values, "distributor");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorBetween(String value1, String value2) {
            addCriterion("DISTRIBUTOR between", value1, value2, "distributor");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorNotBetween(String value1, String value2) {
            addCriterion("DISTRIBUTOR not between", value1, value2, "distributor");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorFlagIsNull() {
            addCriterion("DISTRIBUTOR_FLAG is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorFlagIsNotNull() {
            addCriterion("DISTRIBUTOR_FLAG is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorFlagEqualTo(String value) {
            addCriterion("DISTRIBUTOR_FLAG =", value, "distributorFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorFlagNotEqualTo(String value) {
            addCriterion("DISTRIBUTOR_FLAG <>", value, "distributorFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorFlagGreaterThan(String value) {
            addCriterion("DISTRIBUTOR_FLAG >", value, "distributorFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorFlagGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRIBUTOR_FLAG >=", value, "distributorFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorFlagLessThan(String value) {
            addCriterion("DISTRIBUTOR_FLAG <", value, "distributorFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorFlagLessThanOrEqualTo(String value) {
            addCriterion("DISTRIBUTOR_FLAG <=", value, "distributorFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorFlagLike(String value) {
            addCriterion("DISTRIBUTOR_FLAG like", value, "distributorFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorFlagNotLike(String value) {
            addCriterion("DISTRIBUTOR_FLAG not like", value, "distributorFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorFlagIn(List<String> values) {
            addCriterion("DISTRIBUTOR_FLAG in", values, "distributorFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorFlagNotIn(List<String> values) {
            addCriterion("DISTRIBUTOR_FLAG not in", values, "distributorFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorFlagBetween(String value1, String value2) {
            addCriterion("DISTRIBUTOR_FLAG between", value1, value2, "distributorFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDistributorFlagNotBetween(String value1, String value2) {
            addCriterion("DISTRIBUTOR_FLAG not between", value1, value2, "distributorFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPerReparationsAtIsNull() {
            addCriterion("PER_REPARATIONS_AT is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPerReparationsAtIsNotNull() {
            addCriterion("PER_REPARATIONS_AT is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPerReparationsAtEqualTo(BigDecimal value) {
            addCriterion("PER_REPARATIONS_AT =", value, "perReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPerReparationsAtNotEqualTo(BigDecimal value) {
            addCriterion("PER_REPARATIONS_AT <>", value, "perReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPerReparationsAtGreaterThan(BigDecimal value) {
            addCriterion("PER_REPARATIONS_AT >", value, "perReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPerReparationsAtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PER_REPARATIONS_AT >=", value, "perReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPerReparationsAtLessThan(BigDecimal value) {
            addCriterion("PER_REPARATIONS_AT <", value, "perReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPerReparationsAtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PER_REPARATIONS_AT <=", value, "perReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPerReparationsAtIn(List<BigDecimal> values) {
            addCriterion("PER_REPARATIONS_AT in", values, "perReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPerReparationsAtNotIn(List<BigDecimal> values) {
            addCriterion("PER_REPARATIONS_AT not in", values, "perReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPerReparationsAtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PER_REPARATIONS_AT between", value1, value2, "perReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andPerReparationsAtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PER_REPARATIONS_AT not between", value1, value2, "perReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andComplaintReparationsAtIsNull() {
            addCriterion("COMPLAINT_REPARATIONS_AT is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andComplaintReparationsAtIsNotNull() {
            addCriterion("COMPLAINT_REPARATIONS_AT is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andComplaintReparationsAtEqualTo(BigDecimal value) {
            addCriterion("COMPLAINT_REPARATIONS_AT =", value, "complaintReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andComplaintReparationsAtNotEqualTo(BigDecimal value) {
            addCriterion("COMPLAINT_REPARATIONS_AT <>", value, "complaintReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andComplaintReparationsAtGreaterThan(BigDecimal value) {
            addCriterion("COMPLAINT_REPARATIONS_AT >", value, "complaintReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andComplaintReparationsAtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPLAINT_REPARATIONS_AT >=", value, "complaintReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andComplaintReparationsAtLessThan(BigDecimal value) {
            addCriterion("COMPLAINT_REPARATIONS_AT <", value, "complaintReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andComplaintReparationsAtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMPLAINT_REPARATIONS_AT <=", value, "complaintReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andComplaintReparationsAtIn(List<BigDecimal> values) {
            addCriterion("COMPLAINT_REPARATIONS_AT in", values, "complaintReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andComplaintReparationsAtNotIn(List<BigDecimal> values) {
            addCriterion("COMPLAINT_REPARATIONS_AT not in", values, "complaintReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andComplaintReparationsAtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPLAINT_REPARATIONS_AT between", value1, value2, "complaintReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andComplaintReparationsAtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMPLAINT_REPARATIONS_AT not between", value1, value2, "complaintReparationsAt");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeGoodsBackIsNull() {
            addCriterion("BE_GOODS_BACK is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeGoodsBackIsNotNull() {
            addCriterion("BE_GOODS_BACK is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeGoodsBackEqualTo(String value) {
            addCriterion("BE_GOODS_BACK =", value, "beGoodsBack");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeGoodsBackNotEqualTo(String value) {
            addCriterion("BE_GOODS_BACK <>", value, "beGoodsBack");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeGoodsBackGreaterThan(String value) {
            addCriterion("BE_GOODS_BACK >", value, "beGoodsBack");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeGoodsBackGreaterThanOrEqualTo(String value) {
            addCriterion("BE_GOODS_BACK >=", value, "beGoodsBack");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeGoodsBackLessThan(String value) {
            addCriterion("BE_GOODS_BACK <", value, "beGoodsBack");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeGoodsBackLessThanOrEqualTo(String value) {
            addCriterion("BE_GOODS_BACK <=", value, "beGoodsBack");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeGoodsBackLike(String value) {
            addCriterion("BE_GOODS_BACK like", value, "beGoodsBack");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeGoodsBackNotLike(String value) {
            addCriterion("BE_GOODS_BACK not like", value, "beGoodsBack");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeGoodsBackIn(List<String> values) {
            addCriterion("BE_GOODS_BACK in", values, "beGoodsBack");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeGoodsBackNotIn(List<String> values) {
            addCriterion("BE_GOODS_BACK not in", values, "beGoodsBack");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeGoodsBackBetween(String value1, String value2) {
            addCriterion("BE_GOODS_BACK between", value1, value2, "beGoodsBack");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeGoodsBackNotBetween(String value1, String value2) {
            addCriterion("BE_GOODS_BACK not between", value1, value2, "beGoodsBack");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeBuyerReturnedIsNull() {
            addCriterion("BE_BUYER_RETURNED is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeBuyerReturnedIsNotNull() {
            addCriterion("BE_BUYER_RETURNED is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeBuyerReturnedEqualTo(String value) {
            addCriterion("BE_BUYER_RETURNED =", value, "beBuyerReturned");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeBuyerReturnedNotEqualTo(String value) {
            addCriterion("BE_BUYER_RETURNED <>", value, "beBuyerReturned");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeBuyerReturnedGreaterThan(String value) {
            addCriterion("BE_BUYER_RETURNED >", value, "beBuyerReturned");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeBuyerReturnedGreaterThanOrEqualTo(String value) {
            addCriterion("BE_BUYER_RETURNED >=", value, "beBuyerReturned");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeBuyerReturnedLessThan(String value) {
            addCriterion("BE_BUYER_RETURNED <", value, "beBuyerReturned");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeBuyerReturnedLessThanOrEqualTo(String value) {
            addCriterion("BE_BUYER_RETURNED <=", value, "beBuyerReturned");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeBuyerReturnedLike(String value) {
            addCriterion("BE_BUYER_RETURNED like", value, "beBuyerReturned");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeBuyerReturnedNotLike(String value) {
            addCriterion("BE_BUYER_RETURNED not like", value, "beBuyerReturned");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeBuyerReturnedIn(List<String> values) {
            addCriterion("BE_BUYER_RETURNED in", values, "beBuyerReturned");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeBuyerReturnedNotIn(List<String> values) {
            addCriterion("BE_BUYER_RETURNED not in", values, "beBuyerReturned");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeBuyerReturnedBetween(String value1, String value2) {
            addCriterion("BE_BUYER_RETURNED between", value1, value2, "beBuyerReturned");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeBuyerReturnedNotBetween(String value1, String value2) {
            addCriterion("BE_BUYER_RETURNED not between", value1, value2, "beBuyerReturned");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConfirmBuyerReturnedDateIsNull() {
            addCriterion("CONFIRM_BUYER_RETURNED_DATE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConfirmBuyerReturnedDateIsNotNull() {
            addCriterion("CONFIRM_BUYER_RETURNED_DATE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConfirmBuyerReturnedDateEqualTo(Date value) {
            addCriterion("CONFIRM_BUYER_RETURNED_DATE =", value, "confirmBuyerReturnedDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConfirmBuyerReturnedDateNotEqualTo(Date value) {
            addCriterion("CONFIRM_BUYER_RETURNED_DATE <>", value, "confirmBuyerReturnedDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConfirmBuyerReturnedDateGreaterThan(Date value) {
            addCriterion("CONFIRM_BUYER_RETURNED_DATE >", value, "confirmBuyerReturnedDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConfirmBuyerReturnedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONFIRM_BUYER_RETURNED_DATE >=", value, "confirmBuyerReturnedDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConfirmBuyerReturnedDateLessThan(Date value) {
            addCriterion("CONFIRM_BUYER_RETURNED_DATE <", value, "confirmBuyerReturnedDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConfirmBuyerReturnedDateLessThanOrEqualTo(Date value) {
            addCriterion("CONFIRM_BUYER_RETURNED_DATE <=", value, "confirmBuyerReturnedDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConfirmBuyerReturnedDateIn(List<Date> values) {
            addCriterion("CONFIRM_BUYER_RETURNED_DATE in", values, "confirmBuyerReturnedDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConfirmBuyerReturnedDateNotIn(List<Date> values) {
            addCriterion("CONFIRM_BUYER_RETURNED_DATE not in", values, "confirmBuyerReturnedDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConfirmBuyerReturnedDateBetween(Date value1, Date value2) {
            addCriterion("CONFIRM_BUYER_RETURNED_DATE between", value1, value2, "confirmBuyerReturnedDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andConfirmBuyerReturnedDateNotBetween(Date value1, Date value2) {
            addCriterion("CONFIRM_BUYER_RETURNED_DATE not between", value1, value2, "confirmBuyerReturnedDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSelfSupportFlagIsNull() {
            addCriterion("SELF_SUPPORT_FLAG is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSelfSupportFlagIsNotNull() {
            addCriterion("SELF_SUPPORT_FLAG is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSelfSupportFlagEqualTo(String value) {
            addCriterion("SELF_SUPPORT_FLAG =", value, "selfSupportFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSelfSupportFlagNotEqualTo(String value) {
            addCriterion("SELF_SUPPORT_FLAG <>", value, "selfSupportFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSelfSupportFlagGreaterThan(String value) {
            addCriterion("SELF_SUPPORT_FLAG >", value, "selfSupportFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSelfSupportFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SELF_SUPPORT_FLAG >=", value, "selfSupportFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSelfSupportFlagLessThan(String value) {
            addCriterion("SELF_SUPPORT_FLAG <", value, "selfSupportFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSelfSupportFlagLessThanOrEqualTo(String value) {
            addCriterion("SELF_SUPPORT_FLAG <=", value, "selfSupportFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSelfSupportFlagLike(String value) {
            addCriterion("SELF_SUPPORT_FLAG like", value, "selfSupportFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSelfSupportFlagNotLike(String value) {
            addCriterion("SELF_SUPPORT_FLAG not like", value, "selfSupportFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSelfSupportFlagIn(List<String> values) {
            addCriterion("SELF_SUPPORT_FLAG in", values, "selfSupportFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSelfSupportFlagNotIn(List<String> values) {
            addCriterion("SELF_SUPPORT_FLAG not in", values, "selfSupportFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSelfSupportFlagBetween(String value1, String value2) {
            addCriterion("SELF_SUPPORT_FLAG between", value1, value2, "selfSupportFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSelfSupportFlagNotBetween(String value1, String value2) {
            addCriterion("SELF_SUPPORT_FLAG not between", value1, value2, "selfSupportFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProintsFinishFlagIsNull() {
            addCriterion("PROINTS_FINISH_FLAG is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProintsFinishFlagIsNotNull() {
            addCriterion("PROINTS_FINISH_FLAG is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProintsFinishFlagEqualTo(String value) {
            addCriterion("PROINTS_FINISH_FLAG =", value, "prointsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProintsFinishFlagNotEqualTo(String value) {
            addCriterion("PROINTS_FINISH_FLAG <>", value, "prointsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProintsFinishFlagGreaterThan(String value) {
            addCriterion("PROINTS_FINISH_FLAG >", value, "prointsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProintsFinishFlagGreaterThanOrEqualTo(String value) {
            addCriterion("PROINTS_FINISH_FLAG >=", value, "prointsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProintsFinishFlagLessThan(String value) {
            addCriterion("PROINTS_FINISH_FLAG <", value, "prointsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProintsFinishFlagLessThanOrEqualTo(String value) {
            addCriterion("PROINTS_FINISH_FLAG <=", value, "prointsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProintsFinishFlagLike(String value) {
            addCriterion("PROINTS_FINISH_FLAG like", value, "prointsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProintsFinishFlagNotLike(String value) {
            addCriterion("PROINTS_FINISH_FLAG not like", value, "prointsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProintsFinishFlagIn(List<String> values) {
            addCriterion("PROINTS_FINISH_FLAG in", values, "prointsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProintsFinishFlagNotIn(List<String> values) {
            addCriterion("PROINTS_FINISH_FLAG not in", values, "prointsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProintsFinishFlagBetween(String value1, String value2) {
            addCriterion("PROINTS_FINISH_FLAG between", value1, value2, "prointsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProintsFinishFlagNotBetween(String value1, String value2) {
            addCriterion("PROINTS_FINISH_FLAG not between", value1, value2, "prointsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsFinishFlagIsNull() {
            addCriterion("GOODS_FINISH_FLAG is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsFinishFlagIsNotNull() {
            addCriterion("GOODS_FINISH_FLAG is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsFinishFlagEqualTo(String value) {
            addCriterion("GOODS_FINISH_FLAG =", value, "goodsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsFinishFlagNotEqualTo(String value) {
            addCriterion("GOODS_FINISH_FLAG <>", value, "goodsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsFinishFlagGreaterThan(String value) {
            addCriterion("GOODS_FINISH_FLAG >", value, "goodsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsFinishFlagGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_FINISH_FLAG >=", value, "goodsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsFinishFlagLessThan(String value) {
            addCriterion("GOODS_FINISH_FLAG <", value, "goodsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsFinishFlagLessThanOrEqualTo(String value) {
            addCriterion("GOODS_FINISH_FLAG <=", value, "goodsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsFinishFlagLike(String value) {
            addCriterion("GOODS_FINISH_FLAG like", value, "goodsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsFinishFlagNotLike(String value) {
            addCriterion("GOODS_FINISH_FLAG not like", value, "goodsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsFinishFlagIn(List<String> values) {
            addCriterion("GOODS_FINISH_FLAG in", values, "goodsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsFinishFlagNotIn(List<String> values) {
            addCriterion("GOODS_FINISH_FLAG not in", values, "goodsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsFinishFlagBetween(String value1, String value2) {
            addCriterion("GOODS_FINISH_FLAG between", value1, value2, "goodsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andGoodsFinishFlagNotBetween(String value1, String value2) {
            addCriterion("GOODS_FINISH_FLAG not between", value1, value2, "goodsFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSettlementFinishFlagIsNull() {
            addCriterion("SETTLEMENT_FINISH_FLAG is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSettlementFinishFlagIsNotNull() {
            addCriterion("SETTLEMENT_FINISH_FLAG is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSettlementFinishFlagEqualTo(String value) {
            addCriterion("SETTLEMENT_FINISH_FLAG =", value, "settlementFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSettlementFinishFlagNotEqualTo(String value) {
            addCriterion("SETTLEMENT_FINISH_FLAG <>", value, "settlementFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSettlementFinishFlagGreaterThan(String value) {
            addCriterion("SETTLEMENT_FINISH_FLAG >", value, "settlementFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSettlementFinishFlagGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_FINISH_FLAG >=", value, "settlementFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSettlementFinishFlagLessThan(String value) {
            addCriterion("SETTLEMENT_FINISH_FLAG <", value, "settlementFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSettlementFinishFlagLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_FINISH_FLAG <=", value, "settlementFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSettlementFinishFlagLike(String value) {
            addCriterion("SETTLEMENT_FINISH_FLAG like", value, "settlementFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSettlementFinishFlagNotLike(String value) {
            addCriterion("SETTLEMENT_FINISH_FLAG not like", value, "settlementFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSettlementFinishFlagIn(List<String> values) {
            addCriterion("SETTLEMENT_FINISH_FLAG in", values, "settlementFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSettlementFinishFlagNotIn(List<String> values) {
            addCriterion("SETTLEMENT_FINISH_FLAG not in", values, "settlementFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSettlementFinishFlagBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_FINISH_FLAG between", value1, value2, "settlementFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andSettlementFinishFlagNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_FINISH_FLAG not between", value1, value2, "settlementFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCapitalFinishFlagIsNull() {
            addCriterion("CAPITAL_FINISH_FLAG is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCapitalFinishFlagIsNotNull() {
            addCriterion("CAPITAL_FINISH_FLAG is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCapitalFinishFlagEqualTo(String value) {
            addCriterion("CAPITAL_FINISH_FLAG =", value, "capitalFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCapitalFinishFlagNotEqualTo(String value) {
            addCriterion("CAPITAL_FINISH_FLAG <>", value, "capitalFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCapitalFinishFlagGreaterThan(String value) {
            addCriterion("CAPITAL_FINISH_FLAG >", value, "capitalFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCapitalFinishFlagGreaterThanOrEqualTo(String value) {
            addCriterion("CAPITAL_FINISH_FLAG >=", value, "capitalFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCapitalFinishFlagLessThan(String value) {
            addCriterion("CAPITAL_FINISH_FLAG <", value, "capitalFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCapitalFinishFlagLessThanOrEqualTo(String value) {
            addCriterion("CAPITAL_FINISH_FLAG <=", value, "capitalFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCapitalFinishFlagLike(String value) {
            addCriterion("CAPITAL_FINISH_FLAG like", value, "capitalFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCapitalFinishFlagNotLike(String value) {
            addCriterion("CAPITAL_FINISH_FLAG not like", value, "capitalFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCapitalFinishFlagIn(List<String> values) {
            addCriterion("CAPITAL_FINISH_FLAG in", values, "capitalFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCapitalFinishFlagNotIn(List<String> values) {
            addCriterion("CAPITAL_FINISH_FLAG not in", values, "capitalFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCapitalFinishFlagBetween(String value1, String value2) {
            addCriterion("CAPITAL_FINISH_FLAG between", value1, value2, "capitalFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCapitalFinishFlagNotBetween(String value1, String value2) {
            addCriterion("CAPITAL_FINISH_FLAG not between", value1, value2, "capitalFinishFlag");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeQuickClaimIsNull() {
            addCriterion("BE_QUICK_CLAIM is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeQuickClaimIsNotNull() {
            addCriterion("BE_QUICK_CLAIM is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeQuickClaimEqualTo(String value) {
            addCriterion("BE_QUICK_CLAIM =", value, "beQuickClaim");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeQuickClaimNotEqualTo(String value) {
            addCriterion("BE_QUICK_CLAIM <>", value, "beQuickClaim");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeQuickClaimGreaterThan(String value) {
            addCriterion("BE_QUICK_CLAIM >", value, "beQuickClaim");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeQuickClaimGreaterThanOrEqualTo(String value) {
            addCriterion("BE_QUICK_CLAIM >=", value, "beQuickClaim");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeQuickClaimLessThan(String value) {
            addCriterion("BE_QUICK_CLAIM <", value, "beQuickClaim");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeQuickClaimLessThanOrEqualTo(String value) {
            addCriterion("BE_QUICK_CLAIM <=", value, "beQuickClaim");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeQuickClaimLike(String value) {
            addCriterion("BE_QUICK_CLAIM like", value, "beQuickClaim");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeQuickClaimNotLike(String value) {
            addCriterion("BE_QUICK_CLAIM not like", value, "beQuickClaim");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeQuickClaimIn(List<String> values) {
            addCriterion("BE_QUICK_CLAIM in", values, "beQuickClaim");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeQuickClaimNotIn(List<String> values) {
            addCriterion("BE_QUICK_CLAIM not in", values, "beQuickClaim");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeQuickClaimBetween(String value1, String value2) {
            addCriterion("BE_QUICK_CLAIM between", value1, value2, "beQuickClaim");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andBeQuickClaimNotBetween(String value1, String value2) {
            addCriterion("BE_QUICK_CLAIM not between", value1, value2, "beQuickClaim");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQuickReasonIsNull() {
            addCriterion("QUICK_REASON is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQuickReasonIsNotNull() {
            addCriterion("QUICK_REASON is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQuickReasonEqualTo(String value) {
            addCriterion("QUICK_REASON =", value, "quickReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQuickReasonNotEqualTo(String value) {
            addCriterion("QUICK_REASON <>", value, "quickReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQuickReasonGreaterThan(String value) {
            addCriterion("QUICK_REASON >", value, "quickReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQuickReasonGreaterThanOrEqualTo(String value) {
            addCriterion("QUICK_REASON >=", value, "quickReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQuickReasonLessThan(String value) {
            addCriterion("QUICK_REASON <", value, "quickReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQuickReasonLessThanOrEqualTo(String value) {
            addCriterion("QUICK_REASON <=", value, "quickReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQuickReasonLike(String value) {
            addCriterion("QUICK_REASON like", value, "quickReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQuickReasonNotLike(String value) {
            addCriterion("QUICK_REASON not like", value, "quickReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQuickReasonIn(List<String> values) {
            addCriterion("QUICK_REASON in", values, "quickReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQuickReasonNotIn(List<String> values) {
            addCriterion("QUICK_REASON not in", values, "quickReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQuickReasonBetween(String value1, String value2) {
            addCriterion("QUICK_REASON between", value1, value2, "quickReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andQuickReasonNotBetween(String value1, String value2) {
            addCriterion("QUICK_REASON not between", value1, value2, "quickReason");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyStatusIsNull() {
            addCriterion("PROVIDER_PENALTY_STATUS is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyStatusIsNotNull() {
            addCriterion("PROVIDER_PENALTY_STATUS is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyStatusEqualTo(String value) {
            addCriterion("PROVIDER_PENALTY_STATUS =", value, "providerPenaltyStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyStatusNotEqualTo(String value) {
            addCriterion("PROVIDER_PENALTY_STATUS <>", value, "providerPenaltyStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyStatusGreaterThan(String value) {
            addCriterion("PROVIDER_PENALTY_STATUS >", value, "providerPenaltyStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("PROVIDER_PENALTY_STATUS >=", value, "providerPenaltyStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyStatusLessThan(String value) {
            addCriterion("PROVIDER_PENALTY_STATUS <", value, "providerPenaltyStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyStatusLessThanOrEqualTo(String value) {
            addCriterion("PROVIDER_PENALTY_STATUS <=", value, "providerPenaltyStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyStatusLike(String value) {
            addCriterion("PROVIDER_PENALTY_STATUS like", value, "providerPenaltyStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyStatusNotLike(String value) {
            addCriterion("PROVIDER_PENALTY_STATUS not like", value, "providerPenaltyStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyStatusIn(List<String> values) {
            addCriterion("PROVIDER_PENALTY_STATUS in", values, "providerPenaltyStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyStatusNotIn(List<String> values) {
            addCriterion("PROVIDER_PENALTY_STATUS not in", values, "providerPenaltyStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyStatusBetween(String value1, String value2) {
            addCriterion("PROVIDER_PENALTY_STATUS between", value1, value2, "providerPenaltyStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyStatusNotBetween(String value1, String value2) {
            addCriterion("PROVIDER_PENALTY_STATUS not between", value1, value2, "providerPenaltyStatus");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyAmountIsNull() {
            addCriterion("PROVIDER_PENALTY_AMOUNT is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyAmountIsNotNull() {
            addCriterion("PROVIDER_PENALTY_AMOUNT is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyAmountEqualTo(BigDecimal value) {
            addCriterion("PROVIDER_PENALTY_AMOUNT =", value, "providerPenaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyAmountNotEqualTo(BigDecimal value) {
            addCriterion("PROVIDER_PENALTY_AMOUNT <>", value, "providerPenaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyAmountGreaterThan(BigDecimal value) {
            addCriterion("PROVIDER_PENALTY_AMOUNT >", value, "providerPenaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROVIDER_PENALTY_AMOUNT >=", value, "providerPenaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyAmountLessThan(BigDecimal value) {
            addCriterion("PROVIDER_PENALTY_AMOUNT <", value, "providerPenaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROVIDER_PENALTY_AMOUNT <=", value, "providerPenaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyAmountIn(List<BigDecimal> values) {
            addCriterion("PROVIDER_PENALTY_AMOUNT in", values, "providerPenaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyAmountNotIn(List<BigDecimal> values) {
            addCriterion("PROVIDER_PENALTY_AMOUNT not in", values, "providerPenaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROVIDER_PENALTY_AMOUNT between", value1, value2, "providerPenaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andProviderPenaltyAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROVIDER_PENALTY_AMOUNT not between", value1, value2, "providerPenaltyAmount");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsIdIsNull() {
            addCriterion("REPARATIONS_ID is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsIdIsNotNull() {
            addCriterion("REPARATIONS_ID is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsIdEqualTo(Integer value) {
            addCriterion("REPARATIONS_ID =", value, "reparationsId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsIdNotEqualTo(Integer value) {
            addCriterion("REPARATIONS_ID <>", value, "reparationsId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsIdGreaterThan(Integer value) {
            addCriterion("REPARATIONS_ID >", value, "reparationsId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("REPARATIONS_ID >=", value, "reparationsId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsIdLessThan(Integer value) {
            addCriterion("REPARATIONS_ID <", value, "reparationsId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsIdLessThanOrEqualTo(Integer value) {
            addCriterion("REPARATIONS_ID <=", value, "reparationsId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsIdIn(List<Integer> values) {
            addCriterion("REPARATIONS_ID in", values, "reparationsId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsIdNotIn(List<Integer> values) {
            addCriterion("REPARATIONS_ID not in", values, "reparationsId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsIdBetween(Integer value1, Integer value2) {
            addCriterion("REPARATIONS_ID between", value1, value2, "reparationsId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andReparationsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("REPARATIONS_ID not between", value1, value2, "reparationsId");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andJsonCloumIsNull() {
            addCriterion("JSON_CLOUM is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andJsonCloumIsNotNull() {
            addCriterion("JSON_CLOUM is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andJsonCloumEqualTo(Object value) {
            addCriterion("JSON_CLOUM =", value, "jsonCloum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andJsonCloumNotEqualTo(Object value) {
            addCriterion("JSON_CLOUM <>", value, "jsonCloum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andJsonCloumGreaterThan(Object value) {
            addCriterion("JSON_CLOUM >", value, "jsonCloum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andJsonCloumGreaterThanOrEqualTo(Object value) {
            addCriterion("JSON_CLOUM >=", value, "jsonCloum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andJsonCloumLessThan(Object value) {
            addCriterion("JSON_CLOUM <", value, "jsonCloum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andJsonCloumLessThanOrEqualTo(Object value) {
            addCriterion("JSON_CLOUM <=", value, "jsonCloum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andJsonCloumIn(List<Object> values) {
            addCriterion("JSON_CLOUM in", values, "jsonCloum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andJsonCloumNotIn(List<Object> values) {
            addCriterion("JSON_CLOUM not in", values, "jsonCloum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andJsonCloumBetween(Object value1, Object value2) {
            addCriterion("JSON_CLOUM between", value1, value2, "jsonCloum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andJsonCloumNotBetween(Object value1, Object value2) {
            addCriterion("JSON_CLOUM not between", value1, value2, "jsonCloum");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreatePersonIsNull() {
            addCriterion("CREATE_PERSON is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreatePersonIsNotNull() {
            addCriterion("CREATE_PERSON is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreatePersonEqualTo(String value) {
            addCriterion("CREATE_PERSON =", value, "createPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreatePersonNotEqualTo(String value) {
            addCriterion("CREATE_PERSON <>", value, "createPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreatePersonGreaterThan(String value) {
            addCriterion("CREATE_PERSON >", value, "createPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreatePersonGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_PERSON >=", value, "createPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreatePersonLessThan(String value) {
            addCriterion("CREATE_PERSON <", value, "createPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreatePersonLessThanOrEqualTo(String value) {
            addCriterion("CREATE_PERSON <=", value, "createPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreatePersonLike(String value) {
            addCriterion("CREATE_PERSON like", value, "createPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreatePersonNotLike(String value) {
            addCriterion("CREATE_PERSON not like", value, "createPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreatePersonIn(List<String> values) {
            addCriterion("CREATE_PERSON in", values, "createPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreatePersonNotIn(List<String> values) {
            addCriterion("CREATE_PERSON not in", values, "createPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreatePersonBetween(String value1, String value2) {
            addCriterion("CREATE_PERSON between", value1, value2, "createPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andCreatePersonNotBetween(String value1, String value2) {
            addCriterion("CREATE_PERSON not between", value1, value2, "createPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiDateIsNull() {
            addCriterion("MODI_DATE is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiDateIsNotNull() {
            addCriterion("MODI_DATE is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiDateEqualTo(Date value) {
            addCriterion("MODI_DATE =", value, "modiDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiDateNotEqualTo(Date value) {
            addCriterion("MODI_DATE <>", value, "modiDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiDateGreaterThan(Date value) {
            addCriterion("MODI_DATE >", value, "modiDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MODI_DATE >=", value, "modiDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiDateLessThan(Date value) {
            addCriterion("MODI_DATE <", value, "modiDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiDateLessThanOrEqualTo(Date value) {
            addCriterion("MODI_DATE <=", value, "modiDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiDateIn(List<Date> values) {
            addCriterion("MODI_DATE in", values, "modiDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiDateNotIn(List<Date> values) {
            addCriterion("MODI_DATE not in", values, "modiDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiDateBetween(Date value1, Date value2) {
            addCriterion("MODI_DATE between", value1, value2, "modiDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiDateNotBetween(Date value1, Date value2) {
            addCriterion("MODI_DATE not between", value1, value2, "modiDate");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiPersonIsNull() {
            addCriterion("MODI_PERSON is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiPersonIsNotNull() {
            addCriterion("MODI_PERSON is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiPersonEqualTo(String value) {
            addCriterion("MODI_PERSON =", value, "modiPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiPersonNotEqualTo(String value) {
            addCriterion("MODI_PERSON <>", value, "modiPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiPersonGreaterThan(String value) {
            addCriterion("MODI_PERSON >", value, "modiPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiPersonGreaterThanOrEqualTo(String value) {
            addCriterion("MODI_PERSON >=", value, "modiPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiPersonLessThan(String value) {
            addCriterion("MODI_PERSON <", value, "modiPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiPersonLessThanOrEqualTo(String value) {
            addCriterion("MODI_PERSON <=", value, "modiPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiPersonLike(String value) {
            addCriterion("MODI_PERSON like", value, "modiPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiPersonNotLike(String value) {
            addCriterion("MODI_PERSON not like", value, "modiPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiPersonIn(List<String> values) {
            addCriterion("MODI_PERSON in", values, "modiPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiPersonNotIn(List<String> values) {
            addCriterion("MODI_PERSON not in", values, "modiPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiPersonBetween(String value1, String value2) {
            addCriterion("MODI_PERSON between", value1, value2, "modiPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andModiPersonNotBetween(String value1, String value2) {
            addCriterion("MODI_PERSON not between", value1, value2, "modiPerson");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDateVersionIsNull() {
            addCriterion("DATE_VERSION is null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDateVersionIsNotNull() {
            addCriterion("DATE_VERSION is not null");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDateVersionEqualTo(Short value) {
            addCriterion("DATE_VERSION =", value, "dateVersion");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDateVersionNotEqualTo(Short value) {
            addCriterion("DATE_VERSION <>", value, "dateVersion");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDateVersionGreaterThan(Short value) {
            addCriterion("DATE_VERSION >", value, "dateVersion");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDateVersionGreaterThanOrEqualTo(Short value) {
            addCriterion("DATE_VERSION >=", value, "dateVersion");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDateVersionLessThan(Short value) {
            addCriterion("DATE_VERSION <", value, "dateVersion");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDateVersionLessThanOrEqualTo(Short value) {
            addCriterion("DATE_VERSION <=", value, "dateVersion");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDateVersionIn(List<Short> values) {
            addCriterion("DATE_VERSION in", values, "dateVersion");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDateVersionNotIn(List<Short> values) {
            addCriterion("DATE_VERSION not in", values, "dateVersion");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDateVersionBetween(Short value1, Short value2) {
            addCriterion("DATE_VERSION between", value1, value2, "dateVersion");
            return (TCsClaimsExample.Criteria)this;
        }

        public TCsClaimsExample.Criteria andDateVersionNotBetween(Short value1, Short value2) {
            addCriterion("DATE_VERSION not between", value1, value2, "dateVersion");
            return (TCsClaimsExample.Criteria)this;
        }
    }
}