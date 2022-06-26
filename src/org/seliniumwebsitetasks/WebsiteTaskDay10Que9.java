package org.seliniumwebsitetasks;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay10Que9 {
	
	
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.flipkart.com/ ");
				
				
				driver.manage().window().maximize();

				Thread.sleep(3000);
				
				driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("redmi phone",Keys.ENTER);
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[text()='REDMI 10 (Caribbean Green, 128 GB)']")).click();
				

				String parentwindow = driver.getWindowHandle();
				System.out.println(parentwindow);
				
				
				Set<String> allwindow = driver.getWindowHandles();
				
				System.out.println(allwindow);
				
				for (String x : allwindow) {
					
					if(!parentwindow.equals(x))
						
						driver.switchTo().window(x);
					}
				
           	Thread.sleep(3000);
				WebElement print = driver.findElement(By.xpath("(//div[text()='₹12,999'])[1]"));
				String text = print.getText();
				
				System.out.println(text);
				
				
				
				
}

}
