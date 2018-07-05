package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.UserMapper;
import com.lanbao.ems.model.User;
import com.lanbao.ems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public int save(User user) {
        return userMapper.save(user);
    }

    @Override
    public User selectById(String id) {
        return userMapper.selectById(id);
    }

    @Override
    public int updateById(String id) {
        return userMapper.updateById(id);
    }

    @Override
    public int deleteById(String id) {
        return userMapper.deleteById(id);
    }

    @Override
    public List<User> queryAll() {
        return userMapper.queryAll();
    }
}
