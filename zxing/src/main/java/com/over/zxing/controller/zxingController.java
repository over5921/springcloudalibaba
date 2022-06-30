package com.over.zxing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by jsflz on 2022/6/7 9:25
 */
@Controller
@RequestMapping("/")
public class zxingController {

    @RequestMapping("/")
    public ModelAndView index(HttpServletRequest request) throws Exception {
        return new ModelAndView("h1");
    }
}
