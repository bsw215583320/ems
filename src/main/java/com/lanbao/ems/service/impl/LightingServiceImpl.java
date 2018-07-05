package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.LightingMapper;
import com.lanbao.ems.model.Lighting;
import com.lanbao.ems.service.LightingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LightingServiceImpl implements LightingService {

    @Autowired
    LightingMapper mapper;

    @Override
    public int save(Lighting obj) {
        return mapper.save(obj);
    }

    @Override
    public Lighting selectById(String id) {
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
    public List<Lighting> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<Lighting> queryByParams(Lighting bean) {
        return mapper.queryByParams(bean);
    }
}
