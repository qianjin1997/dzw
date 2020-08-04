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

import com.accp.domain.Section;
import com.accp.domain.Staff;
import com.accp.domain.Team;
import com.accp.service.FxmbjjgService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/fxmbzjg")
public class FxmbzjgController {

	@Autowired
	FxmbjjgService fservice;
	
	//技工添加
	@RequestMapping("/jgadd")
	@ResponseBody
	public String jgadd(@RequestBody Staff staff) {
		int a= fservice.jgadd(staff);
		if(a>0) {
			return "增加成功";
		}else {
			return "增加失败";
		}
	}
	
	
	//技工修改
	@RequestMapping("/jgupdate")
	@ResponseBody
	public String jgupdate(@RequestBody Staff staff) {
		int a= fservice.jgupdate(staff);
		if(a>0) {
			return "修改成功";
		}else {
			return "修改失败";
		}
	}
	
	//班组删除
	@RequestMapping("/bjshan")
	@ResponseBody
	public String bjshan(Section section) {
		int a=fservice.bjshan(section);
		if(a>0) {
			return "删除成功";
		}else {
			return "删除失败,请先删除该班组成员";
		}
	}
	
	
	//班组添加
	@RequestMapping("/bjadd")
	@ResponseBody
	public String bjadd(Section section) {
		int a= fservice.bjadd(section);
		if(a>0) {
			return "添加成功";
		}else {
			return "添加失败";
		}
	}
	
	//班组权重查询所有
	@RequestMapping("/bjqzcsy")
	@ResponseBody
	public List<Team>  bzqzcsy(@Param("name1")String name1) {
		return  fservice.bzqzfind(name1);
	}
	
	@RequestMapping("/bzjgcsy")
	@ResponseBody
	public PageInfo<Staff> bzjgcsy(@Param("pageNum") Integer pageNum,@Param("pageNum") Integer pageSize,@Param("name") String name) {
		return fservice.jgfind(pageNum, pageSize, name);
	}
	
	@RequestMapping("/bzjgright")
	@ResponseBody
	public List<Section> bzjgright() {
		return fservice.righttree();
	}
	
	@RequestMapping("/bzjgshan")
	@ResponseBody
	public String bzjgshan(@RequestBody Staff staff) {
		int a= fservice.jgshan(staff);
		if(a>0) {
			return "删除成功";
		}else {
			return "删除失败";
		}
	}

	
	//导出
	@RequestMapping("/exportExcel")
	public ResponseEntity<byte []> exportExcel(String name){
		try {
			List<Staff> list = fservice.csy(name);
			//创建excel
			XSSFWorkbook xss = new XSSFWorkbook();
			//创建sheet页
			Sheet sheet = xss.createSheet();
			Row titleRow = sheet.createRow(0);
			Cell cellId = titleRow.createCell(0);
			cellId.setCellValue("id");
			
			Cell cellPjobid = titleRow.createCell(1);
			cellPjobid.setCellValue("工号");
			
			Cell cellqname = titleRow.createCell(2);
			cellqname.setCellValue("班组名称");
			
			Cell cellPname = titleRow.createCell(3);
			cellPname.setCellValue("姓名");
			
			Cell cellPsex = titleRow.createCell(4);
			cellPsex.setCellValue("性别");
			
			Cell cellPphone = titleRow.createCell(5);
			cellPphone.setCellValue("手机");
			
			Cell pbodystatus = titleRow.createCell(6);
			pbodystatus.setCellValue("身体状况");

			Cell pheight = titleRow.createCell(7);
			pheight.setCellValue("身高");
			
			Cell porigo = titleRow.createCell(8);
			porigo.setCellValue("籍贯");
			
			Cell pmaritalstatus = titleRow.createCell(9);
			pmaritalstatus.setCellValue("婚姻状况");
			
			Cell pbirthday = titleRow.createCell(10);
			pbirthday.setCellValue("出生日期");
			
			Cell peducation = titleRow.createCell(11);
			peducation.setCellValue("学历");
			
			Cell pidnumber = titleRow.createCell(12);
			pidnumber.setCellValue("身份证号");
			
			Cell paccountadd = titleRow.createCell(13);
			paccountadd.setCellValue("户口地址");
			
			Cell SchoolTag = titleRow.createCell(14);
			SchoolTag.setCellValue("毕业院校");
			
			for(int i=0;i<list.size();i++) {
				Row row = sheet.createRow(i+1);
				
				Cell id = row.createCell(0);
				id.setCellValue(list.get(i).getPid());
				
				
				Cell pjobid = row.createCell(1);
				pjobid.setCellValue(list.get(i).getPjobid());
				
				Cell qname = row.createCell(2);
				qname.setCellValue(list.get(i).getSect().getQname());
				
				Cell pname = row.createCell(3);
				pname.setCellValue(list.get(i).getPname());
				
				Cell psex = row.createCell(4);
				psex.setCellValue(list.get(i).getPsex());
				
				Cell pphone = row.createCell(5);
				pphone.setCellValue(list.get(i).getPphone());
				
				Cell pbodystatus1 = row.createCell(6);
				pbodystatus1.setCellValue(list.get(i).getPbodystatus());
				
				Cell pheight1 = row.createCell(7);
				pheight1.setCellValue(list.get(i).getPheight());
				
				Cell porigo1 = row.createCell(8);
				porigo1.setCellValue(list.get(i).getPorigo());
				
				Cell pmaritalstatus1 = row.createCell(9);
				pmaritalstatus1.setCellValue(list.get(i).getPmaritalstatus());
				
				Cell pbirthday1 = row.createCell(10);
				pbirthday1.setCellValue(list.get(i).getPbirthday());
				
				Cell peducation1 = row.createCell(11);
				peducation1.setCellValue(list.get(i).getPeducation());
				
				Cell pidnumber1 = row.createCell(12);
				pidnumber1.setCellValue(list.get(i).getPidnumber());
				
				Cell paccountadd1 = row.createCell(13);
				paccountadd1.setCellValue(list.get(i).getPaccountadd());
				
				Cell SchoolTag1 = row.createCell(14);
				SchoolTag1.setCellValue(list.get(i).getPschooltag());
			}
			
			HttpHeaders headers = new HttpHeaders();
			String excelName = new String("班组数据列表.xlsx".getBytes("utf-8"),"iso-8859-1");
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
