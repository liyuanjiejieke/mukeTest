package com.course.testng;

import org.testng.annotations.Test;

public class lgnoreTest {
    @Test
    public void lgnore1(){
        System.out.println("忽略执行111");
    }

    @Test(enabled = false)
    public void lgnore2(){
        System.out.println("忽略执行2222");
    }
}
