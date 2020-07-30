package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Driver;
import com.accp.service.drivService;

@RestController
@RequestMapping("/driver")
public class driverController {
	@Autowired
	drivService driser;
	
	@GetMapping
	public List<Driver> find(){
		return driser.find();
	}
	
	@PostMapping
	@ResponseBody
	public int create(@RequestBody Driver driver){
		
		return driser.create(driver);
	}
}
