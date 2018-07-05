package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.WorkshopOfficeMapper;
import com.lanbao.ems.model.WorkshopOffice;
import com.lanbao.ems.service.WorkshopOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkshopOfficeServiceImpl implements WorkshopOfficeService {

    @Autowired
    WorkshopOfficeMapper mapper;

    @Override
    public int save(WorkshopOffice obj) {
        return mapper.save(obj);
    }

    @Override
    public WorkshopOffice selectById(String id) {
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
    public List<WorkshopOffice> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<WorkshopOffice> queryByParams(WorkshopOffice bean) {
        return mapper.queryByParams(bean);
    }
}
