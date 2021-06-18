package com.xiaoming.model;

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

    private Float cameraUpX;

    private Float cameraUpY;

    private Float cmaeraUpZ;

    private Float cameraLookatX;

    private Float cameraLookatY;

    private Float cameraLookatZ;

    private Integer sceneId;

    private Integer fieldOfView;

    private Date createTime;

    private Date updateTime;

    public MyCamera(Integer cameraId, String cameraTitle, String cameraType, Integer cameraNear, Integer cameraFar, String cameraVisibility, Float cameraPositionX, Float cameraPositionY, Float cameraPositionZ, Float cameraUpX, Float cameraUpY, Float cmaeraUpZ, Float cameraLookatX, Float cameraLookatY, Float cameraLookatZ, Integer sceneId, Integer fieldOfView, Date createTime, Date updateTime) {
        this.cameraId = cameraId;
        this.cameraTitle = cameraTitle;
        this.cameraType = cameraType;
        this.cameraNear = cameraNear;
        this.cameraFar = cameraFar;
        this.cameraVisibility = cameraVisibility;
        this.cameraPositionX = cameraPositionX;
        this.cameraPositionY = cameraPositionY;
        this.cameraPositionZ = cameraPositionZ;
        this.cameraUpX = cameraUpX;
        this.cameraUpY = cameraUpY;
        this.cmaeraUpZ = cmaeraUpZ;
        this.cameraLookatX = cameraLookatX;
        this.cameraLookatY = cameraLookatY;
        this.cameraLookatZ = cameraLookatZ;
        this.sceneId = sceneId;
        this.fieldOfView = fieldOfView;
        this.createTime = createTime;
        this.updateTime = updateTime;
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

    public Float getCameraUpX() {
        return cameraUpX;
    }

    public void setCameraUpX(Float cameraUpX) {
        this.cameraUpX = cameraUpX;
    }

    public Float getCameraUpY() {
        return cameraUpY;
    }

    public void setCameraUpY(Float cameraUpY) {
        this.cameraUpY = cameraUpY;
    }

    public Float getCmaeraUpZ() {
        return cmaeraUpZ;
    }

    public void setCmaeraUpZ(Float cmaeraUpZ) {
        this.cmaeraUpZ = cmaeraUpZ;
    }

    public Float getCameraLookatX() {
        return cameraLookatX;
    }

    public void setCameraLookatX(Float cameraLookatX) {
        this.cameraLookatX = cameraLookatX;
    }

    public Float getCameraLookatY() {
        return cameraLookatY;
    }

    public void setCameraLookatY(Float cameraLookatY) {
        this.cameraLookatY = cameraLookatY;
    }

    public Float getCameraLookatZ() {
        return cameraLookatZ;
    }

    public void setCameraLookatZ(Float cameraLookatZ) {
        this.cameraLookatZ = cameraLookatZ;
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