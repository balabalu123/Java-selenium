package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay4Que10 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/ ");
		
		
		driver.manage().window().maximize();
		
		
		
		
		     Thread.sleep(3000);
		
		     WebElement producttype = driver.findElement(By.xpath("//input[contains(@title,'Search for products, brands and more')]"));
		
		     producttype.sendKeys("mobiles");
		
		   
		     
		     
		     Thread.sleep(3000);
				
		     WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
		
		     search.click();
		
		   

		     Thread.sleep(3000);
		
			
			WebElement firstproductclick = driver.findElement(By.xpath("(//img[contains(@class,'_396cs4 _3exPp9')])[1]"));
			
			firstproductclick.click();
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
