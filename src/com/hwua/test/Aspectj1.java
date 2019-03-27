package com.hwua.test;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("aspectj1")
//@Aspect-声明这个类可以作为一个切面
@Aspect
//@Order(1)-确定代理类的优先级，值越小，优先级越高
@Order(1)
public class Aspectj1 {
//    第一个*代表任意访问修饰符+返回值类型
//    第二个*代表任意类名
//    第三个*代表任意方法名
//    第1个..代表任意个数的包
//    第2个..代表参数列表任意位置
//    切入点重用
    @Pointcut("execution(* com..*.*(..))")
    public void p(){}

}
