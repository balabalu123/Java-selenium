package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://output.jsbin.com/osebed/2");
		
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		WebElement Multiselect = driver.findElement(By.id("fruits"));
		
		
		Select s = new Select(Multiselect);
		
		Thread.sleep(3000);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		
	    //To perform the multiple select
		
		s.selectByIndex(2);
		
		s.selectByValue("banana");
		
		s.selectByVisibleText("Grape");
		
		
		//To get all the options available in select
		
		List<WebElement> options = s.getOptions();
		
		int size = options.size();
		System.out.println(size);
		
		
	
		
		//To print all the options availabe in dropdown
		
		
		for (int i = 0; i < options.size(); i++) {
			
			
			WebElement webElement = options.get(i);
			
			String text = webElement.getText();
			
			System.out.println(text);
			
			
		}
			
		
		System.out.println(" ");
		
			//To print first selected option
			
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			
			String text = firstSelectedOption.getText();
			
			System.out.println(text);
			
			
			System.out.println(" ");
			
			//to print the all selected options
			
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			
			for (int i = 0; i < allSelectedOptions.size(); i++) {
				
				
			
				
				WebElement webElement = allSelectedOptions.get(i);
				
				String text2 = webElement.getText();
				
					System.out.println(text2);
				
					
					
				
				
			}
		
			
			//To deselect the selected options
			
			
			s.deselectByIndex(3);
			s.deselectAll();
			
			
			
			
			
			
		}
		
		
		
		

		

		
		
		
		
		
		
	
	
	

	
	
	
	
	

}
