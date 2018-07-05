package com.lanbao.ems.mapper;

import com.lanbao.ems.model.WorkShop;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@Mapper
public interface WorkShopMapper {
    int save(WorkShop bean);
    WorkShop selectById(String id);
    int updateById(String id);
    int deleteById(String id);
    List<WorkShop> queryAll();
    List<WorkShop> queryByParams(WorkShop bean);
}
