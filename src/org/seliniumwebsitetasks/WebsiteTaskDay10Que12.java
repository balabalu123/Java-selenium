package org.seliniumwebsitetasks;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay10Que12 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html\r\n" + 
				" ");
		
     	driver.manage().window().maximize();
     	
     	Thread.sleep(3000);

     	WebElement scrolldown = driver.findElement(By.xpath("//h2[contains(text(),'Core Java Test papers')]       "));
		
		
     	JavascriptExecutor jav = (JavascriptExecutor)driver;
		
     	jav.executeScript("arguments[0].scrollIntoView(true);",scrolldown );
		
     	Thread.sleep(3000);
		driver.findElement(By.xpath("(//h2[contains(text(),'Selenium')])[5]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[text()=' DAY 10 TASK'])[1]")).click();
		
		Thread.sleep(3000);
		
		  String parentwindow = driver.getWindowHandle();
			System.out.println(parentwindow);
			
			
			Set<String> allwindow = driver.getWindowHandles();
			
			System.out.println(allwindow);
			
			for (String x : allwindow) {
				
				if(!parentwindow.equals(x))
					
					driver.switchTo().window(x);
				}
			
		
			
			Thread.sleep(3000);
		
		WebElement print = driver.findElement(By.xpath("//pre[contains(text(),'URL ')]"));
		
		
		String text = print.getText();
		
		System.out.println(text);
		
		
		
	}
	
	
	
	
	
	
	
	

}
