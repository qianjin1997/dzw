package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Repair;
import com.accp.service.TdrepairService;

@Controller
@RequestMapping("/repair")
public class TdrepairController {
	@Autowired
	TdrepairService ser;
	@RequestMapping("/find")
	@ResponseBody
	public List<Repair> find(Integer wuid){
		return ser.find(wuid);
	}
	@RequestMapping("/findone")
	@ResponseBody
	public Repair findone(Integer wid){
		return ser.findone(wid);
	}
	@RequestMapping("/add")
	@ResponseBody
	public String add(@RequestBody Repair reg){
		int ret =ser.add(reg);
		if(ret>0) {
			return "000";
		}
		return "111";
	}
}
