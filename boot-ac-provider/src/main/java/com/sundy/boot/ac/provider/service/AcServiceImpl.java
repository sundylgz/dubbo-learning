package com.sundy.boot.ac.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sundy.ac.api.AcService;
import com.sundy.ac.po.User;
import org.springframework.stereotype.Component;

@Component
@Service
public class AcServiceImpl implements AcService {

    @HystrixCommand
    @Override
    public User getUserByUserName(String userName) {
//        try {
//            Thread.sleep(3000L);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        if (Math.random() > 0.5) {
            throw new RuntimeException();
        }
        System.out.println("boot ac provider");
        return new User();
    }


}
