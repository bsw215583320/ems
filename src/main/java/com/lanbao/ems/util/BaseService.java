package com.lanbao.ems.util;

import java.util.List;

public interface BaseService<T> {
   int save(T obj);
    T selectById(String id);
    int updateById(String id);
    int deleteById(String id);
    List<T> queryAll();
    List<T> queryByParams(T t);
}
