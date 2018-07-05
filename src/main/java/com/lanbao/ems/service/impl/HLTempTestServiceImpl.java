package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.HLTempTestMapper;
import com.lanbao.ems.model.HLTempTest;
import com.lanbao.ems.service.HLTempTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HLTempTestServiceImpl implements HLTempTestService {

    @Autowired
    HLTempTestMapper mapper;

    @Override
    public int save(HLTempTest obj) {
        return mapper.save(obj);
    }

    @Override
    public HLTempTest selectById(String id) {
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
    public List<HLTempTest> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<HLTempTest> queryByParams(HLTempTest bean) {
        return mapper.queryByParams(bean);
    }
}
