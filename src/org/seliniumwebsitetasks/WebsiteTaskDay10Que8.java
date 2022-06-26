package org.seliniumwebsitetasks;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay10Que8 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.snapdeal.com/ ");
				
					driver.manage().window().maximize();
				
				Thread.sleep(3000);
				
				driver.findElement(By.name("keyword")).sendKeys("hand sanitizer",Keys.ENTER);
				
              	Thread.sleep(3000);
				driver.findElement(By.xpath("//p[text()='Mirah Belle Hand Rub (72.9% Alcohol) FDA Approved Hand Sanitizer 50 mL Pack of 8']")).click();
					
                String parentwindow = driver.getWindowHandle();
				
				System.out.println(parentwindow );
				
				Set<String> allwindow = driver.getWindowHandles();
					
				System.out.println(allwindow);
					for (String x : allwindow) {
					
				if(!parentwindow.equals(x));
					
					driver.switchTo().window(x);
					
					}
				
				Thread.sleep(3000);
				WebElement addtocart = driver.findElement(By.xpath("//span[text()='add to cart']"));
				
				
				addtocart.click();
				
				
				
				
				
				
				
}


}
