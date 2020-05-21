package com.sgg.covid19.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Wuhan {
    //ID
    private Integer whId;
    //日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date date;
    //新增病例
    private Integer newCase;
    //累计病例
    private Integer totalCase;
    //新增死亡
    private Integer newDeath;
    //累计死亡
    private Integer totalDeath;
    //死亡率
    private String deathRate;
    //新增治愈
    private Integer newCure;
    //累计治愈
    private Integer totalCure;
    //治愈率
    private String cureRate;

    public Integer getWhId() {
        return whId;
    }

    public Date getDate() {
        return date;
    }

    public Integer getNewCase() {
        return newCase;
    }

    public Integer getTotalCase() {
        return totalCase;
    }

    public Integer getNewDeath() {
        return newDeath;
    }

    public Integer getTotalDeath() {
        return totalDeath;
    }

    public String getDeathRate() {
        return deathRate;
    }

    public Integer getNewCure() {
        return newCure;
    }

    public Integer getTotalCure() {
        return totalCure;
    }

    public String getCureRate() {
        return cureRate;
    }
}
