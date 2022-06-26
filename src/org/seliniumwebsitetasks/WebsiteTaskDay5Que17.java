package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebsiteTaskDay5Que17 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.flipkart.com/\r\n" + 
				"");
		
		driver.manage().window().maximize();
		
		 Thread.sleep(3000);
		
		WebElement fashion = driver.findElement(By.xpath("//div[contains(text(),'Fashion')] "));
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		
		
		act.moveToElement(fashion).perform();
		
		 Thread.sleep(3000);
			
			WebElement womens = driver.findElement(By.xpath("(//html[@class=' fonts-loaded'])[1]"));
			
			act.moveToElement(womens).perform();
			
			
			WebElement women2 = driver.findElement(By.xpath("//span[text()='Women']"));
			
			
			act.moveToElement(women2).perform();
		
			Thread.sleep(3000);
		   WebElement flatslipper = driver.findElement(By.xpath("//html[@class=' fonts-loaded']"));
		
		   flatslipper.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
