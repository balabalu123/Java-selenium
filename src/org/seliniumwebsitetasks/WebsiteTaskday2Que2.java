package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskday2Que2 {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.redbus.in/");
		
		
		WebElement textboarding = driver.findElement(By.id("src"));
		
		textboarding.sendKeys("Chennai");
		
		
		WebElement textdestination = driver.findElement(By.id("dest"));
		
		textdestination.sendKeys("Tirunelveli");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
