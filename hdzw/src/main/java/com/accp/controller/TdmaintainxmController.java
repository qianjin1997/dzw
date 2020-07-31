package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Income;
import com.accp.domain.Maintainxm;
import com.accp.service.TdmaintainxmService;

@Controller
@RequestMapping("/maintainxm")
public class TdmaintainxmController {
	@Autowired
	TdmaintainxmService ser;
	@RequestMapping("/find")
	@ResponseBody
	public List<Maintainxm> find(){
		return ser.find();
	}
	@RequestMapping("/findincome")
	@ResponseBody
	public List<Income> findincome(){
		return ser.findincome();
	}
}
