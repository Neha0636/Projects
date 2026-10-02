package com.BlazeDemo.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class CustomData {
	

public XSSFWorkbook wb;

@DataProvider(name="excelData")
public Object[][] gettestData()
{
	//file path
	  File f1=new File(System.getProperty("user.dir")+"//TestData//excel.xlsx");
	  
	  //FileStream
	  FileInputStream fs;
	  Object arr[][]=null;
	try {
		fs = new FileInputStream(f1);
		//Wb->sheet-->row-->cell-->value
		   wb=new XSSFWorkbook(fs);
		  
		   //number of rows
			  int rows=wb.getSheet("Sheet1").getPhysicalNumberOfRows();
			  System.out.println("Total rows: "+rows);
			  
			  //number of columns
			  int cells=wb.getSheet("Sheet1").getRow(0).getPhysicalNumberOfCells();
			  System.out.println("Total Columns: "+cells);
			  
		  
		  //design array of same size like file data
		   arr=new Object[rows-1][cells];//skip heading size should be rows-columns
		  
		  //read data from file and store it inside file
		  for(int i=1;i<rows;i++)//rows
		  {
			  for(int j=0;j<cells;j++)//column
			  {
				  //array should start from 0
				  DataFormatter formatter=new DataFormatter();
				  arr[i-1][j]=formatter.formatCellValue(wb.getSheet("Sheet1").getRow(i).getCell(j));
				  
			  }
		
			  
		  }
		  
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
	  return arr;
}

@DataProvider(name="BlazeData")
public Object[][] testData() {
	
	Object data[][]= {{"priya","sanjay place","agra","UP","282001","Visa"," ","11","2017","pooja sharma"}};
	return data;
	
	
}
@DataProvider(name="BlazedemoData")
public Object[][] testData2() {
	
	Object data[][]= {{"kishan","st johns","surat","Gujarat","282871","Visa"," 235432dte","11","2017","kishan sharma"}};
	return data;
	
	
}

}


