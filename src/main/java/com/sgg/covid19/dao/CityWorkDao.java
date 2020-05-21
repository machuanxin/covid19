package com.sgg.covid19.dao;

import com.sgg.covid19.entity.CityWork;

import java.util.List;

public interface CityWorkDao {
    /**
     * 查询城市复工指数数据列表
     *
     * @return moveWorkList
     */
    List<CityWork> queryCityWork();
}
