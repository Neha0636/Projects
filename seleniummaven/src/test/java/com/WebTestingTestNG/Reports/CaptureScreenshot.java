package com.WebTestingTestNG.Reports;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class CaptureScreenshot {
  @Test
public void takeScreenshot() throws IOException {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?");
	  
	  
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  File temp=ts.getScreenshotAs(OutputType.FILE);
	  File dest=new File(System.getProperty("user.dir")+"//ScreenshotsFolder//FirstPic.png");
	  
	  FileHandler.copy(temp,dest);
	  
	  
	  
	  
  }
}