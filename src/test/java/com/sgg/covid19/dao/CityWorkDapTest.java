package com.sgg.covid19.dao;

import com.sgg.covid19.BaseTest;
import com.sgg.covid19.entity.CityWork;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CityWorkDapTest extends BaseTest {
    @Autowired
    private CityWorkDao CityWorkDao;

    @Test
    public void testQueryCityWorkList() {
        List<CityWork> cityWorkList = CityWorkDao.queryCityWork();
        assertEquals("1",cityWorkList.get(0).getRate());
    }
}
