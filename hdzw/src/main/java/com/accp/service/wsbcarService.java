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
import com.accp.dao.DriverMapper;
import com.accp.dao.FuelMapper;
import com.accp.domain.Car;
import com.accp.domain.CarExample;
import com.accp.domain.Carbrand;
import com.accp.domain.Cartype;
import com.accp.domain.CartypeExample;
import com.accp.domain.FuelExample;
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
	@Autowired
	DriverMapper driver;
	@Autowired
	FuelMapper fuel;
	
	
	
	//修改
		public int update(Car c) {
			driver.updateByPrimaryKey(c.getDriver());
			fuel.updateByPrimaryKey(c.getFuel());
			carbrand.updateByPrimaryKey(c.getCarbrand());
			cartype.updateByPrimaryKey(c.getCartype());
			return car.updateByPrimaryKey(c);
		}
	//车辆查询
	public PageInfo<Car> findcarpage(Integer pageNum,Integer pageSize){
		Page<Car> page=PageHelper.startPage(pageNum, pageSize);
		car.findAll(null);
		return page.toPageInfo();
	}
	//车辆型号
		public List<Cartype> findtype(Integer id){
			CartypeExample example = new CartypeExample();
			example.createCriteria().andJbrandidEqualTo(id);
			return cartype.selectByExample(example);
		}
	public List<Car> findbyid(Integer id) {
		/*CarExample example =new CarExample();
		example.createCriteria().andHuidEqualTo(id);*/
		return car.findAll(id);
		
	}
	public List<Car> find(){
		return car.findAll(null);
	}
	//车俩删除
	public int delete(Integer hid) {
		return car.deleteByPrimaryKey(hid);
	}
	//车辆新增
	public int insert(Car c) {
		
		return car.insert(c);
	}
	
	//车俩品牌表
	public List<Carbrand> findbrand(){
		return carbrand.selectByExample(null);
	}
	
	public List<Cartype> findAll(){
		return cartype.selectByExample(null);
	}
}
