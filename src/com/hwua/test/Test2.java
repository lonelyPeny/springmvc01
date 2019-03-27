package com.hwua.test;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

public class Test2 {
    @RequestMapping(value = "/test1")
    public String test1(HttpServletRequest req,) {
    }

//    ********************入参********************
//    以Map作为入参
    @RequestMapping(value = "/test1")
    public String test1(Map<String,Object>map){
        String username="admin";
        map.put("username",username);
        .
    }
}
