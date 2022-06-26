package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskday3Que2 {

	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.manage().window().maximize();
		
		WebElement textuser = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		
		
		textuser.sendKeys("madan456@gmail.com");
		
		
		WebElement textpassword = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
		
		textpassword.sendKeys("madan894545$");
		
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
		
		loginbutton.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
