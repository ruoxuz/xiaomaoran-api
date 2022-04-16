package com.ruoxu.xiaomaoran.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class RelArticleTagDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final RelArticleTag relArticleTag = new RelArticleTag();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> id = relArticleTag.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> articleId = relArticleTag.articleId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> tagId = relArticleTag.tagId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class RelArticleTag extends AliasableSqlTable<RelArticleTag> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<Long> articleId = column("article_id", JDBCType.BIGINT);

        public final SqlColumn<Long> tagId = column("tag_id", JDBCType.BIGINT);

        public RelArticleTag() {
            super("rel_article_tag", RelArticleTag::new);
        }
    }
}