package com.over.order.fegin;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jsflz on 2022/5/24 11:00
 */
@FeignClient(value= "stock-nacos",path = "/stock",fallback = StockFeginServiceFallback.class)
public interface StockFeginService {

    @RequestMapping("/reduct1")
    public String reduct1();
}
