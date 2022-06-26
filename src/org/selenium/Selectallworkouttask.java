package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectallworkouttask {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		WebElement CreatenewAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		CreatenewAccount.click();
		
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.id("month"));
		
		
		Select s = new Select(month);
		
		boolean multiple = s.isMultiple();
		
		System.out.println(multiple);
		
		List<WebElement> options = s.getOptions();
		
		int size = options.size();
		System.out.println(size);
		
		
		for (int i = 0; i < 12; i++) {
			
			WebElement webElement = options.get(i);
			
		
			String text = webElement.getText();
			
			System.out.println(text);
			
			
			
		}
		
		
		
		System.out.println("  ");
		
		
		
		
		for (WebElement x : options) {
			
			String text = x.getText();
			
			System.out.println(text);
			
			
			
		}
		
		
		System.out.println("    ");
		
		for (WebElement y : options) {
			
			
			String attribute = y.getAttribute("value");
			
			System.out.println(attribute);
			
		}
		
		
		System.out.println("                  ");
		
		
      for (int i = 0; i <=12; i++) {
			
    	 
    	  if(i%2==0 ) {
    	  
    	WebElement webElement = options.get(i);
			
		
			String text = webElement.getText();
			
			System.out.println(text);
			
			 }
    	  
    	  
        	  
        	  
        	  
		}
    	  
    	  
    	  
    	  
    	  
			}
			
    	  
			
			
			
    	  
			
			

			
	

      
}

		
		
	
	
	

