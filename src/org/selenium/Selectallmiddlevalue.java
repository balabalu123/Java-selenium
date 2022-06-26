package org.selenium;

import java.util.List;

import javax.xml.soap.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectallmiddlevalue {

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
		
		
		List<WebElement> options = s.getOptions();
		
		
	    WebElement webElement = options.get(6);
	    
	    String text = webElement.getText();
		
		
		System.out.println(text);
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
