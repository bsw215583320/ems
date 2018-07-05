package com.lanbao.ems.service;

import com.lanbao.ems.model.WorkShop;

import java.util.List;


public interface WorkShopService {
    int save(WorkShop bean);
    WorkShop selectById(String id);
    int updateById(String id);
    int deleteById(String id);
    List<WorkShop> queryAll();
    List<WorkShop> queryByParams(WorkShop bean);
}
