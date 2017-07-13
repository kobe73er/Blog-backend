package com.andrew.contorller;

import com.andrew.entity.Article;
import com.andrew.service.ArticleService;
import com.google.gson.Gson;
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
    Gson gson = new Gson();

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

    @RequestMapping(value = "/createArticle", method = RequestMethod.POST)
    public void createArticle(@RequestParam(value = "article", required = true) String article) {
        Article thisArticle = gson.fromJson(article, Article.class);
        articleService.createArticle(thisArticle);
    }

    @RequestMapping(value = "/updateArticle", method = RequestMethod.POST)
    public void updateArticle(@RequestParam(value = "article",required = true)String article){
        Article thisArticle = gson.fromJson(article, Article.class);
        articleService.updateArticle(thisArticle);

    }

    @RequestMapping("/helloWorld")
    public @ResponseBody
    String greeting() {
        return "Hello World";
    }
}

