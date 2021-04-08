package com.linovce.blog.service;

import com.github.pagehelper.PageHelper;
import com.linovce.blog.common.ResultEnum;
import com.linovce.blog.entity.Article;
import com.linovce.blog.exception.BusinessException;
import com.linovce.blog.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
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

    public int insert(Article article){

        if(article.getArticleName()==null||article.getArticleName().equals(""))
            throw new BusinessException(ResultEnum.BusinessException);

        if(article.getContent()==null||article.getContent().equals(""))
            throw new BusinessException(ResultEnum.BusinessException);

        if(article.getSummary()==null||article.getSummary().equals(""))
            throw new BusinessException(ResultEnum.BusinessException);

        if(article.getHomePicture()==null||article.getHomePicture().equals("")){
            article.setHomePicture("defaults");
        }

        if(article.getOriginal()==null){
            article.setOriginal(1);
        }
        article.setAppreciate(0);
        article.setViews(0);
        article.setIsComments(1);
        article.setIsCopyright(1);
        article.setIsPublish(1);

        Date date = new Date();
        article.setCreateDate(date);
        article.setDoneDate(date);

        return articleMapper.insert(article);
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
