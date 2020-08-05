package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.CustomertypeMapper;
import com.accp.dao.MemberMapper;
import com.accp.domain.Customertype;
import com.accp.domain.Member;
@Service
@Transactional
public class wsbkhflservice {
	@Autowired
	CustomertypeMapper C;
	public List<Customertype> findfl() {
		return C.selectByExample(null);
	}
	public int insert(Customertype lb) {
		return C.insert(lb);
	}
	public int xg(Customertype lb) {
		return C.updateByPrimaryKey(lb);
	}
	public int del(Integer id) {
		return C.deleteByPrimaryKey(id);
	}
	
}
