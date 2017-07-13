package com.andrew;

import com.andrew.contorller.ArticleController;
import com.andrew.entity.Article;
import com.andrew.entity.GsonObject;
import com.google.gson.Gson;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ArticleControllerTests {
    @Autowired
    private ApplicationContext context;

    @Autowired
    private GsonObject gsonObject;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ArticleController articleController;

    @Test
    @Ignore
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/helloWorld")).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(containsString("Hello World")));
    }

    @Test
    @Ignore
    public void testCreateArticleWebLayer() throws Exception {
        Article article = new Article();
        article.setId(1);
        article.setAuthor("tester");
        article.setContent("tester content 1");
        article.setCreateTime(new Date());
        article.setId(1003);
        article.setTitle("articleTitle");
        article.setCategory("category");
        article.setTag("tag");


        this.mockMvc.perform(post("/createArticle").param("article", gsonObject.getGson().toJson(article))).andDo(print()).andExpect(status().isOk());
    }

    @Test
    public void testUpdateArticleWebLayer() throws Exception{
        Article article = new Article();
        article.setId(1);
        article.setAuthor("tester");
        article.setContent("update content 1");
        article.setCreateTime(new Date());
        article.setId(1003);
        article.setTitle("articleTitle");
        article.setCategory("category");
        article.setTag("tag");

        this.mockMvc.perform(post("/updateArticle").param("article", gsonObject.getGson().toJson(article))).andDo(print()).andExpect(status().isOk());

    }

    @Test
    @Ignore
    public void testCreateArticle() {
        Article article = new Article();
        article.setAuthor("tester");
        article.setContent("tester content");
        article.setCreateTime(new Date());
        article.setId(1002);
        article.setTitle("articleTitle");
        article.setCategory("category");
        article.setTag("tag");

        Gson gsonObj = (Gson) context.getBean("getGson");
        articleController.createArticle(gsonObj.toJson(article));
    }


}
