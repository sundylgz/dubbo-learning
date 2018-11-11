package com.sundy.bootacprovider3.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.sundy.ac.api.AcService;
import com.sundy.ac.po.User;
import org.springframework.stereotype.Component;

@Service
@Component
public class AcServiceImpl implements AcService {

    @Override
    public User getUserByUserName(String userName) {
        System.out.println("boot3 ac provider");
        return new User();
    }

}
