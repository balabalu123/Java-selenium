package org.seliniumwebsitetasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebsiteTaskDay9Que11 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("balagood123");
		
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("0Y8525");
		
		Thread.sleep(3000);
		WebElement Loginbutton = driver.findElement(By.id("login"));
		Loginbutton.click();
		
		Thread.sleep(3000);
		WebElement adultroom  = driver.findElement(By.id("adult_room"));
	    Select s = new Select(adultroom);
		
		List<WebElement> options = s.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			
			WebElement webElement = options.get(i);
			String text = webElement.getText();
			System.out.println(text);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
