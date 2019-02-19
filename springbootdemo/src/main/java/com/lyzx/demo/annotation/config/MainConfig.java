package com.lyzx.demo.annotation.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;


/**
 * 告诉spring这是一个配置类
 * excludeFilters表示要排除的项
 */
@Configuration
@ComponentScan(value = "com.lyzx.demo.annotation.config",excludeFilters = {@ComponentScan.Filter(type=FilterType.ANNOTATION,classes = {Service.class})})

/**
 * Import的3中用法
 *  1、直接把Bean的Class加入values的数组，获取时使用全类名获取
 *  2、使用ImportSelector的实现类返回Bean的全类名
 *  3、使用ImportBeanDefinitionRegistrar的实现类自定义bean的名字
 */
@Import({M1.class,M2.class,MyImport.class,MyBeanDefinitionRegister.class})
public class MainConfig {

    @Lazy
//    @Scope("prototype")
    //表示把返回值加入到容器中
    @Bean("x-man")//默认id是方法名，使用Bean的value属性修改默认id
    public XMAN xman1(){
//        System.out.println("");
        return new XMAN("age",11);
    }

    /**
     * 表示满足条件的bean被添加到容器中
     * @return
     */
    @Conditional(MacosCondition.class)
    @Bean("macXman_123")
    public XMAN macXman(){
        return  new XMAN("macos",99);
    }

    @Conditional(LinuxosCondition.class)
    @Bean("linuxXman_123")
    public XMAN linuxXman(){
        return  new XMAN("linux",99);
    }

    @Bean
    public M7BeanFactory m7(){
        return new M7BeanFactory();
    }


}
