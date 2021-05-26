package com.javaBrain.springObjectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springObjectInjection.xml");

        Traingle traingle=(Traingle) applicationContext.getBean("traingle");
        traingle.draw();

    }
}
