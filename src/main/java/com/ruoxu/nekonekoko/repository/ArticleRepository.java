package com.ruoxu.nekonekoko.repository;

import com.ruoxu.nekonekoko.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ruoxu
 */
public interface ArticleRepository extends JpaRepository<Article, Long> {
    Article findByUuid(String uuid);
}
