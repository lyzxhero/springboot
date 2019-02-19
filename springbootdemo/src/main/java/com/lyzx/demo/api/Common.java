package com.lyzx.demo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Common {

    @RequestMapping("/x1")
    public String x1(){
        return "x1";
    }

    @RequestMapping("/x2")
    public String x2(){
        return "x1";
    }

    @RequestMapping("/v1")
    public String v1(){
        return "v1";
    }

}