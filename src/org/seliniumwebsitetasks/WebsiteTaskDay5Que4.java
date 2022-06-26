package org.seliniumwebsitetasks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebsiteTaskDay5Que4 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(mobile).perform();
		Thread.sleep(5000);
		
		WebElement smartphones = driver.findElement(By.xpath("//strong[text()='Smartphones & Tablets']"));
		
		smartphones.click();
		
		
		String parentwindow = driver.getWindowHandle();
		
		System.out.println(parentwindow);
		
		
		Set<String> allwindow = driver.getWindowHandles();
		
		System.out.println(allwindow);
		
		
		for (String x : allwindow) {
			
			
			
			if(!parentwindow.equals(x)) {
				
				driver.switchTo().window(x);
				
			}
			
		}
		
		
		Thread.sleep(3000);
		
		WebElement pricerange = driver.findElement(By.xpath("//label[@for='Above 5000']"));
		
		
		pricerange.click();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
