package org.seliniumwebsitetasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay2Que5 {

	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
      WebElement frameset = driver.findElement(By.name("login_page"));
		
		
		driver.switchTo().frame(frameset);
		
		
		WebElement customerid = driver.findElement(By.name("fldLoginUserId"));
		 
		customerid.sendKeys("985426HH12",Keys.ENTER);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
