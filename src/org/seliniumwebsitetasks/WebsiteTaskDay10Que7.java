package org.seliniumwebsitetasks;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay10Que7 {
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://greenstech.in/selenium-course-content.html");
				
				driver.manage().window().maximize();
				
		    	Thread.sleep(3000);
				WebElement scrolldown = driver.findElement(By.xpath("//h2[contains(text(),'Software Download Links')] "));
					
                JavascriptExecutor jav = (JavascriptExecutor)driver;	
				jav.executeScript("arguments[0].scrollIntoView(true);",scrolldown );
				
             	Thread.sleep(3000);
				driver.findElement(By.xpath("//h2[contains(text(),'Core ')]")).click();
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//a[@title='Test papers training in chennai'])[4]")).click();
		
				String parentwindow = driver.getWindowHandle();
				System.out.println(parentwindow);
				
		    	Set<String> allwindow = driver.getWindowHandles();
				System.out.println(allwindow);
				
					for (String x : allwindow) {
					if(!parentwindow.equals(x))
	       			driver.switchTo().window(x);
					
				}
				
         	Thread.sleep(3000);
				
	 String mytext = driver.findElement(By.xpath("//pre[contains(text(),'1.What is difference between break and continue?')]")).getText();
				
					System.out.println(mytext);
}	
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				


}
