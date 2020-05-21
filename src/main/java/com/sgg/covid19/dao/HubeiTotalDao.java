package com.sgg.covid19.dao;

import com.sgg.covid19.entity.HubeiTotal;

import java.util.List;

public interface HubeiTotalDao {
    /**
     * 查询湖北各地级市数据列表
     *
     * @return hubeiTotalList
     */
    List<HubeiTotal> queryHubeiTotal();
}
