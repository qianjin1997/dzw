package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.dao.CartypeMapper;
import com.accp.domain.Cartype;
import com.accp.service.wsbcarService;
@RestController
@RequestMapping("wsbcartype")
public class wsbcartypeController {
	@Autowired
	wsbcarService cartype;
	@GetMapping("/{lxid}")
	public List<Cartype> find(@PathVariable ("lxid") Integer lxid){
		return cartype.findtype(lxid);
	}
	@GetMapping
	public List<Cartype> findall(){
		return cartype.findAll();
		 
	}
}
