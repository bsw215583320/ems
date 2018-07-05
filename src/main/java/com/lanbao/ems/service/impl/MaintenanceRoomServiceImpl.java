package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.MaintenanceRoomMapper;
import com.lanbao.ems.model.MaintenanceRoom;
import com.lanbao.ems.service.MaintenanceRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceRoomServiceImpl implements MaintenanceRoomService {

    @Autowired
    MaintenanceRoomMapper mapper;

    @Override
    public int save(MaintenanceRoom obj) {
        return mapper.save(obj);
    }

    @Override
    public MaintenanceRoom selectById(String id) {
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
    public List<MaintenanceRoom> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<MaintenanceRoom> queryByParams(MaintenanceRoom bean) {
        return mapper.queryByParams(bean);
    }
}
