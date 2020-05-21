package com.sgg.covid19.dao;

import com.sgg.covid19.BaseTest;
import com.sgg.covid19.entity.China;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ChinaDaoTest extends BaseTest {
    @Autowired
    private ChinaDao chinaDao;

    @Test
    public void testQueryChina() {
        List<China> chinaList = chinaDao.queryChina();
        assertEquals("1",chinaList.get(0).getDeathRate());
    }
}
