package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay12Que4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/\r\n" + 
				" ");
		
		driver.manage().window().maximize();
		
		 JavascriptExecutor jav = (JavascriptExecutor) driver;
		 
		 
		 Thread.sleep(3000);
		 WebElement textuser = driver.findElement(By.id("email"));
		 
		 jav.executeScript("arguments[0].setAttribute('value','balaacuhealer@gmail.com')", textuser);
		
		 Thread.sleep(3000);
		 
		 WebElement textpass = driver.findElement(By.id("pass"));
		
		
		jav.executeScript("arguments[0].setAttribute('value','Bala12354@#')", textpass);
		
		
		
		Thread.sleep(3000);
		 
		 WebElement loginbutton = driver.findElement(By.xpath("//button[text()='Log In']"));
		
		
		jav.executeScript("arguments[0].click()", loginbutton);
		
		}

}
