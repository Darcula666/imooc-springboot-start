package com.imooc.controller;

import com.imooc.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/getUser")
    public User getUser(){

        User user=new User();
        user.setName("田昆");
        user.setAge(20);
        user.setBirthday(new Date());
        user.setDesc("45613");
        return user;
    }
}
