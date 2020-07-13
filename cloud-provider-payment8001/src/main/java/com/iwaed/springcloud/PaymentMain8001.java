package com.iwaed.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @program: iwaedcloud
 * @description: 服务提供者，使用注解@EnableEurekaClient
 * @author: 钱琦瑛 - iwaed
 * @create: 2020-07-13 11:51
 **/

@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8001.class, args);
    }
}
