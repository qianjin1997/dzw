package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.RepairMapper;
import com.accp.domain.Goods;
import com.accp.domain.Repair;
import com.accp.domain.RepairExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class RepairService {

	@Autowired
	private RepairMapper mapper;
	
	//查询所有信息
	public List<Repair> findAll(String repair) {
		if(repair != "") {
			RepairExample example = new RepairExample();
			example.or(example.createCriteria().andWmnameLike("%"+repair+"%"));
			return mapper.selectByExample(example);
		} else {
			return mapper.selectByExample(null);
		}
	}
	
	//维修项目分页查询
	public PageInfo<Repair> findByPage(Integer pageNum, Integer pageSize, Repair repair){
		Page<Repair> page = PageHelper.startPage(pageNum, pageSize);
		if(repair.getWmname() != null) {
			RepairExample example = new RepairExample();
			example.or(example.createCriteria().andWmnameLike("%"+repair.getWmname()+"%"));
			mapper.selectByExample(example);
		}else {
			mapper.selectByExample(null);
		}
		return page.toPageInfo();
	}
	
	//删除方法
	public int remove(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}
	
	//增加商品资料
	public int create(Repair repair) {
		return mapper.insert(repair);
	}
	
	//修改商品资料
	public int update(Repair repair) {
		return mapper.updateByPrimaryKey(repair);
	}
}
