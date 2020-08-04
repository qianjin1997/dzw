package com.accp.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Legwork;
import com.accp.domain.Section;
import com.accp.service.FxmcarService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/fxmcar")
public class FxmcarController {

	@Autowired
	FxmcarService fxms;
	
	@RequestMapping("/carcsy")
	@ResponseBody
	public PageInfo<Legwork> carcsy(Integer pageNum,Integer pageSize){
		System.out.println(11);
		return fxms.find(pageNum,pageSize);
	}
	
	@RequestMapping("/carright")
	@ResponseBody
	public List<Section> carright() {
		return fxms.righttree();
	}
	
	@RequestMapping("/carshan")
	@ResponseBody
	public String carshan(Integer vid) {
		int a= fxms.delete(vid);
		if(a>0) {
			return "删除成功";
		}else {
			return "删除失败";
		}
	}
	
	@RequestMapping("/caradd")
	@ResponseBody
	public String caradd(@RequestBody Legwork leg) {
		int a= fxms.add(leg);
		if(a>0) {
			return "增加成功";
		}else {
			return "增加失败";
		}
	}
	
	@RequestMapping("/carxiu")
	@ResponseBody
	public String carxiu(@RequestBody Legwork leg) {
		int a= fxms.xiu(leg);
		if(a>0) {
			return "修改成功";
		}else {
			return "修改失败";
		}
	}
}
