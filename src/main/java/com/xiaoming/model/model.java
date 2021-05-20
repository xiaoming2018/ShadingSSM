package com.xiaoming.model;

import java.util.Date;

public class model {
    private Integer modelId;

    private String modelTitle;

    private String modelType;

    private Float modelPositionX;

    private Float modelPositionY;

    private Float modelPositionZ;

    private Float modelRotationX;

    private Float modelRotationY;

    private Float modelRotationZ;

    private Float modelScaleX;

    private Float modelScaleY;

    private Float modelScaleZ;

    private Date createTime;

    private Date updateTime;

    public model(Integer modelId, String modelTitle, String modelType, Float modelPositionX, Float modelPositionY, Float modelPositionZ, Float modelRotationX, Float modelRotationY, Float modelRotationZ, Float modelScaleX, Float modelScaleY, Float modelScaleZ, Date createTime, Date updateTime) {
        this.modelId = modelId;
        this.modelTitle = modelTitle;
        this.modelType = modelType;
        this.modelPositionX = modelPositionX;
        this.modelPositionY = modelPositionY;
        this.modelPositionZ = modelPositionZ;
        this.modelRotationX = modelRotationX;
        this.modelRotationY = modelRotationY;
        this.modelRotationZ = modelRotationZ;
        this.modelScaleX = modelScaleX;
        this.modelScaleY = modelScaleY;
        this.modelScaleZ = modelScaleZ;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public model() {
        super();
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getModelTitle() {
        return modelTitle;
    }

    public void setModelTitle(String modelTitle) {
        this.modelTitle = modelTitle == null ? null : modelTitle.trim();
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType == null ? null : modelType.trim();
    }

    public Float getModelPositionX() {
        return modelPositionX;
    }

    public void setModelPositionX(Float modelPositionX) {
        this.modelPositionX = modelPositionX;
    }

    public Float getModelPositionY() {
        return modelPositionY;
    }

    public void setModelPositionY(Float modelPositionY) {
        this.modelPositionY = modelPositionY;
    }

    public Float getModelPositionZ() {
        return modelPositionZ;
    }

    public void setModelPositionZ(Float modelPositionZ) {
        this.modelPositionZ = modelPositionZ;
    }

    public Float getModelRotationX() {
        return modelRotationX;
    }

    public void setModelRotationX(Float modelRotationX) {
        this.modelRotationX = modelRotationX;
    }

    public Float getModelRotationY() {
        return modelRotationY;
    }

    public void setModelRotationY(Float modelRotationY) {
        this.modelRotationY = modelRotationY;
    }

    public Float getModelRotationZ() {
        return modelRotationZ;
    }

    public void setModelRotationZ(Float modelRotationZ) {
        this.modelRotationZ = modelRotationZ;
    }

    public Float getModelScaleX() {
        return modelScaleX;
    }

    public void setModelScaleX(Float modelScaleX) {
        this.modelScaleX = modelScaleX;
    }

    public Float getModelScaleY() {
        return modelScaleY;
    }

    public void setModelScaleY(Float modelScaleY) {
        this.modelScaleY = modelScaleY;
    }

    public Float getModelScaleZ() {
        return modelScaleZ;
    }

    public void setModelScaleZ(Float modelScaleZ) {
        this.modelScaleZ = modelScaleZ;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}