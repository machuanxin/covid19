package com.sgg.covid19.service.impl;

import com.sgg.covid19.dao.WuhanDao;
import com.sgg.covid19.entity.Wuhan;
import com.sgg.covid19.service.WuhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WuhanServiceImpl implements WuhanService {
    @Autowired
    private WuhanDao wuhanDao;
    @Override
    public List<Wuhan> getWuhanList() {
        return wuhanDao.queryWuhan();
    }
}
