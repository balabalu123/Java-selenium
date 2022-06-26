package org.seliniumwebsitetasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebsiteTasksDay6Que8 {

	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement Loginbutton = driver.findElement(By.xpath("//a[text()='Login']"));
		
		Loginbutton.click();
		
		Thread.sleep(3000);
		WebElement textname = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		
		textname.sendKeys("balaaccudr");
		
		
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		act.doubleClick(textname).perform();
		Thread.sleep(3000);
		act.contextClick(textname).perform();
		
		
		Robot rob = new Robot();
		Thread.sleep(3000);
		for (int i = 0; i < 5; i++) {
			
			
			rob.keyPress(KeyEvent.VK_DOWN);
			rob.keyRelease(KeyEvent.VK_DOWN);
			
			
		}
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.click();
		

		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyRelease(KeyEvent.VK_V);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
