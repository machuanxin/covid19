package com.sgg.covid19.service;

import com.sgg.covid19.BaseTest;
import com.sgg.covid19.entity.Hubei;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class HubeiServiceTest extends BaseTest {
    @Autowired
    private HubeiService hubeiService;

    @Test
    public void testGetChinaList(){
        List<Hubei> hubeiList=hubeiService.getHubeiList();
        assertEquals("77",hubeiList.get(0).getDeathRate());
    }
}
