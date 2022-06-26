package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskday4Que6 {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.facebook.com/ \r\n" + 
				"");
		
		
		driver.manage().window().maximize();
		
		
		
        Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		
		email.sendKeys("balaaccudr@gmail.com");
		
		String attribute = email.getAttribute("value");
		
		System.out.println(attribute);
		

        Thread.sleep(3000);
		
		WebElement pass = driver.findElement(By.xpath("//input[contains(@type,'password')]"));
		
	    pass.sendKeys("bala123456");
		
		String attribute2 = pass.getAttribute("value");
		
		System.out.println(attribute2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
