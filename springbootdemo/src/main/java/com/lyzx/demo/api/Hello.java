package com.lyzx.demo.api;

import com.lyzx.demo.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class Hello {
    @Value("${spring.boot.p1}")
    private String k1;

    @Value("${hero.name}")
    private String name;

    @Value("${hero.age}")
    private Integer age;

    @Value("${hero.go}")
    private String go;

//    @Value("${animal}")
//    private List<Object> animal;

    @Autowired
    private Animal animal;

    @RequestMapping("/v1")
    public String hello(){
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("go="+go);

        System.out.println("animal:"+animal);
//        System.out.println("animal:"+animal);
        return k1;
    }
}
