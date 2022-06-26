package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay12Que6 {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/ ");
		
		driver.manage().window().maximize();
		
		 JavascriptExecutor jav = (JavascriptExecutor) driver;
		 Thread.sleep(3000);
		 
			WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
			
			
			 jav.executeScript("arguments[0].setAttribute('value','balaacuhealer@gmail.com')", username);
			 
			 
			 Object executeScript = jav.executeScript("return arguments[0].getAttribute('value')",username);
			
			System.out.println(executeScript);

			 Thread.sleep(3000);
			 
			 WebElement textpass = driver.findElement(By.xpath("//input[@type='password']"));
			
			
			jav.executeScript("arguments[0].setAttribute('value','Bala12354@#')", textpass);
			
			  Thread.sleep(3000);
				 
				 WebElement loginbutton2 = driver.findElement(By.xpath("(//span[text()='Login'])[2]"));
				
				
				jav.executeScript("arguments[0].click()", loginbutton2);
				
		}
}
