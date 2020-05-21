package com.sgg.covid19.service;

import com.sgg.covid19.entity.CityMove;

import java.util.List;

public interface CityMoveService {
    List<CityMove> getCityMoveList(String mDate);
}
