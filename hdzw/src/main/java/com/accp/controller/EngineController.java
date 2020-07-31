package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import com.accp.domain.Engine;
import com.accp.service.EngineService;

@Controller
@RequestMapping("/EngineController") 
public class EngineController {
	
	@Autowired
	EngineService service;
	
	@RequestMapping("/findEngine") 
	@ResponseBody
	public List<Engine> findEngine() {
		return service.findEngine();
	}
	
	@RequestMapping("/update") 
	@ResponseBody
	public String update(Engine en){
		System.out.println(en.getMename());
		int i=service.update(en);
		if (i>0) {
			return "0000";
		}
		return "0001";
	}
	
	@RequestMapping("/addEngine") 
	@ResponseBody
	public String addEngine(Engine en){
		System.out.println(en.getMename());
		int i=service.insert(en);
		if (i>0) {
			return "0000";
		}
		return "0001";
	}
	
	@RequestMapping("/remove") 
	@ResponseBody
	public String remove(Integer  mid){
		int i=service.remove(mid);
		if (i>0) {
			return "0000";
		}
		return "0001";
	}
	
	@RequestMapping("/exportExcel")
	public ResponseEntity<byte []> exportExcel(){
		try {
			List<Engine> list = service.findEngine();
			//创建excel
			XSSFWorkbook xss = new XSSFWorkbook();
			//创建sheet页
			Sheet sheet = xss.createSheet();
			Row titleRow = sheet.createRow(0);
			Cell cellId = titleRow.createCell(0);
			cellId.setCellValue("发动机品牌编号");
			Cell cellName = titleRow.createCell(1);
			cellName.setCellValue("发动机品牌名称");
			for(int i=0;i<list.size();i++) {
				Row row = sheet.createRow(i+1);
				Cell id = row.createCell(0);
				id.setCellValue(list.get(i).getMid());
				Cell name = row.createCell(1);
				name.setCellValue(list.get(i).getMename());
				
			}
			HttpHeaders headers = new HttpHeaders();
			String excelName = new String("发动机数据列表.xlsx".getBytes("utf-8"),"iso-8859-1");
			headers.setContentDispositionFormData("attachment", excelName);
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			
			//文件流
			ByteArrayOutputStream bao = new ByteArrayOutputStream();
			//将excel写入到文件流中
			xss.write(bao);
			//将文件流转换成字节
			byte [] bytes = bao.toByteArray();
			return new ResponseEntity<byte[]>(bytes, headers, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
}
