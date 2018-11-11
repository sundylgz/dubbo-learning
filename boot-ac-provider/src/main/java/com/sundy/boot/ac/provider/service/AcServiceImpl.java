package com.sundy.boot.ac.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.sundy.ac.api.AcService;
import com.sundy.ac.po.User;
import org.springframework.stereotype.Component;

@Component
@Service
public class AcServiceImpl implements AcService {
    @Override
    public User getUserByUserName(String userName) {
        System.out.println("boot ac provider");
        return new User();
    }
}
