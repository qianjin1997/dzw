package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Module;

@Service
@Transactional
public class MenuService {
	
	@Autowired
	private AuthService authService;
	
	public List<Module> getMenuA(Integer rid){
		return authService.getAuthByParentIdAndCatalog(rid, 0, 0);
	}
	

	public List<Module> getMenuB(Integer rid,Integer parentId){
		List<Module> list = authService.getAuthByParentIdAndCatalog(rid, parentId, 0);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setChildren(authService.getAuthByParentIdAndCatalog(rid, list.get(i).getDid(), 0));
		}
		return list;
	}
}
