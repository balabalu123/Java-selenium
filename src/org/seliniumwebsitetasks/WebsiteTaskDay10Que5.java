package org.seliniumwebsitetasks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebsiteTaskDay10Que5 {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("http://www.greenstechnologys.com/");
				
				
				driver.manage().window().maximize();
				
				Thread.sleep(3000);
				
				
				WebElement courses = driver.findElement(By.xpath("//a[text()='COURSES']"));
				
				
				
				Actions act = new Actions(driver);
				
				
			     act.moveToElement(courses).perform();
				
				
			     Thread.sleep(3000);
				driver.findElement(By.xpath("(//span[text()='Python'])[1]")).click();
				
				Thread.sleep(3000);
				
								
				WebElement scrolldown = driver.findElement(By.xpath("//h3[text()='What is Python Certification?']"));
				JavascriptExecutor jav = (JavascriptExecutor)driver;
				
				jav.executeScript("arguments[0].scrollIntoView(true);",scrolldown );
				
				Thread.sleep(3000);
				
				WebElement ExploreCurriculam = driver.findElement(By.xpath("(//button[text()='Explore Curriculum'])[1]"));
				

				
		        act.contextClick(ExploreCurriculam).perform();
				
				
		        Thread.sleep(3000);
				
				Robot rob = new Robot();
				
				
				for (int i = 0; i < 2; i++) {
					
					
					rob.keyPress(KeyEvent.VK_DOWN);
					
					rob.keyRelease(KeyEvent.VK_DOWN);
					
					
				}
				
				
				rob.keyPress(KeyEvent.VK_ENTER);
				rob.keyRelease(KeyEvent.VK_ENTER);
				
				
				
				
				
				
				
				
				
				
}

}
