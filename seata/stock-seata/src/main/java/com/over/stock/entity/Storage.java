package com.over.stock.entity;

import lombok.Data;

/**
 * (Storage)实体类
 *
 * @author xiaoG
 * @since 2022-05-25 17:15:02
 */
@Data
public class Storage {

    private Long id;
    /**
     * 产品id
     */
    private Long productId;
    /**
     * 总库存
     */
    private Integer total;
    /**
     * 已用库存
     */
    private Integer used;
    /**
     * 剩余库存
     */
    private Integer residue;

}