package org.seliniumwebsitetasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay8Que6 {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://retail.onlinesbi.com/retail/login.htm\r\n" + 
						"");
				
				
				driver.manage().window().maximize();
				
				
				Thread.sleep(3000);
		
				WebElement continuelogin = driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]"));
	
	
				continuelogin.click();
				Thread.sleep(3000);
				
				WebElement loginbutton = driver.findElement(By.id("Button2"));
	
		
				loginbutton.click();
	
				Thread.sleep(3000);
	
				Alert okbutton = driver.switchTo().alert();
	
	
	
				okbutton.accept();
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
}
