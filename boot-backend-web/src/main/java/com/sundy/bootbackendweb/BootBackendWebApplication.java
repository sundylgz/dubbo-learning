package com.sundy.bootbackendweb;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.sundy.ac.api.AcService;
import com.sundy.ac.po.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableDubbo
@SpringBootApplication
@EnableHystrix
public class BootBackendWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootBackendWebApplication.class, args);
    }
}
