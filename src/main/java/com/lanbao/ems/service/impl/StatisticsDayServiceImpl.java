package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.StatisticsDayMapper;
import com.lanbao.ems.model.StatisticsDay;
import com.lanbao.ems.service.StatisticsDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatisticsDayServiceImpl implements StatisticsDayService {

    @Autowired
    StatisticsDayMapper mapper;

    @Override
    public int save(StatisticsDay obj) {
        return mapper.save(obj);
    }

    @Override
    public StatisticsDay selectById(String id) {
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
    public List<StatisticsDay> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<StatisticsDay> queryByParams(StatisticsDay bean) {
        return mapper.queryByParams(bean);
    }
}
