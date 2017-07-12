package com.andrew.contorller;

import com.andrew.entity.Article;
import com.andrew.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by dengpengfei on 2017/7/7.
 */
@RestController
@CrossOrigin
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping("/getAllArticles")
    public List<Article> getAllArticles() {
        return articleService.getAllArticles();
    }

    @RequestMapping("/getSpecificArticle")
    public Article getSpecificArticle(int id) {
        return articleService.getSpecificArticle(id);
    }

    @RequestMapping(value = "/private/getSpecificArticle/{id}")
    public Article getPrivateSpecificArticle(@PathVariable final int id) {
        return articleService.getSpecificArticle(id);
    }
}

