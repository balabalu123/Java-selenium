package org.seliniumwebsitetasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebsiteTaskDay6Que11 {

	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/\r\n" + 
				"");
		
		Thread.sleep(6000);
		driver.manage().window().maximize();	
		
		WebElement product = driver.findElement(By.xpath("(//div[contains(text(),'Best ')])[1]"));
		
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		act.contextClick(product).perform();
		
		
		
		Robot rob = new Robot();
		Thread.sleep(5000);
		for (int i = 0; i < 4; i++) {
			
			
			rob.keyPress(KeyEvent.VK_DOWN);
			
			rob.keyRelease(KeyEvent.VK_DOWN);
			
	       }
		
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
