package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.CheckoutMapper;
import com.accp.domain.CheckoutExample;
import com.accp.domain.Checkout;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CheckoutService {

	@Autowired
	CheckoutMapper mapper;
	
	//竣工检验分页查询
	public PageInfo<Checkout> findByPage(Integer pageNum, Integer pageSize, Checkout checkout){
		Page<Checkout> page = PageHelper.startPage(pageNum, pageSize);
		if(checkout.getAlcarownername() != null) {
			CheckoutExample example = new CheckoutExample();
			example.or(example.createCriteria().andAlcarownernameLike("%"+checkout.getAlcarownername()+"%"));
			mapper.selectByExample(example);
		}else {
			mapper.selectByExample(null);
		}
		return page.toPageInfo();
	}
	
	//竣工检验分页查询
	public PageInfo<Checkout> findByPages(Integer pageNum, Integer pageSize, String aliscomplete,String hlicenseno,Integer alid, String alcompletedate,String alcompletedate1){
		Page<Checkout> page = PageHelper.startPage(pageNum, pageSize);
		mapper.findAlls(aliscomplete, hlicenseno, alid, alcompletedate, alcompletedate1);
		return page.toPageInfo();
	}
		
	//维修单查询
	public Checkout findAlls1(Integer sid) {
		return mapper.findAlls1(sid);
	}
		
	//回滚方法
	public int huigun(Checkout che) {
		che.setAliscomplete(1);
		return mapper.updateByPrimaryKeySelective(che);
	}
	
	//回滚方法
	public int jian(Checkout che) {
		che.setAliscomplete(0);
		return mapper.updateByPrimaryKeySelective(che);
	}
	
//	//删除方法
//	public int remove(Integer id) {
//		return mapper.deleteByPrimaryKey(id);
//	}
//	
//	//增加竣工检验
//	public int create(Checkout checkout) {
//		return mapper.insert(checkout);
//	}
//	
//	//修改竣工检验
//	public int update(Checkout checkout) {
//		return mapper.updateByPrimaryKey(checkout);
//	}
}
