package com.sgg.covid19.dao;

import com.sgg.covid19.BaseTest;
import com.sgg.covid19.entity.HubeiTotal;
import com.sgg.covid19.entity.ProvinceTotal;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class HubeiTotalDaoTest extends BaseTest {
    @Autowired
    private HubeiTotalDao hubeiTotalDao;

    @Test
    public void testQueryProvince() {
        List<HubeiTotal> hubeiTotalList = hubeiTotalDao.queryHubeiTotal();
        System.out.println(hubeiTotalList);
        assertEquals("1", hubeiTotalList.get(0).getCity());
    }
}
