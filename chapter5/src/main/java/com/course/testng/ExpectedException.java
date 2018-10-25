package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFaile(){

        System.out.println("异常测试");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runtimesuccess(){
        System.out.println("success11111111");
        throw new RuntimeException();
    }
}
