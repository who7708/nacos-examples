package com.alibaba.nacos.example.spring.boot.controller;

import com.alibaba.nacos.example.spring.boot.model.User;
import com.alibaba.nacos.example.spring.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @ResponseBody
    public User get(@RequestParam("id") int id) {
        return userService.findById(id);
    }
}