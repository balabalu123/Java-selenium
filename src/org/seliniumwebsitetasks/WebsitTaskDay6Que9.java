package org.seliniumwebsitetasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebsitTaskDay6Que9 {

	
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/\r\n" + 
				"");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement Signinbutton = driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]"));
		
		Signinbutton.click();
		
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.id("ap_email"));
		
		email.sendKeys("balaaccudr123@gmail.com");
		
		
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		act.contextClick(email).perform();
		
		
		Robot rob = new Robot();
		Thread.sleep(3000);
		for (int i = 0; i < 5; i++) 
		{
			
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
				
		}
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		act.contextClick(email).perform();
		
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
