package com.lanbao.ems.mapper;

import com.lanbao.ems.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserMapper {

    int save(User user);
    User selectById(String id);
    int updateById(String id);
    int deleteById(String id);
    List<User> queryAll();

}
