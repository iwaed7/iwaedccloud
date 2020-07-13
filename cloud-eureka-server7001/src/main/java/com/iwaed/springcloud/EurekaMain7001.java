package com.iwaed.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: iwaedcloud
 * @description: 主启动类，加上注解@EnableEurekaServer表示是注册中心
 * @author: 钱琦瑛 - iwaed
 * @create: 2020-07-13 17:05
 **/

@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7001.class, args);
    }
}
