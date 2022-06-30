package com.over.stock;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by jsflz on 2022/5/26 13:55
 */
@SpringBootApplication
@MapperScan("com.over.stock.mapper")
public class ApplicationStock {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStock.class, args);
    }
}
