package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ClearingMapper;
import com.accp.dao.RepairMapper;
import com.accp.domain.Clearing;
import com.accp.domain.Repair;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class FxmzhongxinService {
		
	@Autowired
	ClearingMapper cmapper;
	
	@Autowired
	RepairMapper rmapper;	//维修单
	
	//维修单查询所有
	public List<Repair> fwxfind(){
		return rmapper.findAll();
	}
	
	//收银
	public int  shouyin(Clearing cle) {
		cle.setSsettlementstatus("已结算");
		return  cmapper.updateByPrimaryKey(cle);

	}
	
	//回滚
	public int huigun(Clearing cle) {
		cle.setSsettlementstatus("未结算");
		return  cmapper.updateByPrimaryKey(cle);

	}
	
	//查询所有
	public PageInfo<Clearing> zxfind(Integer pageNum,Integer pageSize,String ecustomername,String ssettlementstatus,String ssellno,String hlicenseno,String sj1,String sj2) {
		Page<Clearing> page=PageHelper.startPage(pageNum, pageSize);
		List<Clearing> list=cmapper.findAll(ecustomername,ssettlementstatus,ssellno,hlicenseno,sj1,sj2);
		return page.toPageInfo();
	}
	
	
	
	//导出查询
	public List<Clearing> find(String ecustomername,String ssettlementstatus,String ssellno,String hlicenseno,String sj1,String sj2){
		List<Clearing>  list=cmapper.findAll(ecustomername, ssettlementstatus, ssellno, hlicenseno,sj1,sj2);
		return list;
	}
}
