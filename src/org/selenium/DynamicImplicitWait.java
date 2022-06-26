package org.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicImplicitWait {

	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.manage().window().maximize();
		
		
		 driver.findElement(By.xpath("//a[text()='Create New Account']")).click();;
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 
		driver.findElement(By.name("firstname")).sendKeys("Bala");
		
		
		driver.findElement(By.name("lastname")).sendKeys("subramaniyam");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
