package com.sundy.ac.mapper;

import com.sundy.ac.po.User;

import java.util.Map;

public interface UserMapper {

    /**
     * 根据map查询
     *
     * @param paramMap
     * @return
     */
    User getByMap(Map<String, Object> paramMap);


}