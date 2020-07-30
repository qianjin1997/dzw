package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ArtisanMapper;
import com.accp.domain.Artisan;

@Service
@Transactional
public class ArtisanService {

	@Autowired
	private ArtisanMapper artisanMapper;
	
	public List<Artisan> getAll(){
		return artisanMapper.selectByExample(null);
	}
	

	public int insert(Artisan record){
		return artisanMapper.insert(record);
	}
	public int update(Artisan record){
		return artisanMapper.updateByPrimaryKey(record);
	}
	public int remove(Integer tid){
		return artisanMapper.deleteByPrimaryKey(tid);
	}
}
