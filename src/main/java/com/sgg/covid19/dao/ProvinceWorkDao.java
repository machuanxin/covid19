package com.sgg.covid19.dao;

import com.sgg.covid19.entity.ProvinceWork;

import java.util.List;

public interface ProvinceWorkDao {
    /**
     * 查询省份复工指数数据列表
     *
     * @return provinceWorkList
     */
    List<ProvinceWork> queryProvinceWork(String date);
}
