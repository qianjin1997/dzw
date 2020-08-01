package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Clearing;
import com.accp.domain.Repair;
import com.accp.service.FxmzhongxinService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/fxmzx")
public class FxmzhongxinController {
	
	@Autowired
	FxmzhongxinService fxmse;
	
	
	
	@RequestMapping("/fwxfind")
	@ResponseBody
	public List<Repair> fwxfind(){
		return fxmse.fwxfind();
	}
	
	
	@RequestMapping("/wxkaishi")
	@ResponseBody
	public Clearing wxkaishi(Integer sid) {
		List<Clearing> list= fxmse.find(null, null, null, null,null,null);
		for (Clearing c : list) {
			if(c.getSid()==sid) {
				return c;
			}
		}
		return null;
	}
	
	@RequestMapping("/zxhuigun")
	@ResponseBody
	public String zxhuigun(@RequestBody Clearing cle) {
		int a= fxmse.huigun(cle);
		if(a>0) {
			return "成功";
		}else {
			return "失败";
		}
	}
	
	@RequestMapping("/zxshouyin")
	@ResponseBody
	public String zxshouyin(@RequestBody Clearing cle) {
		int a= fxmse.shouyin(cle);
		if(a>0) {
			return "成功";
		}else {
			return "失败";
		}
	}
	
	@RequestMapping("/zxfind")
	@ResponseBody
	public PageInfo<Clearing> zxfind(Integer pageNum,Integer pageSize,String ecustomername1,String ssettlementstatus1,String ssellno1,String hlicenseno1,String sj1,String sj2){
		return fxmse.zxfind(pageNum,pageSize,ecustomername1,ssettlementstatus1,ssellno1,hlicenseno1,sj1,sj2);
	}
	//导出
	@RequestMapping("/exportExcel")
	public ResponseEntity<byte[]> exportExcel(String ecustomername, String ssettlementstatus1,String ssellno,String hlicenseno,String sj1,String sj2) {
		
		try {
			
			List<Clearing> list= fxmse.find(ecustomername, ssettlementstatus1, ssellno, hlicenseno,sj1,sj2);
			//创建excel
			XSSFWorkbook xss = new XSSFWorkbook();
			//创建sheet页
			Sheet sheet = xss.createSheet();
			Row titleRow = sheet.createRow(0);
			Cell cellId = titleRow.createCell(0);
			cellId.setCellValue("id");
			
			Cell cellssellno = titleRow.createCell(1);
			cellssellno.setCellValue("销售单号");
			
			Cell cellsclearingform = titleRow.createCell(2);
			cellsclearingform.setCellValue("结算方式");
			
			Cell cellzstatus= titleRow.createCell(3);
			cellzstatus.setCellValue("单据状态");
			
			Cell cellssettlementstatus= titleRow.createCell(4);
			cellssettlementstatus.setCellValue("结算状态");
			
			Cell cellssettlementdate= titleRow.createCell(5);
			cellssettlementdate.setCellValue("结算时间");
			
			Cell cellssettlementpeople= titleRow.createCell(6);
			cellssettlementpeople.setCellValue("结算人");
			
			Cell cellssettlementmoney= titleRow.createCell(7);
			cellssettlementmoney.setCellValue("结算金额");
			
//			Cell cellsbusinesstypeno= titleRow.createCell(5);
//			cellsbusinesstypeno.setCellValue("业务类型");
			
			Cell cellecustomername= titleRow.createCell(8);
			cellecustomername.setCellValue("客户名称");
			
			Cell cellhlicenseno= titleRow.createCell(9);
			cellhlicenseno.setCellValue("车牌号");
			
			Cell cellibrandname= titleRow.createCell(10);
			cellibrandname.setCellValue("车型");
			

			for (int i = 0; i < list.size(); i++) {
				Row row = sheet.createRow(i+1);
				
				Cell id = row.createCell(0);
				id.setCellValue(list.get(i).getSid());
				
				Cell ssellno1 = row.createCell(1);
				ssellno1.setCellValue(list.get(i).getSsellno());
				
				Cell sclearingform = row.createCell(2);
				sclearingform.setCellValue(list.get(i).getSclearingform());
				
				Cell zstatus = row.createCell(3);
				zstatus.setCellValue(list.get(i).getDocu().getZstatus());
				
				Cell ssettlementstatus12 = row.createCell(4);
				ssettlementstatus12.setCellValue(list.get(i).getSsettlementstatus());
				
				Cell ssettlementdate = row.createCell(5);
				ssettlementdate.setCellValue(list.get(i).getSsettlementdate());
				
				Cell ssettlementpeople = row.createCell(6);
				ssettlementpeople.setCellValue(list.get(i).getSsettlementpeople());
				
				Cell ssettlementmoney = row.createCell(7);
				ssettlementmoney.setCellValue(list.get(i).getSsettlementmoney());
				
				
				Cell ecustomername1 = row.createCell(8);
				ecustomername1.setCellValue(list.get(i).getCust().getEcustomername());
				
				Cell hlicenseno1 = row.createCell(9);
				hlicenseno1.setCellValue(list.get(i).getCar().getHlicenseno());
				
				Cell ibrandname = row.createCell(10);
				ibrandname.setCellValue(list.get(i).getCar().getCarbr().getIbrandname());
				

				
			    }

			HttpHeaders headers = new HttpHeaders();
			String excelName;
				
			
				excelName = new String("结算中心数据.xlsx".getBytes("utf-8"),"iso-8859-1");
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
				System.out.println(e);
			}
		    
			return null;
			

		  
				
			
			
		
	}
	
}
