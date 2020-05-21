package com.sgg.covid19.service.impl;

import com.sgg.covid19.dao.HubeiDao;
import com.sgg.covid19.entity.Hubei;
import com.sgg.covid19.service.HubeiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HubeiServiceImpl implements HubeiService {
    @Autowired
    private HubeiDao hubeiDao;
    @Override
    public List<Hubei> getHubeiList() {
        return hubeiDao.queryHubei();
    }
}
