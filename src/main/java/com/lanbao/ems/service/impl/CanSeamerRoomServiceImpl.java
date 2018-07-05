package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.CanSeamerRoomMapper;
import com.lanbao.ems.model.CanSeamerRoom;
import com.lanbao.ems.service.CanSeamerRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CanSeamerRoomServiceImpl implements CanSeamerRoomService {

    @Autowired
    CanSeamerRoomMapper mapper;

    @Override
    public int save(CanSeamerRoom obj) {
        return mapper.save(obj);
    }

    @Override
    public CanSeamerRoom selectById(String id) {
        return mapper.selectById(id);
    }

    @Override
    public int updateById(String id) {
        return mapper.updateById(id);
    }

    @Override
    public int deleteById(String id) {
        return mapper.deleteById(id);
    }

    @Override
    public List<CanSeamerRoom> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<CanSeamerRoom> queryByParams(CanSeamerRoom bean) {
        return mapper.queryByParams(bean);
    }
}
