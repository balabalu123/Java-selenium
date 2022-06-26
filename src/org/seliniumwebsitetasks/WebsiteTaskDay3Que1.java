package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay3Que1 {

	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/\r\n" +"");
		
		
		driver.manage().window().maximize();
		
		
		WebElement Textproduct = driver.findElement(By.id("twotabsearchtextbox"));
		
		Textproduct.sendKeys("iphone");
		
		
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		
		
		searchbutton.click();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
