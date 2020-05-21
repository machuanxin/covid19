package com.sgg.covid19.dao;

import com.sgg.covid19.entity.Area;

import java.util.List;

public interface AreaDao {
    /**
     * 列出武汉区域列表
     * @return
     */
    List<Area> queryArea();
}
