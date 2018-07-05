package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.SecondFloorWorkshopMapper;
import com.lanbao.ems.model.SecondFloorWorkshop;
import com.lanbao.ems.service.SecondFloorWorkshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecondFloorWorkshopServiceImpl implements SecondFloorWorkshopService {

    @Autowired
    SecondFloorWorkshopMapper mapper;

    @Override
    public int save(SecondFloorWorkshop obj) {
        return mapper.save(obj);
    }

    @Override
    public SecondFloorWorkshop selectById(String id) {
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
    public List<SecondFloorWorkshop> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<SecondFloorWorkshop> queryByParams(SecondFloorWorkshop bean) {
        return mapper.queryByParams(bean);
    }
}
