package org.seliniumwebsitetasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebsiteTaskDay9Que5 {

	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		WebElement CreatenewAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		CreatenewAccount.click();
		
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.id("day"));
		
		
		Select s = new Select(day);
		List<WebElement> options = s.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			
			WebElement webElement = options.get(i);
			
		
			String text = webElement.getText();
			
			System.out.println(text);
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
