package com.javaBrain.JornalDev_springAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    @Qualifier("mySqlDriver")
    private DatabaseDriver databaseDriver;

    public String getDriverInfo(){
        return databaseDriver.getInfo();
    }

}
