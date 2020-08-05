package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Customer;
import com.accp.domain.Customertype;
import com.accp.service.wsbkhflservice;

@RestController
@RequestMapping("wsbkhfl")

public class wsbkhfl {
	@Autowired
	wsbkhflservice kh;
	
	@GetMapping
	public List<Customertype> find(){
		return kh.findfl();
	}
	@PostMapping
	@ResponseBody
	public String insertkhfl(@RequestBody Customertype lb) {
		int a=kh.insert(lb);
		if(a>0) {
			System.out.println("新增成功");
		}
		return "000";
	}
	@DeleteMapping("/{id}")
	public String remove(@PathVariable("id") Integer id) {
		int a=kh.del(id);
		return "000";
	}
	
	@PutMapping
	public String update(@RequestBody Customertype lb) {
		int a=kh.xg(lb);
		return "00";
	}
	
}
