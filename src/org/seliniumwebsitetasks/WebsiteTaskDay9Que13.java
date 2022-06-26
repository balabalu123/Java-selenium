package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebsiteTaskDay9Que13 {
	
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
		
		s.selectByVisibleText("Grape");
		
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		
		
		String text = firstSelectedOption.getText();
		
		
		System.out.println(text);
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
