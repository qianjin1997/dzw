package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.BaoyangMapper;
import com.accp.domain.Baoyang;
import com.accp.domain.BaoyangExample;

@Service
@Transactional
public class baoyangservice {
		@Autowired
		BaoyangMapper baoyang;
		public List<Baoyang> findbaoyang(Integer id){	
		
			return baoyang.findAll(id);
		}
		public int insert(Baoyang bby) {
			return baoyang.insert(bby);
		}
		public int update(Baoyang bby) {
			return baoyang.updateByPrimaryKey(bby);
		}
		public int delete(Integer id) {
			return baoyang.deleteByPrimaryKey(id);
		}
}
