package assignmentselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentNavigation {

	public static void main(String[] args)  throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		//open application
	  driver.get("https://www.demoblaze.com");
		
		//navigation in the session to demoqa
		driver.navigate().to("https://demoqa.com/");
		
		//get title demoqa
		System.out.println("title is: "+driver.getTitle());
		
		//navigation in the session to automationexercise
		driver.navigate().to("https://automationexercise.com/");
				
		
		//for static wait    
		Thread.sleep(1000);  // no method  for wait in selenium so use java method

		// for back
		driver.navigate().back();  // reaches to demoqa
		
		Thread.sleep(1000); 
	
		//current page URL===demoqa
		System.out.println("current url is: "+driver.getCurrentUrl());
		
		Thread.sleep(1000); 
		
		// for forward
		driver.navigate().forward(); 
	
		Thread.sleep(2000); 
		
		//current page URL===automationexercise
		System.out.println("current url is: "+driver.getCurrentUrl());
				
		Thread.sleep(2000); 
		//to refresh
		driver.navigate().refresh(); 
		
		Thread.sleep(2000); 
		
		 //get page title
		System.out.println("title is: "+driver.getTitle());
		
	
        driver.quit();


			
		

	}

}
