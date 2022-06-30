package com.over.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by jsflz on 2022/5/18 14:41
 */
@SpringBootApplication
@EnableFeignClients
public class FeginSentinelAppliction {

    public static void main(String[] args) {
        SpringApplication.run(FeginSentinelAppliction.class, args);
    }

}
