package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Checkout;
import com.accp.domain.Repair;
import com.accp.service.CheckoutService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/checkout")
public class CheckoutController {

	@Autowired
	private CheckoutService service;
	
	//回滚方法
	@PostMapping
	public String huigun(@RequestBody Checkout che) {
		int count = service.huigun(che);
		if (count > 0) {
			return "00000";
		}
		return "00001";
	}
	
	//回滚方法
	@PostMapping("/jian")
	public String jian(@RequestBody Checkout che) {
		int count = service.jian(che);
		if (count > 0) {
			return "00000";
		}
		return "00001";
	}
	
	//竣工检验分页查询
	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<Checkout> findByPage(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize, String aliscomplete,String hlicenseno,Integer alid, String alcompletedate,String alcompletedate1){
		return service.findByPages(pageNum, pageSize, aliscomplete, hlicenseno, alid, alcompletedate, alcompletedate1);
	}
	
	//竣工检验分页查询
	@GetMapping("/{sid}")
	public Checkout findByPage2(@PathVariable("sid") Integer sid){
		return service.findAlls1(sid);
	}
//	
//	
//	//删除方法
//	@PostMapping("/{id}")
//	public String remove(@PathVariable("id") Integer id) {
//		int count = service.remove(id);
//		if (count > 0) {
//			return "00000";
//		}
//		return "00001";
//	}
//	
//	//保存竣工检验
//	@PostMapping
//	public String create(Checkout checkout) {
//		//当id=0时进行新增操作
//		if(checkout.getAlid()==0) {
//			int count = service.create(checkout);
//			if (count > 0) {
//				return "00000";
//			}
//			return "00001";
//		}
//		//修改
//		int count =  service.update(checkout);
//		if (count > 0) {
//			return "00000";
//		}
//		return "00001";
//	}
}
