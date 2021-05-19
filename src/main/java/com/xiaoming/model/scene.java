package com.xiaoming.model;

import java.util.Date;

public class scene {
    private Integer sceneId;

    private Integer modelId;

    private Integer cameraId;

    private Integer lightId;

    private Date createTime;

    private Date updateTime;

    public scene(Integer sceneId, Integer modelId, Integer cameraId, Integer lightId, Date createTime, Date updateTime) {
        this.sceneId = sceneId;
        this.modelId = modelId;
        this.cameraId = cameraId;
        this.lightId = lightId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public scene() {
        super();
    }

    public Integer getSceneId() {
        return sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public Integer getCameraId() {
        return cameraId;
    }

    public void setCameraId(Integer cameraId) {
        this.cameraId = cameraId;
    }

    public Integer getLightId() {
        return lightId;
    }

    public void setLightId(Integer lightId) {
        this.lightId = lightId;
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