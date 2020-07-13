package com.iwaed.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: iwaedcloud
 * @description: TODO
 * @author: 钱琦瑛 - iwaed
 * @create: 2020-07-13 15:18
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
