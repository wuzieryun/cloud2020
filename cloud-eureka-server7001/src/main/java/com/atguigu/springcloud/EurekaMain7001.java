package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//加个注释
//再加一个
/**
 * @auther zzyy
 * @create 2020-02-18 21:15
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001
{
    public static void main(String[] args) {
            SpringApplication.run(EurekaMain7001.class, args);
    }
}
