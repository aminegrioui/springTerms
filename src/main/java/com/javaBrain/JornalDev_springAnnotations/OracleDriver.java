package com.javaBrain.JornalDev_springAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("oracleDriver")
@PropertySource("oracledatabase.properties")
public class OracleDriver implements DatabaseDriver{
    @Value("${db.url}")
    protected String url;
    @Value("${db.user}")
    protected String user;
    @Value("${db.password}")
    protected String password;
    @Value("${db.driver}")
    protected String driver;
    @Value("${db.port}")
    protected Integer port;

    @Override
    public String getInfo() {
        return "[ Driver: Oracle" +
                ", url: " + url +
                ", port; " + port +
                ", user: " + user +
                ", password: " + password  +
                ", driver: " + driver +
                " ] ";
    }
}
