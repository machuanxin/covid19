package com.sgg.covid19.dao;

import com.sgg.covid19.BaseTest;
import com.sgg.covid19.entity.Hospital;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class HospitalDaoDaoTest extends BaseTest {
    @Autowired
    private HospitalDao hospitalDao;

    @Test
    public void testQueryFeverClinic(){
        List<Hospital> hospitalList = hospitalDao.queryHospital();
        assertEquals(61, hospitalList.size());
    }
}
