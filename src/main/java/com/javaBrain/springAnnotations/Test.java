package com.javaBrain.springAnnotations;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("annotationsStereotype.xml");

        Shape circle=(Circle) applicationContext.getBean("circle");
        circle.draw();



    }
}
