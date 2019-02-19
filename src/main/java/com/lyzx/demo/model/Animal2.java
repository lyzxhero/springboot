package com.lyzx.demo.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource(value = {"classpath:application-local.yaml"})
@Component
@ConfigurationProperties(prefix = "animal")
//@PropertySource(value = {"classpath:person.properties"})
public class Animal2 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
