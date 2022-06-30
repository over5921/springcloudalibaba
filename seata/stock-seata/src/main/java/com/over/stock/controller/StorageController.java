package com.over.stock.controller;

import com.over.stock.entity.Storage;
import com.over.stock.service.StorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.annotation.Resource;

/**
 * (Storage)控制层
 *
 * @author makejava
 * @since 2022-05-25 17:15:15
 */
@RestController
@RequestMapping("/stock")
public class StorageController {
    /**
     * 服务对象
     */
    @Resource
    private StorageService storageService;

    @GetMapping("/add")
    public void add(){
        Storage storage =new Storage();
        storage.setId(1L);
        storage.setProductId(1L);
        storage.setResidue(1);
        storage.setTotal(1);
        storage.setUsed(1);

        storageService.insert(storage);
    }
}