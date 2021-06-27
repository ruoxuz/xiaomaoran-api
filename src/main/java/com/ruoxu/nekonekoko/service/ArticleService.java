package com.ruoxu.nekonekoko.service;

import com.ruoxu.nekonekoko.model.Article;
import com.ruoxu.nekonekoko.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ruoxu
 */
@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    public List<Article> findAll() {
        return articleRepository.findAll();
    }
}
