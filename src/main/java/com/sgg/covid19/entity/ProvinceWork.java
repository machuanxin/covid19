package com.sgg.covid19.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ProvinceWork {
    //ID
    private Integer id;
    //日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date date;
    private String province;
    private String rate;

    public Integer getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getProvince() {
        return province;
    }

    public String getRate() {
        return rate;
    }
}
