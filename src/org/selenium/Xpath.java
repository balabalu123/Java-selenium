package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.manage().window().maximize();
		
		
		WebElement textuser = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		
		textuser.sendKeys("balaacccu123@gmail.com");
		
		
		
		WebElement textpassword = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		
		textpassword.sendKeys("bala123456*#");
		
		
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		loginbutton.click();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
