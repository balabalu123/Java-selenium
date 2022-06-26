package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIndexBasedTask3 {

	public static void main(String[] args) {
		
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
		
		
		driver.manage().window().maximize();
		
		
		WebElement number = driver.findElement(By.xpath("(//input[@name='permission'])[1]"));
		
		number.click();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
