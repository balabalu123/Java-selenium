package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask4 {

	
	
	
	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://auth.alipay.com/login/global.htm");
		
		
		driver.manage().window().maximize();
		
		
WebElement textuser = driver.findElement(By.xpath("//input[@placeholder='Enter email']"));
		
		textuser.sendKeys("Hameed123@3$2@gmail.com");
		
		
WebElement textpassword = driver.findElement(By.xpath("//input[@class='ui-input i-text']"));
		
		textpassword.sendKeys("Hamusuhu1123456#2");
		
		
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@value='Sign In']"));
		
		
		loginbutton.click();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
