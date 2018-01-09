package com.gengsc.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description
 * @Author shichaogeng
 * @Create 2018-01-04 15:47
 */
public class ProviderTest {

    public static void main(String[] args) throws Exception{
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("producer-context.xml");
        app.start();

        System.out.println("app run...");

        System.in.read();//任意键退出
    }
}
