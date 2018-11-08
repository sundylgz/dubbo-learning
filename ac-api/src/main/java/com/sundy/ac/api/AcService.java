package com.sundy.ac.api;

import com.sundy.ac.po.User;


public interface AcService {

    /**
     * 根据用户名获取用户
     *
     * @param userName
     * @return
     */
    User getUserByUserName(String userName);


}
