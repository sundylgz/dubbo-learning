package com.sundy.ac.service;

import com.sundy.ac.api.AcService;
import com.sundy.ac.mapper.UserMapper;
import com.sundy.ac.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

public class AcServiceImpl implements AcService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserByUserName(String userName) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("userName", userName);
        return userMapper.getByMap(paramMap);
    }
}
