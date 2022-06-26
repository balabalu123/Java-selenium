package org.seliniumwebsitetasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebsiteTaskDay9Que12 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement fruits = driver.findElement(By.id("fruits"));
		
		Select s = new Select(fruits);
		
		s.selectByIndex(0);
		
		s.selectByValue("apple");
		
		s.selectByVisibleText("Orange");
		
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		for (int i =0; i <allSelectedOptions.size(); i++) {
			
			if(i%2!=0) {	
				
				if(i==3) {				
		WebElement webElement = allSelectedOptions.get(i);
			
			String text = webElement.getText();
			System.out.println(text);
			
			}
			
		  else {
			
			  System.out.println("Grape");
			
			}
		
			
				
				
				
				}
		
		
		
		
				}
		
		
		

				
	}
	
				
	
}
	
	
	
			
	

	


