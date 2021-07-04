package com.ruoxu.nekonekoko.model;

import javax.persistence.*;
import java.util.Set;

/**
 * @author ruoxu
 */
@Entity
@Table(name = "tag")
public class Tag extends BaseEntity{

    private String name;

    @ManyToMany(mappedBy = "tags")
    private Set<Article> articles;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }
}
