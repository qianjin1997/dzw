package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SectionMapper;
import com.accp.domain.Section;

@Service
@Transactional
public class SectionService {
	@Autowired
	SectionMapper mmappler;
	public List<Section> findByQparentid(Integer parentid){
		return mmappler.find(parentid);
	}
	public Integer addsection(Section section) {
		return mmappler.insert(section);
	}
	public Integer sectiondel(Integer id) {
		return mmappler.deleteByPrimaryKey(id);
	}
}
