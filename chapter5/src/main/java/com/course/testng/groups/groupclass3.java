package com.course.testng.groups;


import org.testng.annotations.Test;

@Test(groups = "teacher")
public class groupclass3 {

    public void teacher1(){
        System.out.println("这是teacher中的0001");
    }
    public void teacher2(){
        System.out.println("这是teacher中的0002");
    }
}
