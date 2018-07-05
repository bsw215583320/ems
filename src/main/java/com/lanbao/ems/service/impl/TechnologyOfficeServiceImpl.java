package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.TechnologyOfficeMapper;
import com.lanbao.ems.model.TechnologyOffice;
import com.lanbao.ems.service.TechnologyOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyOfficeServiceImpl implements TechnologyOfficeService {

    @Autowired
    TechnologyOfficeMapper mapper;

    @Override
    public int save(TechnologyOffice obj) {
        return mapper.save(obj);
    }

    @Override
    public TechnologyOffice selectById(String id) {
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
    public List<TechnologyOffice> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<TechnologyOffice> queryByParams(TechnologyOffice bean) {
        return mapper.queryByParams(bean);
    }
}
