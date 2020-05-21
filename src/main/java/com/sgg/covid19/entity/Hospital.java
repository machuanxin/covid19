package com.sgg.covid19.entity;

public class Hospital {
    //ID
    private Integer hospitalId;
    //名称
    private String hospitalName;
    //经度
    private Double longitude;
    //纬度
    private Double latitude;
    //是否为发热门诊
    private Integer feverClinic;
    //是否为定点救治医疗机构
    private Integer designatedMedicalInstitution;
    //是否为定点核酸检测机构
    private Integer designatedDetectionInstitution;

    public Integer getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Integer hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Integer getFeverClinic() {
        return feverClinic;
    }

    public void setFeverClinic(Integer feverClinic) {
        this.feverClinic = feverClinic;
    }

    public Integer getDesignatedMedicalInstitution() {
        return designatedMedicalInstitution;
    }

    public void setDesignatedMedicalInstitution(Integer designatedMedicalInstitution) {
        this.designatedMedicalInstitution = designatedMedicalInstitution;
    }

    public Integer getDesignatedDetectionInstitution() {
        return designatedDetectionInstitution;
    }

    public void setDesignatedDetectionInstitution(Integer designatedDetectionInstitution) {
        this.designatedDetectionInstitution = designatedDetectionInstitution;
    }
}
