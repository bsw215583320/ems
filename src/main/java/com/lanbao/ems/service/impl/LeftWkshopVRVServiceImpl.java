package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.LeftWkshopVRVMapper;
import com.lanbao.ems.model.LeftWkshopVRV;
import com.lanbao.ems.service.LeftWkshopVRVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeftWkshopVRVServiceImpl implements LeftWkshopVRVService {

    @Autowired
    LeftWkshopVRVMapper mapper;

    @Override
    public int save(LeftWkshopVRV obj) {
        return mapper.save(obj);
    }

    @Override
    public LeftWkshopVRV selectById(String id) {
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
    public List<LeftWkshopVRV> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<LeftWkshopVRV> queryByParams(LeftWkshopVRV bean) {
        return mapper.queryByParams(bean);
    }
}
