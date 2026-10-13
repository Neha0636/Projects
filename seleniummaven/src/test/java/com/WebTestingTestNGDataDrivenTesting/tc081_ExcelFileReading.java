package com.WebTestingTestNGDataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class tc081_ExcelFileReading {
  @Test
  public void testfileread() throws IOException {
	  //file path
	  File f1=new File(System.getProperty("user.dir")+"//TestData//DataFile.xlsx");
	  
	  //file stream
	  FileInputStream fs=new FileInputStream(f1);
	  
	  //wb-->sheet-->row-->cell--->value
	  XSSFWorkbook wb=new XSSFWorkbook(fs);
	  
	  //no. of row
	int rows= wb.getSheet("LoginData").getPhysicalNumberOfRows();
	  
	  System.out.println("Total Rows: "+rows);    //5
	  
	 //no. of column 
	  
	 int cells= wb.getSheet("LoginData").getRow(0).getPhysicalNumberOfCells();
	 System.out.println("Total Column: "+cells);   //2
	  
	 //design array of same size like file data
	 // Object arr[][]=new Object[rows][cells];   //if we want to print data included heading than use this line unless 36 line
	 
	 //to skip heading size should be rows-1
	 Object arr[][]=new Object[rows-1][cells];
	 
	 
	 //read data from file and store it  inside file
	 for( int i=1;i<rows;i++)      //change 0 to 1 to print only data not heading	 
		 
		 for(int j=0;j<cells;j++)  //column
		 {
			 arr[i-1][j]=wb.getSheet("LoginData").getRow(i).getCell(j).getStringCellValue();   //change i to i-1 to print only data not heading
			 System.out.print(arr[i-1][j]+"    ");
		 }
		 
		 System.out.println();
	 }
	 
	 
	 
	  
	  
	  
  }

