package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
public class GroupsonMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("服务端1111");
    }
    @Test(groups = "server")
        public void test2(){
            System.out.println("服务端222");
        }
    @Test(groups = "client")
        public void test3(){
            System.out.println("客户端111");
        }
    @Test(groups = "client")
        public void test4(){
            System.out.println("客户端222");
        }

        @BeforeGroups("server")
        public void beforgroupserver(){
            System.out.println("服务端运行前");
        }
        @AfterGroups("server")
    public void aftergroupserver(){
        System.out.println("服务端运行后");
    }

    }

