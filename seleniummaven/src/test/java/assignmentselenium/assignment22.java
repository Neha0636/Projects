package assignmentselenium;

import java.util.Map;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class assignment22 {
  @Test
  public void edgecapabilities() {
	  //for edge properties
	  EdgeDriver driver=new EdgeDriver();
	  
	  Capabilities cap=driver.getCapabilities();  //capabilities is interface so we use capabilities cap
	  
	  System.out.println(cap.getBrowserName());
	  System.out.println(cap.getBrowserVersion());
	  
	  System.out.println(cap.getPlatformName());
	  
	  //find all supported properties ===asmap()
	  
	  Map<String,Object> allprop=cap.asMap();
	  System.out.println(allprop);
  }

  @Test
  public void firefoxcapabilities() {
	  //for edge properties
	  FirefoxDriver driver=new FirefoxDriver();
	  
	  Capabilities cap=driver.getCapabilities();  //capabilities is interface so we use capabilities cap
	  
	  System.out.println(cap.getBrowserName());
	  System.out.println(cap.getBrowserVersion());
	  
	  System.out.println(cap.getPlatformName());
	  
	  //find all supported properties ===asmap()
	  
	  Map<String,Object> allprop=cap.asMap();
	  System.out.println(allprop);
  }

  
  
}	  
	  
	  
	  
	  
	  
  

