package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.BracketsMapper;
import com.accp.dao.GoodsMapper;
import com.accp.dao.GoodsbrandMapper;
import com.accp.dao.GoodsdjMapper;
import com.accp.dao.GoodsplaceMapper;
import com.accp.dao.GoodstypeMapper;
import com.accp.dao.OriginalMapper;
import com.accp.dao.UnitMapper;
import com.accp.dao.WaresMapper;
import com.accp.domain.Brackets;
import com.accp.domain.Goods;

import com.github.pagehelper.Page;

import com.accp.domain.GoodsExample;
import com.accp.domain.Goodsbrand;
import com.accp.domain.Goodsdj;
import com.accp.domain.Goodsplace;
import com.accp.domain.Goodstype;
import com.accp.domain.Original;
import com.accp.domain.Unit;
import com.accp.domain.Wares;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import com.accp.domain.Goods;
import com.github.pagehelper.Page;

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
	
	//商品资料的分页查询(自写SQL)
	public PageInfo<Goods> findAll2(Integer pageNum, Integer pageSize, Goods goods) {
		Page<Goods> page = PageHelper.startPage(pageNum, pageSize);
		if(goods.getAbshoplid() != null) {
			mapper.findAll1(goods.getAbshoplid());
		} else {
			mapper.findAll(goods.getAbshopname());
		}
		return page.toPageInfo();
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
	
	//----------------下拉框查询-------------------
	@Autowired
	private GoodsbrandMapper g2mapper;
	@Autowired
	private UnitMapper g3mapper;
	@Autowired
	private GoodstypeMapper g4mapper;
	@Autowired
	private BracketsMapper g5mapper;
	@Autowired
	private OriginalMapper g6mapper;
	@Autowired
	private GoodsdjMapper g7mapper;
	@Autowired
	private GoodsplaceMapper g8mapper;
	@Autowired
	private WaresMapper g9mapper;
	
	public List<Goodsbrand> find1(){
		return g2mapper.selectByExample(null);
	}
	
	public List<Unit> find2(){
		return g3mapper.selectByExample(null);
	}
	
	public List<Goodstype> find3(){
		return g4mapper.selectByExample(null);
	}
	
	public List<Brackets> find4(){
		return g5mapper.selectByExample(null);
	}
	
	public List<Original> find5(){
		return g6mapper.selectByExample(null);
	}
	
	public List<Goodsdj> find6(){
		return g7mapper.selectByExample(null);
	}
	
	public List<Goodsplace> find7(){
		return g8mapper.selectByExample(null);
	}
	
	public List<Wares> find8(){
		return g9mapper.selectByExample(null);
	}
	
	public Page<Goods> findByPage(Integer pageNum, Integer pageSize){
		return null;
	}
}
