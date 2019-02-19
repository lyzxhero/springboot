package com.lyzx.demo.annotation.config;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    private static final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);



    @Test
    public void testImport(){
        printBeans();

        Object m7 = context.getBean("m7");
        System.out.println("====="+m7.getClass());
    }

    public void printBeans(){
        String[] names = context.getBeanDefinitionNames();
        for(String name : names){
            System.out.println("--->"+name);
        }

    }

    @Test
    public void test1(){
        System.out.println("===test1容器创建完成====");
        String[] names = context.getBeanNamesForType(XMAN.class);
        for (String name : names) {
            System.out.println("----->"+name);
        }
    }

    public static void main(String[] args) {
        System.out.println("==================start=======================");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("===容器创建完成====");
        Object o1 = context.getBean("x-man");
        Object o2 = context.getBean("x-man");
        System.out.println(o1 == o2);
        System.out.println("===================end========================");
    }
}