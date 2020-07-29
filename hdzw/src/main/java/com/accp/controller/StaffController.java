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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Dimission;
import com.accp.domain.Staff;
import com.accp.service.StaffService;

@Controller
@RequestMapping("/staff")
public class StaffController {
	@Autowired
	StaffService ser;
	
	@RequestMapping("/find")
	@ResponseBody
	public List<Staff> find(){
		return ser.find();
	}
	@RequestMapping("/findAndsection")
	@ResponseBody
	public List<Staff> findAndsection(){
		return ser.findAndsection();
	}
	@RequestMapping("/findOne")
	@ResponseBody
	public List<Staff> findOne(@RequestBody Integer[] ids){
		return ser.findOne(ids);
	}
	@RequestMapping("/insertstaff")
	@ResponseBody
	public String insertstaff(@RequestBody Staff staff) {
		int ret = ser.insertstaff(staff);
		if(ret>0) {
			return "000";
		}
		return "111";
	}
	@RequestMapping("/delstaff")
	@ResponseBody
	public String delstaff(Integer id) {
		int ret =ser.delstaff(id);
		if(ret>0) {
			return "000";
		}
		return "111";
	}
	@RequestMapping("/updatestaff")
	@ResponseBody
	public String updatestaff(@RequestBody Staff staff) {
		int ret = ser.updatestaff(staff);
		if(ret>0) {
			return "000";
		}
		else {
			return "111";
		}
	}
	@RequestMapping("/exportExcel")
	@ResponseBody
    public ResponseEntity<byte []> exportExcel(){
    	try {
			List<Staff> list=ser.findAndsection();
			//创建excel
			XSSFWorkbook xss=new XSSFWorkbook();
			//创建seet页
			Sheet sheet= xss.createSheet();
			Row titleRow=sheet.createRow(0);
			Cell cellbjg=titleRow.createCell(0);
			cellbjg.setCellValue("机构");
			Cell sellId=titleRow.createCell(1);
			sellId.setCellValue("部门代码");
			Cell cellgid=titleRow.createCell(2);
			cellgid.setCellValue("工号");
			Cell cellname=titleRow.createCell(3);
			cellname.setCellValue("姓名");
			Cell cellsex=titleRow.createCell(4);
			cellsex.setCellValue("性别");
			Cell cellgname=titleRow.createCell(5);
			cellgname.setCellValue("岗位名称");
			Cell cellstzk=titleRow.createCell(6);
			cellstzk.setCellValue("身体状况");
			Cell cellheight=titleRow.createCell(7);
			cellheight.setCellValue("身高");
			Cell celljg=titleRow.createCell(8);
			celljg.setCellValue("籍贯");
			/*Cell celllzdata=titleRow.createCell(5);
			celllzdata.setCellValue("离职日期");
			Cell celllzyy=titleRow.createCell(6);
			celllzyy.setCellValue("离职原因");*/
			
			for (int i = 0; i < list.size(); i++) {
				Row row=sheet.createRow(i+1);
				Cell qbname=row.createCell(0);
				qbname.setCellValue("成高");
				Cell bmid=row.createCell(1);
				bmid.setCellValue(list.get(i).getSection().getQid());
				Cell pName=row.createCell(2);
				pName.setCellValue(list.get(i).getSection().getBmname());
				Cell pjobid=row.createCell(3);
				pjobid.setCellValue(list.get(i).getPjobid());
				Cell yname=row.createCell(4);
				yname.setCellValue(list.get(i).getPname());
				Cell sex=row.createCell(5);
				sex.setCellValue(list.get(i).getPsex());
				Cell zw=row.createCell(6);
				zw.setCellValue(list.get(i).getGpost().getApgname());
				Cell zk=row.createCell(7);
				zk.setCellValue(list.get(i).getPbodystatus());
				Cell height=row.createCell(8);
				height.setCellValue(list.get(i).getPheight());
				Cell jg=row.createCell(9);
				jg.setCellValue(list.get(i).getPorigo());
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
