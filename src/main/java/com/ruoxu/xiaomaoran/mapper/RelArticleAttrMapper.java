package com.ruoxu.xiaomaoran.mapper;

import static com.ruoxu.xiaomaoran.mapper.RelArticleAttrDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import com.ruoxu.xiaomaoran.model.RelArticleAttr;
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
public interface RelArticleAttrMapper extends CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<RelArticleAttr>, CommonUpdateMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, articleId, attrId);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="RelArticleAttrResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="article_id", property="articleId", jdbcType=JdbcType.BIGINT),
        @Result(column="attr_id", property="attrId", jdbcType=JdbcType.BIGINT)
    })
    List<RelArticleAttr> selectMany(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("RelArticleAttrResult")
    Optional<RelArticleAttr> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, relArticleAttr, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, relArticleAttr, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(RelArticleAttr row) {
        return MyBatis3Utils.insert(this::insert, row, relArticleAttr, c ->
            c.map(id).toProperty("id")
            .map(articleId).toProperty("articleId")
            .map(attrId).toProperty("attrId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<RelArticleAttr> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, relArticleAttr, c ->
            c.map(id).toProperty("id")
            .map(articleId).toProperty("articleId")
            .map(attrId).toProperty("attrId")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(RelArticleAttr row) {
        return MyBatis3Utils.insert(this::insert, row, relArticleAttr, c ->
            c.map(id).toPropertyWhenPresent("id", row::getId)
            .map(articleId).toPropertyWhenPresent("articleId", row::getArticleId)
            .map(attrId).toPropertyWhenPresent("attrId", row::getAttrId)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<RelArticleAttr> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, relArticleAttr, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<RelArticleAttr> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, relArticleAttr, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<RelArticleAttr> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, relArticleAttr, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<RelArticleAttr> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, relArticleAttr, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(RelArticleAttr row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(row::getId)
                .set(articleId).equalTo(row::getArticleId)
                .set(attrId).equalTo(row::getAttrId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(RelArticleAttr row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(row::getId)
                .set(articleId).equalToWhenPresent(row::getArticleId)
                .set(attrId).equalToWhenPresent(row::getAttrId);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(RelArticleAttr row) {
        return update(c ->
            c.set(articleId).equalTo(row::getArticleId)
            .set(attrId).equalTo(row::getAttrId)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(RelArticleAttr row) {
        return update(c ->
            c.set(articleId).equalToWhenPresent(row::getArticleId)
            .set(attrId).equalToWhenPresent(row::getAttrId)
            .where(id, isEqualTo(row::getId))
        );
    }
}