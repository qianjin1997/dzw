package com.accp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.service.MenuService;
import com.accp.domain.Module;
import com.accp.domain.Users;

@RestController
@RequestMapping("/menu")
public class MenuController {

	@Autowired
	private MenuService menuService;

	@GetMapping("/menuA")
	@ResponseBody
	public List<Module> getMenuA(HttpServletRequest request){
		HttpSession session = request.getSession();
		Users user = (Users) session.getAttribute("user");
		
		
		return menuService.getMenuA(user.getArid());
	}

	@GetMapping("/menuB")
	@ResponseBody
	public List<Module> getMenuB(HttpServletRequest request,Integer parentId){
		HttpSession session = request.getSession();
		Users user = (Users) session.getAttribute("user");
		
		
		return menuService.getMenuB(user.getArid(), parentId);
	}
}
