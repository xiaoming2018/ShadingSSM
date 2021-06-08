package com.xiaoming.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class MyCamera {
    private Integer cameraId;

    private String cameraTitle;

    private String cameraType;

    private Integer cameraNear;

    private Integer cameraFar;

    private String cameraVisibility;

    private Float cameraPositionX;

    private Float cameraPositionY;

    private Float cameraPositionZ;

    private Date createTime;

    private Date updateTime;

    private Integer sceneId;

    private Integer fieldOfView;

    public MyCamera(Integer cameraId, String cameraTitle, String cameraType, Integer cameraNear, Integer cameraFar, String cameraVisibility, Float cameraPositionX, Float cameraPositionY, Float cameraPositionZ, Date createTime, Date updateTime, Integer sceneId, Integer fieldOfView) {
        this.cameraId = cameraId;
        this.cameraTitle = cameraTitle;
        this.cameraType = cameraType;
        this.cameraNear = cameraNear;
        this.cameraFar = cameraFar;
        this.cameraVisibility = cameraVisibility;
        this.cameraPositionX = cameraPositionX;
        this.cameraPositionY = cameraPositionY;
        this.cameraPositionZ = cameraPositionZ;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.sceneId = sceneId;
        this.fieldOfView = fieldOfView;
    }

    public MyCamera() {
        super();
    }

    public Integer getCameraId() {
        return cameraId;
    }

    public void setCameraId(Integer cameraId) {
        this.cameraId = cameraId;
    }

    public String getCameraTitle() {
        return cameraTitle;
    }

    public void setCameraTitle(String cameraTitle) {
        this.cameraTitle = cameraTitle == null ? null : cameraTitle.trim();
    }

    public String getCameraType() {
        return cameraType;
    }

    public void setCameraType(String cameraType) {
        this.cameraType = cameraType == null ? null : cameraType.trim();
    }

    public Integer getCameraNear() {
        return cameraNear;
    }

    public void setCameraNear(Integer cameraNear) {
        this.cameraNear = cameraNear;
    }

    public Integer getCameraFar() {
        return cameraFar;
    }

    public void setCameraFar(Integer cameraFar) {
        this.cameraFar = cameraFar;
    }

    public String getCameraVisibility() {
        return cameraVisibility;
    }

    public void setCameraVisibility(String cameraVisibility) {
        this.cameraVisibility = cameraVisibility == null ? null : cameraVisibility.trim();
    }

    public Float getCameraPositionX() {
        return cameraPositionX;
    }

    public void setCameraPositionX(Float cameraPositionX) {
        this.cameraPositionX = cameraPositionX;
    }

    public Float getCameraPositionY() {
        return cameraPositionY;
    }

    public void setCameraPositionY(Float cameraPositionY) {
        this.cameraPositionY = cameraPositionY;
    }

    public Float getCameraPositionZ() {
        return cameraPositionZ;
    }

    public void setCameraPositionZ(Float cameraPositionZ) {
        this.cameraPositionZ = cameraPositionZ;
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

    public Integer getSceneId() {
        return sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    public Integer getFieldOfView() {
        return fieldOfView;
    }

    public void setFieldOfView(Integer fieldOfView) {
        this.fieldOfView = fieldOfView;
    }
}