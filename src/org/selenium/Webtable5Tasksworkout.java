package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable5Tasksworkout {
 public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> header = driver.findElements(By.tagName("thead"));
		
			for (int i = 0; i < header .size(); i++) {
			
			 WebElement webElement = header .get(i);
			
			String text = webElement.getText();
			
      		System.out.println(text);
			}
		System.out.println("       ");
		List<WebElement> body = driver.findElements(By.tagName("tbody"));
		
	     	for (int i = 0; i < body.size(); i++) {
			
			WebElement webElement = body.get(i);
			String text = webElement.getText();
				System.out.println(text);
			
				}
		System.out.println("       ");
		
		List<WebElement> foot = driver.findElements(By.tagName("tfoot"));
		
		for (int i = 0; i < foot.size(); i++) {
			
			WebElement webElement = foot.get(i);
			
			String text = webElement.getText();
			System.out.println(text);
			}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
