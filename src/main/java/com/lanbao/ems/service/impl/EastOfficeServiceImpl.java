package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.EastOfficeMapper;
import com.lanbao.ems.model.EastOffice;
import com.lanbao.ems.service.EastOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EastOfficeServiceImpl implements EastOfficeService {

    @Autowired
    EastOfficeMapper mapper;

    @Override
    public int save(EastOffice obj) {
        return mapper.save(obj);
    }

    @Override
    public EastOffice selectById(String id) {
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
    public List<EastOffice> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<EastOffice> queryByParams(EastOffice bean) {
        return mapper.queryByParams(bean);
    }
}
