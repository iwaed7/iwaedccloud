package com.example.test.controller;

import com.example.test.entity.Name;
import com.example.test.mapper.NameMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: test
 * @description: TODO
 * @author: 钱琦瑛 - iwaed
 * @create: 2020-07-13 11:01
 **/
@RestController
public class NameController {
    @Resource
    NameMapper nameMapper;

    @PostMapping("get")
    public Name get(int i){
        Name name = nameMapper.selectByPrimaryKey(i);
        return name;
    }
}
