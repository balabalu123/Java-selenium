package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsitetaskDay4Que7 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com/\r\n" + 
				"");
		
		
		driver.manage().window().maximize();
		
		
		   Thread.sleep(3000);
			
			WebElement type = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
			
			type.sendKeys("greens velmurugan");
		
		
		
			Thread.sleep(3000);
		
			
			WebElement search = driver.findElement(By.xpath("(//input[contains(@value,'Google Search')])[1]"));
			
			search.click();
			
			
			
			Thread.sleep(3000);
		
		  WebElement Clickfirstlink = driver.findElement(By.xpath("//h3[text()='Velmurugan K - Technical Manager - GTL Limited | LinkedIn']"));
		
		   Clickfirstlink.click();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
