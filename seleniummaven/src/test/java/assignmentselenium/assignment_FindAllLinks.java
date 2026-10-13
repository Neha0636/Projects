package assignmentselenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment_FindAllLinks {

	public static void main(String[] args) {
		//create driver session
				WebDriver driver = new ChromeDriver();
				
		        //implicit time
				
		      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
		       driver.get(" https://www.naukri.com/");

		         //get all link text in console

		      List<WebElement>allLinks= driver.findElements(By.cssSelector("div.nI-gNb-log-reg>a"));
		         System.out.println("number of all links:" +allLinks.size());

		         for( WebElement i: allLinks)
		         {
		        	 //tp print text in console
		        	System.out.println(i.getText()); 	
		        	//to print link in console
		        	System.out.println(i.getDomAttribute("href")); 		 
		         }

		         
		        
		        
		        


	}

}
