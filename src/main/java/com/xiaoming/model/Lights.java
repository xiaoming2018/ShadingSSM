package com.xiaoming.model;

import java.util.Date;

public class Lights {
    private Integer lightId;

    private String lightTitle;

    private String lightType;

    private String lightPositionX;

    private String lightPositionY;

    private String lightPositionZ;

    private String lightColor;

    private Integer lightIntensity;

    private Date createTime;

    private Date updateTime;

    public Lights(Integer lightId, String lightTitle, String lightType, String lightPositionX, String lightPositionY, String lightPositionZ, String lightColor, Integer lightIntensity, Date createTime, Date updateTime) {
        this.lightId = lightId;
        this.lightTitle = lightTitle;
        this.lightType = lightType;
        this.lightPositionX = lightPositionX;
        this.lightPositionY = lightPositionY;
        this.lightPositionZ = lightPositionZ;
        this.lightColor = lightColor;
        this.lightIntensity = lightIntensity;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Lights() {
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

    public String getLightPositionX() {
        return lightPositionX;
    }

    public void setLightPositionX(String lightPositionX) {
        this.lightPositionX = lightPositionX == null ? null : lightPositionX.trim();
    }

    public String getLightPositionY() {
        return lightPositionY;
    }

    public void setLightPositionY(String lightPositionY) {
        this.lightPositionY = lightPositionY == null ? null : lightPositionY.trim();
    }

    public String getLightPositionZ() {
        return lightPositionZ;
    }

    public void setLightPositionZ(String lightPositionZ) {
        this.lightPositionZ = lightPositionZ == null ? null : lightPositionZ.trim();
    }

    public String getLightColor() {
        return lightColor;
    }

    public void setLightColor(String lightColor) {
        this.lightColor = lightColor == null ? null : lightColor.trim();
    }

    public Integer getLightIntensity() {
        return lightIntensity;
    }

    public void setLightIntensity(Integer lightIntensity) {
        this.lightIntensity = lightIntensity;
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