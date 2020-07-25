package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.GoodsMapper;
import com.accp.domain.Goods;

import com.github.pagehelper.Page;

import com.accp.domain.GoodsExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Service
@Transactional
public class GoodsService {
	
	@Autowired
	GoodsMapper mapper;
	
	//查询所有信息
	public List<Goods> findAll(String goods) {
		if(goods != "") {
			GoodsExample example = new GoodsExample();
			example.or(example.createCriteria().andAbcodeLike("%"+goods+"%"));
			example.or(example.createCriteria().andAbshopnameLike("%"+goods+"%"));
			
			return mapper.selectByExample(example);
		} else {
			return mapper.selectByExample(null);
		}
	}
	
	//商品资料的分页查询
	public PageInfo<Goods> findByPage(Integer pageNum, Integer pageSize, Goods goods){
		Page<Goods> page = PageHelper.startPage(pageNum, pageSize);
		if(goods.getAbshopname() != null) {
			GoodsExample example = new GoodsExample();
			example.or(example.createCriteria().andAbcodeLike("%"+goods.getAbshopname()+"%"));
			example.or(example.createCriteria().andAbshopnameLike("%"+goods.getAbshopname()+"%"));
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
	public int create(Goods goods) {
		return mapper.insert(goods);
	}
	
	//修改商品资料
	public int update(Goods goods) {
		return mapper.updateByPrimaryKey(goods);
	}
}
