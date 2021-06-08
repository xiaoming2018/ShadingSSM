package com.xiaoming.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class MyModel {
    private Integer modelId;

    private String modelTitle;

    private Integer modelTypeId;

    private Float modelPositionX;

    private Float modelPositionY;

    private Float modelPositionZ;

    private Float modelRotationX;

    private Float modelRotationY;

    private Float modelRotationZ;

    private Float modelScaleX;

    private Float modelScaleY;

    private Float modelScaleZ;

    private String modelFilepath;

    private Integer sceneId;

    private Date createTime;

    private Date updateTime;

    public MyModel(Integer modelId, String modelTitle, Integer modelTypeId, Float modelPositionX, Float modelPositionY, Float modelPositionZ, Float modelRotationX, Float modelRotationY, Float modelRotationZ, Float modelScaleX, Float modelScaleY, Float modelScaleZ, String modelFilepath, Integer sceneId, Date createTime, Date updateTime) {
        this.modelId = modelId;
        this.modelTitle = modelTitle;
        this.modelTypeId = modelTypeId;
        this.modelPositionX = modelPositionX;
        this.modelPositionY = modelPositionY;
        this.modelPositionZ = modelPositionZ;
        this.modelRotationX = modelRotationX;
        this.modelRotationY = modelRotationY;
        this.modelRotationZ = modelRotationZ;
        this.modelScaleX = modelScaleX;
        this.modelScaleY = modelScaleY;
        this.modelScaleZ = modelScaleZ;
        this.modelFilepath = modelFilepath;
        this.sceneId = sceneId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public MyModel() {
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

    public Integer getModelTypeId() {
        return modelTypeId;
    }

    public void setModelTypeId(Integer modelTypeId) {
        this.modelTypeId = modelTypeId;
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

    public String getModelFilepath() {
        return modelFilepath;
    }

    public void setModelFilepath(String modelFilepath) {
        this.modelFilepath = modelFilepath == null ? null : modelFilepath.trim();
    }

    public Integer getSceneId() {
        return sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getCreateTime() {
        return createTime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public Date getUpdateTime() {
        return updateTime;
    }

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}