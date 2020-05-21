package com.sgg.covid19.service.impl;

import com.sgg.covid19.dao.ProvinceWorkDao;
import com.sgg.covid19.entity.ProvinceWork;
import com.sgg.covid19.service.ProvinceWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinceWorkServiceImpl implements ProvinceWorkService {
    @Autowired
    private ProvinceWorkDao provinceWorkDao;
    @Override
    public List<ProvinceWork> getProvinceWorkList(String date) {
        return provinceWorkDao.queryProvinceWork(date);
    }
}
