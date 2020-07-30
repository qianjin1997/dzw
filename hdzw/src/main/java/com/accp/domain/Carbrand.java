package com.accp.domain;

import java.util.List;

public class Carbrand {
    private Integer iid;

    private String ibrandname;

    private String iinitial;

    private List<Cartype> cartype;
    public List<Cartype> getCartype() {
		return cartype;
	}

	public void setCartype(List<Cartype> cartype) {
		this.cartype = cartype;
	}

	public Integer getIid() {
        return iid;
    }

    public void setIid(Integer iid) {
        this.iid = iid;
    }

    public String getIbrandname() {
        return ibrandname;
    }

    public void setIbrandname(String ibrandname) {
        this.ibrandname = ibrandname;
    }

    public String getIinitial() {
        return iinitial;
    }

    public void setIinitial(String iinitial) {
        this.iinitial = iinitial;
    }
}