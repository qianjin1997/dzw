package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.GoodsMapper;
import com.accp.domain.Goods;
import com.accp.domain.GoodsExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class GoodsService {
	@Autowired
	private GoodsMapper mapper;
	
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
