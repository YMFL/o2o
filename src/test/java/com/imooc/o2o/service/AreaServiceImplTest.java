package com.imooc.o2o.service;

import com.imooc.o2o.BaseTest;
import com.imooc.o2o.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AreaServiceImplTest extends BaseTest{

    @Autowired
    private AreaService areaService;
    @Test
    public void testetAreaList() {
        List<Area> areaList=areaService.getAreaList();
        assertEquals("东苑",areaList.get(0).getAreaName());
    }
}