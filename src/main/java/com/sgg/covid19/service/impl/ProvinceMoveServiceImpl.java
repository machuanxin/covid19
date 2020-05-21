package com.sgg.covid19.service.impl;

import com.sgg.covid19.dao.ProvinceMoveDao;
import com.sgg.covid19.entity.ProvinceMove;
import com.sgg.covid19.service.ProvinceMoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProvinceMoveServiceImpl implements ProvinceMoveService {
    @Autowired
    private ProvinceMoveDao provinceMoveDao;
    @Override
    public List<ProvinceMove> getProvinceMoveList(String mDate) {
        return provinceMoveDao.queryProvinceMove(mDate);
    }
}
