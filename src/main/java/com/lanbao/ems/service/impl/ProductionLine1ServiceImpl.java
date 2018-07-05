package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.ProductionLine1Mapper;
import com.lanbao.ems.model.ProductionLine1;
import com.lanbao.ems.service.ProductionLine1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionLine1ServiceImpl implements ProductionLine1Service {

    @Autowired
    ProductionLine1Mapper mapper;

    @Override
    public int save(ProductionLine1 obj) {
        return mapper.save(obj);
    }

    @Override
    public ProductionLine1 selectById(String id) {
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
    public List<ProductionLine1> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<ProductionLine1> queryByParams(ProductionLine1 bean) {
        return mapper.queryByParams(bean);
    }
}
