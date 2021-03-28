package com.linovce.blog.mapper;

import com.linovce.blog.entity.Article;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author linovce
 * @title: ArticleMapper
 * @projectName com.linovce.blog.mapper
 * @description: TODO
 * @date 2021/3/2714:45
 */
@Repository
public interface ArticleMapper {

    void insert(Article article);
    void delete(int id);
    void update(Article article);
    Article select(int id);
    List<Article> selectAll();
//    int selectCount();
}
