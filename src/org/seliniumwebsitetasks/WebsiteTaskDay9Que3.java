package org.seliniumwebsitetasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.execution.instrumentation.tracing.TracingInstrumentation.Options;

public class WebsiteTaskDay9Que3 {

	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement CreatenewAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		CreatenewAccount.click();
		
		
		 Thread.sleep(3000);
		WebElement year = driver.findElement(By.id("year"));
		
		
		Select s = new Select (year);
		
		List<WebElement> options = s.getOptions();

		for (int i = 0; i < options.size(); i++) {
			
			
			if(i%2==0) {
			
			WebElement webElement = options.get(i);
			
			String attribute = webElement.getAttribute("value");
			
			System.out.println(attribute);
			
			
		}
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		}
	
	
		}
	
	
	
	
	
	
	
	
}
