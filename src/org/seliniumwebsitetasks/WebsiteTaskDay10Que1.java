package org.seliniumwebsitetasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebsiteTaskDay10Que1 {
		public static void main(String[] args) throws InterruptedException, AWTException {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.amazon.com/");	
				
				driver.manage().window().maximize();
				
				Thread.sleep(3000);
				WebElement searchiphonex = driver.findElement(By.id("twotabsearchtextbox"));
				
     			searchiphonex.sendKeys("iphones X",Keys.ENTER);
				
				Thread.sleep(3000);
				
				WebElement firstproduct = driver.findElement(By.xpath("//span[text()='Apple iPhone X, 64GB, Silver - GSM Unlocked (Renewed Premium)']"));
				 
				Thread.sleep(3000);
				
		      	Actions act = new Actions(driver);
				
				act.contextClick(firstproduct).perform();
				
				Robot rob = new Robot();
				
				for (int i = 0; i < 2; i++) {
					
					
					rob.keyPress(KeyEvent.VK_DOWN);
					rob.keyRelease(KeyEvent.VK_DOWN);		
					
				}
				rob.keyPress(KeyEvent.VK_ENTER);
				rob.keyRelease(KeyEvent.VK_ENTER);				
	}

}
