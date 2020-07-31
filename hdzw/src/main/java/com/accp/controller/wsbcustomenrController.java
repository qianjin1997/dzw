package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.dao.CustomerMapper;
import com.accp.domain.Customer;



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
import com.accp.service.customerService;
import com.github.pagehelper.PageInfo;
@RestController
@RequestMapping("wsbcutomer")
public class wsbcustomenrController {
	@Autowired
	customerService customer;
	@GetMapping("/{id}")
	public Customer findbyid(@PathVariable ("id") Integer id) {
		return customer.findbyid(id);
	}
	@GetMapping("/byck")
	public List<Customer> findck(String name){
		return customer.find(name);
	}
	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<Customer> findall(@PathVariable ("pageSize") Integer pageSize,@PathVariable ("pageNum") Integer pageNum){
		return customer.findpage(pageSize, pageNum);
	}
	//新增客户
	@PostMapping
	@ResponseBody
	public String insertkh(@RequestBody Customer kh) {
		int a=customer.insertck(kh);
		if(a>0) {
			System.out.println("新增成功");
		}
		return "000";
	}
	//删除客户
	@DeleteMapping("/{id}")
	public String remove(@PathVariable("id") Integer id) {
		int a=customer.remove(id);
		return "000";
	}
	//修改客户
	@PutMapping
	public String update(@RequestBody Customer kh) {
		int a=customer.update(kh);
		return "00";
	}
}
