package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay12Que5 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/ ");
		
		driver.manage().window().maximize();
		
		 JavascriptExecutor jav = (JavascriptExecutor) driver;
		
		
		 Thread.sleep(3000);
		 
		WebElement username = driver.findElement(By.id("username"));
		
		
		 jav.executeScript("arguments[0].setAttribute('value','balaacuhealer@gmail.com')", username);
		
		 Thread.sleep(3000);
		 
		 WebElement textpass = driver.findElement(By.id("password"));
		
		
		jav.executeScript("arguments[0].setAttribute('value','Bala12354@#')", textpass);
		
		Thread.sleep(3000);
		 
		 WebElement loginbutton = driver.findElement(By.id("login"));
		
		
		jav.executeScript("arguments[0].click()", loginbutton);
		
		}
}
