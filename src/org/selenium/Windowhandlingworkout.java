package org.selenium;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandlingworkout {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		
		 searchbox.sendKeys("iphone 13 pro max",Keys.ENTER);
		
		 Thread.sleep(3000);
		 WebElement iphonesilver = driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 Pro Max (128GB) - Graphite'])[3]"));
		
		 iphonesilver.click();
		 
		 
		 String parentwindowid = driver.getWindowHandle();
		 
		 System.out.println(parentwindowid);
		 
		 
		 Set<String> allwindowid = driver.getWindowHandles();
		 
		 System.out.println(allwindowid);
		 
		 
		 for (String x : allwindowid) {
			 
			 
			 if(!parentwindowid.equals(x)) {
					
			 driver.switchTo().window(x);
			 
			
		}
		 
		 }
		 Thread.sleep(3000);
		 
		WebElement addtocartsilverbutton = driver.findElement(By.id("add-to-cart-button"));
		
		addtocartsilverbutton.click();
		
		
		
		driver.switchTo().window(parentwindowid);
    	JavascriptExecutor jav =(JavascriptExecutor) driver;
		WebElement iphonegold = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Pro Max (512GB) - Graphite']"));
		
		jav.executeScript("arguments[0].click()",iphonegold );
		
	  Set<String> allwindows2 = driver.getWindowHandles();
	  
	  
	  List<String> li = new LinkedList<>();
		
	  
	   li.addAll(allwindows2);
	   
	   
	   for (String y : li) {
		   
		   
		   driver.switchTo().window(y);
		
	}
		
	   
	   WebElement addtocartgold = driver.findElement(By.id("add-to-cart-button"));
	   
	   
	   addtocartgold.click();
	   
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
