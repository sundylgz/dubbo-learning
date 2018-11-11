package com.sundy.bootacprovider2.service;

import com.sundy.ac.api.AcService;
import com.sundy.ac.po.User;

public class AcServiceImpl implements AcService {

    @Override
    public User getUserByUserName(String userName) {
        System.out.println("boot2 ac provider");
        return new User();
    }

}
