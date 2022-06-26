package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class User {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://retail.axisbank.co.in/");
		
	   
		driver.manage().window().maximize();
		
		
		WebElement textuser = driver.findElement(By.id("loginId"));
		
		textuser.sendKeys("balaaccu123@gmail.com");
		
		
		WebElement textpassword = driver.findElement(By.id("newPassword"));
		
		textpassword.sendKeys("Balu1234568#");
		
             WebElement loginbutton = driver.findElement(By.id("ABCustomLoginPortletFormSubmit"));
		
		      loginbutton.click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
