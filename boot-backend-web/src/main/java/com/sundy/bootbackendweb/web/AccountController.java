package com.sundy.bootbackendweb.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.sundy.ac.api.AcService;
import com.sundy.ac.po.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {

    //直连方式debug
    //@Reference(url = "127.0.0.1:9005",loadbalance = "random",timeout = 1000)
    @Reference(loadbalance = "random", timeout = 1000)
    AcService acService;

    /**
     * @return
     */
    @HystrixCommand(fallbackMethod = "hello")
    @RequestMapping("/getName")
    public ResponseEntity getName() {
        User user = acService.getUserByUserName("sundy");
        System.out.println(user);
        return ResponseEntity.ok(user);
    }

    public ResponseEntity hello() {
        User user = new User();
        user.setNickName("sundy");
        System.out.println("HystrixCommand##############" + user);
        return ResponseEntity.ok(user);
    }

}
