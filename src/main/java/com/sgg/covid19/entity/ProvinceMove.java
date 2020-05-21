package com.sgg.covid19.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ProvinceMove {
    //ID
    private Integer pmId;
    //日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date mDate;
    private String province;
    private String rate;

    public Integer getPmId() {
        return pmId;
    }

    public Date getmDate() {
        return mDate;
    }

    public String getProvince() {
        return province;
    }

    public String getRate() {
        return rate;
    }
}
