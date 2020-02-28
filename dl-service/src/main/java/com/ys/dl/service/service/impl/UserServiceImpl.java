package com.ys.dl.service.service.impl;

import com.ys.dl.common.entity.User;
import com.ys.dl.dao.mapper.UserMapper;
import com.ys.dl.service.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.selectAll();
    }
}
