package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day7IEdriverinstallandnavigation {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.edge.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		//To launch the browser
				driver.get("https://www.facebook.com/");
				
				driver.manage().window().maximize();
				
				Thread.sleep(3000);
				
				//To get the Respective different url	
				
				driver.navigate().to("https://www.google.com/");
				
			
				
				
				Thread.sleep(3000);
				
				//to go back the first webpage
				
				driver.navigate().back();
				
				
			
				Thread.sleep(3000);
				
				//To again go back to the forward
				
				driver.navigate().forward();
				
				
			
				
				Thread.sleep(3000);
				
				//to refresh the page
				
				driver.navigate().refresh();
				
				
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
