package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.RawMaterialWarehouseMapper;
import com.lanbao.ems.model.RawMaterialWarehouse;
import com.lanbao.ems.service.RawMaterialWarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RawMaterialWarehouseServiceImpl implements RawMaterialWarehouseService {

    @Autowired
    RawMaterialWarehouseMapper mapper;

    @Override
    public int save(RawMaterialWarehouse obj) {
        return mapper.save(obj);
    }

    @Override
    public RawMaterialWarehouse selectById(String id) {
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
    public List<RawMaterialWarehouse> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<RawMaterialWarehouse> queryByParams(RawMaterialWarehouse bean) {
        return mapper.queryByParams(bean);
    }
}
