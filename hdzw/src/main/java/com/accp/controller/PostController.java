package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Gpost;
import com.accp.service.PostService;

@Controller
@RequestMapping("/gpost")
public class PostController {
	@Autowired
	PostService ser;
	@RequestMapping("/findall")
	@ResponseBody
	public List<Gpost> findall(){
		return ser.findall();
	}
	@RequestMapping("/gpostadd")
	@ResponseBody
	public String gpostadd(@RequestBody Gpost gposts) {
		int ret = ser.gpostadd(gposts);
		if(ret>0) {
			return "000";
		}
		return "111";
	}
	@RequestMapping("/del")
	@ResponseBody
	public String del(Integer id) {
		int ret = ser.del(id);
		if(ret>0) {
			return "000";
		}
		else {
			return "111";
		}
	}
	@RequestMapping("/update")
	@ResponseBody
	public String update(@RequestBody Gpost gposts) {
		int ret = ser.update(gposts);
		if(ret>0) {
			return "000";
		}
		else {
			return "111";
		}
	}
}
