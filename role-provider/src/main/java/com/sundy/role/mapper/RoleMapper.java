package com.sundy.role.mapper;

import com.sundy.role.po.Role;

import java.util.Map;

public interface RoleMapper {

    Role getByMap(Map<String, Object> paramMap);

}