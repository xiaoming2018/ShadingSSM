package com.xiaoming.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyModelTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyModelTypeExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andModelTypeIdIsNull() {
            addCriterion("model_type_id is null");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdIsNotNull() {
            addCriterion("model_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdEqualTo(Integer value) {
            addCriterion("model_type_id =", value, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdNotEqualTo(Integer value) {
            addCriterion("model_type_id <>", value, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdGreaterThan(Integer value) {
            addCriterion("model_type_id >", value, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("model_type_id >=", value, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdLessThan(Integer value) {
            addCriterion("model_type_id <", value, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("model_type_id <=", value, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdIn(List<Integer> values) {
            addCriterion("model_type_id in", values, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdNotIn(List<Integer> values) {
            addCriterion("model_type_id not in", values, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("model_type_id between", value1, value2, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("model_type_id not between", value1, value2, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeNameIsNull() {
            addCriterion("model_type_name is null");
            return (Criteria) this;
        }

        public Criteria andModelTypeNameIsNotNull() {
            addCriterion("model_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andModelTypeNameEqualTo(String value) {
            addCriterion("model_type_name =", value, "modelTypeName");
            return (Criteria) this;
        }

        public Criteria andModelTypeNameNotEqualTo(String value) {
            addCriterion("model_type_name <>", value, "modelTypeName");
            return (Criteria) this;
        }

        public Criteria andModelTypeNameGreaterThan(String value) {
            addCriterion("model_type_name >", value, "modelTypeName");
            return (Criteria) this;
        }

        public Criteria andModelTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("model_type_name >=", value, "modelTypeName");
            return (Criteria) this;
        }

        public Criteria andModelTypeNameLessThan(String value) {
            addCriterion("model_type_name <", value, "modelTypeName");
            return (Criteria) this;
        }

        public Criteria andModelTypeNameLessThanOrEqualTo(String value) {
            addCriterion("model_type_name <=", value, "modelTypeName");
            return (Criteria) this;
        }

        public Criteria andModelTypeNameLike(String value) {
            addCriterion("model_type_name like", value, "modelTypeName");
            return (Criteria) this;
        }

        public Criteria andModelTypeNameNotLike(String value) {
            addCriterion("model_type_name not like", value, "modelTypeName");
            return (Criteria) this;
        }

        public Criteria andModelTypeNameIn(List<String> values) {
            addCriterion("model_type_name in", values, "modelTypeName");
            return (Criteria) this;
        }

        public Criteria andModelTypeNameNotIn(List<String> values) {
            addCriterion("model_type_name not in", values, "modelTypeName");
            return (Criteria) this;
        }

        public Criteria andModelTypeNameBetween(String value1, String value2) {
            addCriterion("model_type_name between", value1, value2, "modelTypeName");
            return (Criteria) this;
        }

        public Criteria andModelTypeNameNotBetween(String value1, String value2) {
            addCriterion("model_type_name not between", value1, value2, "modelTypeName");
            return (Criteria) this;
        }

        public Criteria andModelTypeCreateTimeIsNull() {
            addCriterion("model_type_create_time is null");
            return (Criteria) this;
        }

        public Criteria andModelTypeCreateTimeIsNotNull() {
            addCriterion("model_type_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andModelTypeCreateTimeEqualTo(Date value) {
            addCriterion("model_type_create_time =", value, "modelTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeCreateTimeNotEqualTo(Date value) {
            addCriterion("model_type_create_time <>", value, "modelTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeCreateTimeGreaterThan(Date value) {
            addCriterion("model_type_create_time >", value, "modelTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("model_type_create_time >=", value, "modelTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeCreateTimeLessThan(Date value) {
            addCriterion("model_type_create_time <", value, "modelTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("model_type_create_time <=", value, "modelTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeCreateTimeIn(List<Date> values) {
            addCriterion("model_type_create_time in", values, "modelTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeCreateTimeNotIn(List<Date> values) {
            addCriterion("model_type_create_time not in", values, "modelTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeCreateTimeBetween(Date value1, Date value2) {
            addCriterion("model_type_create_time between", value1, value2, "modelTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("model_type_create_time not between", value1, value2, "modelTypeCreateTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeUpdataTimeIsNull() {
            addCriterion("model_type_updata_time is null");
            return (Criteria) this;
        }

        public Criteria andModelTypeUpdataTimeIsNotNull() {
            addCriterion("model_type_updata_time is not null");
            return (Criteria) this;
        }

        public Criteria andModelTypeUpdataTimeEqualTo(Date value) {
            addCriterion("model_type_updata_time =", value, "modelTypeUpdataTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeUpdataTimeNotEqualTo(Date value) {
            addCriterion("model_type_updata_time <>", value, "modelTypeUpdataTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeUpdataTimeGreaterThan(Date value) {
            addCriterion("model_type_updata_time >", value, "modelTypeUpdataTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeUpdataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("model_type_updata_time >=", value, "modelTypeUpdataTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeUpdataTimeLessThan(Date value) {
            addCriterion("model_type_updata_time <", value, "modelTypeUpdataTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeUpdataTimeLessThanOrEqualTo(Date value) {
            addCriterion("model_type_updata_time <=", value, "modelTypeUpdataTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeUpdataTimeIn(List<Date> values) {
            addCriterion("model_type_updata_time in", values, "modelTypeUpdataTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeUpdataTimeNotIn(List<Date> values) {
            addCriterion("model_type_updata_time not in", values, "modelTypeUpdataTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeUpdataTimeBetween(Date value1, Date value2) {
            addCriterion("model_type_updata_time between", value1, value2, "modelTypeUpdataTime");
            return (Criteria) this;
        }

        public Criteria andModelTypeUpdataTimeNotBetween(Date value1, Date value2) {
            addCriterion("model_type_updata_time not between", value1, value2, "modelTypeUpdataTime");
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