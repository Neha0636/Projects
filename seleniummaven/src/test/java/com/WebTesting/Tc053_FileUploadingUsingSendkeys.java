package com.WebTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc053_FileUploadingUsingSendkeys {
  @Test
  public void testfileuploading() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //while doing file upload ,on inspecting if type=file,then use directly sendkeys method to upload file
	   driver.findElement(By.id("file-upload")).sendKeys("C://Users//DELL//Downloads//sql assignments.pdf");
	                                                        //convert backward slash into forward slash
	  //upload
	   driver.findElement(By.id("file-submit")).click();
	  
	   //get uploaded text
	  String text=driver.findElement(By.tagName("h3")).getText();
	  System.out.println(text);
  }
}
