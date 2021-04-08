package com.linovce.blog.controller;

import com.github.pagehelper.PageHelper;
import com.linovce.blog.entity.Article;
import com.linovce.blog.service.ArticleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
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
@Controller
@Api(tags = "文章管理")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @ApiOperation(value = "插入文章", notes="插入文章")
    @RequestMapping(value = "/insertArticle",method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public int insertArticle(@RequestBody Article article) throws Exception {
        articleService.insert(article);
        return article.getArticleId();
    }

    @ApiOperation(value = "查询文章", notes="通过文章编号查询文章")
    @RequestMapping(value ="/selectArticle",method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public Article selectArticle() throws Exception {
        Article result =  articleService.select(1);
        return result;
    }

    @RequestMapping(value ="/deleteArticle",method = RequestMethod.DELETE)
    @ResponseBody
    public Article deleteArticle() throws Exception {
        articleService.delete(101);
        return null;
    }

    @RequestMapping(value ="/updateArticle",method = RequestMethod.POST)
    @ResponseBody
    public Article updateArticle() throws Exception {
        Article article = new Article();
        articleService.update(article);
        return null;
    }

    @ApiOperation(value = "查询所有文章", notes="查询所有文章")
    @RequestMapping(value ="/listArticle",method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Article> listArticle() throws Exception {
        List<Article> result =  articleService.selectAll(2,2);
        return result;
    }
}
