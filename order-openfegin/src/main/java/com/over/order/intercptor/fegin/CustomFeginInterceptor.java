package com.over.order.intercptor.fegin;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jsflz on 2022/5/19 13:48
 */
//自定义拦截器，
public class CustomFeginInterceptor  implements RequestInterceptor {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public void apply(RequestTemplate requestTemplate) {
        //TODO
        requestTemplate.header("xxx","xxx");
        requestTemplate.query("id","111");
        requestTemplate.uri("/9");

        logger.info("fegin拦截器");
    }
}
