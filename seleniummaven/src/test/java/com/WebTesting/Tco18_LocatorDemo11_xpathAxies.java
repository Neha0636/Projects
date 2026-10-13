package com.WebTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tco18_LocatorDemo11_xpathAxies {

	public static void main(String[] args) {

		//create driver session
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=test1232&submit-name=");
					
     //find parent tag for john element
		
		 String parentTagName= driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		System.out.println("parent tag name  for john is: " +parentTagName  );
		
		 // find ancestor tagname for john
		
		String ancestorTagName= driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
		System.out.println("ancestor tag name  for john is: " +ancestorTagName  );
		
		// find all childs from row 4 and print text in console
		 List<WebElement> allChilds=   driver.findElements(By.xpath("//tbody/tr[4]//child::td"));
		 System.out.println("total childs in row 4: " +allChilds.size());
		 
		 for(WebElement i:allChilds) {
			 System.out.println(i.getText());  //it print only 4 child because 5 child is image
			 
		 }
		 //find all the rows after john element
		 List<WebElement> allrows=  driver.findElements(By.xpath("//td[text()='John']//following::tr"));
		 System.out.println("total rows after john : " +allrows.size());
		   //or second method
		//int rows= driver.findElements(By.xpath("//td[text()='John']//following::tr")).size();
		//System.out.println("total rows after john : " +rows);
		  
		 //find all the rows before john element
		int rows2= driver.findElements(By.xpath("//td[text()='John']//preceding::tr")).size();
			System.out.println("total rows before john : " +rows2);
			  
		//find siblings after john element
			int siblings= driver.findElements(By.xpath("//td[text()='John']//following-sibling::td")).size();
			System.out.println("all siblings of john : " +siblings);
		
			//find all before sibling of ashley
			int siblingashley= driver.findElements(By.xpath("//td[text()='Ashley']//preceding-sibling::td")).size();
			System.out.println("all siblings before ashley : " +siblingashley);
			
			
			
			
			
	}

}
