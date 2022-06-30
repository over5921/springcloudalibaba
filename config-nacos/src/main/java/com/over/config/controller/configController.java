package com.over.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jsflz on 2022/5/19 14:51
 */
@RestController
@RequestMapping("/test")
@RefreshScope
public class configController {
    //@Value注解可以获取到配置中心的值，但是无法动态感知修改后的值，需要利用@RefreshScope注解
    @Value("${user.age}")
    public String comm;
    @RequestMapping("/test")
    public String test(){
        return comm;
    }
}
