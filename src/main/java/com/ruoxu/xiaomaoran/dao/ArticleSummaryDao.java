package com.ruoxu.xiaomaoran.dao;

import com.ruoxu.xiaomaoran.dto.ArticleSummaryDto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleSummaryDao {
    List<ArticleSummaryDto> getArticleSummaryDtoList();
}
