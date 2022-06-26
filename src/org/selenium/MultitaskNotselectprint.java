package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultitaskNotselectprint {

	
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		WebElement Multiselect = driver.findElement(By.id("fruits"));
		
		
		Select s = new Select(Multiselect);
		
		

	    //To perform the multiple select
		
		s.selectByIndex(2);
		
		s.selectByValue("banana");
		
		s.selectByVisibleText("Grape");
		
		
		
		
		
		
		
		
		
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	
	
	int size = allSelectedOptions.size();
	
	System.out.println(size);
	
	
	System.out.println("         ");
	
		
		for (int i = 0; i < allSelectedOptions.size(); i++) {
			
			
			if(i==0) {
				
				
			
		  WebElement webElement = allSelectedOptions.get(i);
			
			String text2 = webElement.getText();
			
				System.out.println(text2);
				
				
				}
			
		    
			else {
				
				
				
				System.out.println("Apple");
				
				
			}
			
				
			
	
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
	
		
	
	
	
	
		
	
	}
	
	
	
	
		}
	

