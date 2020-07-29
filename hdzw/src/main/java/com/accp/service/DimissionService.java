package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.DimissionMapper;
import com.accp.dao.GpostMapper;
import com.accp.dao.SectionMapper;
import com.accp.dao.StaffMapper;
import com.accp.domain.Dimission;
import com.accp.domain.DimissionExample;
import com.accp.domain.Gpost;
import com.accp.domain.Section;
import com.accp.domain.SectionExample;
import com.accp.domain.Staff;
import com.accp.domain.StaffExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Service
@Transactional
public class DimissionService {
	@Autowired
	DimissionMapper map;
	@Autowired
	SectionMapper map1;
	@Autowired
	StaffMapper map2;
	@Autowired
	GpostMapper map3;
	//离职分页查询
	public PageInfo<Dimission> findByPage(Integer pageNum, Integer pageSize,String name){
		Page<Dimission> page = PageHelper.startPage(pageNum, pageSize);
		map.selectByExample(null);
		List<Section> list =map1.selectByExample(null);
		for (Dimission d : page.toPageInfo().getList()) {
			SectionExample ex = new SectionExample();
			ex.createCriteria().andQidEqualTo(d.getAmbid());
			Section se = map1.selectByExample(ex).get(0);
			for (Section ss : list) {
				if(ss.getQid().equals(se.getQparentid())) {
					se.setBmname(ss.getQname());
				}
			}
			d.setSection(se);
			StaffExample ex1 = new StaffExample();
			ex1.createCriteria().andPidEqualTo(d.getAmyid());
			d.setStaff(map2.selectByExample(ex1).get(0));
			Gpost gpost = map3.selectByPrimaryKey(d.getStaff().getPgjobid());
			d.getStaff().setPgname(gpost.getApgname());
		}
		return page.toPageInfo();
	}
	//查询主部门
	public Section findSection() {
		 SectionExample ex = new SectionExample();
		 ex.createCriteria().andQparentidEqualTo(0);
		 return map1.selectByExample(ex).get(0);
	}
	//离职回滚
	public Integer del(Integer id) {
		return map.deleteByPrimaryKey(id);
	}
	
	public List<Dimission> finddaochu(){
		List<Dimission> jh = map.selectByExample(null);
		List<Section> list =map1.selectByExample(null);
		for (Dimission d : jh) {
			SectionExample ex = new SectionExample();
			ex.createCriteria().andQidEqualTo(d.getAmbid());
			Section se = map1.selectByExample(ex).get(0);
			for (Section ss : list) {
				if(ss.getQid().equals(se.getQparentid())) {
					se.setBmname(ss.getQname());
				}
			}
			d.setSection(se);
			StaffExample ex1 = new StaffExample();
			ex1.createCriteria().andPidEqualTo(d.getAmyid());
			d.setStaff(map2.selectByExample(ex1).get(0));
			Gpost gpost = map3.selectByPrimaryKey(d.getStaff().getPgjobid());
			d.getStaff().setPgname(gpost.getApgname());
		}
		return jh;
	}
	//离职表所有数据查询
	public List<Dimission> findall(){
		return map.selectByExample(null);
	}
	//员工离职
	public Integer disadd(String name,Dimission dis) {
		StaffExample ex = new StaffExample();
		ex.createCriteria().andPnameEqualTo(name);
		Staff st =map2.selectByExample(ex).get(0);
		
		dis.setAmyid(st.getPid());
		dis.setAmbid(st.getPsectionid());
		return map.insert(dis);
	}
	//员工信息全部删除
	public Integer delall(Integer id) {
		DimissionExample ex = new DimissionExample();
		ex.createCriteria().andAmyidEqualTo(id);
		map.deleteByExample(ex);
		return map2.deleteByPrimaryKey(id);
	}
}
