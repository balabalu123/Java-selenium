package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay3Que5 {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement interviewquestions = driver.findElement(By.xpath("//h2[contains(text(),'Interview Questions')] "));		
		
		interviewquestions.click();
		
		Thread.sleep(5000);
		
		WebElement ctsintquestions = driver.findElement(By.xpath("//a[contains(text(),'CTS Interview Question')] "));
		
		
		ctsintquestions.click();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
