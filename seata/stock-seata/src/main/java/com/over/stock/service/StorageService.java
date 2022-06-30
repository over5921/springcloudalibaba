package com.over.stock.service;


import com.over.stock.entity.Storage;

import java.util.List;

/**
 * (Storage)表服务接口
 *
 * @author makejava
 * @since 2022-05-25 17:15:12
 */
public interface StorageService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Storage selectById(Long id);

    /**
     * 分页查询
     *
     * @param start 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Storage> selectPage(int start, int limit);

    /**
     * 查询全部
     *
     * @return 对象列表
     */
    List<Storage> selectAll();

    /**
     * 通过实体作为筛选条件查询
     *
     * @param storage 实例对象
     * @return 对象列表
     */
    List<Storage> selectList(Storage storage);

    /**
     * 新增数据
     *
     * @param storage 实例对象
     * @return 影响行数
     */
    int insert(Storage storage);

    /**
     * 批量新增
     *
     * @param storages 实例对象的集合
     * @return 影响行数
     */
    int batchInsert(List<Storage> storages);

    /**
     * 修改数据
     *
     * @param storage 实例对象
     * @return 修改
     */
    Storage update(Storage storage);

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