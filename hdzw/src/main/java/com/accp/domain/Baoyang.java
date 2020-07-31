package com.accp.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Baoyang {
    private Integer byid;

    private Integer bycarid;

    private String bybaoname;

    private String bylicheng;

    private String bysjlicheng;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date bysjtime;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date byjhtime;

    private Car car;
    public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Integer getByid() {
        return byid;
    }

    public void setByid(Integer byid) {
        this.byid = byid;
    }

    public Integer getBycarid() {
        return bycarid;
    }

    public void setBycarid(Integer bycarid) {
        this.bycarid = bycarid;
    }

    public String getBybaoname() {
        return bybaoname;
    }

    public void setBybaoname(String bybaoname) {
        this.bybaoname = bybaoname;
    }

    public String getBylicheng() {
        return bylicheng;
    }

    public void setBylicheng(String bylicheng) {
        this.bylicheng = bylicheng;
    }

    public String getBysjlicheng() {
        return bysjlicheng;
    }

    public void setBysjlicheng(String bysjlicheng) {
        this.bysjlicheng = bysjlicheng;
    }

    public Date getBysjtime() {
        return bysjtime;
    }

    public void setBysjtime(Date bysjtime) {
        this.bysjtime = bysjtime;
    }

    public Date getByjhtime() {
        return byjhtime;
    }

    public void setByjhtime(Date byjhtime) {
        this.byjhtime = byjhtime;
    }
}