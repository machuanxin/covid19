package com.sgg.covid19.service.impl;

import com.sgg.covid19.dao.HospitalDao;
import com.sgg.covid19.entity.Hospital;
import com.sgg.covid19.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {
    @Autowired
    private HospitalDao hospitalDao;
    @Override
    public List<Hospital> getHospitalList() {
        return hospitalDao.queryHospital();
    }
}
