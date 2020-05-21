package com.sgg.covid19.service.impl;

import com.sgg.covid19.dao.CityMoveDao;
import com.sgg.covid19.entity.CityMove;
import com.sgg.covid19.service.CityMoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityMoveServiceImpl implements CityMoveService {
    @Autowired
    private CityMoveDao cityMoveDao;
    @Override
    public List<CityMove> getCityMoveList(String mDate) {
        return cityMoveDao.queryCityMove(mDate);
    }
}
