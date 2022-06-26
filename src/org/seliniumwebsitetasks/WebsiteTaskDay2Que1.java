package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay2Que1 {

	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com/ ");
		
		
		WebElement textuser = driver.findElement(By.id("email"));
		
		
		textuser.sendKeys("prakash123456@gmail.com");
		
		
		WebElement textpass = driver.findElement(By.xpath("//*[@id=\'pass\']"));
		
		
		textpass.sendKeys("prakash4564#");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
