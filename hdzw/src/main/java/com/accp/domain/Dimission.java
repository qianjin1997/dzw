package com.accp.domain;

import java.util.Date;

public class Dimission {
    private Integer amid;

    private Integer ambid;

    private Integer amyid;

    private String amcause;

    private Date amldate;

    public Integer getAmid() {
        return amid;
    }

    public void setAmid(Integer amid) {
        this.amid = amid;
    }

    public Integer getAmbid() {
        return ambid;
    }

    public void setAmbid(Integer ambid) {
        this.ambid = ambid;
    }

    public Integer getAmyid() {
        return amyid;
    }

    public void setAmyid(Integer amyid) {
        this.amyid = amyid;
    }

    public String getAmcause() {
        return amcause;
    }

    public void setAmcause(String amcause) {
        this.amcause = amcause;
    }

    public Date getAmldate() {
        return amldate;
    }

    public void setAmldate(Date amldate) {
        this.amldate = amldate;
    }
}