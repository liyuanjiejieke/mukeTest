package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suiteConfig {

    @BeforeSuite
    public void beforSuit(){
        System.out.println("befor suite运行啦");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("aftersuite 运行啦");
    }

    @BeforeTest
    public void beforTest(){
        System.out.println("beforTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
}
