package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class Ghaddress {
    private Integer anid;

    private String anaddress;

    private Integer anparentid;
    
    private List<Ghaddress> children=new ArrayList<Ghaddress>();

    public List<Ghaddress> getChildren() {
		return children;
	}

	public void setChildren(List<Ghaddress> children) {
		this.children = children;
	}

	public Integer getAnid() {
        return anid;
    }

    public void setAnid(Integer anid) {
        this.anid = anid;
    }

    public String getAnaddress() {
        return anaddress;
    }

    public void setAnaddress(String anaddress) {
        this.anaddress = anaddress;
    }

    public Integer getAnparentid() {
        return anparentid;
    }

    public void setAnparentid(Integer anparentid) {
        this.anparentid = anparentid;
    }
}