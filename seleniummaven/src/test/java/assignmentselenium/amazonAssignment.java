package assignmentselenium;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class amazonAssignment {
	
	 WebDriver driver;
	
  @Parameters({"browser"})
  @Test
  public void getProduct(String browserName) throws InterruptedException, MalformedURLException {
	  
	 
	  if(browserName.equalsIgnoreCase("chrome")) {
		  ChromeOptions opt=new ChromeOptions();
		  opt.addArguments("--disable-dev-shm-usage");
		  opt.addArguments("--no-sandbox");
		  driver=new RemoteWebDriver(java.net.URI.create("http://localhost:4444").toURL(), opt);
		  
		  }
	  else if(browserName.equalsIgnoreCase("firefox")) {
		  FirefoxOptions opt=new FirefoxOptions();
		  opt.addArguments("--disable-dev-shm-usage");
		  opt.addArguments("--no-sandbox");
		  driver=new RemoteWebDriver(java.net.URI.create("http://localhost:4444").toURL(), opt);
		  
		  }
	  else if(browserName.equalsIgnoreCase("edge")) {
		  EdgeOptions opt=new EdgeOptions();
		  opt.addArguments("--disable-dev-shm-usage");
		  opt.addArguments("--no-sandbox");
		  driver=new RemoteWebDriver(java.net.URI.create("http://localhost:4444").toURL(), opt);
		  
		  }
	  
	  
	   //connect to docker selenium grid hub
	  // driver=new RemoteWebDriver(java.net.URI.create("http://localhost:4444").toURL(), opt);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");


		WebElement searchBoxEle=driver.findElement(By.id("twotabsearchtextbox"));
		searchBoxEle.sendKeys("laptop");
		
		WebElement enterEle=driver.findElement(By.id("nav-search-submit-button"));
		enterEle.click();
		
		System.out.println("laptop option selected successfully!");
		
		if(driver !=null) {
			driver.quit();
		}
  }
  
}
