package com.andrew.mapper;

/**
 * Created by dengpengfei on 2017/7/7.
 */

import com.andrew.entity.Article;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Andrew De
 */
@Mapper
public interface ArticleMapper {

    @Select("select * from blog.article")
    List<Article> getAllArticle();

    @Select("select * from blog.article where id=#{id}")
    Article getSpecificArticle(int id);

    @Insert("INSERT INTO Blog.article(id, title, content, createTime, author, tag, category) " +
            "VALUES (#{id},#{title},#{content},#{createTime} ,#{author},#{tag},#{category})")
    void createArticle(Article entity);

    @Update("UPDATE Blog.article SET title=#{title},content=#{content},tag=#{tag},category=#{category} where id=#{id}" )
    void updateArticle(Article article);
}
