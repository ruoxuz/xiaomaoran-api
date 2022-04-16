package com.ruoxu.xiaomaoran.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class RelArticleAttrDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final RelArticleAttr relArticleAttr = new RelArticleAttr();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = relArticleAttr.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> articleId = relArticleAttr.articleId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> attrId = relArticleAttr.attrId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class RelArticleAttr extends AliasableSqlTable<RelArticleAttr> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> articleId = column("article_id", JDBCType.BIGINT);

        public final SqlColumn<Long> attrId = column("attr_id", JDBCType.BIGINT);

        public RelArticleAttr() {
            super("rel_article_attr", RelArticleAttr::new);
        }
    }
}