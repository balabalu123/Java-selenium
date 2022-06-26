package org.seliniumwebsitetasks;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay10Que4 {
	
public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://www.greenstechnologys.com/python-training.html");
				
				
				driver.manage().window().maximize();
				
				
				WebElement scrolldown = driver.findElement(By.xpath("//h3[text()='Machine Learning with python Course Content']"));
				
				JavascriptExecutor jav = (JavascriptExecutor)driver;
				
				jav.executeScript("arguments[0].scrollIntoView(true);", scrolldown);
				
				
				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//h3[text()='Selenium Test Papers']")).click();
				
				Thread.sleep(3000);
				WebElement scrolldown2 = driver.findElement(By.xpath("//h3[text()='Selenium Day 8 Task']"));
				
				
				jav.executeScript("arguments[0].scrollIntoView(true);", scrolldown2);
				
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//h3[text()='Selenium Day 10 Task']")).click();
				
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[text()='Windows Handling']")).click();
				
				String parentwindow = driver.getWindowHandle();
				
				System.out.println(parentwindow);
				
				Set<String> allwindows = driver.getWindowHandles();
				
				System.out.println(allwindows);
				
					for (String x : allwindows) {
					
					
					if(!parentwindow.equals(x)) {
						
						
						driver.switchTo().window(x);
								
					}
					
				}
				Thread.sleep(3000);
	
				WebElement firstquestionprint = driver.findElement(By.xpath("//pre[contains(text(),'1.What is the purpose of windows Handling?')]"));
	
				String text = firstquestionprint.getText();
	             	System.out.println(text);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	

}
