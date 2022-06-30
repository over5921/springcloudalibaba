package com.over.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by jsflz on 2022/5/27 10:34
 */
@SpringBootApplication
public class GatewayApplication {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext run = SpringApplication.run(GatewayApplication.class, args);
    }
}
