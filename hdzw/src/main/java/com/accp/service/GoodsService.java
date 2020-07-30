package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.GoodsMapper;
import com.accp.domain.Goods;
import com.github.pagehelper.Page;

@Service
@Transactional
public class GoodsService {
	@Autowired
	GoodsMapper mapper;
	
	public Page<Goods> findByPage(Integer pageNum, Integer pageSize){
		return null;
	}
}
