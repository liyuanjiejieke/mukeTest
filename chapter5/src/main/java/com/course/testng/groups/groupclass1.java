package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class groupclass1 {

    public void stu1(){
        System.out.println("groupclass1中的0001");
    }
    public void stu2(){
        System.out.println("groupclass1中的0002");
    }
}
