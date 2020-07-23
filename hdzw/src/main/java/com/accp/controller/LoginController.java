package com.accp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Users;
import com.accp.service.LoginService;

@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@PostMapping()
	public String login(HttpServletRequest request, Users loguser) {
		try {

			Users user = loginService.login(loguser);
			if(user!=null) {
				HttpSession session = request.getSession();
				session.setAttribute("user", user);
				return "{\"code\":200,\"msg\":\"登录成功\"}";
			}
		} catch (Exception e) {
			// TODO: handle exception

			return "{\"code\":500,\"msg\":\"登录失败，账号或密码错误\"}";
		}

		return "{\"code\":500,\"msg\":\"登录失败，账号或密码错误\"}";
		
	}
}
