package com.sgg.covid19.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class China {
    //ID
    private Integer cId;
    //日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date cDate;
    //新增病例
    private Integer newCase;
    //累计病例
    private Integer totalCase;
    //现存病例
    private Integer nowCase;
    //重症变化
    private Integer severeChange;
    //现存重症
    private Integer nowSevere;
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
    //新增疑似
    private Integer newSuspect;
    //现有疑似
    private Integer nowSuspect;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public Date getcDate() {
        return cDate;
    }

    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }

    public Integer getNewCase() {
        return newCase;
    }

    public void setNewCase(Integer newCase) {
        this.newCase = newCase;
    }

    public Integer getTotalCase() {
        return totalCase;
    }

    public void setTotalCase(Integer totalCase) {
        this.totalCase = totalCase;
    }

    public Integer getNowCase() {
        return nowCase;
    }

    public void setNowCase(Integer nowCase) {
        this.nowCase = nowCase;
    }

    public Integer getSevereChange() {
        return severeChange;
    }

    public void setSevereChange(Integer severeChange) {
        this.severeChange = severeChange;
    }

    public Integer getNowSevere() {
        return nowSevere;
    }

    public void setNowSevere(Integer nowSevere) {
        this.nowSevere = nowSevere;
    }

    public Integer getNewDeath() {
        return newDeath;
    }

    public void setNewDeath(Integer newDeath) {
        this.newDeath = newDeath;
    }

    public Integer getTotalDeath() {
        return totalDeath;
    }

    public void setTotalDeath(Integer totalDeath) {
        this.totalDeath = totalDeath;
    }

    public String getDeathRate() {
        return deathRate;
    }

    public void setDeathRate(String deathRate) {
        this.deathRate = deathRate;
    }

    public Integer getNewCure() {
        return newCure;
    }

    public void setNewCure(Integer newCure) {
        this.newCure = newCure;
    }

    public Integer getTotalCure() {
        return totalCure;
    }

    public void setTotalCure(Integer totalCure) {
        this.totalCure = totalCure;
    }

    public String getCureRate() {
        return cureRate;
    }

    public void setCureRate(String cureRate) {
        this.cureRate = cureRate;
    }

    public Integer getNewSuspect() {
        return newSuspect;
    }

    public void setNewSuspect(Integer newSuspect) {
        this.newSuspect = newSuspect;
    }

    public Integer getNowSuspect() {
        return nowSuspect;
    }

    public void setNowSuspect(Integer nowSuspect) {
        this.nowSuspect = nowSuspect;
    }
}
