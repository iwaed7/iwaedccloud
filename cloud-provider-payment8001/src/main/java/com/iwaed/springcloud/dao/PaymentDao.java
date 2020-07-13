package com.iwaed.springcloud.dao;

import com.iwaed.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @program: iwaedcloud
 * @description: TODO
 * @author: 钱琦瑛 - iwaed
 * @create: 2020-07-13 11:56
 **/

@Repository
@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment getPaymentById(@Param("id") Long id);
}
