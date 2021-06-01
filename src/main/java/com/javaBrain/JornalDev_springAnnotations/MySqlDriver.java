package com.javaBrain.JornalDev_springAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("mySqlDriver")
@PropertySource("mysqldatabase.properties")
public class MySqlDriver implements DatabaseDriver{

    @Value("${databaseName}")
    private  String databaseName;

    @Value("${disableStatementPooling}")
    private String disableStatementPooling;

    @Override
    public String getInfo() {
        return  "[ Driver: mySql" +
                ", databaseName: " + databaseName +
                ", disableStatementPooling: " + disableStatementPooling +
                " ]";
    }
}
