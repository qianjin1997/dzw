package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.accp.dao.ModuleMapper;
import com.accp.domain.Module;

/**
 * 授权操作类
 * @author
 *
 */
@Service
@Transactional
public class AuthService {
	
	@Autowired
	private ModuleMapper moduleMapper;

	public List<Module> getAuthAll(Integer rid){
		return moduleMapper.selectModuleByRid(rid);
	}
	public List<Module> getAuthByParentId(Integer rid,Integer parentId){
		return moduleMapper.selectModuleByRidAndParentId(rid, parentId);
	}
	public List<Module> getAuthByParentIdAndCatalog(Integer rid,Integer parentId,Integer catalog){
		return moduleMapper.selectModuleByRidAndParentIdAndCatalog(rid, parentId, catalog);
	}
}
