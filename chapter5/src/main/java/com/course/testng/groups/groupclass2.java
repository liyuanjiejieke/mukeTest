package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class groupclass2 {

    public void stu1() {
        System.out.println("groupclass2中的0001");
    }

    public void stu2() {
        System.out.println("groupclass2中的0002");
    }
}