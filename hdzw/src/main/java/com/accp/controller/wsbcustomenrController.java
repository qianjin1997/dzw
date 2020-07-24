package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.dao.CustomerMapper;
import com.accp.domain.Customer;

@RestController
@RequestMapping("wsbcutomer")
public class wsbcustomenrController {
	@Autowired
	CustomerMapper customer;
	@GetMapping("/{id}")
	public Customer findbyid(@PathVariable ("id") Integer id) {
		return customer.selectByPrimaryKey(id);
	}
}
