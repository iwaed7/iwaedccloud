package com.iwaed.springcloud.service.impl;

import com.iwaed.springcloud.dao.PaymentDao;
import com.iwaed.springcloud.entities.Payment;
import com.iwaed.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: iwaedcloud
 * @description: TODO
 * @author: 钱琦瑛 - iwaed
 * @create: 2020-07-13 11:56
 **/

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
