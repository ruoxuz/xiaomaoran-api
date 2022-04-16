package com.ruoxu.xiaomaoran.model;

import java.util.Date;
import javax.annotation.Generated;

public class Article {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String uuid;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long userId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long folderId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String title;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String content;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String background;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Boolean personal;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String summary;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date createTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date updateTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUuid() {
        return uuid;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getUserId() {
        return userId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getFolderId() {
        return folderId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setFolderId(Long folderId) {
        this.folderId = folderId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTitle() {
        return title;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getContent() {
        return content;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getBackground() {
        return background;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setBackground(String background) {
        this.background = background == null ? null : background.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Boolean getPersonal() {
        return personal;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPersonal(Boolean personal) {
        this.personal = personal;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSummary() {
        return summary;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getUpdateTime() {
        return updateTime;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}