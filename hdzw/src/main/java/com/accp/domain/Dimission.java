package com.accp.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Dimission {
    private Integer amid;

    private Integer ambid;

    private Integer amyid;

    private String amcause;
    
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date amldate;
    
    private Section section;
    
    private Staff staff;

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

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}
}