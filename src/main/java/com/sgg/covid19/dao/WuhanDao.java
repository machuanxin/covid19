package com.sgg.covid19.dao;

import com.sgg.covid19.entity.Wuhan;

import java.util.List;

public interface WuhanDao {
    /**
     * 查询武汉数据列表
     *
     * @return wuhanList
     */
    List<Wuhan> queryWuhan();
}
