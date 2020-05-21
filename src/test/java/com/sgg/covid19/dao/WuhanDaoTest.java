package com.sgg.covid19.dao;

import com.sgg.covid19.BaseTest;
import com.sgg.covid19.entity.Wuhan;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class WuhanDaoTest extends BaseTest {
    @Autowired
    private WuhanDao wuhanDao;

    @Test
    public void testQueryWuhan() {
        List<Wuhan> wuhanList = wuhanDao.queryWuhan();
        assertEquals("1",wuhanList.get(0).getDeathRate());
    }
}
