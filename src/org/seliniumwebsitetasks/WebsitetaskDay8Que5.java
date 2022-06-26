package org.seliniumwebsitetasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsitetaskDay8Que5 {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
		
		
		driver.manage().window().maximize();
		
		
		

		Thread.sleep(3000);
		
		WebElement Continuebutton = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		Continuebutton.click();
		
		
		
		Alert simplealert = driver.switchTo().alert();
		
		simplealert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
