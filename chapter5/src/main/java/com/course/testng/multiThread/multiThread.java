package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class multiThread {

    @Test(invocationCount = 10,threadPoolSize = 3,timeOut = 2000)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread ID : %s%n",Thread.currentThread().getId());
    }
}
