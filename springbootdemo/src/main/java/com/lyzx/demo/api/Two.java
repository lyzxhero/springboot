package com.lyzx.demo.api;

import com.lyzx.demo.model.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/two")
public class Two {

    @Autowired
    private Hero hero;

    @RequestMapping("/v2")
    public String v1(){
        System.out.println("->"+hero);
        return "k1";
    }
}
