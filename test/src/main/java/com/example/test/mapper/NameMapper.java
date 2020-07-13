package com.example.test.mapper;

import com.example.test.entity.Name;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface NameMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Name record);

    int insertSelective(Name record);

    Name selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Name record);

    int updateByPrimaryKey(Name record);
}