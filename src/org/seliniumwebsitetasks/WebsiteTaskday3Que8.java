package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskday3Que8 {

	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement modelresume = driver.findElement(By.id("heading201"));
		
		modelresume.click();
		
		

		Thread.sleep(3000);
		
		WebElement ResumeModel1 = driver.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[1]"));
		
		ResumeModel1.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
