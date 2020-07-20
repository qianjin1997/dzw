package com.accp.domain;

public class Module {
    private Integer did;

    private String dename;

    private String dcname;

    private String dpath;

    private Integer dcatalog;

    private Integer dparentid;

    private String dmeth;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDename() {
        return dename;
    }

    public void setDename(String dename) {
        this.dename = dename;
    }

    public String getDcname() {
        return dcname;
    }

    public void setDcname(String dcname) {
        this.dcname = dcname;
    }

    public String getDpath() {
        return dpath;
    }

    public void setDpath(String dpath) {
        this.dpath = dpath;
    }

    public Integer getDcatalog() {
        return dcatalog;
    }

    public void setDcatalog(Integer dcatalog) {
        this.dcatalog = dcatalog;
    }

    public Integer getDparentid() {
        return dparentid;
    }

    public void setDparentid(Integer dparentid) {
        this.dparentid = dparentid;
    }

    public String getDmeth() {
        return dmeth;
    }

    public void setDmeth(String dmeth) {
        this.dmeth = dmeth;
    }
}