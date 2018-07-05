package com.lanbao.ems.controller;

import com.lanbao.ems.model.User;
import com.lanbao.ems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ems/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/insert")
    public int insert(){
        User user = new User();
        user.setId("2");
        user.setName("zhangsan");
       return userService.save(user);
    }

    @RequestMapping("/query")
    public User selectUser(){
        return userService.selectById("1");
    }
    @RequestMapping("/queryAll")
    public List<User> queryAll(){
        return userService.queryAll();
    }
}
