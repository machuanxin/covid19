package com.sgg.covid19.service.impl;

import com.sgg.covid19.dao.CityWorkDao;
import com.sgg.covid19.entity.CityWork;
import com.sgg.covid19.service.CityWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityWorkServiceImpl implements CityWorkService {
    @Autowired
    private CityWorkDao cityWorkDao;
    @Override
    public List<CityWork> getCityWorkList() {
        return cityWorkDao.queryCityWork();
    }
}
