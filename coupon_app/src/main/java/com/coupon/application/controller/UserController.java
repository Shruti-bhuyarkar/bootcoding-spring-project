package com.coupon.application.controller;

import com.coupon.application.model.User;
import com.coupon.application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("register")
    public String register(@RequestBody List<User> users){
        userService.saveUser(users);
        return "Success";
    }
}
