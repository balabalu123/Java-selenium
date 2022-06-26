package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebsiteTaskDay5Que2 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement primemouseover = driver.findElement(By.xpath("//span[text()='Prime']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(primemouseover).perform();
		
		Thread.sleep(3000);
		
		WebElement freefastmouseover = driver.findElement(By.id("multiasins-img-link"));
		
         freefastmouseover.click();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
