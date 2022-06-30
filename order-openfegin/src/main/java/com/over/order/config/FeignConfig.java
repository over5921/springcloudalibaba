package com.over.order.config;

import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;

/**
 * Created by jsflz on 2022/5/19 11:27
 */
//日志等级有 4 种，分别是：
//        NONE【性能最佳，适用于生产】：不记录任何日志（默认值）。
//        BASIC【适用于生产环境追踪问题】：仅记录请求方法、URL、响应状态代码以及
//        执行时间。
//        HEADERS：记录BASIC级别的基础上，记录请求和响应的header。
//        FULL【比较适用于开发及测试环境定位问题】：记录请求和响应的header、body
//        和元数据
// 注意： 此处配置@Configuration注解就会全局生效，如果想指定对应微服务生效，就不能配置
public class FeignConfig {
    /**
     * 日志级别
     * * @return
     */
    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

    //全局超时时间配置
    @Bean
    public Request.Options  options() {
        return new Request.Options(5000, 10000);
    }
}
