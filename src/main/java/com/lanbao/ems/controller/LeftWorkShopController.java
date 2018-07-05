package com.lanbao.ems.controller;

import com.lanbao.ems.model.LeftWorkshop;
import com.lanbao.ems.service.LeftWorkshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ems/left_workshop")
public class LeftWorkShopController {
    @Autowired
    private LeftWorkshopService service;

    @RequestMapping("/queryByParams")
    public List<LeftWorkshop> queryByParams(){
        return service.queryByParams(null);
    }


    @RequestMapping("/queryAll")
    public List<LeftWorkshop> queryAll(){
        return service.queryAll();
    }
}
