package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Goods;
import com.accp.domain.Repair;
import com.accp.service.RepairService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/repair")
public class RepairController {
	
	@Autowired
	private RepairService service;
	
	//维修项目分页查询
	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<Repair> findByPage(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize, Repair repair){
		return service.findByPage(pageNum, pageSize, repair);
	}
	
	//删除方法
	@PostMapping("/{id}")
	public String remove(@PathVariable("id") Integer id) {
		int count = service.remove(id);
		if (count > 0) {
			return "00000";
		}
		return "00001";
	}
	
	//增加修改商品资料
	@PostMapping
	public String create(Repair repair) {
		//当id=0时进行新增操作
		if(repair.getWid()==0) {
			int count = service.create(repair);
			if (count > 0) {
				return "00000";
			}
			return "00001";
		}
		//修改
		int count =  service.update(repair);
		if (count > 0) {
			return "00000";
		}
		return "00001";
	}
}
