package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebsiteTaskDay5Que14 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		 Thread.sleep(3000);
		
		WebElement womensfashion = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		
		
		act.moveToElement(womensfashion).perform();
		
		 Thread.sleep(5000);
			
			WebElement Footwear = driver.findElement(By.xpath("(//span[text()='Footwear'])[2]"));
			
			Footwear.click();
		
		

			 Thread.sleep(3000);
				
				WebElement Heals = driver.findElement(By.xpath("(//p[contains(text(),'Scattr ')])[1]"));
				
				Heals.click();
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
