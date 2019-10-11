package com.baosight.shgt.service.support.persistence.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PayApplyRevokeExample
{
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public PayApplyRevokeExample()
    {
        this.oredCriteria = new ArrayList();
        this.oredCriteria.add(new Criteria());
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

    public static class Criteria extends PayApplyRevokeExample.GeneratedCriteria
    {
    }

    protected static abstract class GeneratedCriteria
    {
        protected List<PayApplyRevokeExample.Criterion> criteria;

        protected GeneratedCriteria()
        {
            this.criteria = new ArrayList();
        }

        public boolean isValid() {
            return this.criteria.size() > 0;
        }

        public List<PayApplyRevokeExample.Criterion> getAllCriteria() {
            return this.criteria;
        }

        public List<PayApplyRevokeExample.Criterion> getCriteria() {
            return this.criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            this.criteria.add(new PayApplyRevokeExample.Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            this.criteria.add(new PayApplyRevokeExample.Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if ((value1 == null) || (value2 == null)) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            this.criteria.add(new PayApplyRevokeExample.Criterion(condition, value1, value2));
        }

        public PayApplyRevokeExample.Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayerCodeIsNull() {
            addCriterion("PAYER_CODE is null");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayerCodeIsNotNull() {
            addCriterion("PAYER_CODE is not null");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayerCodeEqualTo(String value) {
            addCriterion("PAYER_CODE =", value, "payerCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayerCodeNotEqualTo(String value) {
            addCriterion("PAYER_CODE <>", value, "payerCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayerCodeGreaterThan(String value) {
            addCriterion("PAYER_CODE >", value, "payerCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYER_CODE >=", value, "payerCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayerCodeLessThan(String value) {
            addCriterion("PAYER_CODE <", value, "payerCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayerCodeLessThanOrEqualTo(String value) {
            addCriterion("PAYER_CODE <=", value, "payerCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayerCodeLike(String value) {
            addCriterion("PAYER_CODE like", value, "payerCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayerCodeNotLike(String value) {
            addCriterion("PAYER_CODE not like", value, "payerCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayerCodeIn(List<String> values) {
            addCriterion("PAYER_CODE in", values, "payerCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayerCodeNotIn(List<String> values) {
            addCriterion("PAYER_CODE not in", values, "payerCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayerCodeBetween(String value1, String value2) {
            addCriterion("PAYER_CODE between", value1, value2, "payerCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayerCodeNotBetween(String value1, String value2) {
            addCriterion("PAYER_CODE not between", value1, value2, "payerCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayeeCodeIsNull() {
            addCriterion("PAYEE_CODE is null");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayeeCodeIsNotNull() {
            addCriterion("PAYEE_CODE is not null");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayeeCodeEqualTo(String value) {
            addCriterion("PAYEE_CODE =", value, "payeeCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayeeCodeNotEqualTo(String value) {
            addCriterion("PAYEE_CODE <>", value, "payeeCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayeeCodeGreaterThan(String value) {
            addCriterion("PAYEE_CODE >", value, "payeeCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayeeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEE_CODE >=", value, "payeeCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayeeCodeLessThan(String value) {
            addCriterion("PAYEE_CODE <", value, "payeeCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayeeCodeLessThanOrEqualTo(String value) {
            addCriterion("PAYEE_CODE <=", value, "payeeCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayeeCodeLike(String value) {
            addCriterion("PAYEE_CODE like", value, "payeeCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayeeCodeNotLike(String value) {
            addCriterion("PAYEE_CODE not like", value, "payeeCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayeeCodeIn(List<String> values) {
            addCriterion("PAYEE_CODE in", values, "payeeCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayeeCodeNotIn(List<String> values) {
            addCriterion("PAYEE_CODE not in", values, "payeeCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayeeCodeBetween(String value1, String value2) {
            addCriterion("PAYEE_CODE between", value1, value2, "payeeCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayeeCodeNotBetween(String value1, String value2) {
            addCriterion("PAYEE_CODE not between", value1, value2, "payeeCode");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andSegNoIsNull() {
            addCriterion("SEG_NO is null");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andSegNoIsNotNull() {
            addCriterion("SEG_NO is not null");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andSegNoEqualTo(String value) {
            addCriterion("SEG_NO =", value, "segNo");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andSegNoNotEqualTo(String value) {
            addCriterion("SEG_NO <>", value, "segNo");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andSegNoGreaterThan(String value) {
            addCriterion("SEG_NO >", value, "segNo");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andSegNoGreaterThanOrEqualTo(String value) {
            addCriterion("SEG_NO >=", value, "segNo");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andSegNoLessThan(String value) {
            addCriterion("SEG_NO <", value, "segNo");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andSegNoLessThanOrEqualTo(String value) {
            addCriterion("SEG_NO <=", value, "segNo");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andSegNoLike(String value) {
            addCriterion("SEG_NO like", value, "segNo");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andSegNoNotLike(String value) {
            addCriterion("SEG_NO not like", value, "segNo");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andSegNoIn(List<String> values) {
            addCriterion("SEG_NO in", values, "segNo");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andSegNoNotIn(List<String> values) {
            addCriterion("SEG_NO not in", values, "segNo");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andSegNoBetween(String value1, String value2) {
            addCriterion("SEG_NO between", value1, value2, "segNo");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andSegNoNotBetween(String value1, String value2) {
            addCriterion("SEG_NO not between", value1, value2, "segNo");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayTypeIsNull() {
            addCriterion("PAY_TYPE is null");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayTypeIsNotNull() {
            addCriterion("PAY_TYPE is not null");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayTypeEqualTo(String value) {
            addCriterion("PAY_TYPE =", value, "payType");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("PAY_TYPE <>", value, "payType");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayTypeGreaterThan(String value) {
            addCriterion("PAY_TYPE >", value, "payType");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE >=", value, "payType");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayTypeLessThan(String value) {
            addCriterion("PAY_TYPE <", value, "payType");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("PAY_TYPE <=", value, "payType");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayTypeLike(String value) {
            addCriterion("PAY_TYPE like", value, "payType");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayTypeNotLike(String value) {
            addCriterion("PAY_TYPE not like", value, "payType");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayTypeIn(List<String> values) {
            addCriterion("PAY_TYPE in", values, "payType");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("PAY_TYPE not in", values, "payType");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("PAY_TYPE between", value1, value2, "payType");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("PAY_TYPE not between", value1, value2, "payType");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andRecodeTimeIsNull() {
            addCriterion("RECODE_TIME is null");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andRecodeTimeIsNotNull() {
            addCriterion("RECODE_TIME is not null");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andRecodeTimeEqualTo(Date value) {
            addCriterion("RECODE_TIME =", value, "recodeTime");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andRecodeTimeNotEqualTo(Date value) {
            addCriterion("RECODE_TIME <>", value, "recodeTime");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andRecodeTimeGreaterThan(Date value) {
            addCriterion("RECODE_TIME >", value, "recodeTime");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andRecodeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RECODE_TIME >=", value, "recodeTime");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andRecodeTimeLessThan(Date value) {
            addCriterion("RECODE_TIME <", value, "recodeTime");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andRecodeTimeLessThanOrEqualTo(Date value) {
            addCriterion("RECODE_TIME <=", value, "recodeTime");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andRecodeTimeIn(List<Date> values) {
            addCriterion("RECODE_TIME in", values, "recodeTime");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andRecodeTimeNotIn(List<Date> values) {
            addCriterion("RECODE_TIME not in", values, "recodeTime");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andRecodeTimeBetween(Date value1, Date value2) {
            addCriterion("RECODE_TIME between", value1, value2, "recodeTime");
            return (PayApplyRevokeExample.Criteria)this;
        }

        public PayApplyRevokeExample.Criteria andRecodeTimeNotBetween(Date value1, Date value2) {
            addCriterion("RECODE_TIME not between", value1, value2, "recodeTime");
            return (PayApplyRevokeExample.Criteria)this;
        }
    }
}