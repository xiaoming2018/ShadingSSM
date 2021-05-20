package com.xiaoming.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class sceneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public sceneExample() {
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

        public Criteria andSceneTitleIsNull() {
            addCriterion("Scene_title is null");
            return (Criteria) this;
        }

        public Criteria andSceneTitleIsNotNull() {
            addCriterion("Scene_title is not null");
            return (Criteria) this;
        }

        public Criteria andSceneTitleEqualTo(String value) {
            addCriterion("Scene_title =", value, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleNotEqualTo(String value) {
            addCriterion("Scene_title <>", value, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleGreaterThan(String value) {
            addCriterion("Scene_title >", value, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Scene_title >=", value, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleLessThan(String value) {
            addCriterion("Scene_title <", value, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleLessThanOrEqualTo(String value) {
            addCriterion("Scene_title <=", value, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleLike(String value) {
            addCriterion("Scene_title like", value, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleNotLike(String value) {
            addCriterion("Scene_title not like", value, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleIn(List<String> values) {
            addCriterion("Scene_title in", values, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleNotIn(List<String> values) {
            addCriterion("Scene_title not in", values, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleBetween(String value1, String value2) {
            addCriterion("Scene_title between", value1, value2, "sceneTitle");
            return (Criteria) this;
        }

        public Criteria andSceneTitleNotBetween(String value1, String value2) {
            addCriterion("Scene_title not between", value1, value2, "sceneTitle");
            return (Criteria) this;
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