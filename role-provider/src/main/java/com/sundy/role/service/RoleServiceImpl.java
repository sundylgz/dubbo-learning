package com.sundy.role.service;


import com.sundy.role.api.RoleService;
import com.sundy.role.mapper.RoleMapper;
import com.sundy.role.po.Role;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public Role getRole(Long roleId) {
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("roleId", roleId);
        return roleMapper.getByMap(paramMap);
    }
}
