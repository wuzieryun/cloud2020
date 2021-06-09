package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.Dao.StorageDao;
import com.atguigu.springcloud.domain.CommonResult;
import com.atguigu.springcloud.service.StorageService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Service
public class StorageServiceImpl implements StorageService {
    @Resource
    private StorageDao storageDao;


    @Override

    public CommonResult decrease( Long productId,  int count) {
        storageDao.decrease(productId,count);
        return new CommonResult(200,"减库存成功");
    }
}
