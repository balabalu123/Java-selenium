package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay2Que8 {

	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/?hl=en) login page ");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement textuser = driver.findElement(By.name("username"));
		
		textuser.sendKeys("balaaccuhr@gmail.com");
		
		Thread.sleep(3000);
		
       WebElement textpass = driver.findElement(By.name("password"));
		
		textpass.sendKeys("Balagood12*#");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
