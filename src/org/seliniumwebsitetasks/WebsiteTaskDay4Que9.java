package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay4Que9 {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/ ");
		
		
		driver.manage().window().maximize();
		
		
		
		
		     Thread.sleep(3000);
		
		     WebElement producttype = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		
		     producttype.sendKeys("jeans pant");
		
		   
		     
		     
		     Thread.sleep(3000);
				
		     WebElement search = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
		
		     search.click();
		
		   

		     Thread.sleep(3000);
				
		     WebElement enterpincode = driver.findElement(By.xpath("//input[@placeholder='Enter your pincode']"));
	
		     enterpincode.sendKeys("600021");
		
		     
		     
		     WebElement check = driver.findElement(By.xpath("//button[contains(@class,'pincode-check')]"));
		     
		     check.click();
		     
		     
		
			Thread.sleep(5000);
		
			
			WebElement firstproductclick = driver.findElement(By.xpath("//span[contains(@id,'display-price-662135759177')]"));
			
			firstproductclick.click();
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
