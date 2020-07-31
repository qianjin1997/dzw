package com.accp.domain;

import java.util.List;

public class Goodstype {
    private Integer aeid;

    private String aelname;

    private Integer aeparentid;
    
    private List<Goodstype> goodstype;//商品品牌集合
    
    public List<Goodstype> getGoodstype() {
		return goodstype;
	}
    
    public void setGoodstype(List<Goodstype> goodstype) {
		this.goodstype = goodstype;
	}

    public Integer getAeid() {
        return aeid;
    }

    public void setAeid(Integer aeid) {
        this.aeid = aeid;
    }

    public String getAelname() {
        return aelname;
    }

    public void setAelname(String aelname) {
        this.aelname = aelname;
    }

    public Integer getAeparentid() {
        return aeparentid;
    }

    public void setAeparentid(Integer aeparentid) {
        this.aeparentid = aeparentid;
    }
}