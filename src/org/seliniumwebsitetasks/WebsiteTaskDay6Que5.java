package org.seliniumwebsitetasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WebsiteTaskDay6Que5 {

	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement Modelresume = driver.findElement(By.xpath("//h2[contains(text(),'Model Resumes')]"));
		
		Modelresume.click();
		
		
		Thread.sleep(3000);
		WebElement ResumeModel4 = driver.findElement(By.xpath("//a[contains(text(),'Resume Model-4')] "));
		
		Actions act = new Actions(driver);
		
		
		Thread.sleep(3000);
		act.contextClick(ResumeModel4).perform();
		
		Robot rob = new Robot();
		
		Thread.sleep(3000);
		for (int i = 0; i <4; i++) {
			
			
			rob.keyPress(KeyEvent.VK_DOWN);
			
			rob.keyRelease(KeyEvent.VK_DOWN);
			}
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
