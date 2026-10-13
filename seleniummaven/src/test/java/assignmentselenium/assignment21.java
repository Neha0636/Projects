package assignmentselenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.WebTesting.generic.ElementUtil;

public class assignment21 {
  @Test
  public void dynamicwebtable() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get(" https://testautomationpractice.blogspot.com/");
	  
	  WebElement tableHeading=driver.findElement(By.xpath("//h2[text()='Dynamic Web Table']"));
	   ElementUtil.scrolluptoElement(driver,tableHeading);
	  
	   //find total headings
		 List<WebElement> allheadings=driver.findElements(By.xpath("//table[@id='taskTable']//tr//th"));
		  
		 for(WebElement i:allheadings) {
			 System.out.println(i.getText());
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
		
		 System.out.println("----specific network speed row--------");
		 
		 List<WebElement> allRow1= driver.findElements(By.xpath("//table[@id='taskTable']//tr//td[1]"));
		 
		 String ExpectRowname1="Chrome";  //if want any changes then change only this data
		 int count1=0;
		 for(WebElement j:allRow1) {
			 count1++;
			 if(j.getText().contains(ExpectRowname1)) {
				 
				 //position of row
				 System.out.println("Expected row "+ExpectRowname1+" found at position: "+count1);
			 
				 //chrome network speed validation
				String expntwkspeed=driver.findElement(By.xpath("//strong[@class='chrome-network']")).getText();
				String actntwkspeed=driver.findElement(By.xpath("//table[@id='taskTable']//tbody//tr["+count1+"]//following-sibling::td[contains(text(),'Mbps')]")).getText();
				if(actntwkspeed.equals(expntwkspeed)) {
					System.out.println("expected network speed matched" +actntwkspeed);
				}
				
				else {
					System.out.println("expected network speed not matched!");
				}				
				
				
				
			 }
		 }
		 Thread.sleep(2000);	 
   System.out.println("----specific space  of Firefox row -------");
	 
   List<WebElement> allRow2= driver.findElements(By.xpath("//table[@id='taskTable']//tr//td[1]"));
	 
	 String ExpectRowname2="Firefox";  //if want any changes then change only this data
	 int count2=0;
	 for(WebElement k:allRow2) {
		 count2++;
		 if(k.getText().contains(ExpectRowname2)) {
			 
			 //position of row
			 System.out.println("Expected row "+ExpectRowname2+" found at position: "+count2);
		 
			 //firefox space validation
			String expspace=driver.findElement(By.xpath("//strong[@class='firefox-disk']")).getText();
			String actspace=driver.findElement(By.xpath("//table[@id='taskTable']//tbody//tr["+count2+"]//following-sibling::td[contains(text(),'MB/s')]")).getText();
			if(actspace.equals(expspace)) {
				System.out.println("expected space matched" +actspace);
			}
			
			else {
				System.out.println("expected space not matched!");
			}
			
	 }
	 
	 }
  
	 System.out.println("----specific memory size of Firefox row -------");
	 
	   List<WebElement> allRow3= driver.findElements(By.xpath("//table[@id='taskTable']//tr//td[1]"));
		 
		 String ExpectRowname3="Firefox";  //if want any changes then change only this data
		 int count3=0;
		 for(WebElement l:allRow3) {
			 count3++;
			 if(l.getText().contains(ExpectRowname3)) {
				 
				 //position of row
				 System.out.println("Expected row "+ExpectRowname3+" found at position: "+count3);
			 
				 //firefox memory size validation
				String expmemory=driver.findElement(By.xpath("//strong[@class='firefox-memory']")).getText();
				String actmemory=driver.findElement(By.xpath("//table[@id='taskTable']//tbody//tr["+count3+"]//following-sibling::td[contains(text(),'MB')]")).getText();
				if(actmemory.equals(expmemory)) {
					System.out.println("expected memory matched" +actmemory);
				}
				
				else {
					System.out.println("expected memory not matched!");
				}
				
		 }
		 
		 }
	  
  
  
  }  
  
  }
  
  
			
		 
	 
		 
	 
	 
  
  
		
		
		 	 		
  

  
