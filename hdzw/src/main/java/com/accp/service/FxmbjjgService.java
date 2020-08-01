package com.accp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.SectionMapper;
import com.accp.dao.StaffMapper;
import com.accp.dao.TeamMapper;
import com.accp.domain.Section;
import com.accp.domain.SectionExample;
import com.accp.domain.Staff;
import com.accp.domain.StaffExample;
import com.accp.domain.Team;
import com.accp.domain.TeamExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class FxmbjjgService {

	@Autowired
	StaffMapper smapper;
	
	@Autowired
	SectionMapper sectmapper;
	
	@Autowired
	TeamMapper tmapper;
	
	//员工添加
	public int jgadd(Staff staff){
		staff.setPsectionid(staff.getSect().getQid());
		return smapper.insert(staff);
	}
	
	
	//员工修改
	public int jgupdate(Staff staff) {
		staff.setPsectionid(staff.getSect().getQid());
		return smapper.updateByPrimaryKey(staff);
	}
	
	
	//班组删除
	public int bjshan(Section section) {
		StaffExample example=new StaffExample();
		example.createCriteria().andPsectionidEqualTo(section.getQid());
		List<Staff> list= smapper.selectByExample(example);
		if(list!=null && list.size()!=0) {
			return 0;
		}
		return sectmapper.deleteByPrimaryKey(section.getQid());
		
	}
	
	//班组添加
	public int bjadd(Section section) {
		return sectmapper.insert(section);
	}
	
	//班组权重查询所有
    public List<Team>  bzqzfind(String name1) {
    	if(name1==""||name1==null) {
    		List<Team> list= tmapper.selectByExample(null);
        	for (Team t : list) {
    			t.setSection(sectmapper.selectByPrimaryKey(t.getUteamid()));
    		}
        	return list;
    	}
    	SectionExample example=new SectionExample();
    	example.createCriteria().andQnameLike("%"+name1+"%");
    	List<Section> list1= sectmapper.selectByExample(example);
    	
    	TeamExample texample=new TeamExample();
    	List<Team> list3 = new ArrayList<Team>();  	
    	for (Section s : list1) {
        	texample.createCriteria().andUteamidEqualTo(s.getQid());
        	List<Team> list2= tmapper.selectByExample(texample);
        	for (Team te : list2) {
				Team te1= tmapper.selectByPrimaryKey(te.getUid());
				list3.add(te1);
				for (Team t : list3) {
					t.setSection(sectmapper.selectByPrimaryKey(t.getUteamid()));
				}
			}
		}
    	return list3;
    }
	
	//查询所有
	public List<Staff> csy(String name){
		if(name=="") {
			List<Staff> list=smapper.selectByExample(null);
			for (Staff s : list) {
				Section se1= sectmapper.selectByPrimaryKey(s.getPsectionid());
				s.setSect(se1);
			}
			return list;
		}else {
			StaffExample example=new StaffExample();
			example.or(example.createCriteria().andPjobidLike("%"+name+"%"));
			example.or(example.createCriteria().andPnameLike("%"+name+"%"));
			List<Staff> list=smapper.selectByExample(example);
			for (Staff s : list) {
				Section se1= sectmapper.selectByPrimaryKey(s.getPsectionid());
				s.setSect(se1);
			}
			
			return list;
		}
	}
	
	//删除
	public int jgshan(Staff staff){
		 return smapper.deleteByPrimaryKey(staff.getPid());
	}
	
	//查询
	public PageInfo<Staff> jgfind(Integer pageNum,Integer pageSize,String name) {
		Page<Staff> page=PageHelper.startPage(pageNum, pageSize);
		if(name==null) {
			name="";
		}
		StaffExample example=new StaffExample();
		example.or(example.createCriteria().andPjobidLike("%"+name+"%"));
		example.or(example.createCriteria().andPnameLike("%"+name+"%"));
		List<Staff> list=smapper.selectByExample(example);
		for (Staff s : list) {
			Section se1= sectmapper.selectByPrimaryKey(s.getPsectionid());
			s.setSect(se1);
		}
		
		return page.toPageInfo();
	}
	
	//右边树形
		public List<Section>  righttree() {
			List<Section> list= sectmapper.selectByExample(null);
			Section s=new Section();
			s.setQid(0);
			each(list,s);
			return s.getSect();
			
		}
		
		//通过递归方式进行级联
		private void each(List<Section> list,Section se) {
			for(Section s : list) {
				if(s.getQparentid() == se.getQid()) {
					Section childSection = new Section();
					childSection.setQid(s.getQid());
					childSection.setQname(s.getQname());
					childSection.setQparentid(s.getQparentid());
					childSection.setQjudge(s.getQjudge());
					se.getSect().add(childSection);
					this.each(list, childSection);
				}
			}
		}
}
