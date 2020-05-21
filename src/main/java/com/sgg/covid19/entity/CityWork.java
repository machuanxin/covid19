package com.sgg.covid19.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CityWork {
    //ID
    private Integer id;
    //日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date date;
    private String city;
    private String rate;

    public Integer getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getCity() {
        return city;
    }

    public String getRate() {
        return rate;
    }
}
