package com.over.order.entity;

import lombok.Data;

/**
 * (Order)实体类
 *
 * @author xiaoG
 * @since 2022-05-25 17:13:23
 */
@Data
public class Order {

    private Long id;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 产品id
     */
    private Long productId;
    /**
     * 数量
     */
    private Integer count;
    /**
     * 金额
     */
    private Double money;
    /**
     * 订单状态：0：创建中；1：已完结
     */
    private Integer status;

}