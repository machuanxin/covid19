package com.sgg.covid19.service;

import com.sgg.covid19.entity.ProvinceMove;

import java.util.List;

public interface ProvinceMoveService {
    List<ProvinceMove> getProvinceMoveList(String mDate);
}
