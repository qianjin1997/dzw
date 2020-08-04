package com.accp.domain;

public class Legwork {
    private Integer vid;

    private Integer vcarid;

    private Integer vteamid;
    
    private Car car;
    
    private Team team;//班组
    
    private Carbrand carbrand; //车辆品牌
    
    private Cartype cartype; //车型
    
    private Section section; //部门
    
    public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Carbrand getCarbrand() {
		return carbrand;
	}

	public void setCarbrand(Carbrand carbrand) {
		this.carbrand = carbrand;
	}

	public Cartype getCartype() {
		return cartype;
	}

	public void setCartype(Cartype cartype) {
		this.cartype = cartype;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

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