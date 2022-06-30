package com.over.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * Created by jsflz on 2022/5/19 14:12
 */
@SpringBootApplication
public class ConfigApplication {
    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext run = SpringApplication.run(ConfigApplication.class, args);
//        while (true){
//            String userName = run.getEnvironment().getProperty("user.name");
//            String userAge = run.getEnvironment().getProperty("user.age");
//            String userCommon = run.getEnvironment().getProperty("user.common");
//           System.out.println("userName:  "+userName+";userAge: "+userAge+";userCommon:"+userCommon);
//            TimeUnit.SECONDS.sleep(2);
//        }
    }
}
