package com.xiaoming.model;

import java.util.Date;

public class camera {
    private Integer cameraId;

    private String cameraTitle;

    private String cameraType;

    private Integer cameraLeft;

    private Integer cameraRight;

    private Integer cameraTop;

    private Integer cameraBottom;

    private Integer cameraNear;

    private Integer cameraFar;

    private String cameraVisibility;

    private Float cameraPositionX;

    private Float cameraPositionY;

    private Float cameraPositionZ;

    private Date createTime;

    private Date updateTime;

    public camera(Integer cameraId, String cameraTitle, String cameraType, Integer cameraLeft, Integer cameraRight, Integer cameraTop, Integer cameraBottom, Integer cameraNear, Integer cameraFar, String cameraVisibility, Float cameraPositionX, Float cameraPositionY, Float cameraPositionZ, Date createTime, Date updateTime) {
        this.cameraId = cameraId;
        this.cameraTitle = cameraTitle;
        this.cameraType = cameraType;
        this.cameraLeft = cameraLeft;
        this.cameraRight = cameraRight;
        this.cameraTop = cameraTop;
        this.cameraBottom = cameraBottom;
        this.cameraNear = cameraNear;
        this.cameraFar = cameraFar;
        this.cameraVisibility = cameraVisibility;
        this.cameraPositionX = cameraPositionX;
        this.cameraPositionY = cameraPositionY;
        this.cameraPositionZ = cameraPositionZ;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public camera() {
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

    public Integer getCameraLeft() {
        return cameraLeft;
    }

    public void setCameraLeft(Integer cameraLeft) {
        this.cameraLeft = cameraLeft;
    }

    public Integer getCameraRight() {
        return cameraRight;
    }

    public void setCameraRight(Integer cameraRight) {
        this.cameraRight = cameraRight;
    }

    public Integer getCameraTop() {
        return cameraTop;
    }

    public void setCameraTop(Integer cameraTop) {
        this.cameraTop = cameraTop;
    }

    public Integer getCameraBottom() {
        return cameraBottom;
    }

    public void setCameraBottom(Integer cameraBottom) {
        this.cameraBottom = cameraBottom;
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