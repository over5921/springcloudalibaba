package com.over.order.fegin;

import org.springframework.stereotype.Component;

/**
 * Created by jsflz on 2022/5/24 11:06
 */
@Component
public class StockFeginServiceFallback implements StockFeginService{
    @Override
    public String reduct1() {
        return "降级拉！！！！";
    }
}
