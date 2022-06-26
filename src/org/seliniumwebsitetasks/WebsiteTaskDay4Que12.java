package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay4Que12 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html \r\n" + 
				" ");
		
		
		driver.manage().window().maximize();
		
		
		
		
		     Thread.sleep(3000);
		
		     WebElement producttype = driver.findElement(By.xpath("//input[contains(@id,'autocomplete')]"));
		
		     producttype.sendKeys("mobiles");
		
		   
		     
		     
		     Thread.sleep(3000);
				
		     WebElement search = driver.findElement(By.xpath("//a[contains(@class,'srch_action btn orange')]"));
		
		     search.click();
		
		  	Thread.sleep(3000);
			
				
				WebElement firstproductclick = driver.findElement(By.xpath("(//img[contains(@onclick,'homePageTracking(this);')])[1]"));
				
				firstproductclick.click();
				
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
