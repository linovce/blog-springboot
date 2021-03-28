package com.linovce.blog.controller;

import com.github.pagehelper.PageHelper;
import com.linovce.blog.entity.Article;
import com.linovce.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author linovce
 * @title: ArticleController
 * @projectName com.linovce.blog.controller
 * @description: TODO
 * @date 2021/3/27 15:41
 */
@Controller
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @RequestMapping("/insertArticle")
    @ResponseBody
    public String insertArticle() throws Exception {
        Article article = new Article();
        article.setArticleName("test1");
        article.setContent("import com.linovce.blog.entity.Article;\n" +
                "import com.linovce.blog.service.ArticleService;\n" +
                "import org.springframework.beans.factory.annotation.Autowired;\n" +
                "import org.springframework.stereotype.Controller;\n" +
                "import org.springframework.web.bind.annotation.RequestMapping;\n" +
                "import org.springframework.web.bind.annotation.ResponseBody;");

        articleService.insert(article);
        return "success";
    }

    @RequestMapping("/selectArticle")
    @ResponseBody
    public Article selectArticle() throws Exception {
        int i = 1/0;
        Article result =  articleService.select(1);
        return result;
    }

    @RequestMapping("/deleteArticle")
    @ResponseBody
    public Article deleteArticle() throws Exception {
        articleService.delete(101);
        return null;
    }

    @RequestMapping("/updateArticle")
    @ResponseBody
    public Article updateArticle() throws Exception {
        Article article = new Article();
        articleService.update(article);
        return null;
    }

    @RequestMapping("/listArticle")
    @ResponseBody
    public List<Article> listArticle() throws Exception {
        List<Article> result =  articleService.selectAll(2,2);
        return result;
    }
}
