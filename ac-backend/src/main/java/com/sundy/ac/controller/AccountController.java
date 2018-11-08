package com.sundy.ac.controller;

import com.sundy.ac.api.AcService;
import com.sundy.ac.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @Autowired
    AcService acService;

    @RequestMapping("/getName")
    public ResponseEntity getName() {
        User user = acService.getUserByUserName("sundy");
        return ResponseEntity.ok(user);
    }

}
