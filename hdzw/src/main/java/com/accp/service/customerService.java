package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.CustomerMapper;
import com.accp.domain.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import com.accp.dao.CustomerMapper;
import com.accp.domain.Customer;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class customerService {
	@Autowired
	CustomerMapper customer;
	//根据id查客户
	public Customer findbyid(Integer id) {
		return customer.selectByPrimaryKey(id);
	}
	//查询所有客户
	public PageInfo<Customer> findpage(Integer pageSize,Integer pageNum){
		Page<Customer> page=PageHelper.startPage(pageNum, pageSize);
		customer.findAll(null);
		return page.toPageInfo();
	}
	public List<Customer> find(String name){
		return customer.findAll(name);
	}
	//新增客户
	public int insertck(Customer kh) {
		return customer.insert(kh);
	}
	//删除客户
	public int remove(Integer id) {
		return customer.deleteByPrimaryKey(id);
	}
	//修改客户
	public int update(Customer kh) {
		return customer.updateByPrimaryKey(kh);
	}
}
