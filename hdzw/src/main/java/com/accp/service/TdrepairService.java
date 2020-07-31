package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.RepairMapper;
import com.accp.domain.Repair;

@Service
@Transactional
public class TdrepairService {
	@Autowired
	RepairMapper map;
	public List<Repair> find(Integer wuid){
		//System.out.println(wuid);
		return map.find(wuid);
	}
	public Repair findone(Integer wid) {
		return map.findone(wid);
	}
	public Integer add(Repair reg) {
		//System.out.println(reg);
		reg.setWincomeid(reg.getCome().getYid());
		reg.setWmid(reg.getXm().getXid());
		reg.setWuid(reg.getCus().getEid());
		reg.setWzid(1);
		reg.setWcarid(reg.getCar().getHid());
		//return null;
		return map.insert(reg);
	}
}
