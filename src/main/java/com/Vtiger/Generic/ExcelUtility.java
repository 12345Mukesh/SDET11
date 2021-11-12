package com.Vtiger.Generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility
{

	public String readDatafromExcel (String path,int row,int cell,String sheetname) throws Throwable
	{
		FileInputStream fis = new FileInputStream(path);

		Workbook wb=WorkbookFactory.create(fis);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
		return  data;
	}


	public void WriteExcelData(String path, String sheetName, int row, int cell,String data) throws Throwable
	{
		FileInputStream fs= new FileInputStream(path);
		Workbook wb= WorkbookFactory.create(fs);
		wb.getSheet(sheetName).getRow(row).createCell(cell).setCellValue(data);
		
		FileOutputStream fos= new FileOutputStream(path);
		wb.write(fos);
		
	}	






}
	
	
