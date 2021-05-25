package com.xiaoming.model;

import java.util.Date;

public class ModelTypes {
    private Integer modelTypeId;

    private String modelTypeName;

    private Date modelTypeCreateTime;

    private Date modelTypeUpdataTime;

    public ModelTypes(Integer modelTypeId, String modelTypeName, Date modelTypeCreateTime, Date modelTypeUpdataTime) {
        this.modelTypeId = modelTypeId;
        this.modelTypeName = modelTypeName;
        this.modelTypeCreateTime = modelTypeCreateTime;
        this.modelTypeUpdataTime = modelTypeUpdataTime;
    }

    public ModelTypes() {
        super();
    }

    public Integer getModelTypeId() {
        return modelTypeId;
    }

    public void setModelTypeId(Integer modelTypeId) {
        this.modelTypeId = modelTypeId;
    }

    public String getModelTypeName() {
        return modelTypeName;
    }

    public void setModelTypeName(String modelTypeName) {
        this.modelTypeName = modelTypeName == null ? null : modelTypeName.trim();
    }

    public Date getModelTypeCreateTime() {
        return modelTypeCreateTime;
    }

    public void setModelTypeCreateTime(Date modelTypeCreateTime) {
        this.modelTypeCreateTime = modelTypeCreateTime;
    }

    public Date getModelTypeUpdataTime() {
        return modelTypeUpdataTime;
    }

    public void setModelTypeUpdataTime(Date modelTypeUpdataTime) {
        this.modelTypeUpdataTime = modelTypeUpdataTime;
    }
}