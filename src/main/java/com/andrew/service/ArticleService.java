package com.andrew.service;

import com.andrew.entity.Article;
import com.andrew.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dengpengfei on 2017/7/7.
 */
@Service
public class ArticleService {


    @Autowired
    private ArticleMapper articleMapper;

    public List<Article> getAllArticles() {
        return articleMapper.getAllArticle();
    }

    public Article getSpecificArticle(int id) {
        return articleMapper.getSpecificArticle(id);
    }
}
