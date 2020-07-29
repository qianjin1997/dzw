package com.accp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Section;
import com.accp.service.SectionService;

@Controller
@RequestMapping("/section")
public class SectionController {
	@Autowired
	SectionService ser;
	@RequestMapping("/findByQparentid")
	@ResponseBody
	public List<Section> findByQparentid(Integer parentid){
		List<Section> list = ser.findByQparentid(parentid);
		return list;
	}
	@RequestMapping("/addsection")
	@ResponseBody
	public String addsection(@RequestBody Section section){
		int ret = ser.addsection(section);
		if(ret>0) {
			return "000";
		}
		return "111";
	}
	@RequestMapping("/sectiondel")
	@ResponseBody
	public String sectiondel(Integer id){
		int ret = ser.sectiondel(id);
		if(ret>0) {
			return "000";
		}
		return "111";
	}
}
