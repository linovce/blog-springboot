package com.linovce.blog.service;

import com.github.pagehelper.PageHelper;
import com.linovce.blog.common.ResultEnum;
import com.linovce.blog.controller.ArticleController;
import com.linovce.blog.entity.Article;
import com.linovce.blog.exception.BusinessException;
import com.linovce.blog.mapper.ArticleMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private final static Logger logger = LoggerFactory.getLogger(ArticleService.class);
    @Autowired
    ArticleMapper articleMapper;

    public int insert(Article article){
        logger.info("开始调用ArticleService.insert方法，入参为：{}",article);
        if(article.getArticleName()==null||article.getArticleName().equals(""))
            throw new BusinessException(ResultEnum.BusinessException);

        if(article.getContent()==null||article.getContent().equals(""))
            throw new BusinessException(ResultEnum.BusinessException);

        if(article.getSummary()==null||article.getSummary().equals(""))
            throw new BusinessException(ResultEnum.BusinessException);

        if(article.getHomePicture()==null||article.getHomePicture().equals("")){
            article.setHomePicture("defaults");
        }

        if(article.isOriginal()){
            article.setOriginal(true);
        }
        article.setAppreciate(0);
        article.setViews(0);
        article.setPublish(true);
        article.setCopyright(true);
        article.setComments(true);

        Date date = new Date();
        article.setCreateDate(date);
        article.setDoneDate(date);
        logger.info("结束调用ArticleService.insert方法");
        return articleMapper.insert(article);
    }

    public int delete(int id){
        logger.info("调用ArticleService.delete方法，入参为：{}",id);
        return articleMapper.delete(id);
    }
    public void update(Article article){
        logger.info("调用ArticleService.update方法，入参为：{}",article);
        articleMapper.update(article);
    }
    public Article select(int id){
        logger.info("开始调用ArticleService.select方法，入参为：{}",id);
        Article article = articleMapper.select(id);
        return article;
    }

    public List<Article> selectAll(int pageNum,int pageSize){
        logger.info("开始调用ArticleService.selectAll分页查询方法，入参为：pageNum：{}，pageSize：{}",pageNum,pageSize);
        PageHelper.startPage(pageNum,pageSize);
        List<Article> result =  articleMapper.selectAll();
        return result;
    }

    public List<Article> selectAll(){
        logger.info("开始调用ArticleService.selectAll方法");
        List<Article> result =  articleMapper.selectAll();
        return result;
    }
}
