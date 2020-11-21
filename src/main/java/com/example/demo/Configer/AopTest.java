package com.example.demo.Configer;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopTest {

    //定义切入点
    @Pointcut("execution(* com.example.demo.*.*(..))")
    public void  point(){
    }

    @Before("point()")
    public void before(){
        System.out.println("before方法执行");
    }
    @After("point()")
    public void  after(){
        System.out.println("after方法执行");
    }
}
