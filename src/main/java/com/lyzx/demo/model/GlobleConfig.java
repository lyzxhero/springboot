package com.lyzx.demo.model;


import com.lyzx.demo.api.interceptor.MyInterceptor;
import com.lyzx.demo.api.interceptor.MyInterceptor3;
import com.lyzx.demo.api.interceptor.MyInterceptor2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class GlobleConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry
                .addInterceptor(new MyInterceptor3())
                .addPathPatterns("/three/**");

        registry
                .addInterceptor(new MyInterceptor2())
                .addPathPatterns("/two/**");

        registry.addInterceptor(new MyInterceptor())
                .addPathPatterns("/v*");
    }

    /**
     * 把返回值放入到容器中，这个bean的默认id就是这个方法名hero123
     * @return
     */
    @Bean
    public Hero hero123(){
        System.out.println("*****hero****");
        return new Hero();
    }
}
