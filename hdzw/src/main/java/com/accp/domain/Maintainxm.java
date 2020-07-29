package com.accp.domain;

import java.util.List;

public class Maintainxm {
    private Integer xid;

    private String xmaintainname;

    private Integer xparentid;
    
    private List<Maintainxm> ma;
    
    public List<Maintainxm> getMa() {
		return ma;
	}
    
    public void setMa(List<Maintainxm> ma) {
		this.ma = ma;
	}
    
    public Integer getXid() {
        return xid;
    }

    public void setXid(Integer xid) {
        this.xid = xid;
    }

    public String getXmaintainname() {
        return xmaintainname;
    }

    public void setXmaintainname(String xmaintainname) {
        this.xmaintainname = xmaintainname;
    }

    public Integer getXparentid() {
        return xparentid;
    }

    public void setXparentid(Integer xparentid) {
        this.xparentid = xparentid;
    }
}