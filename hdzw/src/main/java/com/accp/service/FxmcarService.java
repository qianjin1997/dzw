package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.CarMapper;
import com.accp.dao.CarbrandMapper;
import com.accp.dao.CartypeMapper;
import com.accp.dao.LegworkMapper;
import com.accp.dao.SectionMapper;
import com.accp.dao.TeamMapper;
import com.accp.domain.Car;
import com.accp.domain.Carbrand;
import com.accp.domain.Cartype;
import com.accp.domain.Legwork;

import com.accp.domain.Section;
import com.accp.domain.Team;
import com.accp.domain.TeamExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class FxmcarService {
		
	@Autowired
	LegworkMapper lmapper;
	
	@Autowired
	CarMapper  cmapper;  //车辆表
	
	@Autowired
	CartypeMapper ctypemapper; //车型
	
	@Autowired
	CarbrandMapper cbrandmapper; //车牌
	
	@Autowired
	TeamMapper tmapper; //班组
	
	@Autowired
	SectionMapper smapper;
	
	//查询所有
	public PageInfo<Legwork> find(Integer pageNum,Integer pageSize) {
		Page<Legwork> page = PageHelper.startPage(pageNum, pageSize);
		
		List<Legwork> list= lmapper.selectByExample(null);
		for (Legwork le : list) {
			Car c1= cmapper.selectByPrimaryKey(le.getVcarid());
			Cartype c2=ctypemapper.selectByPrimaryKey(c1.getHbrandid());
			Carbrand c3=cbrandmapper.selectByPrimaryKey(c1.getHtypeid());
			Team t1=tmapper.selectByPrimaryKey(le.getVteamid());
			Section s1=smapper.selectByPrimaryKey(t1.getUteamid());
			
			
			le.setCarbrand(c3);
			le.setCartype(c2);
			le.setCar(c1);
			le.setSection(s1);
			le.setTeam(t1);
		}
		
		return page.toPageInfo();
	}
	
	
	//删除
	public int delete(Integer vid) {
		return lmapper.deleteByPrimaryKey(vid);
		
	}
	//右边树形
	public List<Section>  righttree() {
		List<Section> list= smapper.selectByExample(null);
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
				se.getSect().add(childSection);
				this.each(list, childSection);
			}
		}
	}
	
	
	//添加
	public int add(Legwork leg) {
		ctypemapper.insert(leg.getCartype()); //车型
		cbrandmapper.insert(leg.getCarbrand()); //品牌

		leg.getCar().setHbrandid(leg.getCarbrand().getIid());
		leg.getCar().setHtypeid(leg.getCartype().getJid());
		
		cmapper.insert(leg.getCar());		//车辆
		leg.setVcarid(leg.getCar().getHid());
		
		//根据班组id查出主键
		int a=leg.getSection().getQid();
		Team te=new Team();
		te.setUteamid(a);
		tmapper.insert(te);
		
		leg.setVteamid(te.getUid());
		
		return lmapper.insert(leg);
	}
	
	
	//修改
	public int xiu(Legwork leg) {
		
		cmapper.updateByPrimaryKey(leg.getCar());	//车辆
		ctypemapper.updateByPrimaryKey(leg.getCartype());  //车型
		cbrandmapper.updateByPrimaryKey(leg.getCarbrand()); //车牌
		
		
		int a=leg.getSection().getQid();
		TeamExample example=new TeamExample();
		example.createCriteria().andUteamidEqualTo(a);
		List<Team> li= tmapper.selectByExample(example);
		Team te=null;
		for (int i = 0; i < li.size(); i++) {
			if(i==li.size()-1) {
				 te=li.get(i);
			}
		}
		leg.setVteamid(te.getUid());
		
		return lmapper.updateByPrimaryKey(leg);
	}
}
