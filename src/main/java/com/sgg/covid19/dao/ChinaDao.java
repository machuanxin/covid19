package com.sgg.covid19.dao;

import com.sgg.covid19.entity.China;

import java.util.List;

public interface ChinaDao {
    /**
     * 查询全国数据列表
     *
     * @return chinaList
     */
    List<China> queryChina();
}
