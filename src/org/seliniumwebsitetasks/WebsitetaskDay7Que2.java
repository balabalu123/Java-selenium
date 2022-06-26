package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsitetaskDay7Que2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://toolsqa.com/ ");
			
			driver.manage().window().maximize();
			
			Thread.sleep(3000);
			
		JavascriptExecutor jav = (JavascriptExecutor)driver;
		
		WebElement recentarticles = driver.findElement(By.xpath("//a[text()='Latest Articles']"));  
		
		jav.executeScript("arguments[0].scrollIntoView(true);", recentarticles);
		     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
