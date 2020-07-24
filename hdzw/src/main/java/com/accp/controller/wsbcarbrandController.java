package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.dao.CarbrandMapper;
import com.accp.domain.Carbrand;
import com.accp.service.wsbcarService;
@RestController
@RequestMapping("wsbcarbrand")
public class wsbcarbrandController {
	@Autowired
	wsbcarService brand;
	@GetMapping
	public List<Carbrand> find(){
		return brand.findbrand();
	}
}
