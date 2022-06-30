package com.over.order.service;

import com.over.order.entity.Order;

import java.util.List;



/**
 * (Order)表服务接口
 *
 * @author makejava
 * @since 2022-05-25 17:13:30
 */
public interface OrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Order selectById(Long id);

    /**
     * 分页查询
     *
     * @param start 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Order> selectPage(int start, int limit);

    /**
     * 查询全部
     *
     * @return 对象列表
     */
    List<Order> selectAll();

    /**
     * 通过实体作为筛选条件查询
     *
     * @param order 实例对象
     * @return 对象列表
     */
    List<Order> selectList(Order order);

    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 影响行数
     */
    int insert(Order order);

    /**
     * 批量新增
     *
     * @param orders 实例对象的集合
     * @return 影响行数
     */
    int batchInsert(List<Order> orders);

    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 修改
     */
    Order update(Order order);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
    int count();
}