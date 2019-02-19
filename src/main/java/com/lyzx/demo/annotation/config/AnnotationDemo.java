package com.lyzx.demo.annotation.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/annotation")
@RestController
public class AnnotationDemo {

//    @Autowired//模式按照类型注入
    private XMAN xman;

    @RequestMapping("/v1")
    public String v1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        //获取所有在容器中定义的名字
        String[] names = context.getBeanDefinitionNames();

        for(String name : names){
            System.out.println("==="+name);
        }

        System.out.println("------"+xman);
        return "v1";
    }
}
