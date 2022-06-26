package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtask2 {

	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://sellercentral.amazon.in/gp/homepage.html");
		
		
		driver.manage().window().maximize();
		
		WebElement textuser = driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-autofocus auth-required-field']"));
		
		textuser.sendKeys("suhail123@3$2@gmail.com");
		
	
WebElement textpassword = driver.findElement(By.xpath("//input[@class='a-input-text a-span12 auth-required-field']"));
		
		textpassword.sendKeys("bala123456*#");
		
		
		
		WebElement loginbutton = driver.findElement(By.xpath("//input[@class='a-button-input']"));
		
		loginbutton.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
