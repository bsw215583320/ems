package com.lanbao.ems.service;

import com.lanbao.ems.model.User;

import java.util.List;

public interface UserService {
   int save(User user);
    User selectById(String id);
    int updateById(String id);
    int deleteById(String id);
    List<User> queryAll();
}
