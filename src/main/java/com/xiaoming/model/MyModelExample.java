package com.xiaoming.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyModelExample() {
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

        public Criteria andModelIdIsNull() {
            addCriterion("Model_ID is null");
            return (Criteria) this;
        }

        public Criteria andModelIdIsNotNull() {
            addCriterion("Model_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModelIdEqualTo(Integer value) {
            addCriterion("Model_ID =", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotEqualTo(Integer value) {
            addCriterion("Model_ID <>", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThan(Integer value) {
            addCriterion("Model_ID >", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Model_ID >=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThan(Integer value) {
            addCriterion("Model_ID <", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdLessThanOrEqualTo(Integer value) {
            addCriterion("Model_ID <=", value, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdIn(List<Integer> values) {
            addCriterion("Model_ID in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotIn(List<Integer> values) {
            addCriterion("Model_ID not in", values, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdBetween(Integer value1, Integer value2) {
            addCriterion("Model_ID between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Model_ID not between", value1, value2, "modelId");
            return (Criteria) this;
        }

        public Criteria andModelTitleIsNull() {
            addCriterion("Model_Title is null");
            return (Criteria) this;
        }

        public Criteria andModelTitleIsNotNull() {
            addCriterion("Model_Title is not null");
            return (Criteria) this;
        }

        public Criteria andModelTitleEqualTo(String value) {
            addCriterion("Model_Title =", value, "modelTitle");
            return (Criteria) this;
        }

        public Criteria andModelTitleNotEqualTo(String value) {
            addCriterion("Model_Title <>", value, "modelTitle");
            return (Criteria) this;
        }

        public Criteria andModelTitleGreaterThan(String value) {
            addCriterion("Model_Title >", value, "modelTitle");
            return (Criteria) this;
        }

        public Criteria andModelTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Model_Title >=", value, "modelTitle");
            return (Criteria) this;
        }

        public Criteria andModelTitleLessThan(String value) {
            addCriterion("Model_Title <", value, "modelTitle");
            return (Criteria) this;
        }

        public Criteria andModelTitleLessThanOrEqualTo(String value) {
            addCriterion("Model_Title <=", value, "modelTitle");
            return (Criteria) this;
        }

        public Criteria andModelTitleLike(String value) {
            addCriterion("Model_Title like", value, "modelTitle");
            return (Criteria) this;
        }

        public Criteria andModelTitleNotLike(String value) {
            addCriterion("Model_Title not like", value, "modelTitle");
            return (Criteria) this;
        }

        public Criteria andModelTitleIn(List<String> values) {
            addCriterion("Model_Title in", values, "modelTitle");
            return (Criteria) this;
        }

        public Criteria andModelTitleNotIn(List<String> values) {
            addCriterion("Model_Title not in", values, "modelTitle");
            return (Criteria) this;
        }

        public Criteria andModelTitleBetween(String value1, String value2) {
            addCriterion("Model_Title between", value1, value2, "modelTitle");
            return (Criteria) this;
        }

        public Criteria andModelTitleNotBetween(String value1, String value2) {
            addCriterion("Model_Title not between", value1, value2, "modelTitle");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdIsNull() {
            addCriterion("Model_Type_ID is null");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdIsNotNull() {
            addCriterion("Model_Type_ID is not null");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdEqualTo(Integer value) {
            addCriterion("Model_Type_ID =", value, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdNotEqualTo(Integer value) {
            addCriterion("Model_Type_ID <>", value, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdGreaterThan(Integer value) {
            addCriterion("Model_Type_ID >", value, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Model_Type_ID >=", value, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdLessThan(Integer value) {
            addCriterion("Model_Type_ID <", value, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("Model_Type_ID <=", value, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdIn(List<Integer> values) {
            addCriterion("Model_Type_ID in", values, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdNotIn(List<Integer> values) {
            addCriterion("Model_Type_ID not in", values, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("Model_Type_ID between", value1, value2, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Model_Type_ID not between", value1, value2, "modelTypeId");
            return (Criteria) this;
        }

        public Criteria andModelPositionXIsNull() {
            addCriterion("Model_Position_X is null");
            return (Criteria) this;
        }

        public Criteria andModelPositionXIsNotNull() {
            addCriterion("Model_Position_X is not null");
            return (Criteria) this;
        }

        public Criteria andModelPositionXEqualTo(Float value) {
            addCriterion("Model_Position_X =", value, "modelPositionX");
            return (Criteria) this;
        }

        public Criteria andModelPositionXNotEqualTo(Float value) {
            addCriterion("Model_Position_X <>", value, "modelPositionX");
            return (Criteria) this;
        }

        public Criteria andModelPositionXGreaterThan(Float value) {
            addCriterion("Model_Position_X >", value, "modelPositionX");
            return (Criteria) this;
        }

        public Criteria andModelPositionXGreaterThanOrEqualTo(Float value) {
            addCriterion("Model_Position_X >=", value, "modelPositionX");
            return (Criteria) this;
        }

        public Criteria andModelPositionXLessThan(Float value) {
            addCriterion("Model_Position_X <", value, "modelPositionX");
            return (Criteria) this;
        }

        public Criteria andModelPositionXLessThanOrEqualTo(Float value) {
            addCriterion("Model_Position_X <=", value, "modelPositionX");
            return (Criteria) this;
        }

        public Criteria andModelPositionXIn(List<Float> values) {
            addCriterion("Model_Position_X in", values, "modelPositionX");
            return (Criteria) this;
        }

        public Criteria andModelPositionXNotIn(List<Float> values) {
            addCriterion("Model_Position_X not in", values, "modelPositionX");
            return (Criteria) this;
        }

        public Criteria andModelPositionXBetween(Float value1, Float value2) {
            addCriterion("Model_Position_X between", value1, value2, "modelPositionX");
            return (Criteria) this;
        }

        public Criteria andModelPositionXNotBetween(Float value1, Float value2) {
            addCriterion("Model_Position_X not between", value1, value2, "modelPositionX");
            return (Criteria) this;
        }

        public Criteria andModelPositionYIsNull() {
            addCriterion("Model_Position_Y is null");
            return (Criteria) this;
        }

        public Criteria andModelPositionYIsNotNull() {
            addCriterion("Model_Position_Y is not null");
            return (Criteria) this;
        }

        public Criteria andModelPositionYEqualTo(Float value) {
            addCriterion("Model_Position_Y =", value, "modelPositionY");
            return (Criteria) this;
        }

        public Criteria andModelPositionYNotEqualTo(Float value) {
            addCriterion("Model_Position_Y <>", value, "modelPositionY");
            return (Criteria) this;
        }

        public Criteria andModelPositionYGreaterThan(Float value) {
            addCriterion("Model_Position_Y >", value, "modelPositionY");
            return (Criteria) this;
        }

        public Criteria andModelPositionYGreaterThanOrEqualTo(Float value) {
            addCriterion("Model_Position_Y >=", value, "modelPositionY");
            return (Criteria) this;
        }

        public Criteria andModelPositionYLessThan(Float value) {
            addCriterion("Model_Position_Y <", value, "modelPositionY");
            return (Criteria) this;
        }

        public Criteria andModelPositionYLessThanOrEqualTo(Float value) {
            addCriterion("Model_Position_Y <=", value, "modelPositionY");
            return (Criteria) this;
        }

        public Criteria andModelPositionYIn(List<Float> values) {
            addCriterion("Model_Position_Y in", values, "modelPositionY");
            return (Criteria) this;
        }

        public Criteria andModelPositionYNotIn(List<Float> values) {
            addCriterion("Model_Position_Y not in", values, "modelPositionY");
            return (Criteria) this;
        }

        public Criteria andModelPositionYBetween(Float value1, Float value2) {
            addCriterion("Model_Position_Y between", value1, value2, "modelPositionY");
            return (Criteria) this;
        }

        public Criteria andModelPositionYNotBetween(Float value1, Float value2) {
            addCriterion("Model_Position_Y not between", value1, value2, "modelPositionY");
            return (Criteria) this;
        }

        public Criteria andModelPositionZIsNull() {
            addCriterion("Model_Position_Z is null");
            return (Criteria) this;
        }

        public Criteria andModelPositionZIsNotNull() {
            addCriterion("Model_Position_Z is not null");
            return (Criteria) this;
        }

        public Criteria andModelPositionZEqualTo(Float value) {
            addCriterion("Model_Position_Z =", value, "modelPositionZ");
            return (Criteria) this;
        }

        public Criteria andModelPositionZNotEqualTo(Float value) {
            addCriterion("Model_Position_Z <>", value, "modelPositionZ");
            return (Criteria) this;
        }

        public Criteria andModelPositionZGreaterThan(Float value) {
            addCriterion("Model_Position_Z >", value, "modelPositionZ");
            return (Criteria) this;
        }

        public Criteria andModelPositionZGreaterThanOrEqualTo(Float value) {
            addCriterion("Model_Position_Z >=", value, "modelPositionZ");
            return (Criteria) this;
        }

        public Criteria andModelPositionZLessThan(Float value) {
            addCriterion("Model_Position_Z <", value, "modelPositionZ");
            return (Criteria) this;
        }

        public Criteria andModelPositionZLessThanOrEqualTo(Float value) {
            addCriterion("Model_Position_Z <=", value, "modelPositionZ");
            return (Criteria) this;
        }

        public Criteria andModelPositionZIn(List<Float> values) {
            addCriterion("Model_Position_Z in", values, "modelPositionZ");
            return (Criteria) this;
        }

        public Criteria andModelPositionZNotIn(List<Float> values) {
            addCriterion("Model_Position_Z not in", values, "modelPositionZ");
            return (Criteria) this;
        }

        public Criteria andModelPositionZBetween(Float value1, Float value2) {
            addCriterion("Model_Position_Z between", value1, value2, "modelPositionZ");
            return (Criteria) this;
        }

        public Criteria andModelPositionZNotBetween(Float value1, Float value2) {
            addCriterion("Model_Position_Z not between", value1, value2, "modelPositionZ");
            return (Criteria) this;
        }

        public Criteria andModelRotationXIsNull() {
            addCriterion("Model_Rotation_X is null");
            return (Criteria) this;
        }

        public Criteria andModelRotationXIsNotNull() {
            addCriterion("Model_Rotation_X is not null");
            return (Criteria) this;
        }

        public Criteria andModelRotationXEqualTo(Float value) {
            addCriterion("Model_Rotation_X =", value, "modelRotationX");
            return (Criteria) this;
        }

        public Criteria andModelRotationXNotEqualTo(Float value) {
            addCriterion("Model_Rotation_X <>", value, "modelRotationX");
            return (Criteria) this;
        }

        public Criteria andModelRotationXGreaterThan(Float value) {
            addCriterion("Model_Rotation_X >", value, "modelRotationX");
            return (Criteria) this;
        }

        public Criteria andModelRotationXGreaterThanOrEqualTo(Float value) {
            addCriterion("Model_Rotation_X >=", value, "modelRotationX");
            return (Criteria) this;
        }

        public Criteria andModelRotationXLessThan(Float value) {
            addCriterion("Model_Rotation_X <", value, "modelRotationX");
            return (Criteria) this;
        }

        public Criteria andModelRotationXLessThanOrEqualTo(Float value) {
            addCriterion("Model_Rotation_X <=", value, "modelRotationX");
            return (Criteria) this;
        }

        public Criteria andModelRotationXIn(List<Float> values) {
            addCriterion("Model_Rotation_X in", values, "modelRotationX");
            return (Criteria) this;
        }

        public Criteria andModelRotationXNotIn(List<Float> values) {
            addCriterion("Model_Rotation_X not in", values, "modelRotationX");
            return (Criteria) this;
        }

        public Criteria andModelRotationXBetween(Float value1, Float value2) {
            addCriterion("Model_Rotation_X between", value1, value2, "modelRotationX");
            return (Criteria) this;
        }

        public Criteria andModelRotationXNotBetween(Float value1, Float value2) {
            addCriterion("Model_Rotation_X not between", value1, value2, "modelRotationX");
            return (Criteria) this;
        }

        public Criteria andModelRotationYIsNull() {
            addCriterion("Model_Rotation_Y is null");
            return (Criteria) this;
        }

        public Criteria andModelRotationYIsNotNull() {
            addCriterion("Model_Rotation_Y is not null");
            return (Criteria) this;
        }

        public Criteria andModelRotationYEqualTo(Float value) {
            addCriterion("Model_Rotation_Y =", value, "modelRotationY");
            return (Criteria) this;
        }

        public Criteria andModelRotationYNotEqualTo(Float value) {
            addCriterion("Model_Rotation_Y <>", value, "modelRotationY");
            return (Criteria) this;
        }

        public Criteria andModelRotationYGreaterThan(Float value) {
            addCriterion("Model_Rotation_Y >", value, "modelRotationY");
            return (Criteria) this;
        }

        public Criteria andModelRotationYGreaterThanOrEqualTo(Float value) {
            addCriterion("Model_Rotation_Y >=", value, "modelRotationY");
            return (Criteria) this;
        }

        public Criteria andModelRotationYLessThan(Float value) {
            addCriterion("Model_Rotation_Y <", value, "modelRotationY");
            return (Criteria) this;
        }

        public Criteria andModelRotationYLessThanOrEqualTo(Float value) {
            addCriterion("Model_Rotation_Y <=", value, "modelRotationY");
            return (Criteria) this;
        }

        public Criteria andModelRotationYIn(List<Float> values) {
            addCriterion("Model_Rotation_Y in", values, "modelRotationY");
            return (Criteria) this;
        }

        public Criteria andModelRotationYNotIn(List<Float> values) {
            addCriterion("Model_Rotation_Y not in", values, "modelRotationY");
            return (Criteria) this;
        }

        public Criteria andModelRotationYBetween(Float value1, Float value2) {
            addCriterion("Model_Rotation_Y between", value1, value2, "modelRotationY");
            return (Criteria) this;
        }

        public Criteria andModelRotationYNotBetween(Float value1, Float value2) {
            addCriterion("Model_Rotation_Y not between", value1, value2, "modelRotationY");
            return (Criteria) this;
        }

        public Criteria andModelRotationZIsNull() {
            addCriterion("Model_Rotation_Z is null");
            return (Criteria) this;
        }

        public Criteria andModelRotationZIsNotNull() {
            addCriterion("Model_Rotation_Z is not null");
            return (Criteria) this;
        }

        public Criteria andModelRotationZEqualTo(Float value) {
            addCriterion("Model_Rotation_Z =", value, "modelRotationZ");
            return (Criteria) this;
        }

        public Criteria andModelRotationZNotEqualTo(Float value) {
            addCriterion("Model_Rotation_Z <>", value, "modelRotationZ");
            return (Criteria) this;
        }

        public Criteria andModelRotationZGreaterThan(Float value) {
            addCriterion("Model_Rotation_Z >", value, "modelRotationZ");
            return (Criteria) this;
        }

        public Criteria andModelRotationZGreaterThanOrEqualTo(Float value) {
            addCriterion("Model_Rotation_Z >=", value, "modelRotationZ");
            return (Criteria) this;
        }

        public Criteria andModelRotationZLessThan(Float value) {
            addCriterion("Model_Rotation_Z <", value, "modelRotationZ");
            return (Criteria) this;
        }

        public Criteria andModelRotationZLessThanOrEqualTo(Float value) {
            addCriterion("Model_Rotation_Z <=", value, "modelRotationZ");
            return (Criteria) this;
        }

        public Criteria andModelRotationZIn(List<Float> values) {
            addCriterion("Model_Rotation_Z in", values, "modelRotationZ");
            return (Criteria) this;
        }

        public Criteria andModelRotationZNotIn(List<Float> values) {
            addCriterion("Model_Rotation_Z not in", values, "modelRotationZ");
            return (Criteria) this;
        }

        public Criteria andModelRotationZBetween(Float value1, Float value2) {
            addCriterion("Model_Rotation_Z between", value1, value2, "modelRotationZ");
            return (Criteria) this;
        }

        public Criteria andModelRotationZNotBetween(Float value1, Float value2) {
            addCriterion("Model_Rotation_Z not between", value1, value2, "modelRotationZ");
            return (Criteria) this;
        }

        public Criteria andModelScaleXIsNull() {
            addCriterion("Model_Scale_X is null");
            return (Criteria) this;
        }

        public Criteria andModelScaleXIsNotNull() {
            addCriterion("Model_Scale_X is not null");
            return (Criteria) this;
        }

        public Criteria andModelScaleXEqualTo(Float value) {
            addCriterion("Model_Scale_X =", value, "modelScaleX");
            return (Criteria) this;
        }

        public Criteria andModelScaleXNotEqualTo(Float value) {
            addCriterion("Model_Scale_X <>", value, "modelScaleX");
            return (Criteria) this;
        }

        public Criteria andModelScaleXGreaterThan(Float value) {
            addCriterion("Model_Scale_X >", value, "modelScaleX");
            return (Criteria) this;
        }

        public Criteria andModelScaleXGreaterThanOrEqualTo(Float value) {
            addCriterion("Model_Scale_X >=", value, "modelScaleX");
            return (Criteria) this;
        }

        public Criteria andModelScaleXLessThan(Float value) {
            addCriterion("Model_Scale_X <", value, "modelScaleX");
            return (Criteria) this;
        }

        public Criteria andModelScaleXLessThanOrEqualTo(Float value) {
            addCriterion("Model_Scale_X <=", value, "modelScaleX");
            return (Criteria) this;
        }

        public Criteria andModelScaleXIn(List<Float> values) {
            addCriterion("Model_Scale_X in", values, "modelScaleX");
            return (Criteria) this;
        }

        public Criteria andModelScaleXNotIn(List<Float> values) {
            addCriterion("Model_Scale_X not in", values, "modelScaleX");
            return (Criteria) this;
        }

        public Criteria andModelScaleXBetween(Float value1, Float value2) {
            addCriterion("Model_Scale_X between", value1, value2, "modelScaleX");
            return (Criteria) this;
        }

        public Criteria andModelScaleXNotBetween(Float value1, Float value2) {
            addCriterion("Model_Scale_X not between", value1, value2, "modelScaleX");
            return (Criteria) this;
        }

        public Criteria andModelScaleYIsNull() {
            addCriterion("Model_Scale_Y is null");
            return (Criteria) this;
        }

        public Criteria andModelScaleYIsNotNull() {
            addCriterion("Model_Scale_Y is not null");
            return (Criteria) this;
        }

        public Criteria andModelScaleYEqualTo(Float value) {
            addCriterion("Model_Scale_Y =", value, "modelScaleY");
            return (Criteria) this;
        }

        public Criteria andModelScaleYNotEqualTo(Float value) {
            addCriterion("Model_Scale_Y <>", value, "modelScaleY");
            return (Criteria) this;
        }

        public Criteria andModelScaleYGreaterThan(Float value) {
            addCriterion("Model_Scale_Y >", value, "modelScaleY");
            return (Criteria) this;
        }

        public Criteria andModelScaleYGreaterThanOrEqualTo(Float value) {
            addCriterion("Model_Scale_Y >=", value, "modelScaleY");
            return (Criteria) this;
        }

        public Criteria andModelScaleYLessThan(Float value) {
            addCriterion("Model_Scale_Y <", value, "modelScaleY");
            return (Criteria) this;
        }

        public Criteria andModelScaleYLessThanOrEqualTo(Float value) {
            addCriterion("Model_Scale_Y <=", value, "modelScaleY");
            return (Criteria) this;
        }

        public Criteria andModelScaleYIn(List<Float> values) {
            addCriterion("Model_Scale_Y in", values, "modelScaleY");
            return (Criteria) this;
        }

        public Criteria andModelScaleYNotIn(List<Float> values) {
            addCriterion("Model_Scale_Y not in", values, "modelScaleY");
            return (Criteria) this;
        }

        public Criteria andModelScaleYBetween(Float value1, Float value2) {
            addCriterion("Model_Scale_Y between", value1, value2, "modelScaleY");
            return (Criteria) this;
        }

        public Criteria andModelScaleYNotBetween(Float value1, Float value2) {
            addCriterion("Model_Scale_Y not between", value1, value2, "modelScaleY");
            return (Criteria) this;
        }

        public Criteria andModelScaleZIsNull() {
            addCriterion("Model_Scale_Z is null");
            return (Criteria) this;
        }

        public Criteria andModelScaleZIsNotNull() {
            addCriterion("Model_Scale_Z is not null");
            return (Criteria) this;
        }

        public Criteria andModelScaleZEqualTo(Float value) {
            addCriterion("Model_Scale_Z =", value, "modelScaleZ");
            return (Criteria) this;
        }

        public Criteria andModelScaleZNotEqualTo(Float value) {
            addCriterion("Model_Scale_Z <>", value, "modelScaleZ");
            return (Criteria) this;
        }

        public Criteria andModelScaleZGreaterThan(Float value) {
            addCriterion("Model_Scale_Z >", value, "modelScaleZ");
            return (Criteria) this;
        }

        public Criteria andModelScaleZGreaterThanOrEqualTo(Float value) {
            addCriterion("Model_Scale_Z >=", value, "modelScaleZ");
            return (Criteria) this;
        }

        public Criteria andModelScaleZLessThan(Float value) {
            addCriterion("Model_Scale_Z <", value, "modelScaleZ");
            return (Criteria) this;
        }

        public Criteria andModelScaleZLessThanOrEqualTo(Float value) {
            addCriterion("Model_Scale_Z <=", value, "modelScaleZ");
            return (Criteria) this;
        }

        public Criteria andModelScaleZIn(List<Float> values) {
            addCriterion("Model_Scale_Z in", values, "modelScaleZ");
            return (Criteria) this;
        }

        public Criteria andModelScaleZNotIn(List<Float> values) {
            addCriterion("Model_Scale_Z not in", values, "modelScaleZ");
            return (Criteria) this;
        }

        public Criteria andModelScaleZBetween(Float value1, Float value2) {
            addCriterion("Model_Scale_Z between", value1, value2, "modelScaleZ");
            return (Criteria) this;
        }

        public Criteria andModelScaleZNotBetween(Float value1, Float value2) {
            addCriterion("Model_Scale_Z not between", value1, value2, "modelScaleZ");
            return (Criteria) this;
        }

        public Criteria andModelFilepathIsNull() {
            addCriterion("Model_FilePath is null");
            return (Criteria) this;
        }

        public Criteria andModelFilepathIsNotNull() {
            addCriterion("Model_FilePath is not null");
            return (Criteria) this;
        }

        public Criteria andModelFilepathEqualTo(String value) {
            addCriterion("Model_FilePath =", value, "modelFilepath");
            return (Criteria) this;
        }

        public Criteria andModelFilepathNotEqualTo(String value) {
            addCriterion("Model_FilePath <>", value, "modelFilepath");
            return (Criteria) this;
        }

        public Criteria andModelFilepathGreaterThan(String value) {
            addCriterion("Model_FilePath >", value, "modelFilepath");
            return (Criteria) this;
        }

        public Criteria andModelFilepathGreaterThanOrEqualTo(String value) {
            addCriterion("Model_FilePath >=", value, "modelFilepath");
            return (Criteria) this;
        }

        public Criteria andModelFilepathLessThan(String value) {
            addCriterion("Model_FilePath <", value, "modelFilepath");
            return (Criteria) this;
        }

        public Criteria andModelFilepathLessThanOrEqualTo(String value) {
            addCriterion("Model_FilePath <=", value, "modelFilepath");
            return (Criteria) this;
        }

        public Criteria andModelFilepathLike(String value) {
            addCriterion("Model_FilePath like", value, "modelFilepath");
            return (Criteria) this;
        }

        public Criteria andModelFilepathNotLike(String value) {
            addCriterion("Model_FilePath not like", value, "modelFilepath");
            return (Criteria) this;
        }

        public Criteria andModelFilepathIn(List<String> values) {
            addCriterion("Model_FilePath in", values, "modelFilepath");
            return (Criteria) this;
        }

        public Criteria andModelFilepathNotIn(List<String> values) {
            addCriterion("Model_FilePath not in", values, "modelFilepath");
            return (Criteria) this;
        }

        public Criteria andModelFilepathBetween(String value1, String value2) {
            addCriterion("Model_FilePath between", value1, value2, "modelFilepath");
            return (Criteria) this;
        }

        public Criteria andModelFilepathNotBetween(String value1, String value2) {
            addCriterion("Model_FilePath not between", value1, value2, "modelFilepath");
            return (Criteria) this;
        }

        public Criteria andSceneIdIsNull() {
            addCriterion("Scene_ID is null");
            return (Criteria) this;
        }

        public Criteria andSceneIdIsNotNull() {
            addCriterion("Scene_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSceneIdEqualTo(Integer value) {
            addCriterion("Scene_ID =", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotEqualTo(Integer value) {
            addCriterion("Scene_ID <>", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdGreaterThan(Integer value) {
            addCriterion("Scene_ID >", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Scene_ID >=", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLessThan(Integer value) {
            addCriterion("Scene_ID <", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLessThanOrEqualTo(Integer value) {
            addCriterion("Scene_ID <=", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdIn(List<Integer> values) {
            addCriterion("Scene_ID in", values, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotIn(List<Integer> values) {
            addCriterion("Scene_ID not in", values, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdBetween(Integer value1, Integer value2) {
            addCriterion("Scene_ID between", value1, value2, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Scene_ID not between", value1, value2, "sceneId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("Create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("Create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("Create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("Create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("Create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("Create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("Create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("Create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("Create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("Create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("Create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("Update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("Update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("Update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("Update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("Update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("Update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("Update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("Update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("Update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("Update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("Update_time not between", value1, value2, "updateTime");
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