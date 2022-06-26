package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContainsusingAttributes {

	
	public static void main(String[] args) {
		
		
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.manage().window().maximize();
		
		
		WebElement textuser = driver.findElement(By.xpath("//input[contains(@data-testid,'royal_email')]"));
		
		textuser.sendKeys("baluacu123*@gmail.com");
		
		String attribute = textuser.getAttribute("value");
		
		System.out.println(attribute);
		
		
		
		String attribute2 = textuser.getAttribute("data-testid");
		
		System.out.println(attribute2);
		
		
		WebElement textpass = driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		
	textpass.sendKeys("Balu123456#4");
		
		
		String attribute3 = textpass.getAttribute("value");
		
		System.out.println(attribute3);
		
		String attribute4 = textpass.getAttribute("placeholder");
		
		System.out.println(attribute4);
		
		
		
		WebElement loginButton = driver.findElement(By.xpath("//button[contains(@type,'submit')]"));
		
		loginButton.click();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
