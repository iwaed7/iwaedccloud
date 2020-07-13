package com.iwaed.springcloud.controller;

import com.iwaed.springcloud.entities.Payment;
import com.iwaed.springcloud.service.PaymentService;
import com.iwaed.springcloud.util.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: iwaedcloud
 * @description: TODO
 * @author: 钱琦瑛 - iwaed
 * @create: 2020-07-13 11:55
 **/
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    //要加@RequestBody，如果不加的话，80端口的serial插入不进去，为Null
    @PostMapping("/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入数据的ID:\t" + payment.getId());
        log.info("插入结果：" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据成功", result);
        } else {
            return new CommonResult(444, "插入数据失败", null);
        }
    }

    @GetMapping("/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("***查询结果：" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询数据成功", payment);
        } else {
            return new CommonResult(444, "没有对应记录", null);
        }
    }
}
