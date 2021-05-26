package com.javaBrain.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Test {
    public static void main(String[] args) {
       // BeanFactory beanFactory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
      //  Traingle traingle=(Traingle) beanFactory.getBean("studentbean");
        Traingle traingle1=(Traingle) applicationContext.getBean("studentbean") ;
        traingle1.draw();

    }
}
