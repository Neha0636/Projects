package com.WebTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.WebTesting.generic.ElementUtil;

public class Tc023_selectBasedDropdown_RediffMail {
  @Test
  public void f() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	//IN THIS WE ARE USING ELEMENTUTIL ..so no need to write code for everytime only select elementutil
	  
     //day dropdown
	 WebElement daydd= driver.findElement(By.className("day"));
	ElementUtil.selectBasedDropdown(daydd,"24" );
	 
	 //month  dropdown
	 WebElement monthdd= driver.findElement(By.className("middle"));
	 ElementUtil.selectBasedDropdown(monthdd,"NOV" );
	 
	 //year dropdown
	 WebElement yeardd= driver.findElement(By.className("year"));
	 ElementUtil.selectBasedDropdown(yeardd,"2010" );
	 
	 
	/*  Select sc = new Select(daydd);
	  System.out.println("is dropdown contain multiple option:" +sc.isMultiple());
	  
	  List<WebElement> allOptions = sc.getOptions();
	  System.out.println("total options are:" +allOptions.size());
	  
	  for(WebElement i:allOptions) {
		  
		  System.out.println(i.getText());
		  if(i.getText().contains("27")) {
			  
			  i.click();
			  break;
			  
			  
		  }
	  }*/
	  
	  
	  
	  
  }
}
