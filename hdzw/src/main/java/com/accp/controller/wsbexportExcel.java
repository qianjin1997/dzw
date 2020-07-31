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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Car;
import com.accp.service.wsbcarService;
@RestController
@RequestMapping("exportExcel")
public class wsbexportExcel {
	
	@Autowired
	wsbcarService car;//车辆
	@GetMapping
	public ResponseEntity<byte []> exportExcel(){
		try {
			List<Car> list = car.find();
			//创建excel
			XSSFWorkbook xss = new XSSFWorkbook();
			//创建sheet页
			Sheet sheet = xss.createSheet();
			Row titleRow = sheet.createRow(0);
			Cell cellId = titleRow.createCell(0);
			cellId.setCellValue("编号");
			
			Cell licenseno = titleRow.createCell(1);
			licenseno.setCellValue("车牌号");
			
			Cell brand = titleRow.createCell(2);
			brand.setCellValue("车辆品牌");
			
			Cell type = titleRow.createCell(3);
			type.setCellValue("车俩类型");
			
			Cell deriver = titleRow.createCell(4);
			deriver.setCellValue("驾驶员");
			
			Cell engineid = titleRow.createCell(5);
			engineid.setCellValue("发动机");
			
			Cell carmj = titleRow.createCell(6);
			carmj.setCellValue("车辆年款");
			
			Cell mileage = titleRow.createCell(7);
			mileage.setCellValue("里程");
			
			Cell carseries = titleRow.createCell(8);
			carseries.setCellValue("车系");
			
			Cell buydate = titleRow.createCell(9);
			buydate.setCellValue("购买日期");
			
			Cell fueltype = titleRow.createCell(10);
			fueltype.setCellValue("燃油类别");
			
			for(int i=0;i<list.size();i++) {
				Row row = sheet.createRow(i+1);
				Cell id = row.createCell(0);
				id.setCellValue(list.get(i).getHid());
				Cell hlicenseno = row.createCell(1);
				hlicenseno.setCellValue(list.get(i).getHlicenseno());
				Cell hbrand = row.createCell(2);
				hbrand.setCellValue(list.get(i).getCarbrand().getIbrandname());
				
				Cell htype = row.createCell(3);
				htype.setCellValue(list.get(i).getCartype().getJtypename());
				
				Cell derive = row.createCell(4);
				derive.setCellValue(list.get(i).getDriver().getOname());
				
				Cell hengineid = row.createCell(5);
				hengineid.setCellValue(list.get(i).getHengineid());
				
				Cell hcarmj = row.createCell(6);
				hcarmj.setCellValue(list.get(i).getHcarmj());
				
				Cell hmileage = row.createCell(7);
				hmileage.setCellValue(list.get(i).getHmileage());
				
				Cell hcarseries = row.createCell(8);
				hcarseries.setCellValue(list.get(i).getHcarseries());
				
				Cell hbuydate = row.createCell(9);
				hbuydate.setCellValue(list.get(i).getHbldate());
				
				
				
				Cell hfueltype = row.createCell(10);
				hfueltype.setCellValue(list.get(i).getHfueltype());
			}
			
			HttpHeaders headers = new HttpHeaders();
			String excelName = new String("车辆数据列表.xlsx".getBytes("utf-8"),"iso-8859-1");
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
