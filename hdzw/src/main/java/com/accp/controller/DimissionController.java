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
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.accp.domain.Dimission;
import com.accp.domain.Section;
import com.accp.service.DimissionService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/dimission")
public class DimissionController {
	@Autowired
	DimissionService ser;
	
	@RequestMapping("/findbypage")
	@ResponseBody
	public PageInfo<Dimission> findbypage(Integer pageNum, Integer pageSize,String name){
		return ser.findByPage(pageNum, pageSize, name);
	}
	@RequestMapping("/findSection")
	@ResponseBody
	public Section findSection(){
		return ser.findSection();
	}
	@RequestMapping("/del")
	@ResponseBody
	public String del(Integer id){
		int ret = ser.del(id);
		if(ret>0) {
			return "000";
		}
		return "001";
	}
	@RequestMapping("/findall")
	@ResponseBody
	public List<Dimission> findall(){
		return ser.findall();
	}
	@RequestMapping("/disadd/{name}")
	@ResponseBody
	public String disadd(@PathVariable("name")String name,@RequestBody Dimission dis){
		int ret = ser.disadd(name, dis);
		if(ret>0) {
			return "000";
		}
		return "111";
	}
	@RequestMapping("/delall")
	@ResponseBody
	public String delall(Integer id){
		int ret =ser.delall(id);
		if(ret>0) {
			return "000";
		}
		return "111";
	}
	@RequestMapping("/exportExcel")
	@ResponseBody
    public ResponseEntity<byte []> exportExcel(){
    	try {
			List<Dimission> list=ser.finddaochu();
			//创建excel
			XSSFWorkbook xss=new XSSFWorkbook();
			//创建seet页
			Sheet sheet= xss.createSheet();
			Row titleRow=sheet.createRow(0);
			Cell cellbname=titleRow.createCell(0);
			cellbname.setCellValue("部门");
			Cell sellId=titleRow.createCell(1);
			sellId.setCellValue("员工编号");
			Cell cellname=titleRow.createCell(2);
			cellname.setCellValue("姓名");
			Cell cellsex=titleRow.createCell(3);
			cellsex.setCellValue("性别");
			Cell cellzw=titleRow.createCell(4);
			cellzw.setCellValue("职位");
			/*Cell celllzdata=titleRow.createCell(5);
			celllzdata.setCellValue("离职日期");
			Cell celllzyy=titleRow.createCell(6);
			celllzyy.setCellValue("离职原因");*/
			
			for (int i = 0; i < list.size(); i++) {
				Row row=sheet.createRow(i+1);
				Cell qId=row.createCell(0);
				qId.setCellValue(list.get(i).getSection().getQname());
				Cell pId=row.createCell(1);
				pId.setCellValue(list.get(i).getStaff().getPid());
				Cell pName=row.createCell(2);
				pName.setCellValue(list.get(i).getStaff().getPname());
				Cell pSex=row.createCell(3);
				pSex.setCellValue(list.get(i).getStaff().getPsex());
				Cell pPgname=row.createCell(4);
				pPgname.setCellValue(list.get(i).getStaff().getPgname());
			}
			
			HttpHeaders headers=new HttpHeaders();
			String excelName=new String("离职登记列表.xlsx".getBytes("utf-8"),"iso-8859-1");
			
			headers.setContentDispositionFormData("attachment", excelName);
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			//文件流	
			ByteArrayOutputStream  bao=new ByteArrayOutputStream();
			//将excel写到文件流中
			xss.write(bao);
			//将文件流转换成字节
			byte [] bytes=bao.toByteArray();
			return new ResponseEntity<byte[]>(bytes, headers,HttpStatus.OK);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
}
