package com.ruoxu.xiaomaoran.dto;

import java.util.Date;
import java.util.Set;

/**
 * @author ruoxu
 */
public class ArticleDetailDto {
    private String uuid;

    private String title;

    private String content;

    private Boolean personal;

    private Set<AttributeDto> tags;

    private Date createTime;

    private Date updateTime;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getPersonal() {
        return personal;
    }

    public void setPersonal(Boolean personal) {
        this.personal = personal;
    }

    public Set<AttributeDto> getTags() {
        return tags;
    }

    public void setTags(Set<AttributeDto> tags) {
        this.tags = tags;
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
