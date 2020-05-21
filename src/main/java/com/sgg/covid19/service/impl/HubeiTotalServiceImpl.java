package com.sgg.covid19.service.impl;

import com.sgg.covid19.dao.HubeiTotalDao;
import com.sgg.covid19.entity.HubeiTotal;
import com.sgg.covid19.service.HubeiTotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HubeiTotalServiceImpl implements HubeiTotalService {
    @Autowired
    private HubeiTotalDao hubeiTotalDao;
    @Override
    public List<HubeiTotal> getHubeiTotalList() {
        return hubeiTotalDao.queryHubeiTotal();
    }
}
