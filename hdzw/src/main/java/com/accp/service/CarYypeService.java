package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.CarbrandMapper;
import com.accp.dao.CartypeMapper;
import com.accp.dao.EngineMapper;
import com.accp.dao.FuelMapper;
import com.accp.domain.Carbrand;
import com.accp.domain.CarbrandExample;
import com.accp.domain.Cartype;
import com.accp.domain.CartypeExample;
import com.accp.domain.Engine;
import com.accp.domain.Fuel;
import com.accp.domain.FuelExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CarYypeService {
	@Autowired
	CarbrandMapper mapper;
	
	@Autowired
	CartypeMapper mapper2;
	
	@Autowired
	EngineMapper mapper3;
	
	@Autowired
	FuelMapper mapper4;
	public List<Carbrand> findCarbrand(){
		/*CarbrandExample example=new CarbrandExample();
		example.createCriteria().andIbrandnameBetween(brand, brand);*/
		return mapper.selectByExample(null);
	}
	
	public int insertCartype(Cartype cartype) {
		return mapper2.insert(cartype);
	}
	
	public List<Fuel> findFuel(){
		return mapper4.selectByExample(null);
	}
	
	public int insertCarbrand(Carbrand carbrand) {
		return mapper.insert(carbrand);
	}
	
	public int updateCarbrand(Carbrand carbrand) {
		return mapper.updateByPrimaryKey(carbrand);
	}
	
	public int removeCarbrand(Integer lid) {
		return mapper.deleteByPrimaryKey(lid);
	}
	
	public PageInfo<Cartype> findCartypeById(Integer lid,Integer pageNum,Integer pageSize){
		CartypeExample example=new CartypeExample();
		example.createCriteria().andJbrandidEqualTo(lid);
		Page<Cartype> page = PageHelper.startPage(pageNum, pageSize);
		List<Cartype> list=mapper2.selectByExample(example);
		System.out.println(list.size());
		for (Cartype cartype : list) {
			Carbrand cb=mapper.selectByPrimaryKey(cartype.getJbrandid());
			Engine eg=mapper3.selectByPrimaryKey(cartype.getJeid());
			Fuel fu=mapper4.findById(cartype.getJfuelid().toString());
			if (cartype.getJisdomestic()==1) {
				cartype.setCaryear("进口");
			}else{
				cartype.setCaryear("国产");
			}
			cartype.setCarbrand(cb);
			cartype.setEngine(eg);
			cartype.setFuel(fu);
		}
		return page.toPageInfo();
	}
}
