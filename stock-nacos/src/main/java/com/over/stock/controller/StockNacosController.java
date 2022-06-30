package com.over.stock.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jsflz on 2022/5/18 14:38
 */
@RestController
@RequestMapping("/stock")
public class StockNacosController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/reduct")
    public String reduct(){
        System.out.println("扣减库存！");
        return "扣减库存"+port;
    }

    @RequestMapping("/reduct1")
    public String reduct1(){
        int a=1/0;
        System.out.println("扣减库存！");
        return "扣减库存"+port;
    }
}
