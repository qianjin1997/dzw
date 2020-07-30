package com.accp.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Driver {
    private Integer oid;

    private String oname;

    private String ophone;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date obirthday;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date oexpire;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public String getOphone() {
        return ophone;
    }

    public void setOphone(String ophone) {
        this.ophone = ophone;
    }

    public Date getObirthday() {
        return obirthday;
    }

    public void setObirthday(Date obirthday) {
        this.obirthday = obirthday;
    }

    public Date getOexpire() {
        return oexpire;
    }

    public void setOexpire(Date oexpire) {
        this.oexpire = oexpire;
    }
}