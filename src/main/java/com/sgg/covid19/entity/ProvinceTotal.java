package com.sgg.covid19.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ProvinceTotal {
    //ID
    private Integer pId;
    //日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date pDate;
    //省份信息
    private String province;
    //确诊数
    private Integer caseTotal;

    public Integer getpId() {
        return pId;
    }

    public Date getpDate() {
        return pDate;
    }

    public String getProvince() {
        return province;
    }

    public Integer getCaseTotal() {
        return caseTotal;
    }
}
