package com.accp.domain;

public class Legwork {
    private Integer vid;

    private Integer vcarid;

    private Integer vteamid;
    
    private Car car;
    
    public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getVcarid() {
        return vcarid;
    }

    public void setVcarid(Integer vcarid) {
        this.vcarid = vcarid;
    }

    public Integer getVteamid() {
        return vteamid;
    }

    public void setVteamid(Integer vteamid) {
        this.vteamid = vteamid;
    }
}