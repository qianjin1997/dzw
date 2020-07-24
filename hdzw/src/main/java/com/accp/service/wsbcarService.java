package com.accp.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.accp.dao.CarMapper;
import com.accp.dao.CarbrandMapper;
import com.accp.dao.CartypeMapper;
import com.accp.domain.Car;
import com.accp.domain.Carbrand;
import com.accp.domain.Cartype;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class wsbcarService {
	@Autowired
	CarMapper car;
	@Autowired
	CarbrandMapper carbrand;
	@Autowired
	CartypeMapper cartype;
	
	//车辆查询
	public PageInfo<Car> findcarpage(Integer pageNum,Integer pageSize){
		Page<Car> page=PageHelper.startPage(pageNum, pageSize);
		car.findAll();
		return page.toPageInfo();
	}
	//车俩删除
	public int delete(Integer hid) {
		return car.deleteByPrimaryKey(hid);
	}
	//车辆新增
	public int insert(Car c) {
		return car.insert(c);
	}
	//修改
	public int update(Car c) {
		return car.updateByPrimaryKey(c);
	}
	//车俩品牌表
	public List<Carbrand> findbrand(){
		return carbrand.selectByExample(null);
	}
	//车辆型号
	public List<Cartype> findtype(){
		return cartype.selectByExample(null);
	}
}
