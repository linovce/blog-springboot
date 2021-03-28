package com.linovce.blog.service;

import com.github.pagehelper.PageHelper;
import com.linovce.blog.entity.Article;
import com.linovce.blog.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author linovce
 * @title: ArticleService
 * @projectName com.linovce.blog.service
 * @description: TODO
 * @date 2021/3/27 15:36
 */
@Service("articleService")
public class ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    public void insert(Article article){

        if(article.getArticleName()==null||article.getArticleName().equals("")||article.getContent()==null||article.getContent().equals(""))
            System.out.println("插入文章数据不完整！");

        articleMapper.insert(article);
    }
    public void delete(int id){
        articleMapper.delete(id);
    }
    public void update(Article article){
        articleMapper.update(article);
    }
    public Article select(int id){
        Article article = articleMapper.select(id);
        return article;
    }

    public List<Article> selectAll(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageNum);
        List<Article> result =  articleMapper.selectAll();
        return result;
    }
}
