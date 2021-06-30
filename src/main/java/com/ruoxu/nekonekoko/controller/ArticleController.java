package com.ruoxu.nekonekoko.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ruoxu.nekonekoko.dto.ArticleDTO;
import com.ruoxu.nekonekoko.model.Article;
import com.ruoxu.nekonekoko.service.ArticleService;
import com.ruoxu.nekonekoko.util.JsonConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public void saveArticle(ArticleDTO articleDTO) {
        articleService.saveArticle(articleDtoConvertToArticle(articleDTO));
    }

    public Article articleDtoConvertToArticle(ArticleDTO articleDTO) {
        var article = new Article();
        article.setUuid(articleDTO.getUuid());
        article.setUserId(articleDTO.getUserId());
        article.setFolderId(articleDTO.getFolderId());
        article.setTitle(articleDTO.getTitle());
        article.setContent(articleDTO.getContent());
        article.setBackground(articleDTO.getBackground());
        article.setPersonal(articleDTO.getPersonal());
        article.setCreateTime(articleDTO.getCreateTime());
        article.setUpdateTime(articleDTO.getUpdateTime());
        return article;
    }
}
