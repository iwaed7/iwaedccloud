package com.iwaed.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: iwaedcloud
 * @description: 消费者，需要从8001获取数据，消费者也可以添加注解@EnableEurekaClient，将自己注册进EurekaServer
 * @author: 钱琦瑛 - iwaed
 * @create: 2020-07-13 15:14
 **/
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
