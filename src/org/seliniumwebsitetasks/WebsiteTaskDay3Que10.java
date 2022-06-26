package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay3Que10 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://www.amazon.in/");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement product = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		
		product.sendKeys("realmeX2pro");
		
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		
		
		
		search.click();
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
