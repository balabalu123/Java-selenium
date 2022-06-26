package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesworkout {
	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.manage().window().maximize();
		
		
		WebElement frameset = driver.findElement(By.name("login_page"));
		
		
		driver.switchTo().frame(frameset);
		
		
		List<WebElement> numberofframes = driver.findElements(By.tagName("frame"));
		
		int size = numberofframes.size();
		
		System.out.println(size);
		
		WebElement customerid = driver.findElement(By.name("fldLoginUserId"));
		 
		customerid.sendKeys("985426HH12",Keys.ENTER);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
