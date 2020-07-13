package com.iwaed.springcloud.controller;

import com.iwaed.springcloud.entities.Payment;
import com.iwaed.springcloud.util.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: iwaedcloud
 * @description: 客户端（消费者），发送的是GetMapping请求
 * @author: 钱琦瑛 - iwaed
 * @create: 2020-07-13 15:19
 **/

@RestController
@Slf4j
public class OrderController {

    //请求的地址
    private static final String PAYMENT_URL= "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    //浏览器只能发get请求
    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id")Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }
}
