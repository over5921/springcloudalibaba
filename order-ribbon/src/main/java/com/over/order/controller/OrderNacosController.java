package com.over.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jsflz on 2022/5/18 14:36
 */
@RestController
@RequestMapping("/order")
public class OrderNacosController {

    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功！");
        String forObject = restTemplate.getForObject("http://stock-service/stock/reduct", String.class);
        return "Hello world,"+forObject;
    }
}
