package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Carbrand;
import com.accp.domain.Cartype;
import com.accp.domain.Fuel;
import com.accp.service.CarYypeService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/CarYypeController") 
public class CarYypeController {
	
	@Autowired
	CarYypeService service;
	
	@RequestMapping("/findCarbrand") 
	@ResponseBody
	public List<Carbrand> findCarbrand(){
		return service.findCarbrand();
	}
	
	@RequestMapping("/findCartypeById") 
	@ResponseBody
	public PageInfo<Cartype> findCartypeById(Integer lid,Integer pageNum,
											Integer pageSize){
		return service.findCartypeById(lid, pageNum,pageSize);
	}
	@RequestMapping("/insertCarbrand") 
	@ResponseBody
	public String insertCarbrand(Carbrand carbrand) {
		int i=service.insertCarbrand(carbrand);
		if (i>0) {
			return "0000";
		}
		return "0001";
	}
	@RequestMapping("/updateCarbrand") 
	@ResponseBody
	public String updateCarbrand(Carbrand carbrand) {
		int i=service.updateCarbrand(carbrand);
		if (i>0) {
			return "0000";
		}
		return "0001";
	}
	@RequestMapping("/removeCarbrand") 
	@ResponseBody
	public String removeCarbrand(Integer lid) {
		int i=service.removeCarbrand(lid);
		if (i>0) {
			return "0000";
		}
		return "0001";
	}
	
	@RequestMapping("/findFuel") 
	@ResponseBody
	public List<Fuel> findFuel(){
		return service.findFuel();
	}
	
	
	@RequestMapping("/insertCartype") 
	@ResponseBody
	public String insertCartype(Cartype cartype) {
		int i=service.insertCartype(cartype);
		if (i>0) {
			return "0000";
		}
		return "0001";
	}
}
