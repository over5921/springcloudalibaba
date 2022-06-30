package com.over.order.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jsflz on 2022/5/19 11:17
 */
//局部配置，让调用的微服务生效，在@FeignClient 注解中指定使用的配置类 FeignConfig 此时的配置类不能加@Configuration
@FeignClient(name = "stock-service",path = "/stock")
public interface StockFeginService {
    //生命需要调用rest接口对应的方法
    @RequestMapping("/add")
    String reduct();
}
