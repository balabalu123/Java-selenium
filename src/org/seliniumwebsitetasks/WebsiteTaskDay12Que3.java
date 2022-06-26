package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay12Que3 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html ");
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
			
		WebElement scrolldown = driver.findElement(By.xpath("//h2[contains(text(),'Python')] "));
		
		
        JavascriptExecutor jav = (JavascriptExecutor) driver;
		
		jav.executeScript("arguments[0].scrollIntoView(true)",scrolldown);
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
