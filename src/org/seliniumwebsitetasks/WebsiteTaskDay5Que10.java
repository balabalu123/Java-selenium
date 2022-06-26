package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebsiteTaskDay5Que10 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		
		driver.manage().window().maximize();
		
		
       Thread.sleep(3000);
		
		WebElement coursemouseover = driver.findElement(By.xpath("//div[@class='header-browse-greens']"));
		
		
		Actions act = new Actions(driver);
		
		
		act.moveToElement(coursemouseover).perform();
		
		Thread.sleep(3000);
		
		WebElement datawaremouseover = driver.findElement(By.xpath("//span[text()='Data Warehousing (5)']"));
		
	    act.moveToElement(datawaremouseover).perform();	
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
