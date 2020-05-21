package com.sgg.covid19.dao;

import com.sgg.covid19.BaseTest;
import com.sgg.covid19.entity.CityMove;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CityMoveDaoTest extends BaseTest {
    @Autowired
    private CityMoveDao cityMoveDao;

    @Test
    public void testQueryCityMoveList() {
        String mDate = "2020-01-02";
        List<CityMove> cityMoveList = cityMoveDao.queryCityMove(mDate);
        assertEquals("1",cityMoveList.get(0).getRate());
    }
}
