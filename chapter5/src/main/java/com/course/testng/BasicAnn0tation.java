package com.course.testng;

import org.testng.annotations.*;

public class BasicAnn0tation {
    //Test  是最基本的注解   方法标记为测试的一部分一个测试方法，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试1");

    }

    @Test
    public void tetsCase2(){
        System.out.println("这是测试2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod测试方法之前运行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod测试方法之后运行");
    }


    @BeforeClass
    public void BeforeClass(){
        System.out.println("类之前运行");
    }


    // 注册一些对象   静态的东西、复制   变量赋值
    @AfterClass
    public void afterClass(){
        System.out.println("类之后运行");
    }


    //在整个类运行之前运行，可以包含多个类
    @BeforeSuite
    public void beforSuite(){
        System.out.println("beforSuitel");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuitel");
    }

}
