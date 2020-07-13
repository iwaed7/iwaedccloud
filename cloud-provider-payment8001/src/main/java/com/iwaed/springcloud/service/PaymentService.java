package com.iwaed.springcloud.service;

import com.iwaed.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @program: iwaedcloud
 * @description: TODO
 * @author: 钱琦瑛 - iwaed
 * @create: 2020-07-13 11:56
 **/
public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);

}
