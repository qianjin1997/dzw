package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.GoodsMapper;

@Service
@Transactional
public class GoodsService {
	@Autowired
	GoodsMapper mapper;
}
