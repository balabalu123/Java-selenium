package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathIndexBasedTask1 {

	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		
		driver.manage().window().maximize();
		
		
		WebElement gender = driver.findElement(By.xpath("(//input[@value='Male'])[1]"));
		
		gender.click();
		
		WebElement hobbies = driver.findElement(By.xpath("//input[@value='Hockey']"));
		
		
		hobbies.click();
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
