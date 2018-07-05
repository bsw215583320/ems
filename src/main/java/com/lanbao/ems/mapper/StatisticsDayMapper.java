package com.lanbao.ems.mapper;

import com.lanbao.ems.model.StatisticsDay;
import com.lanbao.ems.util.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface StatisticsDayMapper extends BaseMapper<StatisticsDay> {
}
