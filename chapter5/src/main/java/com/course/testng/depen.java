package com.course.testng;

import org.testng.annotations.Test;

public class depen {

    @Test
    public void test1(){
        System.out.println("333333333");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("55555");
    }
}
