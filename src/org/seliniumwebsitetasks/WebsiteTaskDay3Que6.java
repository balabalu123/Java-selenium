 package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay3Que6 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement arrow = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		
		arrow.click();
		
		Thread.sleep(3000);
		
		WebElement signin = driver.findElement(By.xpath("//li[@id='signInLink']"));
		
		signin.click();
		
		Thread.sleep(3000);
		
		
		WebElement frameset = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		
		
		
		driver.switchTo().frame(frameset);
		
		Thread.sleep(3000);
		
		WebElement mobile = driver.findElement(By.id("mobileNoInp"));
		
		
		mobile.sendKeys("9710685287");		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
