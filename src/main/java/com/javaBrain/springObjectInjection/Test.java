package com.javaBrain.springObjectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springObjectInjection.xml");



        // without using Coding to interfece
        Traingle traingle=(Traingle) applicationContext.getBean("traingle");
        traingle.draw();
        Circle traingle2=(Circle) applicationContext.getBean("circle");
        traingle2.draw();
        System.out.println("Using Interface");
        Shape shape=(Traingle) applicationContext.getBean("traingle");
        shape.draw();

    }
}
