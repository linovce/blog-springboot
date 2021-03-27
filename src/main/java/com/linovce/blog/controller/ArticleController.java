package com.linovce.blog.controller;

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

    @RequestMapping("/")
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

    @RequestMapping("/select")
    @ResponseBody
    public String selectArticle() throws Exception {
        String tt =  articleService.select(101).toString();
        return tt;
    }
}
