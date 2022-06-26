package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicExplicitWebdriverWait {

	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				
				
				driver.manage().window().maximize();
				
				
				 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
				 
				 
				 
				 WebDriverWait w = new WebDriverWait(driver,10);
				
				 
				 w.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname"))).sendKeys("bala"
						 );
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
