package com.accp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.accp.dao.GpostMapper;
import com.accp.dao.SectionMapper;
import com.accp.dao.StaffMapper;
import com.accp.domain.Section;
import com.accp.domain.Staff;
import com.accp.domain.StaffExample;

@Service
@Transactional
public class StaffService {
	@Autowired
	StaffMapper map;
	@Autowired
	SectionMapper map1;
	@Autowired
	GpostMapper map2;
	public List<Staff> find(){
		return map.selectByExample(null);
	}
	public List<Staff> findAndsection(){
		List<Staff> list = map.selectByExample(null);
		List<Section> list1 = map1.selectByExample(null);
		for (Staff s : list) {
			s.setSection(map1.selectByPrimaryKey(s.getPsectionid()));
			for (Section ss : list1) {
				if(ss.getQid().equals(s.getSection().getQparentid())) {
					s.getSection().setBmname(ss.getQname());
				}
			}
			s.setGpost(map2.selectByPrimaryKey(s.getPgjobid()));
		}
		return list;
	}
	public List<Staff> findOne(Integer[] ids){
		List<Staff> list=new ArrayList<Staff>();
		for(int i=0;i<ids.length;i++) {
			StaffExample ex = new StaffExample();
			ex.createCriteria().andPsectionidEqualTo(ids[i]);
			List<Staff> staff =map.selectByExample(ex);
			for (Staff sss : staff) {
				list.add(sss);
			}
		}
		List<Section> list1 = map1.selectByExample(null);
		for (Staff s : list) {
			s.setSection(map1.selectByPrimaryKey(s.getPsectionid()));
			for (Section ss : list1) {
				if(ss.getQid().equals(s.getSection().getQparentid())) {
					s.getSection().setBmname(ss.getQname());
				}
			}
			s.setGpost(map2.selectByPrimaryKey(s.getPgjobid()));
		}
		return list;
	}
	public Integer insertstaff(Staff staff) {
		return map.insert(staff);
	}
	public Integer delstaff(Integer id) {
		return map.deleteByPrimaryKey(id);
	}
	public Integer updatestaff(Staff staff) {
		return map.updateByPrimaryKey(staff);
	}
}
