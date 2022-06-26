package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay3Que7 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.cleartrip.com/trains");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement From = driver.findElement(By.xpath("//input[@id='from_station']"));
		
		
		From.sendKeys("Chennai");
		
		Thread.sleep(3000);
		
		WebElement To = driver.findElement(By.xpath("//input[@id='to_station']"));
		
		
		To.sendKeys("Tirunelveli");
		
		
		Thread.sleep(3000);
		
		WebElement search = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		
		search.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
