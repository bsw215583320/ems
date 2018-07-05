package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.WorkShopMapper;
import com.lanbao.ems.model.WorkShop;
import com.lanbao.ems.service.WorkShopService;
import com.lanbao.ems.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WorkShopServiceImpl implements WorkShopService {

    @Autowired
    WorkShopMapper mapper;


    @Override
    public int save(WorkShop bean) {
        return mapper.save(bean);
    }

    @Override
    public WorkShop selectById(String id) {
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
    public List<WorkShop> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<WorkShop> queryByParams(WorkShop bean) {
        if (bean==null){
            bean = new WorkShop();
            Date now = new Date();
            bean.setStime(DateUtil.getNextHour(now));
            bean.setEtime(now);
        }
        return mapper.queryByParams(bean);
    }
}
