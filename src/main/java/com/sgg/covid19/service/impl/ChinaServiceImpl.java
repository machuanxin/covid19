package com.sgg.covid19.service.impl;

import com.sgg.covid19.dao.ChinaDao;
import com.sgg.covid19.entity.China;
import com.sgg.covid19.service.ChinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChinaServiceImpl implements ChinaService {
    @Autowired
    private ChinaDao chinaDao;
    @Override
    public List<China> getChinaList() {
        return chinaDao.queryChina();
    }
}
