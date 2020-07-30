package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.DriverMapper;
import com.accp.domain.Driver;
import com.accp.domain.DriverExample;

@Service
@Transactional
public class drivService {
	
	@Autowired
	DriverMapper drimapper;
	
	public List<Driver> find(){
		return drimapper.selectByExample(null);
	}
	
	public int create(Driver driver){
		drimapper.insert(driver);
		return driver.getOid();
	}
	
}
