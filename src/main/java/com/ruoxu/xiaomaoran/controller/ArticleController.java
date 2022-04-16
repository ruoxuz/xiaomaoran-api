package com.ruoxu.xiaomaoran.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ruoxu.xiaomaoran.dto.ArticleDetailDto;
import com.ruoxu.xiaomaoran.dto.ArticleSummaryDto;
import com.ruoxu.xiaomaoran.service.ArticleService;
import com.ruoxu.xiaomaoran.util.JsonConverter;
import com.ruoxu.xiaomaoran.util.UUIDGenerator;
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
        List<ArticleSummaryDto> articleSummaryDTOList = articleService.getArticleSummaryDtoList();;
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
        return JsonConverter.toString(articleService.getArticleByUuid(uuid));
    }

    @PostMapping("/saveArticle")
    public void saveArticle(@RequestBody ArticleDetailDto articleDetailDto) {
        articleService.saveArticleWithTags(articleDetailDto);
    }
}
