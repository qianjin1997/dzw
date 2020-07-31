package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Goodstype;
import com.accp.service.GoodstypeService;

@RestController
@RequestMapping("/goodstype")
public class GoodstypeController {

	@Autowired
	private GoodstypeService service;
	
	@GetMapping("/{id}")
	public List<Goodstype> findAll(@PathVariable("id") Integer id) {
		List<Goodstype> list = service.findAll(id);
		return list;
	}
}
