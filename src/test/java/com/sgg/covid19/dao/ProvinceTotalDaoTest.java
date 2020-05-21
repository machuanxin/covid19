package com.sgg.covid19.dao;

import com.sgg.covid19.BaseTest;
import com.sgg.covid19.entity.ProvinceTotal;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProvinceTotalDaoTest extends BaseTest {
    @Autowired
    private ProvinceTotalDao provinceTotalDao;

    @Test
    public void testQueryProvince() {
        List<ProvinceTotal> provinceTotalList = provinceTotalDao.queryProvinceTotal();
        System.out.println(provinceTotalList);
        assertEquals("1", provinceTotalList.get(0).getProvince());
    }
}
