package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.FinishedStoreMapper;
import com.lanbao.ems.model.FinishedStore;
import com.lanbao.ems.service.FinishedStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinishedStoreServiceImpl implements FinishedStoreService {

    @Autowired
    FinishedStoreMapper mapper;

    @Override
    public int save(FinishedStore obj) {
        return mapper.save(obj);
    }

    @Override
    public FinishedStore selectById(String id) {
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
    public List<FinishedStore> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<FinishedStore> queryByParams(FinishedStore bean) {
        return mapper.queryByParams(bean);
    }
}
