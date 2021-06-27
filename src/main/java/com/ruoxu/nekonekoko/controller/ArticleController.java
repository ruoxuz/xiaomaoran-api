package com.ruoxu.nekonekoko.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ruoxu.nekonekoko.model.Article;
import com.ruoxu.nekonekoko.service.ArticleService;
import com.ruoxu.nekonekoko.util.JsonConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
    * @date: 2021/6/26 11:47
    * @description: 获取文章
    */
    @GetMapping("/getArticles")
    @ResponseBody
    public String getArticles() throws JsonProcessingException {
        List<Article> articleList = articleService.findAll();
        String result = JsonConverter.toString(articleList);
        return result;
    }
}
