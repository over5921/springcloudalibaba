package com.over.order.controller;


import com.over.order.entity.Order;
import com.over.order.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;



/**
 * (Order)控制层
 *
 * @author makejava
 * @since 2022-05-25 17:13:33
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;

    @GetMapping("/update")
    public void update(){
        Order order =new Order();
        order.setCount(9);
        order.setId(1L);
//        order.setMoney(1.00);
//        order.setProductId(1L);
//        order.setStatus(1);
//        order.setUserId(1L);
        orderService.update(order);

    }



}