package com.over.order.service.impl;

import com.over.order.entity.Order;
import com.over.order.fegin.StockFeginService;
import com.over.order.mapper.OrderMapper;
import com.over.order.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;



/**
 * (Order表)服务实现类
 *
 * @author makejava
 * @since 2022-05-25 17:13:32
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderDao;

    @Autowired
    public StockFeginService stockFeginService;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Order selectById(Long id) {
        return this.orderDao.selectById(id);
    }

    /**
     * 分页查询
     *
     * @param start 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Order> selectPage(int start, int limit) {
        return this.orderDao.selectPage(start, limit);
    }

    /**
     * 查询所有
     *
     * @return 实例对象的集合
     */
    @Override
    public List<Order> selectAll() {
        return this.orderDao.selectAll();
    }

    /**
     * 根据条件查询
     *
     * @return 实例对象的集合
     */
    @Override
    public List<Order> selectList(Order order) {
        return this.orderDao.selectList(order);
    }

    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Order order) {
        return this.orderDao.insert(order);
    }

    /**
     * 批量新增
     *
     * @param orders 实例对象的集合
     * @return 生效的条数
     */
    @Override
    public int batchInsert(List<Order> orders) {
        return this.orderDao.batchInsert(orders);
    }

    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    @Override
    @GlobalTransactional
    public Order update(Order order) {
        this.orderDao.update(order);
        System.out.println("订单生成===");
        String reduct = stockFeginService.reduct();

        int a=1/0;
        return this.selectById(order.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Long id) {
        return this.orderDao.deleteById(id);
    }

    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
    @Override
    public int count() {
        return this.orderDao.count();
    }
}