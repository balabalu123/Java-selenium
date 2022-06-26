package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTask3 {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.etsy.com/signin");
		
		
		driver.manage().window().maximize();
		
		
WebElement textuser = driver.findElement(By.xpath("//input[@id='join_neu_email_field']"));
		
		textuser.sendKeys("suhail123@3$2@gmail.com");
		
		
		WebElement textpassword = driver.findElement(By.xpath("//input[@id='join_neu_password_field']"));
		
		textpassword.sendKeys("Hameed1123456#2");
		
WebElement loginbutton = driver.findElement(By.xpath("//button[@name='submit_attempt']"));		

		
		loginbutton.click();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
