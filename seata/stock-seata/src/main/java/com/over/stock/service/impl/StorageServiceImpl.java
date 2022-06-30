package com.over.stock.service.impl;


import com.over.stock.entity.Storage;
import com.over.stock.mapper.StorageMapper;
import com.over.stock.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * (Storage表)服务实现类
 *
 * @author makejava
 * @since 2022-05-25 17:15:14
 */
@Service("storageService")
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageMapper storageDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Storage selectById(Long id) {
        return this.storageDao.selectById(id);
    }

    /**
     * 分页查询
     *
     * @param start 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Storage> selectPage(int start, int limit) {
        return this.storageDao.selectPage(start, limit);
    }

    /**
     * 查询所有
     *
     * @return 实例对象的集合
     */
    @Override
    public List<Storage> selectAll() {
        return this.storageDao.selectAll();
    }

    /**
     * 根据条件查询
     *
     * @return 实例对象的集合
     */
    @Override
    public List<Storage> selectList(Storage storage) {
        return this.storageDao.selectList(storage);
    }

    /**
     * 新增数据
     *
     * @param storage 实例对象
     * @return 实例对象
     */
    @Override
    public int insert(Storage storage) {
        return this.storageDao.insert(storage);
    }

    /**
     * 批量新增
     *
     * @param storages 实例对象的集合
     * @return 生效的条数
     */
    @Override
    public int batchInsert(List<Storage> storages) {
        return this.storageDao.batchInsert(storages);
    }

    /**
     * 修改数据
     *
     * @param storage 实例对象
     * @return 实例对象
     */
    @Override
    public Storage update(Storage storage) {
        this.storageDao.update(storage);
        return this.selectById(storage.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public int deleteById(Long id) {
        return this.storageDao.deleteById(id);
    }

    /**
     * 查询总数据数
     *
     * @return 数据总数
     */
    @Override
    public int count() {
        return this.storageDao.count();
    }
}