package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Task5 {

	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://sellercentral.amazon.in/gp/homepage.html");
		
		
		driver.manage().window().maximize();
		
		
		WebElement textusername = driver.findElement(By.id("ap_email"));
		
		textusername.sendKeys("roshan1238@gmail.com");
		
		
		WebElement textpassword = driver.findElement(By.id("ap_password"));
		
		textpassword.sendKeys("roshan123$123");
		
		WebElement signinbutton = driver.findElement(By.id("signInSubmit"));
		
		signinbutton.click();
		
	}
	
	
	
	
	

	
}
