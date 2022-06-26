package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay4Que2 {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html#trainer");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement trainer = driver.findElement(By.xpath("//span[text()='Trainer']"));
		
		trainer.click();
		
		Thread.sleep(5000);
		
		WebElement paratext = driver.findElement(By.xpath("//p[contains(text(),'currently')] "));
		
		String text = paratext.getText();
		
		System.out.println(text);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
