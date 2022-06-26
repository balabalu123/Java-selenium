package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebsiteTaskDay5Que5 {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html \r\n" + 
				" ");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement sports = driver.findElement(By.xpath("//a[text()='Sports & More']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(sports).perform();
		
		Thread.sleep(3000);
		WebElement weightandgrainers = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		
		weightandgrainers.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
