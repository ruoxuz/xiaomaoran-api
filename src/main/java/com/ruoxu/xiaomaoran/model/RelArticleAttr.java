package com.ruoxu.xiaomaoran.model;

import javax.annotation.Generated;

public class RelArticleAttr {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long articleId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long attrId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getArticleId() {
        return articleId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getAttrId() {
        return attrId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }
}