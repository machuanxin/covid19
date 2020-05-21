package com.sgg.covid19.service;

import com.sgg.covid19.BaseTest;
import com.sgg.covid19.entity.ProvinceMove;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProvinceMoveTest extends BaseTest {
    @Autowired
    private ProvinceMoveService provinceMoveService;

    @Test
    public void testGetProvinceMoveList(){
        String mDate="2020-01-02";
        List<ProvinceMove> provinceList=provinceMoveService.getProvinceMoveList(mDate);
        System.out.println(provinceList.get(0).getRate());
        assertEquals("1",provinceList.get(0).getRate());
    }
}
