package com.accp.controller;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.dao.CarbrandMapper;
import com.accp.dao.CustomerMapper;
import com.accp.domain.Car;
import com.accp.domain.Carbrand;
import com.accp.domain.Cartype;
import com.accp.domain.CartypeExample;
import com.accp.domain.Customer;
import com.accp.service.customerService;
import com.accp.service.wsbcarService;

import com.github.pagehelper.PageInfo;
	
	

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

import com.accp.domain.Car;
import com.accp.domain.Customer;
import com.accp.service.customerService;
import com.accp.service.wsbcarService;

import com.github.pagehelper.PageInfo;
@RestController
@RequestMapping("wsbcar")
public class wsbcarController {
	@Autowired
	wsbcarService car;//车辆
	@Autowired
	customerService customer;//客户
	
	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<Car> findcarby(@PathVariable ("pageNum") Integer pageNum,@PathVariable ("pageSize") Integer pageSize){
		return car.findcarpage(pageNum, pageSize);
	}
	
	@GetMapping
	public List<Car> find(){
		return car.find();
	}
	//新增车
	@PostMapping
	@ResponseBody
	public String insert(@RequestBody Car c) {
		int count=car.insert(c);
		if(count>0) {
			System.out.println("新增成功");
		}
		return "000";
	}
	//修改车
	@PutMapping
	public String update(@RequestBody Car c) {
		int count=car.update(c);
		return "000";
	}
	//删除车
	@DeleteMapping("/{id}")
	public String delect(@PathVariable("id") Integer id) {
		int count=car.delete(id);
		return "000";
	}
	//id查询客户
	@GetMapping("/{id}")
	public Customer findControllerby(@PathVariable ("id") Integer id){
		return customer.findbyid(id);
	}
	
	@GetMapping("/byname")
	public List <Car> find(String name){
		return car.findmhcar(name);
	}
	
}
