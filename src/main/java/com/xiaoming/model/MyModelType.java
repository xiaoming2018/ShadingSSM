package com.xiaoming.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class MyModelType {
    private Integer modelTypeId;

    private String modelTypeName;

    private Date modelTypeCreateTime;

    private Date modelTypeUpdataTime;

    public MyModelType(Integer modelTypeId, String modelTypeName, Date modelTypeCreateTime, Date modelTypeUpdataTime) {
        this.modelTypeId = modelTypeId;
        this.modelTypeName = modelTypeName;
        this.modelTypeCreateTime = modelTypeCreateTime;
        this.modelTypeUpdataTime = modelTypeUpdataTime;
    }

    public MyModelType() {
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

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getModelTypeCreateTime() {
        return modelTypeCreateTime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public void setModelTypeCreateTime(Date modelTypeCreateTime) {
        this.modelTypeCreateTime = modelTypeCreateTime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getModelTypeUpdataTime() {
        return modelTypeUpdataTime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public void setModelTypeUpdataTime(Date modelTypeUpdataTime) {
        this.modelTypeUpdataTime = modelTypeUpdataTime;
    }
}