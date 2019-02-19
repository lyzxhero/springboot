package com.lyzx.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("/three")
public class Three {
    @Autowired
    private ApplicationContext context;

    @Autowired
    private ApplicationArguments args;

    @RequestMapping("v3")
    public String v3(){
        boolean hero = context.containsBean("hero123");
        System.out.println("----"+hero);

//        boolean arg1 = args.containsOption("arg1");
        List<String> args1 = args.getOptionValues("args1");
        Set<String> set = args.getOptionNames();


        System.out.println("=====args.getOptionValues:"+args1);
        System.out.println("=====args.getOptionNames:"+set);

        return "v3_ok";
    }


}