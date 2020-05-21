package com.sgg.covid19.dao;

import com.sgg.covid19.entity.Hubei;

import java.util.List;

public interface HubeiDao {
    /**
     * 查询湖北数据列表
     *
     * @return chinaList
     */
    List<Hubei> queryHubei();
}
