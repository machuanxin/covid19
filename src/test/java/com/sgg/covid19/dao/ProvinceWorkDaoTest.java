package com.sgg.covid19.dao;

import com.sgg.covid19.BaseTest;
import com.sgg.covid19.entity.ProvinceWork;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProvinceWorkDaoTest extends BaseTest {
    @Autowired
    private ProvinceWorkDao provinceWorkDao;

    @Test
    public void testQueryProvinceWorkList() {
        String date = "2020-03-10";
        List<ProvinceWork> provinceWorkList = provinceWorkDao.queryProvinceWork(date);
        assertEquals("1",provinceWorkList.get(0).getRate());
    }
}
