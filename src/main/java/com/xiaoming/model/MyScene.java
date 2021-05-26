package com.xiaoming.model;

import java.util.Date;

public class MyScene {
    private Integer sceneId;

    private String sceneTitle;

    private Date createTime;

    private Date updateTime;

    public MyScene(Integer sceneId, String sceneTitle, Date createTime, Date updateTime) {
        this.sceneId = sceneId;
        this.sceneTitle = sceneTitle;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public MyScene() {
        super();
    }

    public Integer getSceneId() {
        return sceneId;
    }

    public void setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
    }

    public String getSceneTitle() {
        return sceneTitle;
    }

    public void setSceneTitle(String sceneTitle) {
        this.sceneTitle = sceneTitle == null ? null : sceneTitle.trim();
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