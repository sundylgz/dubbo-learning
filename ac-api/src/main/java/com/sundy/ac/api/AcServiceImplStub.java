package com.sundy.ac.api;

import com.sundy.ac.api.AcService;
import com.sundy.ac.po.User;


import java.util.HashMap;
import java.util.Map;

public class AcServiceImplStub implements AcService {


    private AcService acService;

    public AcServiceImplStub(AcService acService) {
        super();
        this.acService = acService;
    }

    @Override
    public User getUserByUserName(String userName) {

        System.out.println("####################本地存根服务");
        return acService.getUserByUserName(userName);
    }
}
