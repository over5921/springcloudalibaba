package com.over.zxing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jsflz on 2022/6/7 9:30
 */
@RestController
@RequestMapping("/test")
public class testController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }
}
