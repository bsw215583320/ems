package com.lanbao.ems.service.impl;

import com.lanbao.ems.mapper.DatasStatisticsMapper;
import com.lanbao.ems.model.DatasStatistics;
import com.lanbao.ems.service.DatasStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DatasStatisticsServiceImpl implements DatasStatisticsService {

    @Autowired
    DatasStatisticsMapper mapper;
    @Override
    public int save(DatasStatistics obj) {
        return mapper.save(obj);
    }

    @Override
    public DatasStatistics selectById(String id) {
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
    public List<DatasStatistics> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public List<DatasStatistics> queryByParams(DatasStatistics bean) {
        return mapper.queryByParams(bean);
    }
}
