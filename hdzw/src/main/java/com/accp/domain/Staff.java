package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Staff {
    private Integer pid;

    private String pjobid;
    
    private Section section;
    
    private Gpost gpost;

    private String pname;

    private Integer psectionid;

    private String psex;

    private Integer pgjobid;
    
    private String pgname;

    private String pbodystatus;

    private String pheight;

    private String porigo;

    private String pethnic;

    private String pmaritalstatus;

    private String peducation;

    private String pschooltag;

    private String pprofession;

    private String pqualification;

    private String pdegree;

    private String pstaffing;

    private String pidnumber;

    private String paccountadd;

    private String ppostcode;

    private String pphone;

    private String pthisaddress;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date ptrialdate;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date pentrydate;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date pbirthdate;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date pbegindate;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date poverdate;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date pbirthday;

    private Integer page;

    private Integer puid;
    
    private Section sect;
    
    public Section getSect() {
		return sect;
	}

	public void setSect(Section sect) {
		this.sect = sect;
	}

	public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPjobid() {
        return pjobid;
    }

    public void setPjobid(String pjobid) {
        this.pjobid = pjobid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPsectionid() {
        return psectionid;
    }

    public void setPsectionid(Integer psectionid) {
        this.psectionid = psectionid;
    }

    public String getPsex() {
        return psex;
    }

    public void setPsex(String psex) {
        this.psex = psex;
    }

    public Integer getPgjobid() {
        return pgjobid;
    }

    public void setPgjobid(Integer pgjobid) {
        this.pgjobid = pgjobid;
    }

    public String getPbodystatus() {
        return pbodystatus;
    }

    public void setPbodystatus(String pbodystatus) {
        this.pbodystatus = pbodystatus;
    }

    public String getPheight() {
        return pheight;
    }

    public void setPheight(String pheight) {
        this.pheight = pheight;
    }

    public String getPorigo() {
        return porigo;
    }

    public void setPorigo(String porigo) {
        this.porigo = porigo;
    }

    public String getPethnic() {
        return pethnic;
    }

    public void setPethnic(String pethnic) {
        this.pethnic = pethnic;
    }

    public String getPmaritalstatus() {
        return pmaritalstatus;
    }

    public void setPmaritalstatus(String pmaritalstatus) {
        this.pmaritalstatus = pmaritalstatus;
    }

    public String getPeducation() {
        return peducation;
    }

    public void setPeducation(String peducation) {
        this.peducation = peducation;
    }

    public String getPschooltag() {
        return pschooltag;
    }

    public void setPschooltag(String pschooltag) {
        this.pschooltag = pschooltag;
    }

    public String getPprofession() {
        return pprofession;
    }

    public void setPprofession(String pprofession) {
        this.pprofession = pprofession;
    }

    public String getPqualification() {
        return pqualification;
    }

    public void setPqualification(String pqualification) {
        this.pqualification = pqualification;
    }

    public String getPdegree() {
        return pdegree;
    }

    public void setPdegree(String pdegree) {
        this.pdegree = pdegree;
    }

    public String getPstaffing() {
        return pstaffing;
    }

    public void setPstaffing(String pstaffing) {
        this.pstaffing = pstaffing;
    }

    public String getPidnumber() {
        return pidnumber;
    }

    public void setPidnumber(String pidnumber) {
        this.pidnumber = pidnumber;
    }

    public String getPaccountadd() {
        return paccountadd;
    }

    public void setPaccountadd(String paccountadd) {
        this.paccountadd = paccountadd;
    }

    public String getPpostcode() {
        return ppostcode;
    }

    public void setPpostcode(String ppostcode) {
        this.ppostcode = ppostcode;
    }

    public String getPphone() {
        return pphone;
    }

    public void setPphone(String pphone) {
        this.pphone = pphone;
    }

    public String getPthisaddress() {
        return pthisaddress;
    }

    public void setPthisaddress(String pthisaddress) {
        this.pthisaddress = pthisaddress;
    }

    public Date getPtrialdate() {
        return ptrialdate;
    }

    public void setPtrialdate(Date ptrialdate) {
        this.ptrialdate = ptrialdate;
    }

    public Date getPentrydate() {
        return pentrydate;
    }

    public void setPentrydate(Date pentrydate) {
        this.pentrydate = pentrydate;
    }

    public Date getPbirthdate() {
        return pbirthdate;
    }

    public void setPbirthdate(Date pbirthdate) {
        this.pbirthdate = pbirthdate;
    }

    public Date getPbegindate() {
        return pbegindate;
    }

    public void setPbegindate(Date pbegindate) {
        this.pbegindate = pbegindate;
    }

    public Date getPoverdate() {
        return poverdate;
    }

    public void setPoverdate(Date poverdate) {
        this.poverdate = poverdate;
    }

    public Date getPbirthday() {
        return pbirthday;
    }

    public void setPbirthday(Date pbirthday) {
        this.pbirthday = pbirthday;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPuid() {
        return puid;
    }

    public void setPuid(Integer puid) {
        this.puid = puid;
    }

	public String getPgname() {
		return pgname;
	}

	public void setPgname(String pgname) {
		this.pgname = pgname;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Gpost getGpost() {
		return gpost;
	}

	public void setGpost(Gpost gpost) {
		this.gpost = gpost;
	}
}