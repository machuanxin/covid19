package com.sgg.covid19.service.impl;

import com.sgg.covid19.dao.ProvinceTotalDao;
import com.sgg.covid19.entity.ProvinceTotal;
import com.sgg.covid19.service.ProvinceTotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceTotalServiceImpl implements ProvinceTotalService {
    @Autowired
    private ProvinceTotalDao provinceTotalDao;
    @Override
    public List<ProvinceTotal> getProvinceTotalList() {
        return provinceTotalDao.queryProvinceTotal();
    }
}
