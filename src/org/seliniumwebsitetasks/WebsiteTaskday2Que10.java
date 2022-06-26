package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskday2Que10 {

	
	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		
		driver.manage().window().maximize();
		
		
		WebElement textuser = driver.findElement(By.xpath("//input[@id='username']"));
		
		textuser.sendKeys("ramesh12342gmail.com");
		
		
		
		WebElement Textpass = driver.findElement(By.xpath("//input[@id='password']"));
		
		Textpass.sendKeys("ram123454%");
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
