package com.course.testng;

import com.sun.javafx.tk.TKPulseListener;
import org.testng.annotations.Test;

public class TimeoutTest {

    @Test(timeOut = 3000)
    public void test1() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("成功111112");
    }


    @Test(timeOut = 2000)
    public void test2() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("失败1111");
    }
}
