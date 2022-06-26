package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay4Que11 {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/ ");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		
		login.click();
		
		Thread.sleep(3000);
		
		WebElement textuser = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		
		
		textuser.sendKeys("balaacu123hr@gmail.com");
		
		String attribute = textuser.getAttribute("value");
		
		System.out.println(attribute);
		
		Thread.sleep(3000);
		
		WebElement textpass = driver.findElement(By.xpath("//input[@type='password']"));
		
		textpass.sendKeys("Bala5678910*1");
		
		String attribute2 = textpass.getAttribute("value");
		
		
		System.out.println(attribute2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
