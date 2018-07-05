package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.ProductionOfficeMapper;
import com.lanbao.ems.model.ProductionOffice;
import com.lanbao.ems.service.ProductionOfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductionOfficeServiceImpl implements ProductionOfficeService {

    @Autowired
    ProductionOfficeMapper mapper;

    @Override
    public int save(ProductionOffice obj) {
        return mapper.save(obj);
    }

    @Override
    public ProductionOffice selectById(String id) {
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
    public List<ProductionOffice> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<ProductionOffice> queryByParams(ProductionOffice bean) {
        return mapper.queryByParams(bean);
    }
}
