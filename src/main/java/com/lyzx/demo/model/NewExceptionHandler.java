package com.lyzx.demo.model;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;


@ControllerAdvice
public class NewExceptionHandler {

    @ExceptionHandler(Exception.class)//捕获自定义异常
    @ResponseBody
    public Map<String,Object> handlerException(Exception e) {//出现异常时会将异常传递过来

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", "自定义状态码");
        map.put("msg", e.getMessage());
        return map;
    }
}
