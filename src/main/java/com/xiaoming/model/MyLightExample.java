package com.xiaoming.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyLightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyLightExample() {
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

        public Criteria andLightIdIsNull() {
            addCriterion("Light_ID is null");
            return (Criteria) this;
        }

        public Criteria andLightIdIsNotNull() {
            addCriterion("Light_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLightIdEqualTo(Integer value) {
            addCriterion("Light_ID =", value, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightIdNotEqualTo(Integer value) {
            addCriterion("Light_ID <>", value, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightIdGreaterThan(Integer value) {
            addCriterion("Light_ID >", value, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Light_ID >=", value, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightIdLessThan(Integer value) {
            addCriterion("Light_ID <", value, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightIdLessThanOrEqualTo(Integer value) {
            addCriterion("Light_ID <=", value, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightIdIn(List<Integer> values) {
            addCriterion("Light_ID in", values, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightIdNotIn(List<Integer> values) {
            addCriterion("Light_ID not in", values, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightIdBetween(Integer value1, Integer value2) {
            addCriterion("Light_ID between", value1, value2, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Light_ID not between", value1, value2, "lightId");
            return (Criteria) this;
        }

        public Criteria andLightTitleIsNull() {
            addCriterion("Light_title is null");
            return (Criteria) this;
        }

        public Criteria andLightTitleIsNotNull() {
            addCriterion("Light_title is not null");
            return (Criteria) this;
        }

        public Criteria andLightTitleEqualTo(String value) {
            addCriterion("Light_title =", value, "lightTitle");
            return (Criteria) this;
        }

        public Criteria andLightTitleNotEqualTo(String value) {
            addCriterion("Light_title <>", value, "lightTitle");
            return (Criteria) this;
        }

        public Criteria andLightTitleGreaterThan(String value) {
            addCriterion("Light_title >", value, "lightTitle");
            return (Criteria) this;
        }

        public Criteria andLightTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Light_title >=", value, "lightTitle");
            return (Criteria) this;
        }

        public Criteria andLightTitleLessThan(String value) {
            addCriterion("Light_title <", value, "lightTitle");
            return (Criteria) this;
        }

        public Criteria andLightTitleLessThanOrEqualTo(String value) {
            addCriterion("Light_title <=", value, "lightTitle");
            return (Criteria) this;
        }

        public Criteria andLightTitleLike(String value) {
            addCriterion("Light_title like", value, "lightTitle");
            return (Criteria) this;
        }

        public Criteria andLightTitleNotLike(String value) {
            addCriterion("Light_title not like", value, "lightTitle");
            return (Criteria) this;
        }

        public Criteria andLightTitleIn(List<String> values) {
            addCriterion("Light_title in", values, "lightTitle");
            return (Criteria) this;
        }

        public Criteria andLightTitleNotIn(List<String> values) {
            addCriterion("Light_title not in", values, "lightTitle");
            return (Criteria) this;
        }

        public Criteria andLightTitleBetween(String value1, String value2) {
            addCriterion("Light_title between", value1, value2, "lightTitle");
            return (Criteria) this;
        }

        public Criteria andLightTitleNotBetween(String value1, String value2) {
            addCriterion("Light_title not between", value1, value2, "lightTitle");
            return (Criteria) this;
        }

        public Criteria andLightTypeIsNull() {
            addCriterion("Light_Type is null");
            return (Criteria) this;
        }

        public Criteria andLightTypeIsNotNull() {
            addCriterion("Light_Type is not null");
            return (Criteria) this;
        }

        public Criteria andLightTypeEqualTo(String value) {
            addCriterion("Light_Type =", value, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeNotEqualTo(String value) {
            addCriterion("Light_Type <>", value, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeGreaterThan(String value) {
            addCriterion("Light_Type >", value, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeGreaterThanOrEqualTo(String value) {
            addCriterion("Light_Type >=", value, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeLessThan(String value) {
            addCriterion("Light_Type <", value, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeLessThanOrEqualTo(String value) {
            addCriterion("Light_Type <=", value, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeLike(String value) {
            addCriterion("Light_Type like", value, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeNotLike(String value) {
            addCriterion("Light_Type not like", value, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeIn(List<String> values) {
            addCriterion("Light_Type in", values, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeNotIn(List<String> values) {
            addCriterion("Light_Type not in", values, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeBetween(String value1, String value2) {
            addCriterion("Light_Type between", value1, value2, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightTypeNotBetween(String value1, String value2) {
            addCriterion("Light_Type not between", value1, value2, "lightType");
            return (Criteria) this;
        }

        public Criteria andLightPositionXIsNull() {
            addCriterion("Light_Position_X is null");
            return (Criteria) this;
        }

        public Criteria andLightPositionXIsNotNull() {
            addCriterion("Light_Position_X is not null");
            return (Criteria) this;
        }

        public Criteria andLightPositionXEqualTo(Float value) {
            addCriterion("Light_Position_X =", value, "lightPositionX");
            return (Criteria) this;
        }

        public Criteria andLightPositionXNotEqualTo(Float value) {
            addCriterion("Light_Position_X <>", value, "lightPositionX");
            return (Criteria) this;
        }

        public Criteria andLightPositionXGreaterThan(Float value) {
            addCriterion("Light_Position_X >", value, "lightPositionX");
            return (Criteria) this;
        }

        public Criteria andLightPositionXGreaterThanOrEqualTo(Float value) {
            addCriterion("Light_Position_X >=", value, "lightPositionX");
            return (Criteria) this;
        }

        public Criteria andLightPositionXLessThan(Float value) {
            addCriterion("Light_Position_X <", value, "lightPositionX");
            return (Criteria) this;
        }

        public Criteria andLightPositionXLessThanOrEqualTo(Float value) {
            addCriterion("Light_Position_X <=", value, "lightPositionX");
            return (Criteria) this;
        }

        public Criteria andLightPositionXIn(List<Float> values) {
            addCriterion("Light_Position_X in", values, "lightPositionX");
            return (Criteria) this;
        }

        public Criteria andLightPositionXNotIn(List<Float> values) {
            addCriterion("Light_Position_X not in", values, "lightPositionX");
            return (Criteria) this;
        }

        public Criteria andLightPositionXBetween(Float value1, Float value2) {
            addCriterion("Light_Position_X between", value1, value2, "lightPositionX");
            return (Criteria) this;
        }

        public Criteria andLightPositionXNotBetween(Float value1, Float value2) {
            addCriterion("Light_Position_X not between", value1, value2, "lightPositionX");
            return (Criteria) this;
        }

        public Criteria andLightPositionYIsNull() {
            addCriterion("Light_Position_Y is null");
            return (Criteria) this;
        }

        public Criteria andLightPositionYIsNotNull() {
            addCriterion("Light_Position_Y is not null");
            return (Criteria) this;
        }

        public Criteria andLightPositionYEqualTo(Float value) {
            addCriterion("Light_Position_Y =", value, "lightPositionY");
            return (Criteria) this;
        }

        public Criteria andLightPositionYNotEqualTo(Float value) {
            addCriterion("Light_Position_Y <>", value, "lightPositionY");
            return (Criteria) this;
        }

        public Criteria andLightPositionYGreaterThan(Float value) {
            addCriterion("Light_Position_Y >", value, "lightPositionY");
            return (Criteria) this;
        }

        public Criteria andLightPositionYGreaterThanOrEqualTo(Float value) {
            addCriterion("Light_Position_Y >=", value, "lightPositionY");
            return (Criteria) this;
        }

        public Criteria andLightPositionYLessThan(Float value) {
            addCriterion("Light_Position_Y <", value, "lightPositionY");
            return (Criteria) this;
        }

        public Criteria andLightPositionYLessThanOrEqualTo(Float value) {
            addCriterion("Light_Position_Y <=", value, "lightPositionY");
            return (Criteria) this;
        }

        public Criteria andLightPositionYIn(List<Float> values) {
            addCriterion("Light_Position_Y in", values, "lightPositionY");
            return (Criteria) this;
        }

        public Criteria andLightPositionYNotIn(List<Float> values) {
            addCriterion("Light_Position_Y not in", values, "lightPositionY");
            return (Criteria) this;
        }

        public Criteria andLightPositionYBetween(Float value1, Float value2) {
            addCriterion("Light_Position_Y between", value1, value2, "lightPositionY");
            return (Criteria) this;
        }

        public Criteria andLightPositionYNotBetween(Float value1, Float value2) {
            addCriterion("Light_Position_Y not between", value1, value2, "lightPositionY");
            return (Criteria) this;
        }

        public Criteria andLightPositionZIsNull() {
            addCriterion("Light_Position_Z is null");
            return (Criteria) this;
        }

        public Criteria andLightPositionZIsNotNull() {
            addCriterion("Light_Position_Z is not null");
            return (Criteria) this;
        }

        public Criteria andLightPositionZEqualTo(Float value) {
            addCriterion("Light_Position_Z =", value, "lightPositionZ");
            return (Criteria) this;
        }

        public Criteria andLightPositionZNotEqualTo(Float value) {
            addCriterion("Light_Position_Z <>", value, "lightPositionZ");
            return (Criteria) this;
        }

        public Criteria andLightPositionZGreaterThan(Float value) {
            addCriterion("Light_Position_Z >", value, "lightPositionZ");
            return (Criteria) this;
        }

        public Criteria andLightPositionZGreaterThanOrEqualTo(Float value) {
            addCriterion("Light_Position_Z >=", value, "lightPositionZ");
            return (Criteria) this;
        }

        public Criteria andLightPositionZLessThan(Float value) {
            addCriterion("Light_Position_Z <", value, "lightPositionZ");
            return (Criteria) this;
        }

        public Criteria andLightPositionZLessThanOrEqualTo(Float value) {
            addCriterion("Light_Position_Z <=", value, "lightPositionZ");
            return (Criteria) this;
        }

        public Criteria andLightPositionZIn(List<Float> values) {
            addCriterion("Light_Position_Z in", values, "lightPositionZ");
            return (Criteria) this;
        }

        public Criteria andLightPositionZNotIn(List<Float> values) {
            addCriterion("Light_Position_Z not in", values, "lightPositionZ");
            return (Criteria) this;
        }

        public Criteria andLightPositionZBetween(Float value1, Float value2) {
            addCriterion("Light_Position_Z between", value1, value2, "lightPositionZ");
            return (Criteria) this;
        }

        public Criteria andLightPositionZNotBetween(Float value1, Float value2) {
            addCriterion("Light_Position_Z not between", value1, value2, "lightPositionZ");
            return (Criteria) this;
        }

        public Criteria andLightColorIsNull() {
            addCriterion("Light_Color is null");
            return (Criteria) this;
        }

        public Criteria andLightColorIsNotNull() {
            addCriterion("Light_Color is not null");
            return (Criteria) this;
        }

        public Criteria andLightColorEqualTo(String value) {
            addCriterion("Light_Color =", value, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorNotEqualTo(String value) {
            addCriterion("Light_Color <>", value, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorGreaterThan(String value) {
            addCriterion("Light_Color >", value, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorGreaterThanOrEqualTo(String value) {
            addCriterion("Light_Color >=", value, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorLessThan(String value) {
            addCriterion("Light_Color <", value, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorLessThanOrEqualTo(String value) {
            addCriterion("Light_Color <=", value, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorLike(String value) {
            addCriterion("Light_Color like", value, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorNotLike(String value) {
            addCriterion("Light_Color not like", value, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorIn(List<String> values) {
            addCriterion("Light_Color in", values, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorNotIn(List<String> values) {
            addCriterion("Light_Color not in", values, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorBetween(String value1, String value2) {
            addCriterion("Light_Color between", value1, value2, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightColorNotBetween(String value1, String value2) {
            addCriterion("Light_Color not between", value1, value2, "lightColor");
            return (Criteria) this;
        }

        public Criteria andLightIntensityIsNull() {
            addCriterion("Light_Intensity is null");
            return (Criteria) this;
        }

        public Criteria andLightIntensityIsNotNull() {
            addCriterion("Light_Intensity is not null");
            return (Criteria) this;
        }

        public Criteria andLightIntensityEqualTo(Float value) {
            addCriterion("Light_Intensity =", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityNotEqualTo(Float value) {
            addCriterion("Light_Intensity <>", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityGreaterThan(Float value) {
            addCriterion("Light_Intensity >", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityGreaterThanOrEqualTo(Float value) {
            addCriterion("Light_Intensity >=", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityLessThan(Float value) {
            addCriterion("Light_Intensity <", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityLessThanOrEqualTo(Float value) {
            addCriterion("Light_Intensity <=", value, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityIn(List<Float> values) {
            addCriterion("Light_Intensity in", values, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityNotIn(List<Float> values) {
            addCriterion("Light_Intensity not in", values, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityBetween(Float value1, Float value2) {
            addCriterion("Light_Intensity between", value1, value2, "lightIntensity");
            return (Criteria) this;
        }

        public Criteria andLightIntensityNotBetween(Float value1, Float value2) {
            addCriterion("Light_Intensity not between", value1, value2, "lightIntensity");
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