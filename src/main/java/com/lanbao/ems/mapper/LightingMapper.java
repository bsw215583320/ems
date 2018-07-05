package com.lanbao.ems.mapper;

import com.lanbao.ems.model.Lighting;
import com.lanbao.ems.util.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface LightingMapper extends BaseMapper<Lighting> {
}
