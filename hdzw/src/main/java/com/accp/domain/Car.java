package com.accp.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;



public class Car {
	private Customer customer;
	
	private Carbrand carbrand;
	
	private Driver driver;
	
	private Cartype cartype;
	
	private Fuel fuel;
	
    public Fuel getFuel() {
		return fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public Cartype getCartype() {
		return cartype;
	}

	public void setCartype(Cartype cartype) {
		this.cartype = cartype;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	private Integer hid;

    private String hlicenseno;

    private Integer hbrandid;

    private Integer htypeid;

    private Integer hdriverid;

    private Integer hvehicleownership;

    private String hvin;

    private Integer hengineid;

    private String hengineno;

    private Float hcarmj;

    private Integer hmileage;

    private String hcarseries;

    private Date hbuydate;
    
    private Date hbldate;
   
    private Date hsoidate;

    private Integer hjqxicbc;
  
    private Date hjqxexpire;

    private Integer hsyxicbc;
   
    private Date hsyxlastdate;

    private Integer hicar;

    private Integer hfueltype;

    private Integer hnextmileage;

    private Date hmileagedate;

    private Integer huid;

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getHlicenseno() {
        return hlicenseno;
    }

    public void setHlicenseno(String hlicenseno) {
        this.hlicenseno = hlicenseno;
    }

    public Integer getHbrandid() {
        return hbrandid;
    }

    public void setHbrandid(Integer hbrandid) {
        this.hbrandid = hbrandid;
    }

    public Integer getHtypeid() {
        return htypeid;
    }

    public void setHtypeid(Integer htypeid) {
        this.htypeid = htypeid;
    }

    public Integer getHdriverid() {
        return hdriverid;
    }

    public void setHdriverid(Integer hdriverid) {
        this.hdriverid = hdriverid;
    }

    public Integer getHvehicleownership() {
        return hvehicleownership;
    }

    public void setHvehicleownership(Integer hvehicleownership) {
        this.hvehicleownership = hvehicleownership;
    }

    public String getHvin() {
        return hvin;
    }

    public void setHvin(String hvin) {
        this.hvin = hvin;
    }

    public Integer getHengineid() {
        return hengineid;
    }

    public void setHengineid(Integer hengineid) {
        this.hengineid = hengineid;
    }

    public String getHengineno() {
        return hengineno;
    }

    public void setHengineno(String hengineno) {
        this.hengineno = hengineno;
    }

    public Float getHcarmj() {
        return hcarmj;
    }

    public void setHcarmj(Float hcarmj) {
        this.hcarmj = hcarmj;
    }

    public Integer getHmileage() {
        return hmileage;
    }

    public void setHmileage(Integer hmileage) {
        this.hmileage = hmileage;
    }

    public String getHcarseries() {
        return hcarseries;
    }

    public void setHcarseries(String hcarseries) {
        this.hcarseries = hcarseries;
    }

    public Date getHbuydate() {
        return hbuydate;
    }

    public void setHbuydate(Date hbuydate) {
        this.hbuydate = hbuydate;
    }

    public Date getHbldate() {
        return hbldate;
    }

    public void setHbldate(Date hbldate) {
        this.hbldate = hbldate;
    }

    public Date getHsoidate() {
        return hsoidate;
    }

    public void setHsoidate(Date hsoidate) {
        this.hsoidate = hsoidate;
    }

    public Integer getHjqxicbc() {
        return hjqxicbc;
    }

    public void setHjqxicbc(Integer hjqxicbc) {
        this.hjqxicbc = hjqxicbc;
    }

    public Date getHjqxexpire() {
        return hjqxexpire;
    }

    public void setHjqxexpire(Date hjqxexpire) {
        this.hjqxexpire = hjqxexpire;
    }

    public Integer getHsyxicbc() {
        return hsyxicbc;
    }

    public void setHsyxicbc(Integer hsyxicbc) {
        this.hsyxicbc = hsyxicbc;
    }

    public Date getHsyxlastdate() {
        return hsyxlastdate;
    }

    public void setHsyxlastdate(Date hsyxlastdate) {
        this.hsyxlastdate = hsyxlastdate;
    }

    public Integer getHicar() {
        return hicar;
    }

    public void setHicar(Integer hicar) {
        this.hicar = hicar;
    }

    public Integer getHfueltype() {
        return hfueltype;
    }

    public void setHfueltype(Integer hfueltype) {
        this.hfueltype = hfueltype;
    }

    public Integer getHnextmileage() {
        return hnextmileage;
    }

    public void setHnextmileage(Integer hnextmileage) {
        this.hnextmileage = hnextmileage;
    }

    public Date getHmileagedate() {
        return hmileagedate;
    }

    public void setHmileagedate(Date hmileagedate) {
        this.hmileagedate = hmileagedate;
    }

    public Integer getHuid() {
        return huid;
    }

    public void setHuid(Integer huid) {
        this.huid = huid;
    }

	public Carbrand getCarbrand() {
		return carbrand;
	}

	public void setCarbrand(Carbrand carbrand) {
		this.carbrand = carbrand;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}