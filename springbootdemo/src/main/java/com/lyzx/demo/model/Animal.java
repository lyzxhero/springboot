package com.lyzx.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.Email;
import java.util.List;


/**
 * ConfigurationProperties配置属性，
 * prefix = "animal"
 * 表示把配置文件中animal和这个类进行一一映射
 * 注意要映射的字段要有get/set方法
 */
@PropertySource(value = {"classpath:application-local.yaml"})
@Component
@ConfigurationProperties(prefix = "animal")
@Validated
public class Animal {

    @Email
    private String email;
    private String desc;
    private List<Object> list;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "email='" + email + '\'' +
                ", desc='" + desc + '\'' +
                ", list=" + list +
                '}';
    }
}