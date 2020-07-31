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
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Baoyang;
import com.accp.service.baoyangservice;

@RestController
@RequestMapping("baoyang")
public class wsbbaoyangcontroller {
	@Autowired
	baoyangservice baoyang;
	@GetMapping("/{id}")
	public List<Baoyang> find(@PathVariable ("id") Integer id){
		return baoyang.findbaoyang(id);
	}
	@PutMapping
	public String update(@RequestBody Baoyang byy) {
		int a= baoyang.update(byy);
		return "000";
	}
	@PostMapping
	public String insert(@RequestBody Baoyang byy) {
		int a=baoyang.insert(byy);
		return "000";
	}
	@DeleteMapping("/{id}")
	public String remove(@PathVariable("id") Integer id) {
		int a=baoyang.delete(id);
		return "0000";
	}
	
}
