package com.andrew.mapper;

/**
 * Created by dengpengfei on 2017/7/7.
 */

import com.andrew.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
}
