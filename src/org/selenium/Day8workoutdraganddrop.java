package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Day8workoutdraganddrop {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement source = driver.findElement(By.id("credit2"));
		
		WebElement Destination = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions act = new Actions(driver);
	
		act.dragAndDrop(source, Destination).perform();
		
	
		
		
		
		
		Thread.sleep(3000);
		
		WebElement source2 = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
		
		WebElement Destination2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions act2 = new Actions(driver);
		
		act2.dragAndDrop(source2, Destination2).perform();
		
		
		
		
		
        Thread.sleep(3000);
		
		WebElement source3 = driver.findElement(By.id("credit1"));
		
		WebElement Destination3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions act3 = new Actions(driver);
	
		act.dragAndDrop(source3, Destination3).perform();
		
		
		
		
		
		Thread.sleep(3000);
		
		WebElement source4 = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
		
		WebElement Destination4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		Actions act4 = new Actions(driver);
		
		act2.dragAndDrop(source4, Destination4).perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
