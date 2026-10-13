package assignmentselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentdemo1 {

	public static void main(String[] args)throws InterruptedException {
		
		// to launch browser= create driver session with chrome	
		
		WebDriver driver = new ChromeDriver();	
			
		//open google application
		driver.get("https://www.selenium.dev/");
		
		   
		 //get page title
			System.out.println("title is: "+driver.getTitle());
			
			//current page URL
			System.out.println("current url is: "+driver.getCurrentUrl());
			
			//maximize browser window
			driver.manage().window().maximize();
			
			   //validate title contain selenium
	  
				String actTitle=driver.getTitle();
				if(actTitle.equals("Selenium"))
				{
					System.out.println("Title Match....Test Pass");
				}else
				{
					System.out.println("Title not match....Test Fail");
				}
	
			 
				Thread.sleep(2000);
				
				//to refresh
			driver.navigate().refresh(); 
		
				Thread.sleep(2000);
			  driver.quit(); 
	}

}
