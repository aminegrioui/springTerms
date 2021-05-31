package com.javaBrain.springObjectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

       // ApplicationContext applicationContext=new ClassPathXmlApplicationContext("springObjectInjection.xml");



        // without using Coding to interfece
    /*    Traingle traingle=(Traingle) applicationContext.getBean("traingle");
        traingle.draw();
        System.out.println("Using Interface");
        Shape shape=(Traingle) applicationContext.getBean("traingle");
        shape.draw();*/
        AbstractApplicationContext  applicationContext2=new ClassPathXmlApplicationContext("springObjectInjection.xml");
       applicationContext2.registerShutdownHook();
        Circle circle=(Circle) applicationContext2.getBean("circle");
        circle.draw();


    }
}
