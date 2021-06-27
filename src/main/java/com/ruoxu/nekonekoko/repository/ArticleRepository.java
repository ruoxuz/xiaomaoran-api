package com.ruoxu.nekonekoko.repository;

import com.ruoxu.nekonekoko.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ruoxu
 */
public interface ArticleRepository extends JpaRepository<Article, Long> {

    /**
    * find article by uuid
    * @param uuid
    * @return Article
    */
    Article findByUuid(String uuid);
}
