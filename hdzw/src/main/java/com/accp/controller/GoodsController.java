package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Goods;
import com.accp.service.GoodsService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	private GoodsService service;
	
	//商品资料信息查询
	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<Goods> findByPage(Goods goods,@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize) {
		return service.findByPage(pageNum, pageSize, goods);
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
	public String create(Goods goods) {
		//当id=0时进行新增操作
		if(goods.getAbid()==0) {
			int count = service.create(goods);
			if (count > 0) {
				return "00000";
			}
			return "00001";
		}
		//修改
		int count =  service.update(goods);
		if (count > 0) {
			return "00000";
		}
		return "00001";
	}
}
