package com.sundy.ac.service;

import com.sundy.ac.api.AcService;
import com.sundy.ac.mapper.UserMapper;
import com.sundy.ac.po.User;
import com.sundy.role.api.RoleService;
import com.sundy.role.po.Role;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class AcServiceImplV2 implements AcService {

    @Autowired
    RoleService roleService;

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserByUserName(String userName) {
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("####################v2");
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("userName", userName);
        Role role = roleService.getRole(1L);
        System.out.println(role);
        return userMapper.getByMap(paramMap);
    }
}
