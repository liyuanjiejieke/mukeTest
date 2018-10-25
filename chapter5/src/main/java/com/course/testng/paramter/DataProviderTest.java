package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sun.java2d.opengl.OGLContext;

import java.lang.reflect.Method;
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDtaprovider(String name,int age){
        System.out.println("name="+name+"\nage="+age);
    }
    @DataProvider(name="data")
    public Object [][] providerData(){
        Object[][] o=new Object[][]{
                {"zahngsan",85},
                {"lisi",96},
                {"dududuu",78}
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String name,int age){
        System.out.println("test11"+"name="+name+   "age="+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age){
        System.out.println("test11"+"name="+name+   "age="+age);
    }
    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result=null;
        if(method.getName().equals("test1")){

            result=new Object[][]{
                    {"liyunajie",234},
                    {"hahha",90}
            };
        }else if(method.getName().equals("test2")){
            result=new Object[][]{
                    {"liyunajie333",2342},
                    {"hahha333",902}
            };
        }
        return result;
    }

}
