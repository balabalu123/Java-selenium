package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebsiteTaskDay5Que13 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		 Thread.sleep(3000);
		
		WebElement MobileandTablets = driver.findElement(By.xpath("//span[text()='Mobile & Accessories']"));
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		
		
		act.moveToElement(MobileandTablets).perform();
		
		 Thread.sleep(3000);
			
			WebElement Newlylaunchcovers = driver.findElement(By.xpath("//span[text()='Flip Covers']"));
			
			Newlylaunchcovers.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
