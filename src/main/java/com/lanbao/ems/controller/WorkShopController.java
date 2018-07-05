package com.lanbao.ems.controller;

import com.lanbao.ems.model.WorkShop;
import com.lanbao.ems.service.WorkShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ems/workshop")
public class WorkShopController {
    @Autowired
    private WorkShopService service;

    @RequestMapping("/queryByParams")
    public List<WorkShop> queryByParams(){
        return service.queryByParams(null);
    }


    @RequestMapping("/queryAll")
    public List<WorkShop> queryAll(){
        return service.queryAll();
    }
}
