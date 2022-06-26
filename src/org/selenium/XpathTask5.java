package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask5 {

	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://retail.axisbank.co.in/");
		
		
		driver.manage().window().maximize();
		
		
WebElement textuser = driver.findElement(By.xpath("//input[@placeholder='Login ID']"));
		
		textuser.sendKeys("Hameedshu123@3$2@gmail.com");
		
		
WebElement textpassword = driver.findElement(By.xpath("//input[@id='newPassword']"));
		
		textpassword.sendKeys("shushuuhu1123456#2");
		
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@onclick='return validatenewPassword()']"));
		
		
		loginbutton.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
