package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay4Que8 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		
		driver.manage().window().maximize();
		
		

        Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'username')]"));
		
		email.sendKeys("balaaccudr@gmail.com");
		
		String attribute = email.getAttribute("value");
		
		System.out.println(attribute);
		
		
		
		
		 Thread.sleep(3000);
			
			WebElement password = driver.findElement(By.xpath("//input[contains(@id,'password')]"));
			
			password.sendKeys("balagood123456");
			
			String attribute2 = password.getAttribute("value");
		
			System.out.println(attribute2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
