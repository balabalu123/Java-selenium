package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6workoutDebugg {

	public static void main(String[] args) throws InterruptedException   {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.manage().window().maximize();
		
		WebElement CreateNewAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		CreateNewAccount.click();
		
		Thread.sleep(5000);
		
		
		WebElement FirstName = driver.findElement(By.name("firstname"));
		
		FirstName.sendKeys("Bala");
		
		
		
		WebElement LastName = driver.findElement(By.name("lastname"));
		
		LastName.sendKeys("Subramaniyam");
		
		
		WebElement mobile = driver.findElement(By.name("reg_email__"));
		
		
		mobile.sendKeys("9710685287");
		
		

		
	}
	
	
	
	
	
	
	
	
	
	
}
