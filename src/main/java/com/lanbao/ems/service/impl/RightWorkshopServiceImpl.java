package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.RightWorkshopMapper;
import com.lanbao.ems.model.RightWorkshop;
import com.lanbao.ems.service.RightWorkshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RightWorkshopServiceImpl implements RightWorkshopService {

    @Autowired
    RightWorkshopMapper mapper;

    @Override
    public int save(RightWorkshop obj) {
        return mapper.save(obj);
    }

    @Override
    public RightWorkshop selectById(String id) {
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
    public List<RightWorkshop> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<RightWorkshop> queryByParams(RightWorkshop bean) {
        return mapper.queryByParams(bean);
    }
}
