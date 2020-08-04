package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.IncomeMapper;
import com.accp.dao.MaintainxmMapper;
import com.accp.domain.Income;
import com.accp.domain.Maintainxm;

@Service
@Transactional
public class TdmaintainxmService {
	@Autowired
	MaintainxmMapper map;
	@Autowired
	IncomeMapper map1;
	
	public List<Maintainxm> find(){
		return map.selectByExample(null);
	}
	public List<Income> findincome(){
		return map1.selectByExample(null);
	}
}
