package com.sgg.covid19.dao;

import com.sgg.covid19.entity.ProvinceTotal;

import java.util.List;

public interface ProvinceTotalDao {
    /**
     * 查询各省份数据列表
     *
     * @return provinceTotalList
     */
    List<ProvinceTotal> queryProvinceTotal();
}
