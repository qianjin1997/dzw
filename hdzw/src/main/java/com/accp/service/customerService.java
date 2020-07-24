package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.CustomerMapper;
import com.accp.domain.Customer;

@Service
@Transactional
public class customerService {
	@Autowired
	CustomerMapper customer;
	public Customer findbyid(Integer id) {
		return customer.selectByPrimaryKey(id);
	}
}
