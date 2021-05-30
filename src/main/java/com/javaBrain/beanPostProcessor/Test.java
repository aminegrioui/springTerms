package com.javaBrain.beanPostProcessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beanPostProcessorSpring.xml");

        Traingle traingle=(Traingle) applicationContext.getBean("traingle");
        traingle.draw();


    }
}
