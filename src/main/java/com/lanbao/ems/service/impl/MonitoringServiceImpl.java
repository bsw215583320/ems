package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.MonitoringMapper;
import com.lanbao.ems.model.Monitoring;
import com.lanbao.ems.service.MonitoringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitoringServiceImpl implements MonitoringService {

    @Autowired
    MonitoringMapper mapper;

    @Override
    public int save(Monitoring obj) {
        return mapper.save(obj);
    }

    @Override
    public Monitoring selectById(String id) {
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
    public List<Monitoring> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<Monitoring> queryByParams(Monitoring bean) {
        return mapper.queryByParams(bean);
    }
}
