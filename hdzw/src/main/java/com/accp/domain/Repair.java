package com.accp.domain;

public class Repair {
	private Section secti; //班组
	
	private Staff sta; //员工
	
    private Integer wid;

    private Integer wmid;

    private String wmname;

    private Integer wincomeid;

    private String wremark;

    private Float wsprice;

    private Float wmemberprice;

    private Float wvipice;

    private Float wdeal;

    private Float wclaim;

    private Float wicbcprice;
    
    //----------------------------
    private Maintainxm r2;
    
    private Income r3;

    public Maintainxm getR2() {
		return r2;
	}

	public void setR2(Maintainxm r2) {
		this.r2 = r2;
	}

	public Income getR3() {
		return r3;
	}

	public void setR3(Income r3) {
		this.r3 = r3;
	}

    private Integer wsum;

    private String wpriceclass;

    private Integer wyhqianprice;

    private Integer wthhouprice;

    private Integer wyhhouamount;

    private String wproblem;

    private String wdescribe;

    private Integer bjid;

    private Integer ygid;

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public Integer getWmid() {
        return wmid;
    }

    public void setWmid(Integer wmid) {
        this.wmid = wmid;
    }

    public String getWmname() {
        return wmname;
    }

    public void setWmname(String wmname) {
        this.wmname = wmname;
    }

    public Integer getWincomeid() {
        return wincomeid;
    }

    public void setWincomeid(Integer wincomeid) {
        this.wincomeid = wincomeid;
    }

    public String getWremark() {
        return wremark;
    }

    public void setWremark(String wremark) {
        this.wremark = wremark;
    }

    public Float getWsprice() {
        return wsprice;
    }

    public void setWsprice(Float wsprice) {
        this.wsprice = wsprice;
    }

    public Float getWmemberprice() {
        return wmemberprice;
    }

    public void setWmemberprice(Float wmemberprice) {
        this.wmemberprice = wmemberprice;
    }

    public Float getWvipice() {
        return wvipice;
    }

    public void setWvipice(Float wvipice) {
        this.wvipice = wvipice;
    }

    public Float getWdeal() {
        return wdeal;
    }

    public void setWdeal(Float wdeal) {
        this.wdeal = wdeal;
    }

    public Float getWclaim() {
        return wclaim;
    }

    public void setWclaim(Float wclaim) {
        this.wclaim = wclaim;
    }

    public Float getWicbcprice() {
        return wicbcprice;
    }

    public void setWicbcprice(Float wicbcprice) {
        this.wicbcprice = wicbcprice;
    }

    public Integer getWsum() {
        return wsum;
    }

    public void setWsum(Integer wsum) {
        this.wsum = wsum;
    }

    public String getWpriceclass() {
        return wpriceclass;
    }

    public void setWpriceclass(String wpriceclass) {
        this.wpriceclass = wpriceclass;
    }

    public Integer getWyhqianprice() {
        return wyhqianprice;
    }

    public void setWyhqianprice(Integer wyhqianprice) {
        this.wyhqianprice = wyhqianprice;
    }

    public Integer getWthhouprice() {
        return wthhouprice;
    }

    public void setWthhouprice(Integer wthhouprice) {
        this.wthhouprice = wthhouprice;
    }

    public Integer getWyhhouamount() {
        return wyhhouamount;
    }

    public void setWyhhouamount(Integer wyhhouamount) {
        this.wyhhouamount = wyhhouamount;
    }

    public String getWproblem() {
        return wproblem;
    }

    public void setWproblem(String wproblem) {
        this.wproblem = wproblem;
    }

    public String getWdescribe() {
        return wdescribe;
    }

    public void setWdescribe(String wdescribe) {
        this.wdescribe = wdescribe;
    }

    public Integer getBjid() {
        return bjid;
    }

    public void setBjid(Integer bjid) {
        this.bjid = bjid;
    }

    public Integer getYgid() {
        return ygid;
    }

    public void setYgid(Integer ygid) {
        this.ygid = ygid;
    }

	public Section getSecti() {
		return secti;
	}

	public void setSecti(Section secti) {
		this.secti = secti;
	}

	public Staff getSta() {
		return sta;
	}

	public void setSta(Staff sta) {
		this.sta = sta;
	}
}