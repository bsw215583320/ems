package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.LeftWkshopMapper;
import com.lanbao.ems.model.LeftWorkshop;
import com.lanbao.ems.service.LeftWorkshopService;
import com.lanbao.ems.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LeftWorkshopServiceImpl implements LeftWorkshopService {
    @Autowired
    LeftWkshopMapper mapper;

    @Override
    public int save(LeftWorkshop obj) {
        return mapper.save(obj);
    }

    @Override
    public LeftWorkshop selectById(String id) {
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
    public List<LeftWorkshop> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<LeftWorkshop> queryByParams(LeftWorkshop bean) {
        if (bean==null){
            bean = new LeftWorkshop();
            Date now = new Date();
            bean.setStime(DateUtil.getNextHour(now));
            bean.setEtime(now);
        }
        return mapper.queryByParams(bean);
    }
}
