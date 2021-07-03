package com.ruoxu.nekonekoko.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ruoxu.nekonekoko.dto.ArticleDTO;
import com.ruoxu.nekonekoko.model.Article;
import com.ruoxu.nekonekoko.service.ArticleService;
import com.ruoxu.nekonekoko.util.JsonConverter;
import com.ruoxu.nekonekoko.util.UUIDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
        List<Article> articleList = articleService.findAll();
        return JsonConverter.toString(articleList);
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
    public void saveArticle(@RequestBody ArticleDTO articleDTO) {
        var article = articleDtoConvertToArticle(articleDTO);
        article.setUuid(UUIDGenerator.getUUID());
        article.setDelFlag(Boolean.FALSE);
        articleService.saveArticle(article);
    }

    public Article articleDtoConvertToArticle(ArticleDTO articleDTO) {
        var article = new Article();
        article.setFolderId(articleDTO.getFolderId());
        article.setTitle(articleDTO.getTitle());
        article.setContent(articleDTO.getContent());
        article.setBackground(articleDTO.getBackground());
        article.setPersonal(articleDTO.getPersonal());
        return article;
    }
}
