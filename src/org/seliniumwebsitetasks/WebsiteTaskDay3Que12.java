package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay3Que12 {

	public static void main(String[] args) throws InterruptedException {	
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement signin = driver.findElement(By.xpath("//div[@class='accountInner']"));
		
		signin.click();
		
		Thread.sleep(3000);
		WebElement Register = driver.findElement(By.xpath("//span[@class='newUserRegister']"));
		
		Register.click();
		
		Thread.sleep(3000);
		WebElement frameset = driver.findElement(By.id("loginIframe"));
		
		driver.switchTo().frame(frameset);
		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']"));
		
		email.sendKeys("balaaccuhealer@gmail.com");
		Thread.sleep(3000);
	    WebElement Continue = driver.findElement(By.xpath("//button[@class='btn col-xs-24 btn-large btn-skyblue continueBtn marT20 marB30']"));
		
		Continue.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
}
