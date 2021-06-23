package com.xiaoming.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyCameraExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyCameraExample() {
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

        public Criteria andCameraTitleIsNull() {
            addCriterion("Camera_Title is null");
            return (Criteria) this;
        }

        public Criteria andCameraTitleIsNotNull() {
            addCriterion("Camera_Title is not null");
            return (Criteria) this;
        }

        public Criteria andCameraTitleEqualTo(String value) {
            addCriterion("Camera_Title =", value, "cameraTitle");
            return (Criteria) this;
        }

        public Criteria andCameraTitleNotEqualTo(String value) {
            addCriterion("Camera_Title <>", value, "cameraTitle");
            return (Criteria) this;
        }

        public Criteria andCameraTitleGreaterThan(String value) {
            addCriterion("Camera_Title >", value, "cameraTitle");
            return (Criteria) this;
        }

        public Criteria andCameraTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Camera_Title >=", value, "cameraTitle");
            return (Criteria) this;
        }

        public Criteria andCameraTitleLessThan(String value) {
            addCriterion("Camera_Title <", value, "cameraTitle");
            return (Criteria) this;
        }

        public Criteria andCameraTitleLessThanOrEqualTo(String value) {
            addCriterion("Camera_Title <=", value, "cameraTitle");
            return (Criteria) this;
        }

        public Criteria andCameraTitleLike(String value) {
            addCriterion("Camera_Title like", value, "cameraTitle");
            return (Criteria) this;
        }

        public Criteria andCameraTitleNotLike(String value) {
            addCriterion("Camera_Title not like", value, "cameraTitle");
            return (Criteria) this;
        }

        public Criteria andCameraTitleIn(List<String> values) {
            addCriterion("Camera_Title in", values, "cameraTitle");
            return (Criteria) this;
        }

        public Criteria andCameraTitleNotIn(List<String> values) {
            addCriterion("Camera_Title not in", values, "cameraTitle");
            return (Criteria) this;
        }

        public Criteria andCameraTitleBetween(String value1, String value2) {
            addCriterion("Camera_Title between", value1, value2, "cameraTitle");
            return (Criteria) this;
        }

        public Criteria andCameraTitleNotBetween(String value1, String value2) {
            addCriterion("Camera_Title not between", value1, value2, "cameraTitle");
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

        public Criteria andCameraNearIsNull() {
            addCriterion("Camera_near is null");
            return (Criteria) this;
        }

        public Criteria andCameraNearIsNotNull() {
            addCriterion("Camera_near is not null");
            return (Criteria) this;
        }

        public Criteria andCameraNearEqualTo(Float value) {
            addCriterion("Camera_near =", value, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraNearNotEqualTo(Float value) {
            addCriterion("Camera_near <>", value, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraNearGreaterThan(Float value) {
            addCriterion("Camera_near >", value, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraNearGreaterThanOrEqualTo(Float value) {
            addCriterion("Camera_near >=", value, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraNearLessThan(Float value) {
            addCriterion("Camera_near <", value, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraNearLessThanOrEqualTo(Float value) {
            addCriterion("Camera_near <=", value, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraNearIn(List<Float> values) {
            addCriterion("Camera_near in", values, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraNearNotIn(List<Float> values) {
            addCriterion("Camera_near not in", values, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraNearBetween(Float value1, Float value2) {
            addCriterion("Camera_near between", value1, value2, "cameraNear");
            return (Criteria) this;
        }

        public Criteria andCameraNearNotBetween(Float value1, Float value2) {
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

        public Criteria andCameraFarEqualTo(Float value) {
            addCriterion("Camera_Far =", value, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraFarNotEqualTo(Float value) {
            addCriterion("Camera_Far <>", value, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraFarGreaterThan(Float value) {
            addCriterion("Camera_Far >", value, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraFarGreaterThanOrEqualTo(Float value) {
            addCriterion("Camera_Far >=", value, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraFarLessThan(Float value) {
            addCriterion("Camera_Far <", value, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraFarLessThanOrEqualTo(Float value) {
            addCriterion("Camera_Far <=", value, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraFarIn(List<Float> values) {
            addCriterion("Camera_Far in", values, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraFarNotIn(List<Float> values) {
            addCriterion("Camera_Far not in", values, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraFarBetween(Float value1, Float value2) {
            addCriterion("Camera_Far between", value1, value2, "cameraFar");
            return (Criteria) this;
        }

        public Criteria andCameraFarNotBetween(Float value1, Float value2) {
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

        public Criteria andCameraUpXIsNull() {
            addCriterion("Camera_Up_X is null");
            return (Criteria) this;
        }

        public Criteria andCameraUpXIsNotNull() {
            addCriterion("Camera_Up_X is not null");
            return (Criteria) this;
        }

        public Criteria andCameraUpXEqualTo(Float value) {
            addCriterion("Camera_Up_X =", value, "cameraUpX");
            return (Criteria) this;
        }

        public Criteria andCameraUpXNotEqualTo(Float value) {
            addCriterion("Camera_Up_X <>", value, "cameraUpX");
            return (Criteria) this;
        }

        public Criteria andCameraUpXGreaterThan(Float value) {
            addCriterion("Camera_Up_X >", value, "cameraUpX");
            return (Criteria) this;
        }

        public Criteria andCameraUpXGreaterThanOrEqualTo(Float value) {
            addCriterion("Camera_Up_X >=", value, "cameraUpX");
            return (Criteria) this;
        }

        public Criteria andCameraUpXLessThan(Float value) {
            addCriterion("Camera_Up_X <", value, "cameraUpX");
            return (Criteria) this;
        }

        public Criteria andCameraUpXLessThanOrEqualTo(Float value) {
            addCriterion("Camera_Up_X <=", value, "cameraUpX");
            return (Criteria) this;
        }

        public Criteria andCameraUpXIn(List<Float> values) {
            addCriterion("Camera_Up_X in", values, "cameraUpX");
            return (Criteria) this;
        }

        public Criteria andCameraUpXNotIn(List<Float> values) {
            addCriterion("Camera_Up_X not in", values, "cameraUpX");
            return (Criteria) this;
        }

        public Criteria andCameraUpXBetween(Float value1, Float value2) {
            addCriterion("Camera_Up_X between", value1, value2, "cameraUpX");
            return (Criteria) this;
        }

        public Criteria andCameraUpXNotBetween(Float value1, Float value2) {
            addCriterion("Camera_Up_X not between", value1, value2, "cameraUpX");
            return (Criteria) this;
        }

        public Criteria andCameraUpYIsNull() {
            addCriterion("Camera_Up_Y is null");
            return (Criteria) this;
        }

        public Criteria andCameraUpYIsNotNull() {
            addCriterion("Camera_Up_Y is not null");
            return (Criteria) this;
        }

        public Criteria andCameraUpYEqualTo(Float value) {
            addCriterion("Camera_Up_Y =", value, "cameraUpY");
            return (Criteria) this;
        }

        public Criteria andCameraUpYNotEqualTo(Float value) {
            addCriterion("Camera_Up_Y <>", value, "cameraUpY");
            return (Criteria) this;
        }

        public Criteria andCameraUpYGreaterThan(Float value) {
            addCriterion("Camera_Up_Y >", value, "cameraUpY");
            return (Criteria) this;
        }

        public Criteria andCameraUpYGreaterThanOrEqualTo(Float value) {
            addCriterion("Camera_Up_Y >=", value, "cameraUpY");
            return (Criteria) this;
        }

        public Criteria andCameraUpYLessThan(Float value) {
            addCriterion("Camera_Up_Y <", value, "cameraUpY");
            return (Criteria) this;
        }

        public Criteria andCameraUpYLessThanOrEqualTo(Float value) {
            addCriterion("Camera_Up_Y <=", value, "cameraUpY");
            return (Criteria) this;
        }

        public Criteria andCameraUpYIn(List<Float> values) {
            addCriterion("Camera_Up_Y in", values, "cameraUpY");
            return (Criteria) this;
        }

        public Criteria andCameraUpYNotIn(List<Float> values) {
            addCriterion("Camera_Up_Y not in", values, "cameraUpY");
            return (Criteria) this;
        }

        public Criteria andCameraUpYBetween(Float value1, Float value2) {
            addCriterion("Camera_Up_Y between", value1, value2, "cameraUpY");
            return (Criteria) this;
        }

        public Criteria andCameraUpYNotBetween(Float value1, Float value2) {
            addCriterion("Camera_Up_Y not between", value1, value2, "cameraUpY");
            return (Criteria) this;
        }

        public Criteria andCmaeraUpZIsNull() {
            addCriterion("Cmaera_Up_Z is null");
            return (Criteria) this;
        }

        public Criteria andCmaeraUpZIsNotNull() {
            addCriterion("Cmaera_Up_Z is not null");
            return (Criteria) this;
        }

        public Criteria andCmaeraUpZEqualTo(Float value) {
            addCriterion("Cmaera_Up_Z =", value, "cmaeraUpZ");
            return (Criteria) this;
        }

        public Criteria andCmaeraUpZNotEqualTo(Float value) {
            addCriterion("Cmaera_Up_Z <>", value, "cmaeraUpZ");
            return (Criteria) this;
        }

        public Criteria andCmaeraUpZGreaterThan(Float value) {
            addCriterion("Cmaera_Up_Z >", value, "cmaeraUpZ");
            return (Criteria) this;
        }

        public Criteria andCmaeraUpZGreaterThanOrEqualTo(Float value) {
            addCriterion("Cmaera_Up_Z >=", value, "cmaeraUpZ");
            return (Criteria) this;
        }

        public Criteria andCmaeraUpZLessThan(Float value) {
            addCriterion("Cmaera_Up_Z <", value, "cmaeraUpZ");
            return (Criteria) this;
        }

        public Criteria andCmaeraUpZLessThanOrEqualTo(Float value) {
            addCriterion("Cmaera_Up_Z <=", value, "cmaeraUpZ");
            return (Criteria) this;
        }

        public Criteria andCmaeraUpZIn(List<Float> values) {
            addCriterion("Cmaera_Up_Z in", values, "cmaeraUpZ");
            return (Criteria) this;
        }

        public Criteria andCmaeraUpZNotIn(List<Float> values) {
            addCriterion("Cmaera_Up_Z not in", values, "cmaeraUpZ");
            return (Criteria) this;
        }

        public Criteria andCmaeraUpZBetween(Float value1, Float value2) {
            addCriterion("Cmaera_Up_Z between", value1, value2, "cmaeraUpZ");
            return (Criteria) this;
        }

        public Criteria andCmaeraUpZNotBetween(Float value1, Float value2) {
            addCriterion("Cmaera_Up_Z not between", value1, value2, "cmaeraUpZ");
            return (Criteria) this;
        }

        public Criteria andCameraLookatXIsNull() {
            addCriterion("Camera_LookAt_X is null");
            return (Criteria) this;
        }

        public Criteria andCameraLookatXIsNotNull() {
            addCriterion("Camera_LookAt_X is not null");
            return (Criteria) this;
        }

        public Criteria andCameraLookatXEqualTo(Float value) {
            addCriterion("Camera_LookAt_X =", value, "cameraLookatX");
            return (Criteria) this;
        }

        public Criteria andCameraLookatXNotEqualTo(Float value) {
            addCriterion("Camera_LookAt_X <>", value, "cameraLookatX");
            return (Criteria) this;
        }

        public Criteria andCameraLookatXGreaterThan(Float value) {
            addCriterion("Camera_LookAt_X >", value, "cameraLookatX");
            return (Criteria) this;
        }

        public Criteria andCameraLookatXGreaterThanOrEqualTo(Float value) {
            addCriterion("Camera_LookAt_X >=", value, "cameraLookatX");
            return (Criteria) this;
        }

        public Criteria andCameraLookatXLessThan(Float value) {
            addCriterion("Camera_LookAt_X <", value, "cameraLookatX");
            return (Criteria) this;
        }

        public Criteria andCameraLookatXLessThanOrEqualTo(Float value) {
            addCriterion("Camera_LookAt_X <=", value, "cameraLookatX");
            return (Criteria) this;
        }

        public Criteria andCameraLookatXIn(List<Float> values) {
            addCriterion("Camera_LookAt_X in", values, "cameraLookatX");
            return (Criteria) this;
        }

        public Criteria andCameraLookatXNotIn(List<Float> values) {
            addCriterion("Camera_LookAt_X not in", values, "cameraLookatX");
            return (Criteria) this;
        }

        public Criteria andCameraLookatXBetween(Float value1, Float value2) {
            addCriterion("Camera_LookAt_X between", value1, value2, "cameraLookatX");
            return (Criteria) this;
        }

        public Criteria andCameraLookatXNotBetween(Float value1, Float value2) {
            addCriterion("Camera_LookAt_X not between", value1, value2, "cameraLookatX");
            return (Criteria) this;
        }

        public Criteria andCameraLookatYIsNull() {
            addCriterion("Camera_LookAt_Y is null");
            return (Criteria) this;
        }

        public Criteria andCameraLookatYIsNotNull() {
            addCriterion("Camera_LookAt_Y is not null");
            return (Criteria) this;
        }

        public Criteria andCameraLookatYEqualTo(Float value) {
            addCriterion("Camera_LookAt_Y =", value, "cameraLookatY");
            return (Criteria) this;
        }

        public Criteria andCameraLookatYNotEqualTo(Float value) {
            addCriterion("Camera_LookAt_Y <>", value, "cameraLookatY");
            return (Criteria) this;
        }

        public Criteria andCameraLookatYGreaterThan(Float value) {
            addCriterion("Camera_LookAt_Y >", value, "cameraLookatY");
            return (Criteria) this;
        }

        public Criteria andCameraLookatYGreaterThanOrEqualTo(Float value) {
            addCriterion("Camera_LookAt_Y >=", value, "cameraLookatY");
            return (Criteria) this;
        }

        public Criteria andCameraLookatYLessThan(Float value) {
            addCriterion("Camera_LookAt_Y <", value, "cameraLookatY");
            return (Criteria) this;
        }

        public Criteria andCameraLookatYLessThanOrEqualTo(Float value) {
            addCriterion("Camera_LookAt_Y <=", value, "cameraLookatY");
            return (Criteria) this;
        }

        public Criteria andCameraLookatYIn(List<Float> values) {
            addCriterion("Camera_LookAt_Y in", values, "cameraLookatY");
            return (Criteria) this;
        }

        public Criteria andCameraLookatYNotIn(List<Float> values) {
            addCriterion("Camera_LookAt_Y not in", values, "cameraLookatY");
            return (Criteria) this;
        }

        public Criteria andCameraLookatYBetween(Float value1, Float value2) {
            addCriterion("Camera_LookAt_Y between", value1, value2, "cameraLookatY");
            return (Criteria) this;
        }

        public Criteria andCameraLookatYNotBetween(Float value1, Float value2) {
            addCriterion("Camera_LookAt_Y not between", value1, value2, "cameraLookatY");
            return (Criteria) this;
        }

        public Criteria andCameraLookatZIsNull() {
            addCriterion("Camera_LookAt_Z is null");
            return (Criteria) this;
        }

        public Criteria andCameraLookatZIsNotNull() {
            addCriterion("Camera_LookAt_Z is not null");
            return (Criteria) this;
        }

        public Criteria andCameraLookatZEqualTo(Float value) {
            addCriterion("Camera_LookAt_Z =", value, "cameraLookatZ");
            return (Criteria) this;
        }

        public Criteria andCameraLookatZNotEqualTo(Float value) {
            addCriterion("Camera_LookAt_Z <>", value, "cameraLookatZ");
            return (Criteria) this;
        }

        public Criteria andCameraLookatZGreaterThan(Float value) {
            addCriterion("Camera_LookAt_Z >", value, "cameraLookatZ");
            return (Criteria) this;
        }

        public Criteria andCameraLookatZGreaterThanOrEqualTo(Float value) {
            addCriterion("Camera_LookAt_Z >=", value, "cameraLookatZ");
            return (Criteria) this;
        }

        public Criteria andCameraLookatZLessThan(Float value) {
            addCriterion("Camera_LookAt_Z <", value, "cameraLookatZ");
            return (Criteria) this;
        }

        public Criteria andCameraLookatZLessThanOrEqualTo(Float value) {
            addCriterion("Camera_LookAt_Z <=", value, "cameraLookatZ");
            return (Criteria) this;
        }

        public Criteria andCameraLookatZIn(List<Float> values) {
            addCriterion("Camera_LookAt_Z in", values, "cameraLookatZ");
            return (Criteria) this;
        }

        public Criteria andCameraLookatZNotIn(List<Float> values) {
            addCriterion("Camera_LookAt_Z not in", values, "cameraLookatZ");
            return (Criteria) this;
        }

        public Criteria andCameraLookatZBetween(Float value1, Float value2) {
            addCriterion("Camera_LookAt_Z between", value1, value2, "cameraLookatZ");
            return (Criteria) this;
        }

        public Criteria andCameraLookatZNotBetween(Float value1, Float value2) {
            addCriterion("Camera_LookAt_Z not between", value1, value2, "cameraLookatZ");
            return (Criteria) this;
        }

        public Criteria andSceneIdIsNull() {
            addCriterion("scene_id is null");
            return (Criteria) this;
        }

        public Criteria andSceneIdIsNotNull() {
            addCriterion("scene_id is not null");
            return (Criteria) this;
        }

        public Criteria andSceneIdEqualTo(Integer value) {
            addCriterion("scene_id =", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotEqualTo(Integer value) {
            addCriterion("scene_id <>", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdGreaterThan(Integer value) {
            addCriterion("scene_id >", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("scene_id >=", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLessThan(Integer value) {
            addCriterion("scene_id <", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdLessThanOrEqualTo(Integer value) {
            addCriterion("scene_id <=", value, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdIn(List<Integer> values) {
            addCriterion("scene_id in", values, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotIn(List<Integer> values) {
            addCriterion("scene_id not in", values, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdBetween(Integer value1, Integer value2) {
            addCriterion("scene_id between", value1, value2, "sceneId");
            return (Criteria) this;
        }

        public Criteria andSceneIdNotBetween(Integer value1, Integer value2) {
            addCriterion("scene_id not between", value1, value2, "sceneId");
            return (Criteria) this;
        }

        public Criteria andCameraFieldOfViewIsNull() {
            addCriterion("Camera_field_of_view is null");
            return (Criteria) this;
        }

        public Criteria andCameraFieldOfViewIsNotNull() {
            addCriterion("Camera_field_of_view is not null");
            return (Criteria) this;
        }

        public Criteria andCameraFieldOfViewEqualTo(Integer value) {
            addCriterion("Camera_field_of_view =", value, "cameraFieldOfView");
            return (Criteria) this;
        }

        public Criteria andCameraFieldOfViewNotEqualTo(Integer value) {
            addCriterion("Camera_field_of_view <>", value, "cameraFieldOfView");
            return (Criteria) this;
        }

        public Criteria andCameraFieldOfViewGreaterThan(Integer value) {
            addCriterion("Camera_field_of_view >", value, "cameraFieldOfView");
            return (Criteria) this;
        }

        public Criteria andCameraFieldOfViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("Camera_field_of_view >=", value, "cameraFieldOfView");
            return (Criteria) this;
        }

        public Criteria andCameraFieldOfViewLessThan(Integer value) {
            addCriterion("Camera_field_of_view <", value, "cameraFieldOfView");
            return (Criteria) this;
        }

        public Criteria andCameraFieldOfViewLessThanOrEqualTo(Integer value) {
            addCriterion("Camera_field_of_view <=", value, "cameraFieldOfView");
            return (Criteria) this;
        }

        public Criteria andCameraFieldOfViewIn(List<Integer> values) {
            addCriterion("Camera_field_of_view in", values, "cameraFieldOfView");
            return (Criteria) this;
        }

        public Criteria andCameraFieldOfViewNotIn(List<Integer> values) {
            addCriterion("Camera_field_of_view not in", values, "cameraFieldOfView");
            return (Criteria) this;
        }

        public Criteria andCameraFieldOfViewBetween(Integer value1, Integer value2) {
            addCriterion("Camera_field_of_view between", value1, value2, "cameraFieldOfView");
            return (Criteria) this;
        }

        public Criteria andCameraFieldOfViewNotBetween(Integer value1, Integer value2) {
            addCriterion("Camera_field_of_view not between", value1, value2, "cameraFieldOfView");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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