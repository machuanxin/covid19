package com.sgg.covid19.service;

import com.sgg.covid19.entity.ProvinceWork;

import java.util.List;

public interface ProvinceWorkService {
    List<ProvinceWork> getProvinceWorkList(String date);
}
