package com.hwua.contriller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//声明这个类为处理器类，可以提取重复多级目标
public class Hello {
//  声明这个方法为处理器方法，对相应的请求进行处理
//  一个处理器方法可以接收不同路径的请求，多个路径用
//    {"/hello","hello"}

    @RequestMapping(value = {"/hello","/hello1"})
//    @RequestMapping("/hello1")
    public String hello1(){
        return "welcome";
    }
    @RequestMapping("/hello2")
    public String hello2(){
        return "welcome";
    }
    @RequestMapping("/hello3")
    public String hell3(){
        return "welcome";
    }
    @RequestMapping("/hello4")
    public String hello4(){
        return "welcome";
    }
//    *可以代表人一个数的任意字节
//    *的位置可以随意 可前可后
    @RequestMapping("/*b")
    public String hello5(){
        return "welcome";
    }
//    可以匹配任何路径
    @RequestMapping("/*/abc")
    public String hello6(){
        return "welcome";
    }
//    **代表中间路径级别可以是任意多个
    @RequestMapping("/**/abc")
    public String hello7(){
        return "welcome";
    }
}
