package com.WebTestingTestNGDataReading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Tc078_FileReadingExcel {
  @Test
  public void fileread() throws IOException {
	  
	  //give the file path
	  File f1=new File(System.getProperty("user.dir")+"//TestData//DataFile.xlsx");
	  
	  // to read file in stream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //format based class:workbook
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	 
	  //read single entry from excel file
	String toolName=wb.getSheet("BookData").getRow(3).getCell(1).getStringCellValue();
	
	System.out.println(toolName);
	
	double priceData=wb.getSheet("BookData").getRow(2).getCell(2).getNumericCellValue();
	System.out.println((int)priceData);                 // to get data in int format
	
	  
	  /*
	  //wb--> sheet
	XSSFSheet sheet1=wb.getSheet("BookData");
	  
	  //sheet-->row
	XSSFRow expRow=sheet1.getRow(3);
	  
	  //row--->cell
	XSSFCell expCell=expRow.getCell(1);
	  
	  //cell-->read data
	String toolName=expCell.getStringCellValue();
	 
	 System.out.println(toolName); 
	 
	*/
	 
	 
	 
	 
	 
	 
	  
	  
  }
}
