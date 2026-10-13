package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.generic.ElementUtil;

public class Tc046_dynamicWebTable {
  @Test
  public void testDynamicWebtable() {
	  
 WebDriver driver=new ChromeDriver();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  WebElement tableHeading=driver.findElement(By.xpath("//h2[text()='Dynamic Web Table']"));
	  ElementUtil.scrolluptoElement(driver,tableHeading);
	  
	  //find total headings
	 List<WebElement> allheadings=driver.findElements(By.xpath("//table[@id='taskTable']//tr//th"));
	  
	 for(WebElement i:allheadings) {
		 System.out.println(i.getText());
	 }
	 
	 System.out.println("------specific column--------");
	 
	 String ExpectHeading="CPU";  //if want any changes then change only this data
	 int count=0;
	 for(WebElement i:allheadings) {
		 count++;
		 if(i.getText().contains(ExpectHeading)) {
			 
			 //position of column
			 System.out.println("Expected heading  "+ExpectHeading+" found at position: "+count  );
		 
		 //based on position we can get the column
		 List<WebElement> celldata=driver.findElements(By.xpath("//table[@id='taskTable']//tr//td["+count+"]"));
		 
		 for(WebElement j:celldata) {
			 System.out.println(j.getText());
		 }
		 
		 }
	 }
	 
	 System.out.println("----specific row--------");
	 
	 List<WebElement> allRows= driver.findElements(By.xpath("//table[@id='taskTable']//tr//td[1]"));
	 
	 String ExpectRow="Chrome";  //if want any changes then change only this data
	 int rowcount=0;
	 for(WebElement i:allRows) {
		 rowcount++;
		 if(i.getText().contains(ExpectRow)) {
			 
			 //position of row
			 System.out.println("Expected row "+ExpectRow+" found at position: "+rowcount);
		 
		 }
	 }
	 
	 
System.out.println("----specific load row--------");
	 
	 List<WebElement> allRow= driver.findElements(By.xpath("//table[@id='taskTable']//tr//td[1]"));
	 
	 String ExpectRowname="Chrome";  //if want any changes then change only this data
	 int rcount=0;
	 for(WebElement i:allRow) {
		 rcount++;
		 if(i.getText().contains(ExpectRowname)) {
			 
			 //position of row
			 System.out.println("Expected row "+ExpectRowname+" found at position: "+rcount);
		 
			 //cpu load validation
			String expcpuload=driver.findElement(By.xpath("//strong[@class='chrome-cpu']")).getText();
			String actcpuload=driver.findElement(By.xpath("//table[@id='taskTable']//tbody//tr["+rcount+"]//following-sibling::td[contains(text(),'%')]")).getText();
			if(actcpuload.equals(expcpuload)) {
				System.out.println("expected cpu load matched" +actcpuload);
			}
			
			else {
				System.out.println("expected cpu load not matched!");
			}
			
			
			
			
			
		 }
	 }
	 
	 
	 
	 
	 
	 
	  
	  
	  
  }
}















