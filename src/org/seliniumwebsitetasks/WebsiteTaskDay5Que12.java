package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebsiteTaskDay5Que12 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.homedepot.com/\r\n" + 
				"");
		
		driver.manage().window().maximize();
		
		 Thread.sleep(3000);
		
		WebElement Alldeptmouseover = driver.findElement(By.xpath("//a[text()='All Departments']"));
		
		
		Actions act = new Actions(driver);
		
		
		act.moveToElement(Alldeptmouseover).perform();
		
		Thread.sleep(3000);
		
		WebElement paintmouseover = driver.findElement(By.xpath("//a[text()='Paint']"));
		
	    act.moveToElement( paintmouseover).perform();	
	    
	    Thread.sleep(3000);
         WebElement interiorpaintingmouseover = driver.findElement(By.xpath("//a[text()='Interior Paint']"));
		
	    act.moveToElement(interiorpaintingmouseover).perform();	
	    
	    
	    Thread.sleep(3000);
		
		WebElement ceilingpaint = driver.findElement(By.xpath("//a[text()='Ceiling Paint']"));
		
		ceilingpaint.click();
		}
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
