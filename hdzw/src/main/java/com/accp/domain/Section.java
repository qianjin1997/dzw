package com.accp.domain;

import java.util.List;

public class Section {
    private Integer qid;

    private String qname;

    private Integer qparentid;
    
    private List<Section> children;
    
    private String bmname;

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    public String getQname() {
        return qname;
    }

    public void setQname(String qname) {
        this.qname = qname;
    }

    public Integer getQparentid() {
        return qparentid;
    }

    public void setQparentid(Integer qparentid) {
        this.qparentid = qparentid;
    }

	public List<Section> getChildren() {
		return children;
	}

	public void setChildren(List<Section> children) {
		this.children = children;
	}

	public String getBmname() {
		return bmname;
	}

	public void setBmname(String bmname) {
		this.bmname = bmname;
	}
}