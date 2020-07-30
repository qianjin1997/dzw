package com.accp.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Member {
    private Integer gid;

    private String gcard;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date gadmissiondate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date gmembershipdue;

    private Integer gcustomertypeid;

    private Integer gtypeid;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGcard() {
        return gcard;
    }

    public void setGcard(String gcard) {
        this.gcard = gcard;
    }

    public Date getGadmissiondate() {
        return gadmissiondate;
    }

    public void setGadmissiondate(Date gadmissiondate) {
        this.gadmissiondate = gadmissiondate;
    }

    public Date getGmembershipdue() {
        return gmembershipdue;
    }

    public void setGmembershipdue(Date gmembershipdue) {
        this.gmembershipdue = gmembershipdue;
    }

    public Integer getGcustomertypeid() {
        return gcustomertypeid;
    }

    public void setGcustomertypeid(Integer gcustomertypeid) {
        this.gcustomertypeid = gcustomertypeid;
    }

    public Integer getGtypeid() {
        return gtypeid;
    }

    public void setGtypeid(Integer gtypeid) {
        this.gtypeid = gtypeid;
    }
}