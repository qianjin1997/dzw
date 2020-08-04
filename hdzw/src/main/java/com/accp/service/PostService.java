package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.GpostMapper;
import com.accp.domain.Gpost;

@Service
@Transactional
public class PostService {
	@Autowired
	GpostMapper map;
	public List<Gpost> findall(){
		return map.selectByExample(null);
	}
	public Integer gpostadd(Gpost gposts) {
		return map.insert(gposts);
	}
	public Integer del(Integer id) {
		return map.deleteByPrimaryKey(id);
	}
	public Integer update(Gpost gposts) {
		return  map.updateByPrimaryKey(gposts);
	}
}
