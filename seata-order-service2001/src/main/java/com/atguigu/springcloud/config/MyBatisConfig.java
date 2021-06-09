package com.atguigu.springcloud.config;

import com.atguigu.springcloud.dao.OrderDao;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.atguigu.springcloud.dao" })
public class MyBatisConfig {

}
