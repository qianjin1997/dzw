package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Cslinkman;
import com.accp.domain.Engine;
import com.accp.domain.Ghaddress;
import com.accp.domain.Wares;
import com.accp.service.GongHuoService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/GongHuoController") 
public class GongHuoController {
	
	@Autowired
	GongHuoService service;
	
	@RequestMapping("/findAll") 
	@ResponseBody
	public List<Ghaddress> findAll(Integer anparentid){
		return service.findAll(anparentid);
	}
	
	@RequestMapping("/removeGhaddress") 
	@ResponseBody
	public String removeGhaddress(Integer anid) {
		int i=service.removeGhaddress(anid);
		System.out.println(anid);
		if (i>0) {
			return "0000";
		}
		return "0001";
	}
	
	@RequestMapping("/insertGhaddress") 
	@ResponseBody
	public String insertGhaddress(@RequestBody Ghaddress address) {
		int i=service.insertGhaddress(address);
		if (i>0) {
			return "0000";
		}
		return "0001";
	}
	
	@RequestMapping("/insertGhaddressParents") 
	@ResponseBody
	public String  insertGhaddressParents(Ghaddress address) {
		int i=service.insertGhaddressParents(address);
		if (i>0) {
			return "0000";
		}
		return "0001";
	}
	
	@RequestMapping("/updateGhaddress") 
	@ResponseBody
	public String updateGhaddress(@RequestBody Ghaddress address) {
		int i=service.updateGhaddress(address);
		if (i>0) {
			return "0000";
		}
		return "0001";
	}
	@RequestMapping("/remoceCslinkman") 
	@ResponseBody
	public String remoceCslinkman(Integer aoid) {
		int i=service.remoceCslinkman(aoid);
		if (i>0) {
			return "0000";
		}
		return "0001";
	}
	
	@RequestMapping("/findFaytroy") 
	@ResponseBody
	public PageInfo<Wares>  findFaytroy(String afvendortype,Integer pageNum,
			Integer pageSize,String serch){
		return service.findFaytroy(afvendortype,pageNum,pageSize,serch);
	}
	
	@RequestMapping("/findCustomerByAofactoryId") 
	@ResponseBody
	public  List<Cslinkman> findCustomerByAofactoryId(Integer aofactoryId){
		return service.findCustomerByAofactoryId(aofactoryId);
	}
	
	@RequestMapping("/findUpdateFaytroyType") 
	@ResponseBody
	public List<Ghaddress> findUpdateFaytroyType(Integer anparentid){
		return service.findUpdateFaytroyType(anparentid);
	}
	
	@RequestMapping("/updateWares") 
	@ResponseBody
	public String updateWares(@RequestBody Wares wares) {
		int i=service.updateWares(wares);
		if (i>0) {
			return "0000";
		}
		return "0001";
	}
	
	@RequestMapping("/addCslinkman") 
	@ResponseBody
	public String addCslinkman(Cslinkman csm) {
		int i=service.addCslinkman(csm);
		if (i>0) {
			return "0000";
		}
		return "0001";
	}
	
	@RequestMapping("/addWares") 
	@ResponseBody
	public String addWares(Wares wa) {
		int i=service.addWares(wa);
		if (i>0) {
			return "0000";
		}
		return "0001";
	}
	
	@RequestMapping("/findFaytroys")
	@ResponseBody
	public List<Wares> findFaytroys(Integer afvendortype){
		return service.findFaytroys(afvendortype);
	}
	
	@RequestMapping("/updateCslinkman")
	@ResponseBody
	public String updateCslinkman(Cslinkman csm) {
		int i=service.updateCslinkman(csm);
		if (i>0) {
			return "0000";
		}
		return "0001";
	}
	
	@RequestMapping("/exportExcel")
	public ResponseEntity<byte []> exportExcel(){
		try {
			PageInfo<Wares>  list =service.findFaytroy("1",1,3,"");
			//创建excel
			XSSFWorkbook xss = new XSSFWorkbook();
			//创建sheet页
			Sheet sheet = xss.createSheet();
			Row titleRow = sheet.createRow(0);
			Cell afvendorcode = titleRow.createCell(0);
			afvendorcode.setCellValue("厂商代码");
			
			Cell aftradename = titleRow.createCell(1);
			aftradename.setCellValue("厂商名称");
			
			Cell afaddress = titleRow.createCell(2);
			afaddress.setCellValue("地址");
			
			
			Cell afoperation = titleRow.createCell(3);
			afoperation.setCellValue("经验情况");
			
			Cell afurl = titleRow.createCell(4);
			afurl.setCellValue("网址");

			Cell afbankaccount = titleRow.createCell(5);
			afbankaccount.setCellValue("开户行");
			
			Cell afopeningbank = titleRow.createCell(6);
			afopeningbank.setCellValue("银行账号");
			
			Cell affkmethod = titleRow.createCell(7);
			affkmethod.setCellValue("付款方式");
			
			Cell afvendorrating = titleRow.createCell(8);
			afvendorrating.setCellValue("厂商等级");
			
			Cell afrunbrand = titleRow.createCell(9);
			afrunbrand.setCellValue("经营品牌");
			
			Cell anaddress = titleRow.createCell(10);
			anaddress.setCellValue("厂商类别");
			for(int i=0;i<list.getList().size();i++) {
				Row row = sheet.createRow(i+1);
				Cell id = row.createCell(0);
				id.setCellValue(list.getList().get(i).getAfvendorcode());
				Cell name = row.createCell(1);
				name.setCellValue(list.getList().get(i).getAftradename());
				Cell afaddress1 = row.createCell(2);
				afaddress1.setCellValue(list.getList().get(i).getAfaddress());
				Cell afoperation1 = row.createCell(3);
				afoperation1.setCellValue(list.getList().get(i).getAfoperation());
				Cell afurl1 = row.createCell(4);
				afurl1.setCellValue(list.getList().get(i).getAfurl());
				Cell afbankaccount1 = row.createCell(5);
				afbankaccount1.setCellValue(list.getList().get(i).getAfbankaccount());
				Cell afopeningbank1 = row.createCell(6);
				afopeningbank1.setCellValue(list.getList().get(i).getAfopeningbank());
				Cell affkmethod1 = row.createCell(7);
				affkmethod1.setCellValue(list.getList().get(i).getAffkmethod());
				Cell afvendorrating1 = row.createCell(8);
				afvendorrating1.setCellValue(list.getList().get(i).getAfvendorrating());
				Cell afrunbrand1 = row.createCell(9);
				afrunbrand1.setCellValue(list.getList().get(i).getAfrunbrand());
				Cell anaddress1 = row.createCell(10);
				anaddress1.setCellValue(list.getList().get(i).getAddress().getAnaddress());
				
			}
			HttpHeaders headers = new HttpHeaders();
			String excelName = new String("供货单位地址数据列表.xlsx".getBytes("utf-8"),"iso-8859-1");
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
	
	@RequestMapping("/removeFaytroy")
	@ResponseBody
	public String removeFaytroy(Integer afid,Integer afvendorcode) {
		int i=service.removeFaytroy(afid,afvendorcode);
		if (i>0) {
			return "0000";
		}
		return "0001";
	}
	
	@RequestMapping("/joinAddress")
	@ResponseBody
	public String joinAddress(Integer[] anid) {
		return service.joinAddress(anid);
	}
}
