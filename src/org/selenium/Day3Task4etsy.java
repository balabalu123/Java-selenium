package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Task4etsy {

	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.etsy.com/signin");
		
		
		driver.manage().window().maximize();
		
		
		WebElement textuser = driver.findElement(By.id("join_neu_email_field"));
		
		textuser.sendKeys("suhailhameed123$@gmail.com");
		
		
		WebElement textpassword = driver.findElement(By.id("join_neu_password_field"));
		
		textpassword.sendKeys("Suhail123*3");
		
		
		WebElement signinbutton = driver.findElement(By.name("submit_attempt"));
		
		signinbutton.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
