package com.ruoxu.xiaomaoran.service;

import com.ruoxu.xiaomaoran.dao.ArticleSummaryDao;
import com.ruoxu.xiaomaoran.dto.ArticleDetailDto;
import com.ruoxu.xiaomaoran.dto.ArticleSummaryDto;
import com.ruoxu.xiaomaoran.mapper.ArticleMapper;
import com.ruoxu.xiaomaoran.mapper.TagMapper;
import com.ruoxu.xiaomaoran.model.Article;
import com.ruoxu.xiaomaoran.model.RelArticleTag;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static com.ruoxu.xiaomaoran.mapper.ArticleDynamicSqlSupport.article;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

/**
 * @author ruoxu
 */
@Service
public class ArticleService {
    @Autowired
    private ArticleSummaryDao articleSummaryDao;
    @Autowired
    private ArticleMapper articleMapper;
    @Autowired
    private TagMapper tagMapper;

    public List<ArticleSummaryDto> getArticleSummaryDtoList() {
        return articleSummaryDao.getArticleSummaryDtoList();
    }

    public Article getArticleByUuid(String uuid) {
        return articleMapper.selectOne(c ->
                c.where(article.uuid, isEqualTo(uuid))).get();
    }

    @Transactional
    public void saveArticleWithTags(ArticleDetailDto articleDetailDto) {
        // save article
        Article article = new Article();
        BeanUtils.copyProperties(articleDetailDto, article);
        articleMapper.insert(article);

        // save rel_article_tag
//        List<RelArticleTag> articleTagList = new ArrayList<>();
//        articleDetailDto.getTags().forEach(tag -> {
//            RelArticleTag relArticleTag = new RelArticleTag();
//            relArticleTag.setArticleId(article.getId());
//            relArticleTag.setTagId(tag.ge);
//        });
//
//        tagMapper.insertMultiple()
    }
}
