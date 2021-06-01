package com.javaBrain.JornalDev_springAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {
    public static void main(String[] args) {

        AbstractApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfig.class);

       DatabaseDriver oracleDriver=applicationContext.getBean("oracleDriver",DatabaseDriver.class);

        DatabaseDriver mySqlDriver=applicationContext.getBean("mySqlDriver",DatabaseDriver.class);

        System.out.println("Oracle driver info:");
        System.out.println(oracleDriver.getInfo());

        System.out.println("MySQL driver info:");
        System.out.println(mySqlDriver.getInfo());

    }
}
