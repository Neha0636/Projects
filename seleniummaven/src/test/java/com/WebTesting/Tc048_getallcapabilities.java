package com.WebTesting;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tc048_getallcapabilities {
  @Test
  public void getallcapabilities() {
	  //for chrome properties
	  ChromeDriver driver=new ChromeDriver();
	  
	  Capabilities cap=driver.getCapabilities();  //capabilities is interface so we use capabilities cap
	  
	  System.out.println(cap.getBrowserName());
	  System.out.println(cap.getBrowserVersion());
	  
	  System.out.println(cap.getPlatformName());
	  
	  //find all supported properties ===asmap()
	  
	  Map<String,Object> allprop=cap.asMap();
	  System.out.println(allprop);
  }
}

