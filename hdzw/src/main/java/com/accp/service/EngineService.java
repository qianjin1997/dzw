package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.accp.dao.EngineMapper;
import com.accp.domain.Engine;
import com.accp.domain.EngineExample;

@Service
@Transactional
public class EngineService {
	@Autowired
	private EngineMapper mapper;
	
	public List<Engine> findEngine(){
		return mapper.selectByExample(null);
	}
	
	public int insert(Engine en) {
		return mapper.insert(en);
	}
	
	public int update(Engine en) {
		EngineExample emample=new EngineExample();
		return mapper.updateByPrimaryKey(en);
	}
	
	public int remove(Integer mid) {
		return mapper.deleteByPrimaryKey(mid);
	}
}
