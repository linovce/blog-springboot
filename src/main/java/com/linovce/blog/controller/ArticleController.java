package com.linovce.blog.controller;


import com.github.pagehelper.PageInfo;
import com.linovce.blog.common.ResultEnum;
import com.linovce.blog.entity.Article;
import com.linovce.blog.exception.BusinessException;
import com.linovce.blog.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import oracle.jrockit.jfr.StringConstantPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author linovce
 * @title: ArticleController
 * @projectName com.linovce.blog.controller
 * @description: TODO
 * @date 2021/3/27 15:41
 */
@CrossOrigin
@Controller
@Api(tags = "文章管理")
public class ArticleController {
    private final static Logger logger = LoggerFactory.getLogger(ArticleController.class);

    @Autowired
    ArticleService articleService;

    @ApiOperation(value = "插入文章", notes="插入文章")
    @RequestMapping(value = "/insertArticle",method = RequestMethod.POST)
    @ResponseBody
    public int insertArticle(@RequestBody Article article) throws Exception {
        logger.info("开始插入文章,文章数据为：{}",article);
        articleService.insert(article);
        logger.info("插入文章结束！");
        return article.getArticleId();
    }

    @ApiOperation(value = "查询文章", notes="通过文章编号查询文章")
    @RequestMapping(value ="/selectArticle",method = RequestMethod.GET)
    @ResponseBody
    public Article selectArticle(@RequestParam(name = "articleId") int articleId) throws Exception {
        logger.info("开始通过文章编号查询文章,文章编号为：{}",articleId);
        Article result =  articleService.select(articleId);
        return result;
    }

    @ApiOperation(value = "删除文章", notes="通过文章编号物理删除文章")
    @RequestMapping(value ="/deleteArticle",method = RequestMethod.DELETE)
    @ResponseBody
    public int deleteArticle(@RequestBody int articleId) throws Exception {
        return articleService.delete(articleId);
    }

    @ApiOperation(value = "更新文章", notes="更新文章")
    @RequestMapping(value ="/updateArticle",method = RequestMethod.POST)
    @ResponseBody
    public int updateArticle(@RequestBody Article article) throws Exception {
        articleService.update(article);
        return article.getArticleId();
    }

    @ApiOperation(value = "查询所有文章", notes="分页查询所有文章")
    @RequestMapping(value ="/pagingArticle",method = RequestMethod.GET)
    @ResponseBody
    public PageInfo<Article> listArticle(@RequestParam(name = "pageNum") Integer pageNum, @RequestParam(name = "pageSize") Integer pageSize) throws Exception {
        logger.info("开始分页查询所有文章,当前页面：{}，每页{}条数据",pageNum,pageSize);

        if(pageNum<0||pageSize<=0)
            throw new BusinessException(ResultEnum.BusinessException);

        List<Article> result =  articleService.selectAll(pageNum,pageSize);

        PageInfo<Article> page = new PageInfo<>(result);
        return page;
    }

    @ApiOperation(value = "查询所有文章", notes="不分页查询所有文章")
    @RequestMapping(value ="/listArticle",method = RequestMethod.GET)
    @ResponseBody
    public List<Article> listArticle() throws Exception {
        List<Article> result =  articleService.selectAll();
        return result;
    }
}
