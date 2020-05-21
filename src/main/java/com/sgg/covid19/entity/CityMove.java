package com.sgg.covid19.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CityMove {
    //ID
    private Integer cmId;
    //日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date mDate;
    private String city;
    private String rate;

    public Integer getCmId() {
        return cmId;
    }

    public Date getmDate() {
        return mDate;
    }

    public String getCity() {
        return city;
    }

    public String getRate() {
        return rate;
    }
}
