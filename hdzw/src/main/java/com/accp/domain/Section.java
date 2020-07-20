package com.accp.domain;

public class Section {
    private Integer qid;

    private String qname;

    private Integer qparentid;

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
}