package com.over.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jsflz on 2022/5/18 14:41
 */
@SpringBootApplication
@EnableFeignClients
public class OrderNacosAppliction {

    public static void main(String[] args) {
        SpringApplication.run(OrderNacosAppliction.class, args);
    }

}
