package com.ruoxu.xiaomaoran.service;

import com.ruoxu.xiaomaoran.dto.ArticleDetailDto;
import com.ruoxu.xiaomaoran.dto.ArticleSummaryDto;
import com.ruoxu.xiaomaoran.model.Article;

import java.util.List;

public interface ArticleService {

    public List<ArticleSummaryDto> getArticleSummaryDtoList();

    public Article getArticleByUuid(String uuid);

    public void saveArticleWithTags(ArticleDetailDto articleDetailDto);
}
