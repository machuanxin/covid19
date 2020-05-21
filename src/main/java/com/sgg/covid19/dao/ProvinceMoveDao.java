package com.sgg.covid19.dao;

import com.sgg.covid19.entity.ProvinceMove;

import java.util.List;

public interface ProvinceMoveDao {
    /**
     * 查询从武汉到其他城市迁徙数据列表
     *
     * @return moveCityList
     */
    List<ProvinceMove> queryProvinceMove(String mDate);
}
