package org.seliniumwebsitetasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WebsiteTasksDay6Que2 {
	
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/webhp \r\n" + 			"");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement enter = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		
		enter.sendKeys("VelMurugan");
		
		
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		act.doubleClick(enter).perform();
		
		
		Thread.sleep(3000);
		act.contextClick(enter).perform();
		
		Robot rob = new Robot();
		
		Thread.sleep(3000);
		for (int i = 0; i < 2; i++) {
			
			rob.keyPress(KeyEvent.VK_DOWN);
			
			rob.keyRelease(KeyEvent.VK_DOWN);
		}
		
		Thread.sleep(3000);
		
		 rob.keyPress(KeyEvent.VK_ENTER);
		 rob.keyRelease(KeyEvent.VK_ENTER);
		 		
		
 		
			
			 
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	

}
