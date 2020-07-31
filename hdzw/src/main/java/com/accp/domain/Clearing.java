package com.accp.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


public class Clearing {
	private Documentstatus docu;//单据状态
	
	private Customer cust; //客户
	
	private Car car;//车辆
	
    private Integer sid;

    private String ssellno;

    private Integer sbillstypeno;

    private String sclearingform;

    private Integer sstatusid;

    private String ssettlementstatus;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date ssettlementdate;

    private String ssettlementpeople;

    private Float ssettlementmoney;

    private Integer sbusinesstypeno;

    private Integer scusno;

    private Integer scarno;

    private Integer sinsuranceno;

    private String sindemnitycompany;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date scompletedate;

    private String sremark;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSsellno() {
        return ssellno;
    }

    public void setSsellno(String ssellno) {
        this.ssellno = ssellno;
    }

    public Integer getSbillstypeno() {
        return sbillstypeno;
    }

    public void setSbillstypeno(Integer sbillstypeno) {
        this.sbillstypeno = sbillstypeno;
    }

    public String getSclearingform() {
        return sclearingform;
    }

    public void setSclearingform(String sclearingform) {
        this.sclearingform = sclearingform;
    }

    public Integer getSstatusid() {
        return sstatusid;
    }

    public void setSstatusid(Integer sstatusid) {
        this.sstatusid = sstatusid;
    }

    public String getSsettlementstatus() {
        return ssettlementstatus;
    }

    public void setSsettlementstatus(String ssettlementstatus) {
        this.ssettlementstatus = ssettlementstatus;
    }

    public Date getSsettlementdate() {
        return ssettlementdate;
    }

    public void setSsettlementdate(Date ssettlementdate) {
        this.ssettlementdate = ssettlementdate;
    }

    public String getSsettlementpeople() {
        return ssettlementpeople;
    }

    public void setSsettlementpeople(String ssettlementpeople) {
        this.ssettlementpeople = ssettlementpeople;
    }

    public Float getSsettlementmoney() {
        return ssettlementmoney;
    }

    public void setSsettlementmoney(Float ssettlementmoney) {
        this.ssettlementmoney = ssettlementmoney;
    }

    public Integer getSbusinesstypeno() {
        return sbusinesstypeno;
    }

    public void setSbusinesstypeno(Integer sbusinesstypeno) {
        this.sbusinesstypeno = sbusinesstypeno;
    }

    public Integer getScusno() {
        return scusno;
    }

    public void setScusno(Integer scusno) {
        this.scusno = scusno;
    }

    public Integer getScarno() {
        return scarno;
    }

    public void setScarno(Integer scarno) {
        this.scarno = scarno;
    }

    public Integer getSinsuranceno() {
        return sinsuranceno;
    }

    public void setSinsuranceno(Integer sinsuranceno) {
        this.sinsuranceno = sinsuranceno;
    }

    public String getSindemnitycompany() {
        return sindemnitycompany;
    }

    public void setSindemnitycompany(String sindemnitycompany) {
        this.sindemnitycompany = sindemnitycompany;
    }

    public Date getScompletedate() {
        return scompletedate;
    }

    public void setScompletedate(Date scompletedate) {
        this.scompletedate = scompletedate;
    }

    public String getSremark() {
        return sremark;
    }

    public void setSremark(String sremark) {
        this.sremark = sremark;
    }

	public Documentstatus getDocu() {
		return docu;
	}

	public void setDocu(Documentstatus docu) {
		this.docu = docu;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
}