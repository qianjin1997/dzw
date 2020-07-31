package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.GoodstypeMapper;
import com.accp.domain.Goodstype;

@Service
@Transactional
public class GoodstypeService {

	@Autowired
	private GoodstypeMapper mapper;
	
	//查询所有商品品牌
	public List<Goodstype> findAll(Integer id) {
		return mapper.finds(id);
	}
}
