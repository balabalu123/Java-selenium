package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebsiteTaskDay5Que11 {

	
	
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
		
		WebElement Heatingcoolingmouseover = driver.findElement(By.xpath("//a[text()='Heating & Cooling']"));
		
	    act.moveToElement(Heatingcoolingmouseover).perform();	
	    
	    Thread.sleep(3000);
         WebElement Airconditionermouseover = driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
		
	    act.moveToElement(Airconditionermouseover).perform();	
	    
	    
	    Thread.sleep(3000);
		
		WebElement portablleaircond = driver.findElement(By.xpath("//a[text()='Portable Air Conditioners']"));
		
		portablleaircond.click();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
