package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.PackGlueRoomMapper;
import com.lanbao.ems.model.PackGlueRoom;
import com.lanbao.ems.service.PackGlueRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackGlueRoomServiceImpl implements PackGlueRoomService {

    @Autowired
    PackGlueRoomMapper mapper;

    @Override
    public int save(PackGlueRoom obj) {
        return mapper.save(obj);
    }

    @Override
    public PackGlueRoom selectById(String id) {
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
    public List<PackGlueRoom> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<PackGlueRoom> queryByParams(PackGlueRoom bean) {
        return mapper.queryByParams(bean);
    }
}
