package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.ProductionLine2Mapper;
import com.lanbao.ems.model.ProductionLine2;
import com.lanbao.ems.service.ProductionLine2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionLine2ServiceImpl implements ProductionLine2Service {

    @Autowired
    ProductionLine2Mapper mapper;

    @Override
    public int save(ProductionLine2 obj) {
        return mapper.save(obj);
    }

    @Override
    public ProductionLine2 selectById(String id) {
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
    public List<ProductionLine2> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<ProductionLine2> queryByParams(ProductionLine2 bean) {
        return mapper.queryByParams(bean);
    }
}
