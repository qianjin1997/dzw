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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.dao.IncomeMapper;
import com.accp.dao.MaintainxmMapper;
import com.accp.domain.Brackets;
import com.accp.domain.Goods;
import com.accp.domain.Goodsbrand;
import com.accp.domain.Goodsdj;
import com.accp.domain.Goodsplace;
import com.accp.domain.Goodstype;
import com.accp.domain.Income;
import com.accp.domain.Maintainxm;
import com.accp.domain.Original;
import com.accp.domain.Repair;
import com.accp.domain.Unit;
import com.accp.domain.Wares;
import com.accp.service.GoodsService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/goods")
public class GoodsController {

	@Autowired
	private GoodsService service;
	
	//商品资料信息查询
	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<Goods> findByPage(Goods goods,@PathVariable("pageNum") Integer pageNum, @PathVariable("pageSize") Integer pageSize) {
		return service.findAll2(pageNum, pageSize, goods);
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
	
	//增加修改商品资料
	@PostMapping("/create")
	public String create(Goods goods) {
		//当id=0时进行新增操作
		if(goods.getAbid()==0) {
			int count = service.create(goods);
			if (count > 0) {
				return "00000";
			}
			return "00001";
		}
		//修改
		int count =  service.update(goods);
		if (count > 0) {
			return "00000";
		}
		return "00001";
	}
	
	
	//下拉框查询--------------------
	@GetMapping("/find1")
	public List<Goodsbrand> find1(){
		return service.find1();
	}
	@GetMapping("/find2")
	public List<Unit> find2(){
		return service.find2();
	}
	@GetMapping("/find3")
	public List<Goodstype> find3(){
		return service.find3();
	}
	@GetMapping("/find4")
	public List<Brackets> find4(){
		return service.find4();
	}
	@GetMapping("/find5")
	public List<Original> find5(){
		return service.find5();
	}
	@GetMapping("/find6")
	public List<Goodsdj> find6(){
		return service.find6();
	}
	@GetMapping("/find7")
	public List<Goodsplace> find7(){
		return service.find7();
	}
	@GetMapping("/find8")
	public List<Wares> find8(){
		return service.find8();
	}
	
	//导出方法
	@GetMapping("/exportExcel")
	public ResponseEntity<byte []> exportExcel(String goods) {
		try {
			List<Goods> list = service.findAll(goods);
			//创建excel
			XSSFWorkbook xss = new XSSFWorkbook();
			//创建sheet页
			Sheet sheet = xss.createSheet();
			Row titleRow = sheet.createRow(0);
			
			Cell cellAbregisterstores= titleRow.createCell(0);
			cellAbregisterstores.setCellValue("登记门店");
			
			Cell cellAbimagename = titleRow.createCell(1);
			cellAbimagename.setCellValue("照片名");
			
			Cell cellAbcode = titleRow.createCell(2);
			cellAbcode.setCellValue("商品编码");
			
			Cell cellAbshopname = titleRow.createCell(3);
			cellAbshopname.setCellValue("商品名称");
			
			Cell cellAbshopbrandid = titleRow.createCell(4);
			cellAbshopbrandid.setCellValue("商品品牌");
			
			Cell cellAbarctic = titleRow.createCell(5);
			cellAbarctic.setCellValue("使用车型");
			
			Cell cellAbuoq= titleRow.createCell(6);
			cellAbuoq.setCellValue("数量单位");
			
			Cell cellAbshoplid = titleRow.createCell(7);
			cellAbimagename.setCellValue("商品大类");
			
			for (int i = 0; i < list.size(); i++) {
				Row row = sheet.createRow(i + 1);
				
				Cell abregisterstores= row.createCell(0);
				abregisterstores.setCellValue(list.get(i).getAbregisterstores());
				
				Cell abimagename = row.createCell(1);
				abimagename.setCellValue(list.get(i).getAbimagename());
				
				Cell abcode = row.createCell(2);
				abcode.setCellValue(list.get(i).getAbcode());
				
				Cell abshopname = row.createCell(3);
				abshopname.setCellValue(list.get(i).getAbshopname());
				
				Cell abshopbrandid = row.createCell(4);
				abshopbrandid.setCellValue(list.get(i).getAbshopbrandid());
				
				Cell abarctic = row.createCell(5);
				abarctic.setCellValue(list.get(i).getAbarctic());
				
				Cell abuoq= row.createCell(6);
				abuoq.setCellValue(list.get(i).getAbuoq());
				
				Cell abshoplid = row.createCell(7);
				abshoplid.setCellValue(list.get(i).getAbshoplid());
			}
			
			HttpHeaders headers = new HttpHeaders();
			String excelName = new String("商品资料列表.xlsx".getBytes("utf-8"),"iso-8859-1");
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
