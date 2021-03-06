package com.xiaoming.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class MyLight {
    private Integer lightId;

    private String lightTitle;

    private String lightType;

    private String lightCastsShadow;

    private Float lightPositionX;

    private Float lightPositionY;

    private Float lightPositionZ;

    private String lightColor;

    private Float lightIntensity;

    private Integer sceneId;

    private Date createTime;

    private Date updateTime;

    public MyLight(Integer lightId, String lightTitle, String lightType, String lightCastsShadow, Float lightPositionX, Float lightPositionY, Float lightPositionZ, String lightColor, Float lightIntensity, Integer sceneId, Date createTime, Date updateTime) {
        this.lightId = lightId;
        this.lightTitle = lightTitle;
        this.lightType = lightType;
        this.lightCastsShadow = lightCastsShadow;
        this.lightPositionX = lightPositionX;
        this.lightPositionY = lightPositionY;
        this.lightPositionZ = lightPositionZ;
        this.lightColor = lightColor;
        this.lightIntensity = lightIntensity;
        this.sceneId = sceneId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public MyLight() {
        super();
    }

    public Integer getLightId() {
        return lightId;
    }

    public void setLightId(Integer lightId) {
        this.lightId = lightId;
    }

    public String getLightTitle() {
        return lightTitle;
    }

    public void setLightTitle(String lightTitle) {
        this.lightTitle = lightTitle == null ? null : lightTitle.trim();
    }

    public String getLightType() {
        return lightType;
    }

    public void setLightType(String lightType) {
        this.lightType = lightType == null ? null : lightType.trim();
    }

    public String getLightCastsShadow() {
        return lightCastsShadow;
    }

    public void setLightCastsShadow(String lightCastsShadow) {
        this.lightCastsShadow = lightCastsShadow == null ? null : lightCastsShadow.trim();
    }

    public Float getLightPositionX() {
        return lightPositionX;
    }

    public void setLightPositionX(Float lightPositionX) {
        this.lightPositionX = lightPositionX;
    }

    public Float getLightPositionY() {
        return lightPositionY;
    }

    public void setLightPositionY(Float lightPositionY) {
        this.lightPositionY = lightPositionY;
    }

    public Float getLightPositionZ() {
        return lightPositionZ;
    }

    public void setLightPositionZ(Float lightPositionZ) {
        this.lightPositionZ = lightPositionZ;
    }

    public String getLightColor() {
        return lightColor;
    }

    public void setLightColor(String lightColor) {
        this.lightColor = lightColor == null ? null : lightColor.trim();
    }

    public Float getLightIntensity() {
        return lightIntensity;
    }

    public void setLightIntensity(Float lightIntensity) {
        this.lightIntensity = lightIntensity;
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