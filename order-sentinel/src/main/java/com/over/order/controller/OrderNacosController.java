package com.over.order.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * Created by jsflz on 2022/5/18 14:36
 */
@RestController
@RequestMapping("/order")
public class OrderNacosController {

    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功！");
        return "Hello world";
    }

    @RequestMapping("/flow")
//    @SentinelResource(value = "flow",blockHandler = "flowBlockHandler") 注释掉 测试统一流控规则
    public String flow(){
        return "正常访问";
    }
    public String flowBlockHandler(BlockException e){
        return "流控";
    }

    @RequestMapping("/flowThread")
    @SentinelResource(value = "flowThread",blockHandler = "flowBlockHandler")
    public String flowThread() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        return "正常访问";
    }

}
