package com.sgg.covid19.dao;

import com.sgg.covid19.BaseTest;
import com.sgg.covid19.dao.CityMoveDao;
import com.sgg.covid19.dao.ProvinceMoveDao;
import com.sgg.covid19.entity.CityMove;
import com.sgg.covid19.entity.ProvinceMove;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProvinceMoveDaoTest extends BaseTest {
    @Autowired
    private ProvinceMoveDao provinceMoveDao;

    @Test
    public void testQueryProvinceMoveList() {
        String mDate = "2020-01-02";
        List<ProvinceMove> provinceMoveList = provinceMoveDao.queryProvinceMove(mDate);
        assertEquals("1",provinceMoveList.get(0).getRate());
    }
}
