package com.accp.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.service.ArtisanService;
import com.accp.domain.Artisan;

@RestController
@RequestMapping("/artisan")
public class ArtisanController {
	
	@Autowired
	private ArtisanService artisanService;
	
	@GetMapping
	@ResponseBody
	public List<Artisan> getAll(){
		return artisanService.getAll();
	}
	
	@PostMapping("/edit")
	public String update(Artisan record){
		int ret = artisanService.update(record);
		if(ret>0) {
			return "0000";
		}else {
			return "0001";
		}
	}
	

	@PostMapping
	public String insert(Artisan record){
		int ret = artisanService.insert(record);
		if(ret>0) {
			return "0000";
		}else {
			return "0001";
		}
	}
	
	@PostMapping("/remove/{tid}")
	public String remove(@PathVariable("tid") Integer tid){
		int ret = artisanService.remove(tid);
		if(ret>0) {
			return "0000";
		}else {
			return "0001";
		}
	}
}
