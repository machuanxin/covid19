package com.sgg.covid19.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class HubeiTotal {
    //ID
    private Integer id;
    //日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date date;
    //城市信息
    private String city;
    //确诊数
    private Integer caseTotal;

    public Integer getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public String getCity() {
        return city;
    }

    public Integer getCaseTotal() {
        return caseTotal;
    }
}
