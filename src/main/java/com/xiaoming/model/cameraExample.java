package com.xiaoming.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class cameraExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public cameraExample() {
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

        public Criteria andCameraIdIsNull() {
            addCriterion("Camera_ID is null");
            return (Criteria) this;
        }

        public Criteria andCameraIdIsNotNull() {
            addCriterion("Camera_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCameraIdEqualTo(Integer value) {
            addCriterion("Camera_ID =", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdNotEqualTo(Integer value) {
            addCriterion("Camera_ID <>", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdGreaterThan(Integer value) {
            addCriterion("Camera_ID >", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Camera_ID >=", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdLessThan(Integer value) {
            addCriterion("Camera_ID <", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdLessThanOrEqualTo(Integer value) {
            addCriterion("Camera_ID <=", value, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdIn(List<Integer> values) {
            addCriterion("Camera_ID in", values, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdNotIn(List<Integer> values) {
            addCriterion("Camera_ID not in", values, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdBetween(Integer value1, Integer value2) {
            addCriterion("Camera_ID between", value1, value2, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Camera_ID not between", value1, value2, "cameraId");
            return (Criteria) this;
        }

        public Criteria andCameraTypeIsNull() {
            addCriterion("Camera_Type is null");
            return (Criteria) this;
        }

        public Criteria andCameraTypeIsNotNull() {
            addCriterion("Camera_Type is not null");
            return (Criteria) this;
        }

        public Criteria andCameraTypeEqualTo(String value) {
            addCriterion("Camera_Type =", value, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeNotEqualTo(String value) {
            addCriterion("Camera_Type <>", value, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeGreaterThan(String value) {
            addCriterion("Camera_Type >", value, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Camera_Type >=", value, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeLessThan(String value) {
            addCriterion("Camera_Type <", value, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeLessThanOrEqualTo(String value) {
            addCriterion("Camera_Type <=", value, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeLike(String value) {
            addCriterion("Camera_Type like", value, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeNotLike(String value) {
            addCriterion("Camera_Type not like", value, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeIn(List<String> values) {
            addCriterion("Camera_Type in", values, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeNotIn(List<String> values) {
            addCriterion("Camera_Type not in", values, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeBetween(String value1, String value2) {
            addCriterion("Camera_Type between", value1, value2, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraTypeNotBetween(String value1, String value2) {
            addCriterion("Camera_Type not between", value1, value2, "cameraType");
            return (Criteria) this;
        }

        public Criteria andCameraLeftIsNull() {
            addCriterion("Camera_Left is null");
            return (Criteria) this;
        }

        public Criteria andCameraLeftIsNotNull() {
            addCriterion("Camera_Left is not null");
            return (Criteria) this;
        }

        public Criteria andCameraLeftEqualTo(Integer value) {
            addCriterion("Camera_Left =", value, "cameraLeft");
            return (Criteria) this;
        }

        public Criteria andCameraLeftNotEqualTo(Integer value) {
            addCriterion("Camera_Left <>", value, "cameraLeft");
            return (Criteria) this;
        }

        public Criteria andCameraLeftGreaterThan(Integer value) {
            addCriterion("Camera_Left >", value, "cameraLeft");
            return (Criteria) this;
        }

        public Criteria andCameraLeftGreaterThanOrEqualTo(Integer value) {
            addCriterion("Camera_Left >=", value, "cameraLeft");
            return (Criteria) this;
        }

        public Criteria andCameraLeftLessThan(Integer value) {
            addCriterion("Camera_Left <", value, "cameraLeft");
            return (Criteria) this;
        }

        public Criteria andCameraLeftLessThanOrEqualTo(Integer value) {
            addCriterion("Camera_Left <=", value, "cameraLeft");
            return (Criteria) this;
        }

        public Criteria andCameraLeftIn(List<Integer> values) {
            addCriterion("Camera_Left in", values, "cameraLeft");
            return (Criteria) this;
        }

        public Criteria andCameraLeftNotIn(List<Integer> values) {
            addCriterion("Camera_Left not in", values, "cameraLeft");
            return (Criteria) this;
        }

        public Criteria andCameraLeftBetween(Integer value1, Integer value2) {
            addCriterion("Camera_Left between", value1, value2, "cameraLeft");
            return (Criteria) this;
        }

        public Criteria andCameraLeftNotBetween(Integer value1, Integer value2) {
            addCriterion("Camera_Left not between", value1, value2, "cameraLeft");
            return (Criteria) this;
        }

        public Criteria andCameraRightIsNull() {
            addCriterion("Camera_Right is null");
            return (Criteria) this;
        }

        public Criteria andCameraRightIsNotNull() {
            addCriterion("Camera_Right is not null");
            return (Criteria) this;
        }

        public Criteria andCameraRightEqualTo(Integer value) {
            addCriterion("Camera_Right =", value, "cameraRight");
            return (Criteria) this;
        }

        public Criteria andCameraRightNotEqualTo(Integer value) {
            addCriterion("Camera_Right <>", value, "cameraRight");
            return (Criteria) this;
        }

        public Criteria andCameraRightGreaterThan(Integer value) {
            addCriterion("Camera_Right >", value, "cameraRight");
            return (Criteria) this;
        }

        public Criteria andCameraRightGreaterThanOrEqualTo(Integer value) {
            addCriterion("Camera_Right >=", value, "cameraRight");
            return (Criteria) this;
        }

        public Criteria andCameraRightLessThan(Integer value) {
            addCriterion("Camera_Right <", value, "cameraRight");
            return (Criteria) this;
        }

        public Criteria andCameraRightLessThanOrEqualTo(Integer value) {
            addCriterion("Camera_Right <=", value, "cameraRight");
            return (Criteria) this;
        }

        public Criteria andCameraRightIn(List<Integer> values) {
            addCriterion("Camera_Right in", values, "cameraRight");
            return (Criteria) this;
        }

        public Criteria andCameraRightNotIn(List<Integer> values) {
            addCriterion("Camera_Right not in", values, "cameraRight");
            return (Criteria) this;
        }

        public Criteria andCameraRightBetween(Integer value1, Integer value2) {
            addCriterion("Camera_Right between", value1, value2, "cameraRight");
            return (Criteria) this;
        }

        public Criteria andCameraRightNotBetween(Integer value1, Integer value2) {
            addCriterion("Camera_Right not between", value1, value2, "cameraRight");
            return (Criteria) this;
        }

        public Criteria andCameraTopIsNull() {
            addCriterion("Camera_Top is null");
            return (Criteria) this;
        }

        public Criteria andCameraTopIsNotNull() {
            addCriterion("Camera_Top is not null");
            return (Criteria) this;
        }

        public Criteria andCameraTopEqualTo(Integer value) {
            addCriterion("Camera_Top =", value, "cameraTop");
            return (Criteria) this;
        }

        public Criteria andCameraTopNotEqualTo(Integer value) {
            addCriterion("Camera_Top <>", value, "cameraTop");
            return (Criteria) this;
        }

        public Criteria andCameraTopGreaterThan(Integer value) {
            addCriterion("Camera_Top >", value, "cameraTop");
            return (Criteria) this;
        }

        public Criteria andCameraTopGreaterThanOrEqualTo(Integer value) {
            addCriterion("Camera_Top >=", value, "cameraTop");
            return (Criteria) this;
        }

        public Criteria andCameraTopLessThan(Integer value) {
            addCriterion("Camera_Top <", value, "cameraTop");
            return (Criteria) this;
        }

        public Criteria andCameraTopLessThanOrEqualTo(Integer value) {
            addCriterion("Camera_Top <=", value, "cameraTop");
            return (Criteria) this;
        }

        public Criteria andCameraTopIn(List<Integer> values) {
            addCriterion("Camera_Top in", values, "cameraTop");
            return (Criteria) this;
        }

        public Criteria andCameraTopNotIn(List<Integer> values) {
            addCriterion("Camera_Top not in", values, "cameraTop");
            return (Criteria) this;
        }

        public Criteria andCameraTopBetween(Integer value1, Integer value2) {
            addCriterion("Camera_Top between", value1, value2, "cameraTop");
            return (Criteria) this;
        }

        public Criteria andCameraTopNotBetween(Integer value1, Integer value2) {
            addCriterion("Camera_Top not between", value1, value2, "cameraTop");
            return (Criteria) this;
        }

        public Criteria andCameraBottomIsNull() {
            addCriterion("Camera_Bottom is null");
            return (Criteria) this;
        }

        public Criteria andCameraBottomIsNotNull() {
            addCriterion("Camera_Bottom is not null");
            return (Criteria) this;
        }

        public Criteria andCameraBottomEqualTo(Integer value) {
            addCriterion("Camera_Bottom =", value, "cameraBottom");
            return (Criteria) this;
        }

        public Criteria andCameraBottomNotEqualTo(Integer value) {
            addCriterion("Camera_Bottom <>", value, "cameraBottom");
            return (Criteria) this;
        }

        public Criteria andCameraBottomGreaterThan(Integer value) {
            addCriterion("Camera_Bottom >", value, "cameraBottom");
            return (Criteria) this;
        }

        public Criteria andCameraBottomGreaterThanOrEqualTo(Integer value) {
            addCriterion("Camera_Bottom >=", value, "cameraBottom");
            return (Criteria) this;
        }

        public Criteria andCameraBottomLessThan(Integer value) {
            addCriterion("Camera_Bottom <", value, "cameraBottom");
            return (Criteria) this;
        }

        public Criteria andCameraBottomLessThanOrEqualTo(Integer value) {
            addCriterion("Camera_Bottom <=", value, "cameraBottom");
            return (Criteria) this;
        }

        public Criteria andCameraBottomIn(List<Integer> values) {
            addCriterion("Camera_Bottom in", values, "cameraBottom");
            return (Criteria) this;
        }

        public Criteria andCameraBottomNotIn(List<Integer> values) {
            addCriterion("Camera_Bottom not in", values, "cameraBottom");
            return (Criteria) this;
        }

        public Criteria andCameraBottomBetween(Integer value1, Integer value2) {
            addCriterion("Camera_Bottom between", value1, value2, "cameraBottom");
            return (Criteria) this;
        }

        public Criteria andCameraBottomNotBetween(Integer value1, Integer value2) {
            addCriterion("Camera_Bottom not between", value1, value2, "cameraBottom");
            return (Criteria) this;
        }

        public Criteria andCameraNearIsNull() {
            addCriterion("Camera_near is null");
            return (Criteria) this;
        }

        public Criteria andCameraNearIsNotNull() {
            addCriterion("Camera_near is not null");
            return (Criteria) this;
        }

        public Criteria andCameraNearEqualTo(Integer value) {
            addCriterion("Camera_near =", value, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraNearNotEqualTo(Integer value) {
            addCriterion("Camera_near <>", value, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraNearGreaterThan(Integer value) {
            addCriterion("Camera_near >", value, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraNearGreaterThanOrEqualTo(Integer value) {
            addCriterion("Camera_near >=", value, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraNearLessThan(Integer value) {
            addCriterion("Camera_near <", value, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraNearLessThanOrEqualTo(Integer value) {
            addCriterion("Camera_near <=", value, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraNearIn(List<Integer> values) {
            addCriterion("Camera_near in", values, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraNearNotIn(List<Integer> values) {
            addCriterion("Camera_near not in", values, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraNearBetween(Integer value1, Integer value2) {
            addCriterion("Camera_near between", value1, value2, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraNearNotBetween(Integer value1, Integer value2) {
            addCriterion("Camera_near not between", value1, value2, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraFarIsNull() {
            addCriterion("Camera_Far is null");
            return (Criteria) this;
        }

        public Criteria andCameraFarIsNotNull() {
            addCriterion("Camera_Far is not null");
            return (Criteria) this;
        }

        public Criteria andCameraFarEqualTo(Integer value) {
            addCriterion("Camera_Far =", value, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraFarNotEqualTo(Integer value) {
            addCriterion("Camera_Far <>", value, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraFarGreaterThan(Integer value) {
            addCriterion("Camera_Far >", value, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraFarGreaterThanOrEqualTo(Integer value) {
            addCriterion("Camera_Far >=", value, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraFarLessThan(Integer value) {
            addCriterion("Camera_Far <", value, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraFarLessThanOrEqualTo(Integer value) {
            addCriterion("Camera_Far <=", value, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraFarIn(List<Integer> values) {
            addCriterion("Camera_Far in", values, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraFarNotIn(List<Integer> values) {
            addCriterion("Camera_Far not in", values, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraFarBetween(Integer value1, Integer value2) {
            addCriterion("Camera_Far between", value1, value2, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraFarNotBetween(Integer value1, Integer value2) {
            addCriterion("Camera_Far not between", value1, value2, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraVisibilityIsNull() {
            addCriterion("Camera_Visibility is null");
            return (Criteria) this;
        }

        public Criteria andCameraVisibilityIsNotNull() {
            addCriterion("Camera_Visibility is not null");
            return (Criteria) this;
        }

        public Criteria andCameraVisibilityEqualTo(String value) {
            addCriterion("Camera_Visibility =", value, "cameraVisibility");
            return (Criteria) this;
        }

        public Criteria andCameraVisibilityNotEqualTo(String value) {
            addCriterion("Camera_Visibility <>", value, "cameraVisibility");
            return (Criteria) this;
        }

        public Criteria andCameraVisibilityGreaterThan(String value) {
            addCriterion("Camera_Visibility >", value, "cameraVisibility");
            return (Criteria) this;
        }

        public Criteria andCameraVisibilityGreaterThanOrEqualTo(String value) {
            addCriterion("Camera_Visibility >=", value, "cameraVisibility");
            return (Criteria) this;
        }

        public Criteria andCameraVisibilityLessThan(String value) {
            addCriterion("Camera_Visibility <", value, "cameraVisibility");
            return (Criteria) this;
        }

        public Criteria andCameraVisibilityLessThanOrEqualTo(String value) {
            addCriterion("Camera_Visibility <=", value, "cameraVisibility");
            return (Criteria) this;
        }

        public Criteria andCameraVisibilityLike(String value) {
            addCriterion("Camera_Visibility like", value, "cameraVisibility");
            return (Criteria) this;
        }

        public Criteria andCameraVisibilityNotLike(String value) {
            addCriterion("Camera_Visibility not like", value, "cameraVisibility");
            return (Criteria) this;
        }

        public Criteria andCameraVisibilityIn(List<String> values) {
            addCriterion("Camera_Visibility in", values, "cameraVisibility");
            return (Criteria) this;
        }

        public Criteria andCameraVisibilityNotIn(List<String> values) {
            addCriterion("Camera_Visibility not in", values, "cameraVisibility");
            return (Criteria) this;
        }

        public Criteria andCameraVisibilityBetween(String value1, String value2) {
            addCriterion("Camera_Visibility between", value1, value2, "cameraVisibility");
            return (Criteria) this;
        }

        public Criteria andCameraVisibilityNotBetween(String value1, String value2) {
            addCriterion("Camera_Visibility not between", value1, value2, "cameraVisibility");
            return (Criteria) this;
        }

        public Criteria andCameraPositionXIsNull() {
            addCriterion("Camera_Position_X is null");
            return (Criteria) this;
        }

        public Criteria andCameraPositionXIsNotNull() {
            addCriterion("Camera_Position_X is not null");
            return (Criteria) this;
        }

        public Criteria andCameraPositionXEqualTo(Float value) {
            addCriterion("Camera_Position_X =", value, "cameraPositionX");
            return (Criteria) this;
        }

        public Criteria andCameraPositionXNotEqualTo(Float value) {
            addCriterion("Camera_Position_X <>", value, "cameraPositionX");
            return (Criteria) this;
        }

        public Criteria andCameraPositionXGreaterThan(Float value) {
            addCriterion("Camera_Position_X >", value, "cameraPositionX");
            return (Criteria) this;
        }

        public Criteria andCameraPositionXGreaterThanOrEqualTo(Float value) {
            addCriterion("Camera_Position_X >=", value, "cameraPositionX");
            return (Criteria) this;
        }

        public Criteria andCameraPositionXLessThan(Float value) {
            addCriterion("Camera_Position_X <", value, "cameraPositionX");
            return (Criteria) this;
        }

        public Criteria andCameraPositionXLessThanOrEqualTo(Float value) {
            addCriterion("Camera_Position_X <=", value, "cameraPositionX");
            return (Criteria) this;
        }

        public Criteria andCameraPositionXIn(List<Float> values) {
            addCriterion("Camera_Position_X in", values, "cameraPositionX");
            return (Criteria) this;
        }

        public Criteria andCameraPositionXNotIn(List<Float> values) {
            addCriterion("Camera_Position_X not in", values, "cameraPositionX");
            return (Criteria) this;
        }

        public Criteria andCameraPositionXBetween(Float value1, Float value2) {
            addCriterion("Camera_Position_X between", value1, value2, "cameraPositionX");
            return (Criteria) this;
        }

        public Criteria andCameraPositionXNotBetween(Float value1, Float value2) {
            addCriterion("Camera_Position_X not between", value1, value2, "cameraPositionX");
            return (Criteria) this;
        }

        public Criteria andCameraPositionYIsNull() {
            addCriterion("Camera_Position_Y is null");
            return (Criteria) this;
        }

        public Criteria andCameraPositionYIsNotNull() {
            addCriterion("Camera_Position_Y is not null");
            return (Criteria) this;
        }

        public Criteria andCameraPositionYEqualTo(Float value) {
            addCriterion("Camera_Position_Y =", value, "cameraPositionY");
            return (Criteria) this;
        }

        public Criteria andCameraPositionYNotEqualTo(Float value) {
            addCriterion("Camera_Position_Y <>", value, "cameraPositionY");
            return (Criteria) this;
        }

        public Criteria andCameraPositionYGreaterThan(Float value) {
            addCriterion("Camera_Position_Y >", value, "cameraPositionY");
            return (Criteria) this;
        }

        public Criteria andCameraPositionYGreaterThanOrEqualTo(Float value) {
            addCriterion("Camera_Position_Y >=", value, "cameraPositionY");
            return (Criteria) this;
        }

        public Criteria andCameraPositionYLessThan(Float value) {
            addCriterion("Camera_Position_Y <", value, "cameraPositionY");
            return (Criteria) this;
        }

        public Criteria andCameraPositionYLessThanOrEqualTo(Float value) {
            addCriterion("Camera_Position_Y <=", value, "cameraPositionY");
            return (Criteria) this;
        }

        public Criteria andCameraPositionYIn(List<Float> values) {
            addCriterion("Camera_Position_Y in", values, "cameraPositionY");
            return (Criteria) this;
        }

        public Criteria andCameraPositionYNotIn(List<Float> values) {
            addCriterion("Camera_Position_Y not in", values, "cameraPositionY");
            return (Criteria) this;
        }

        public Criteria andCameraPositionYBetween(Float value1, Float value2) {
            addCriterion("Camera_Position_Y between", value1, value2, "cameraPositionY");
            return (Criteria) this;
        }

        public Criteria andCameraPositionYNotBetween(Float value1, Float value2) {
            addCriterion("Camera_Position_Y not between", value1, value2, "cameraPositionY");
            return (Criteria) this;
        }

        public Criteria andCameraPositionZIsNull() {
            addCriterion("Camera_Position_Z is null");
            return (Criteria) this;
        }

        public Criteria andCameraPositionZIsNotNull() {
            addCriterion("Camera_Position_Z is not null");
            return (Criteria) this;
        }

        public Criteria andCameraPositionZEqualTo(Float value) {
            addCriterion("Camera_Position_Z =", value, "cameraPositionZ");
            return (Criteria) this;
        }

        public Criteria andCameraPositionZNotEqualTo(Float value) {
            addCriterion("Camera_Position_Z <>", value, "cameraPositionZ");
            return (Criteria) this;
        }

        public Criteria andCameraPositionZGreaterThan(Float value) {
            addCriterion("Camera_Position_Z >", value, "cameraPositionZ");
            return (Criteria) this;
        }

        public Criteria andCameraPositionZGreaterThanOrEqualTo(Float value) {
            addCriterion("Camera_Position_Z >=", value, "cameraPositionZ");
            return (Criteria) this;
        }

        public Criteria andCameraPositionZLessThan(Float value) {
            addCriterion("Camera_Position_Z <", value, "cameraPositionZ");
            return (Criteria) this;
        }

        public Criteria andCameraPositionZLessThanOrEqualTo(Float value) {
            addCriterion("Camera_Position_Z <=", value, "cameraPositionZ");
            return (Criteria) this;
        }

        public Criteria andCameraPositionZIn(List<Float> values) {
            addCriterion("Camera_Position_Z in", values, "cameraPositionZ");
            return (Criteria) this;
        }

        public Criteria andCameraPositionZNotIn(List<Float> values) {
            addCriterion("Camera_Position_Z not in", values, "cameraPositionZ");
            return (Criteria) this;
        }

        public Criteria andCameraPositionZBetween(Float value1, Float value2) {
            addCriterion("Camera_Position_Z between", value1, value2, "cameraPositionZ");
            return (Criteria) this;
        }

        public Criteria andCameraPositionZNotBetween(Float value1, Float value2) {
            addCriterion("Camera_Position_Z not between", value1, value2, "cameraPositionZ");
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