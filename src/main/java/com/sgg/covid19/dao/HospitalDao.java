package com.sgg.covid19.dao;

import com.sgg.covid19.entity.Hospital;

import java.util.List;

public interface HospitalDao {
    /**
     * 查询武汉发热门诊
     * @return
     */
    List<Hospital> queryHospital();
}
