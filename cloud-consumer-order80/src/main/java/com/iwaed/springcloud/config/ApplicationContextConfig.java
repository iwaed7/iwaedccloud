package com.iwaed.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: iwaedcloud
 * @description: TODO
 * @author: 钱琦瑛 - iwaed
 * @create: 2020-07-13 15:26
 **/

@Configuration
public class ApplicationContextConfig {

    //使用注解依赖注入
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
