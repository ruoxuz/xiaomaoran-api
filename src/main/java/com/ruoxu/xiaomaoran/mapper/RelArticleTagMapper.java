package com.ruoxu.xiaomaoran.mapper;

import static com.ruoxu.xiaomaoran.mapper.RelArticleTagDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.ruoxu.xiaomaoran.model.RelArticleTag;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface RelArticleTagMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<RelArticleTag>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, articleId, tagId);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RelArticleTagResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="article_id", property="articleId", jdbcType=JdbcType.BIGINT),
        @Result(column="tag_id", property="tagId", jdbcType=JdbcType.BIGINT)
    })
    List<RelArticleTag> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RelArticleTagResult")
    Optional<RelArticleTag> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, relArticleTag, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, relArticleTag, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(RelArticleTag row) {
        return MyBatis3Utils.insert(this::insert, row, relArticleTag, c ->
            c.map(id).toProperty("id")
            .map(articleId).toProperty("articleId")
            .map(tagId).toProperty("tagId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<RelArticleTag> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, relArticleTag, c ->
            c.map(id).toProperty("id")
            .map(articleId).toProperty("articleId")
            .map(tagId).toProperty("tagId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(RelArticleTag row) {
        return MyBatis3Utils.insert(this::insert, row, relArticleTag, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(articleId).toPropertyWhenPresent("articleId", row::getArticleId)
            .map(tagId).toPropertyWhenPresent("tagId", row::getTagId)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<RelArticleTag> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, relArticleTag, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<RelArticleTag> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, relArticleTag, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<RelArticleTag> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, relArticleTag, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<RelArticleTag> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, relArticleTag, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(RelArticleTag row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(articleId).equalTo(row::getArticleId)
                .set(tagId).equalTo(row::getTagId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RelArticleTag row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(articleId).equalToWhenPresent(row::getArticleId)
                .set(tagId).equalToWhenPresent(row::getTagId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(RelArticleTag row) {
        return update(c ->
            c.set(articleId).equalTo(row::getArticleId)
            .set(tagId).equalTo(row::getTagId)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(RelArticleTag row) {
        return update(c ->
            c.set(articleId).equalToWhenPresent(row::getArticleId)
            .set(tagId).equalToWhenPresent(row::getTagId)
            .where(id, isEqualTo(row::getId))
        );
    }
}