package com.sgg.covid19.dao;

import com.sgg.covid19.entity.CityMove;

import java.util.List;

public interface CityMoveDao {
    /**
     * 查询从武汉到其他城市迁徙数据列表
     *
     * @return moveCityList
     */
    List<CityMove> queryCityMove(String mDate);
}
