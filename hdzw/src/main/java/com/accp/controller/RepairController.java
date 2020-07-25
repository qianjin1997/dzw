package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Goods;
import com.accp.domain.Repair;
import com.accp.service.RepairService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/repair")
public class RepairController {
	
	@Autowired
	private RepairService service;
	
	//维修项目分页查询
	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<Repair> findByPage(@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize, Repair repair){
		return service.findByPage(pageNum, pageSize, repair);
	}
	
	//删除方法
	@PostMapping("/{id}")
	public String remove(@PathVariable("id") Integer id) {
		int count = service.remove(id);
		if (count > 0) {
			return "00000";
		}
		return "00001";
	}
	
	//保存维修项目
	@PostMapping
	public String create(Repair repair) {
		//当id=0时进行新增操作
		if(repair.getWid()==0) {
			int count = service.create(repair);
			if (count > 0) {
				return "00000";
			}
			return "00001";
		}
		//修改
		int count =  service.update(repair);
		if (count > 0) {
			return "00000";
		}
		return "00001";
	}
	
	@GetMapping("/exportExcel")
	public ResponseEntity<byte []> exportExcel(String repair) {
		try {
			List<Repair> list = service.findAll(repair);
			//创建excel
			XSSFWorkbook xss = new XSSFWorkbook();
			//创建sheet页
			Sheet sheet = xss.createSheet();
			Row titleRow = sheet.createRow(0);
			Cell cellWmid = titleRow.createCell(0);
			cellWmid.setCellValue("项目类别");
			
			Cell cellWid = titleRow.createCell(1);
			cellWid.setCellValue("项目编码");
			
			Cell cellWmname = titleRow.createCell(2);
			cellWmname.setCellValue("项目名称");
			
			Cell cellWremark = titleRow.createCell(3);
			cellWremark.setCellValue("售价按");
			
			Cell cellWincomeid = titleRow.createCell(4);
			cellWincomeid.setCellValue("收入种类");
			
			Cell cellWsprice = titleRow.createCell(5);
			cellWsprice.setCellValue("标准价");
			
			Cell cellWmemberprice = titleRow.createCell(6);
			cellWmemberprice.setCellValue("会员价");
			
			Cell cellWvipice = titleRow.createCell(7);
			cellWvipice.setCellValue("VIP价");
			
			Cell cellWdeal = titleRow.createCell(8);
			cellWdeal.setCellValue("协议价");
			
			Cell cellWclaim = titleRow.createCell(9);
			cellWclaim.setCellValue("索赔价");
			
			Cell cellWicbcprice = titleRow.createCell(10);
			cellWicbcprice.setCellValue("保险价");
			
			for (int i = 0; i < list.size(); i++) {
				Row row = sheet.createRow(i + 1);
				
				Cell wmid = row.createCell(0);
				wmid.setCellValue(list.get(i).getWmid());
				
				Cell wid = row.createCell(1);
				wid.setCellValue(list.get(i).getWid());
				
				Cell wmname = row.createCell(2);
				wmname.setCellValue(list.get(i).getWmname());
				
				Cell wremark = row.createCell(3);
				wremark.setCellValue(list.get(i).getWremark());
				
				Cell wincomeid = row.createCell(4);
				wincomeid.setCellValue(list.get(i).getWincomeid());
				
				Cell wsprice = row.createCell(5);
				wsprice.setCellValue(list.get(i).getWsprice());
				
				Cell wmemberprice = row.createCell(6);
				wmemberprice.setCellValue(list.get(i).getWmemberprice());
				
				Cell wvipice = row.createCell(7);
				wvipice.setCellValue(list.get(i).getWvipice());
				
				Cell wdeal = row.createCell(8);
				wdeal.setCellValue(list.get(i).getWdeal());
				
				Cell wclaim = row.createCell(9);
				wclaim.setCellValue(list.get(i).getWclaim());
				
				Cell wicbcprice = row.createCell(10);
				wicbcprice.setCellValue(list.get(i).getWicbcprice());
			}
			
			HttpHeaders headers = new HttpHeaders();
			String excelName = new String("维修项目列表.xlsx".getBytes("utf-8"),"iso-8859-1");
			headers.setContentDispositionFormData("attachment", excelName);
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			
			//文件流
			ByteArrayOutputStream bao = new ByteArrayOutputStream();
			//将excel写入到文件流中
			xss.write(bao);
			//将文件流转换成字节
			byte [] bytes = bao.toByteArray();
			return new ResponseEntity<byte[]>(bytes, headers, HttpStatus.OK);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
