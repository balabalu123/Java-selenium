package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay3Que4 {

	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://toolsqa.com/selenium-training?q=banner#enroll-form");
		
		
		driver.manage().window().maximize();
		
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
		
		firstname.sendKeys("Bala");
		
		
		WebElement lastname = driver.findElement(By.xpath("//input[@id='last-name']"));
		
		
		lastname.sendKeys("Subramaniyam");
		
		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		
		email.sendKeys("balaaccudr@gmail.com");
		
		Thread.sleep(3000);
		
		WebElement Mobilenumber = driver.findElement(By.xpath("//input[@id='mobile']"));
		
		
		Mobilenumber.sendKeys("9710685287");
		
		Thread.sleep(3000);
		
		WebElement country = driver.findElement(By.xpath("//option[text()='India']"));
		
		country.click();
		
		Thread.sleep(3000);
		
		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		
		
		city.sendKeys("Chennai");
		
		Thread.sleep(3000);
		
		WebElement message = driver.findElement(By.xpath("//textarea[@name='message']"));
		
		
		message.sendKeys("I am intrested to join course.what is the course duration.");
		
		Thread.sleep(3000);
		
		WebElement code = driver.findElement(By.xpath("//input[@id='code']"));
		
		code.sendKeys("WmEa");
		
		
		Thread.sleep(3000);
		
		WebElement button = driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary']"));
		
		
		button.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
