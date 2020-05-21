package com.sgg.covid19.service;

import com.sgg.covid19.BaseTest;
import com.sgg.covid19.entity.China;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ChinaServiceTest extends BaseTest {
    @Autowired
    private ChinaService chinaService;

    @Test
    public void testGetChinaList(){
        List<China> chinaList=chinaService.getChinaList();
        assertEquals("77",chinaList.get(0).getDeathRate());
    }
}
