package com.over.order.controller;

import com.over.order.fegin.StockFeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jsflz on 2022/5/18 14:36
 */
@RestController
@RequestMapping("/order")
public class OrderNacosController {
    @Autowired
    StockFeginService stockFeginService;

    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功！");
        String reduct = stockFeginService.reduct();
        return "Hello world,"+reduct;
    }
}
