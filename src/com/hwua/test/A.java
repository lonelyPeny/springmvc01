package com.hwua.test;

import org.springframework.stereotype.Component;

@Component("a")
public class A {
    public void a1(){
        System.out.println("执行了一个a1方法");
        int a=1/0;
    }
    public void a2(){
        System.out.println("执行了一个a2方法");
    }
}
