package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableWorkoutcontains {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		
		driver.manage().window().maximize();
		
		
		List<WebElement> tdatas = driver.findElements(By.tagName("td"));
		
		
		for (int i = 0; i < tdatas.size(); i++) {
			
			
			WebElement webElement = tdatas.get(i);
			
			String text = webElement.getText();
			
			
				if(text.equals("second cell")) {
				
				System.out.println(text);}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
