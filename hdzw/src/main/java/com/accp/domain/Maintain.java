package com.accp.domain;

import java.util.Date;

public class Maintain {
    private Integer rid;

    private String rinvoicestype;

    private String rsaleno;

    private String rlicenseno;

    private Date rfactorydate;

    private Date rokdate;

    private Date rclosedate;

    private Float rclosemoney;

    private Integer rcarid;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRinvoicestype() {
        return rinvoicestype;
    }

    public void setRinvoicestype(String rinvoicestype) {
        this.rinvoicestype = rinvoicestype;
    }

    public String getRsaleno() {
        return rsaleno;
    }

    public void setRsaleno(String rsaleno) {
        this.rsaleno = rsaleno;
    }

    public String getRlicenseno() {
        return rlicenseno;
    }

    public void setRlicenseno(String rlicenseno) {
        this.rlicenseno = rlicenseno;
    }

    public Date getRfactorydate() {
        return rfactorydate;
    }

    public void setRfactorydate(Date rfactorydate) {
        this.rfactorydate = rfactorydate;
    }

    public Date getRokdate() {
        return rokdate;
    }

    public void setRokdate(Date rokdate) {
        this.rokdate = rokdate;
    }

    public Date getRclosedate() {
        return rclosedate;
    }

    public void setRclosedate(Date rclosedate) {
        this.rclosedate = rclosedate;
    }

    public Float getRclosemoney() {
        return rclosemoney;
    }

    public void setRclosemoney(Float rclosemoney) {
        this.rclosemoney = rclosemoney;
    }

    public Integer getRcarid() {
        return rcarid;
    }

    public void setRcarid(Integer rcarid) {
        this.rcarid = rcarid;
    }
}