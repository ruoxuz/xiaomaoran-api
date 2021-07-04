package com.ruoxu.nekonekoko.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ruoxu.nekonekoko.dto.ArticleDetailDto;
import com.ruoxu.nekonekoko.dto.ArticleSummaryDto;
import com.ruoxu.nekonekoko.model.Article;
import com.ruoxu.nekonekoko.model.Tag;
import com.ruoxu.nekonekoko.service.ArticleService;
import com.ruoxu.nekonekoko.util.JsonConverter;
import com.ruoxu.nekonekoko.util.UUIDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author ruoxu
 */
@Controller
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    /**
     * @date 2021/6/26 11:47
     * 获取文章列表
     * @return java.lang.String
     */
    @GetMapping("/getArticles")
    @ResponseBody
    public String getArticles() throws JsonProcessingException {
        List<ArticleSummaryDto> articleSummaryDTOList = new ArrayList<>();
        List<Article> articleList = articleService.findAll();
        articleList.forEach(article -> {
            var articleSummaryDTO = articleConvertToArticleSummaryDTO(article);
            articleSummaryDTOList.add(articleSummaryDTO);
        });
        return JsonConverter.toString(articleSummaryDTOList);
    }

    /**
     * @date 2021/6/30 0:59
     * 通过uuid获取文章
     * @param uuid uuid
     * @return java.lang.String
     */
    @GetMapping("/getArticle/{uuid}")
    @ResponseBody
    public String getArticle(@PathVariable String uuid) throws JsonProcessingException {
        return JsonConverter.toString(articleService.findArticle(uuid));
    }

    @PostMapping("/saveArticle")
    public void saveArticle(@RequestBody ArticleDetailDto articleDetailDto) {
        var article = articleDetailDtoConvertToArticle(articleDetailDto);
        Set<Tag> tags = new HashSet<>();
        articleDetailDto.getTags().forEach(tagDto -> {
            var tag = new Tag();
            tag.setName(tagDto.getName());
            tags.add(tag);
        });
        article.setTags(tags);
        article.setUuid(UUIDGenerator.getUUID());
        if (article.getContent().length() > 50) {
            article.setSummary(article.getContent().substring(0, 50));
        } else {
            article.setSummary(article.getContent());
        }
        articleService.saveArticle(article);
    }

    public Article articleDetailDtoConvertToArticle(ArticleDetailDto articleDetailDto) {
        var article = new Article();
        article.setTitle(articleDetailDto.getTitle());
        article.setContent(articleDetailDto.getContent());
        article.setPersonal(articleDetailDto.getPersonal());
        return article;
    }

    public ArticleSummaryDto articleConvertToArticleSummaryDTO(Article article) {
        var articleSummaryDto = new ArticleSummaryDto();
        articleSummaryDto.setUuid(article.getUuid());
        articleSummaryDto.setTitle(article.getTitle());
        articleSummaryDto.setSummary(article.getSummary());
        articleSummaryDto.setCreateTime(article.getCreateTime());
        articleSummaryDto.setUpdateTime(article.getUpdateTime());
        return articleSummaryDto;
    }
}
