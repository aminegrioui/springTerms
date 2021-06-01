package com.javaBrain.JornalDev_springAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.javaBrain.JornalDev_springAnnotations")
public class AppConfig {

    @Bean
    DatabaseDriver oracleDriver(){
        return new OracleDriver();
    }

    @Bean
    DatabaseDriver mysqlDriver() {
        return new MySqlDriver();
    }
}
