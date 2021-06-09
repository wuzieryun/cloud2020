package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.OrderDao;
import com.atguigu.springcloud.domain.Order;
import com.atguigu.springcloud.service.AccountService;
import com.atguigu.springcloud.service.OrderService;
import com.atguigu.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;


    @Override
    public void create(Order order) {

        log.info("开始创建订单");
        orderDao.create(order);

        log.info("开始调用库存做扣减商品");
        storageService.decrease(order.getProductId(),order.getCount());

        log.info("开始调用扣款");
        accountService.decrease(order.getUserId(),order.getMoney());

        log.info("开始调用kucun 扣款 end");

        log.info("开始修改订单状态");
        orderDao.update(order.getUserId(),0);

        log.info("jieshu");



    }
}
