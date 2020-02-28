package com.ys.dl.api.controller;

import com.ys.dl.common.entity.User;
import com.ys.dl.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/userList")
    public String getUserList(){
        List<User>  userList=userService.getUserList();
        for(User user:userList){
            System.out.println(user);
        }
        return  "22222";
    }
}
