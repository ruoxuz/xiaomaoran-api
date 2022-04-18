package com.ruoxu.xiaomaoran.dao;

import com.ruoxu.xiaomaoran.dto.ArticleSummaryDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ArticleSummaryDao {
    List<ArticleSummaryDto> getArticleSummaryDtoList();
}
