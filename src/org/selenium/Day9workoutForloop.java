package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day9workoutForloop {

	
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/ ");
		
		
		driver.manage().window().maximize();
		
		
		                  /// FOR LOOP METHOD
		
		
		
				Thread.sleep(3000);
				//To inspect the username webelemnt
				
				WebElement Textuser = driver.findElement(By.id("email"));
				
				//To insert the values to the user name web element
				
				Textuser.sendKeys("balagood123");
				
				
				Actions act = new  Actions(driver);
				Thread.sleep(3000);
				// To perform the double click actions
				act.doubleClick(Textuser).perform();
				
				
				Thread.sleep(3000);
				// To perform the context click/Right click actions
				
				act.contextClick(Textuser).perform();
				
				
				
				Robot rob= new Robot ();
				
				
				Thread.sleep(3000);
				
				
				for (int i = 0; i < 2; i++) {
					
					
					rob.keyPress(KeyEvent.VK_DOWN);
					rob.keyRelease(KeyEvent.VK_DOWN);
					
				}
				
				
				
				Thread.sleep(3000);
				rob.keyPress(KeyEvent.VK_ENTER);
				rob.keyRelease(KeyEvent.VK_ENTER);
				
				Thread.sleep(3000);
				
				rob.keyPress(KeyEvent.VK_CONTROL);
				rob.keyPress(KeyEvent.VK_V);
				
				Thread.sleep(3000);
				rob.keyRelease(KeyEvent.VK_CONTROL);
				rob.keyRelease(KeyEvent.VK_V);
				
				
				
				
				
				
				
			}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
