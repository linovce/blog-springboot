package com.linovce.blog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration //声明该类为配置类
@EnableSwagger2 //声明启动Swagger2
public class SwaggerConfig{
    @Bean//Swagger的使用主要是要将docket对象传入IOC容器
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())//关于文档的各种信息
                .select()//选择扫描的接口
                .apis(RequestHandlerSelectors.basePackage("com.linovce.blog.controller"))//指定扫描的接口
//                .paths(PathSelectors.any())
                .build();
    }
    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("blog-springboot的Swagger2在线接口文档")//页面标题
//                .contact(new Contact("linovce", "https://blog.csdn.net/qq_35524157", "runyulin@qq.com"))//创建人
                .version("1.0")//版本号
//                .description("博客系统在线接口")//描述
                .build();
    }
}