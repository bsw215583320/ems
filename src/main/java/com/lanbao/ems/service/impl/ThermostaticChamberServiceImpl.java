package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.ThermostaticChamberMapper;
import com.lanbao.ems.model.ThermostaticChamber;
import com.lanbao.ems.service.ThermostaticChamberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThermostaticChamberServiceImpl implements ThermostaticChamberService {

    @Autowired
    ThermostaticChamberMapper mapper;

    @Override
    public int save(ThermostaticChamber obj) {
        return mapper.save(obj);
    }

    @Override
    public ThermostaticChamber selectById(String id) {
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
    public List<ThermostaticChamber> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<ThermostaticChamber> queryByParams(ThermostaticChamber bean) {
        return mapper.queryByParams(bean);
    }
}
