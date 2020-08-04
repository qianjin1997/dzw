package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.CslinkmanMapper;
import com.accp.dao.CustomerMapper;
import com.accp.dao.GhaddressMapper;
import com.accp.dao.WaresMapper;
import com.accp.domain.Cartype;
import com.accp.domain.Cslinkman;
import com.accp.domain.CslinkmanExample;
import com.accp.domain.Customer;
import com.accp.domain.CustomerExample;
import com.accp.domain.Ghaddress;
import com.accp.domain.GhaddressExample;
import com.accp.domain.Wares;
import com.accp.domain.WaresExample;
import com.accp.domain.WaresExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class GongHuoService {
	@Autowired
	GhaddressMapper mapper;
	
	@Autowired
	WaresMapper waresMapper;
	
	@Autowired
	CslinkmanMapper merMappper;
	
	public int updateCslinkman(Cslinkman csm) {
		return merMappper.updateByPrimaryKey(csm);
	}
	
	public int addCslinkman(Cslinkman csm) {
		return merMappper.insert(csm);
	}
	
	public int remoceCslinkman(Integer aoid) {
		return merMappper.deleteByPrimaryKey(aoid);
	}
	
	public int addWares(Wares wa) {
		wa.setAflinkman(id);
		wa.setAfvendortype(afvendortype.toString());
		return waresMapper.insert(wa);
	}
	public String id="";
	public Integer afvendortype=null;
	public String joinAddress(Integer[] anid) {
		String address="";
		id="";
		Boolean bo=false;
		for (Integer integer : anid) {
			Ghaddress list=mapper.selectByPrimaryKey(integer);
			address+=list.getAnaddress();
			id+=","+integer.toString();
			if (bo==false) {
				afvendortype=integer;
				bo=true;
				continue;
			}
		}
		id=id+",";
		return address;
	}
	
	
	public List<Ghaddress> findAll(Integer anparentid){
		List<Ghaddress> list=mapper.findAll(anparentid);
		return list;
	}
	
	public  List<Cslinkman> findCustomerByAofactoryId(Integer aofactoryId){
		CslinkmanExample example=new CslinkmanExample();
		example.createCriteria().andAofactoryidEqualTo(aofactoryId);
		return merMappper.selectByExample(example);
	}
	
	public PageInfo<Wares> findFaytroy(String afvendortype,Integer pageNum,
			Integer pageSize,String serch){
		WaresExample example=new WaresExample();
		Criteria ct=example.createCriteria();
		ct.andAflinkmanLike("%,"+afvendortype+",%");
		if (serch!=null) {
			if (serch!="") {
				
				ct.andAftradenameLike("%"+serch+"%");
			}
		}
		Page<Wares> page = PageHelper.startPage(pageNum, pageSize);
		 List<Wares> list=waresMapper.selectByExample(example);
		 for (Wares wares : list) {
			 Ghaddress ghad=mapper.selectByPrimaryKey(Integer.parseInt(wares.getAfvendortype()));
			 wares.setAddress(ghad);
		}
		return page.toPageInfo();
	}
	
	public int insertGhaddress(Ghaddress address) {
		return mapper.insert(address);
	}
	
	public int insertGhaddressParents(Ghaddress address) {
		address.setAnparentid(0);
		return mapper.insert(address);
	}
	
	public int updateGhaddress(Ghaddress address) {
		return mapper.updateByPrimaryKey(address);
	}
	
	public int removeGhaddress(Integer anid) {
		int i=mapper.deleteByPrimaryKey(anid);
		int k=0;
		if (i>0) {
			WaresExample example=new WaresExample();
			example.createCriteria().andAflinkmanLike("%,"+anid+",%");
			Wares ghad=waresMapper.selectByExample(example).get(0);
			int j=waresMapper.deleteByPrimaryKey(ghad.getAfid());
			if (j>0) {
				CslinkmanExample cexample=new CslinkmanExample();
				cexample.createCriteria().andAofactoryidEqualTo(Integer.parseInt(ghad.getAfvendorcode()));
				 k=merMappper.deleteByExample(cexample);
			}
		}
		return k;
	}
	
	public List<Ghaddress> findUpdateFaytroyType(Integer anparentid){
		GhaddressExample example=new GhaddressExample();
		example.createCriteria().andAnparentidEqualTo(anparentid);
		return mapper.selectByExample(example);
	}
	
	public int removeFaytroy(Integer afid,Integer afvendorcode) {
		CslinkmanExample example=new CslinkmanExample();
		example.createCriteria().andAofactoryidEqualTo(afvendorcode);
		merMappper.deleteByExample(example);
		return waresMapper.deleteByPrimaryKey(afid);
	}
	
	public int updateWares(Wares wares) {
		wares.setAflinkman(id);
		wares.setAfvendortype(afvendortype.toString());
		return waresMapper.updateByPrimaryKey(wares);
	}
	
	public List<Wares> findFaytroys(Integer afvendortype){
		WaresExample example=new WaresExample();
		example.createCriteria().andAflinkmanLike("%,"+afvendortype+",%");
		/*GhaddressExample ghex=new GhaddressExample();*/
		List<Wares> list=waresMapper.selectByExample(example);
		for (Wares wares : list) {
			/*ghex.createCriteria().andAnidEqualTo(Integer.parseInt(wares.getAfvendortype()));*/
			 Ghaddress ghad=mapper.selectByPrimaryKey(Integer.parseInt(wares.getAfvendortype()));
			 wares.setAddress(ghad);
		}
		return list;
	}
}	
