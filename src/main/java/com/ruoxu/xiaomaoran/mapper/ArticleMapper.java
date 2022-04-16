package com.ruoxu.xiaomaoran.mapper;

import static com.ruoxu.xiaomaoran.mapper.ArticleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.ruoxu.xiaomaoran.model.Article;
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
public interface ArticleMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<Article>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, uuid, userId, folderId, title, content, background, personal, summary, createTime, updateTime);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ArticleResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="uuid", property="uuid", jdbcType=JdbcType.VARCHAR),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.BIGINT),
        @Result(column="folder_id", property="folderId", jdbcType=JdbcType.BIGINT),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="content", property="content", jdbcType=JdbcType.VARCHAR),
        @Result(column="background", property="background", jdbcType=JdbcType.VARCHAR),
        @Result(column="personal", property="personal", jdbcType=JdbcType.BIT),
        @Result(column="summary", property="summary", jdbcType=JdbcType.VARCHAR),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="update_time", property="updateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Article> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ArticleResult")
    Optional<Article> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, article, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, article, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(Article row) {
        return MyBatis3Utils.insert(this::insert, row, article, c ->
            c.map(id).toProperty("id")
            .map(uuid).toProperty("uuid")
            .map(userId).toProperty("userId")
            .map(folderId).toProperty("folderId")
            .map(title).toProperty("title")
            .map(content).toProperty("content")
            .map(background).toProperty("background")
            .map(personal).toProperty("personal")
            .map(summary).toProperty("summary")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<Article> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, article, c ->
            c.map(id).toProperty("id")
            .map(uuid).toProperty("uuid")
            .map(userId).toProperty("userId")
            .map(folderId).toProperty("folderId")
            .map(title).toProperty("title")
            .map(content).toProperty("content")
            .map(background).toProperty("background")
            .map(personal).toProperty("personal")
            .map(summary).toProperty("summary")
            .map(createTime).toProperty("createTime")
            .map(updateTime).toProperty("updateTime")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(Article row) {
        return MyBatis3Utils.insert(this::insert, row, article, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(uuid).toPropertyWhenPresent("uuid", row::getUuid)
            .map(userId).toPropertyWhenPresent("userId", row::getUserId)
            .map(folderId).toPropertyWhenPresent("folderId", row::getFolderId)
            .map(title).toPropertyWhenPresent("title", row::getTitle)
            .map(content).toPropertyWhenPresent("content", row::getContent)
            .map(background).toPropertyWhenPresent("background", row::getBackground)
            .map(personal).toPropertyWhenPresent("personal", row::getPersonal)
            .map(summary).toPropertyWhenPresent("summary", row::getSummary)
            .map(createTime).toPropertyWhenPresent("createTime", row::getCreateTime)
            .map(updateTime).toPropertyWhenPresent("updateTime", row::getUpdateTime)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Article> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, article, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Article> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, article, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<Article> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, article, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<Article> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, article, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(Article row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(uuid).equalTo(row::getUuid)
                .set(userId).equalTo(row::getUserId)
                .set(folderId).equalTo(row::getFolderId)
                .set(title).equalTo(row::getTitle)
                .set(content).equalTo(row::getContent)
                .set(background).equalTo(row::getBackground)
                .set(personal).equalTo(row::getPersonal)
                .set(summary).equalTo(row::getSummary)
                .set(createTime).equalTo(row::getCreateTime)
                .set(updateTime).equalTo(row::getUpdateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(Article row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(uuid).equalToWhenPresent(row::getUuid)
                .set(userId).equalToWhenPresent(row::getUserId)
                .set(folderId).equalToWhenPresent(row::getFolderId)
                .set(title).equalToWhenPresent(row::getTitle)
                .set(content).equalToWhenPresent(row::getContent)
                .set(background).equalToWhenPresent(row::getBackground)
                .set(personal).equalToWhenPresent(row::getPersonal)
                .set(summary).equalToWhenPresent(row::getSummary)
                .set(createTime).equalToWhenPresent(row::getCreateTime)
                .set(updateTime).equalToWhenPresent(row::getUpdateTime);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(Article row) {
        return update(c ->
            c.set(uuid).equalTo(row::getUuid)
            .set(userId).equalTo(row::getUserId)
            .set(folderId).equalTo(row::getFolderId)
            .set(title).equalTo(row::getTitle)
            .set(content).equalTo(row::getContent)
            .set(background).equalTo(row::getBackground)
            .set(personal).equalTo(row::getPersonal)
            .set(summary).equalTo(row::getSummary)
            .set(createTime).equalTo(row::getCreateTime)
            .set(updateTime).equalTo(row::getUpdateTime)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(Article row) {
        return update(c ->
            c.set(uuid).equalToWhenPresent(row::getUuid)
            .set(userId).equalToWhenPresent(row::getUserId)
            .set(folderId).equalToWhenPresent(row::getFolderId)
            .set(title).equalToWhenPresent(row::getTitle)
            .set(content).equalToWhenPresent(row::getContent)
            .set(background).equalToWhenPresent(row::getBackground)
            .set(personal).equalToWhenPresent(row::getPersonal)
            .set(summary).equalToWhenPresent(row::getSummary)
            .set(createTime).equalToWhenPresent(row::getCreateTime)
            .set(updateTime).equalToWhenPresent(row::getUpdateTime)
            .where(id, isEqualTo(row::getId))
        );
    }
}