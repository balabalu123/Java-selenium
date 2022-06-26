package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownYoutubeSara {
	
	
public static void main(String[] args) throws InterruptedException {
	
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.amazon.in/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	JavascriptExecutor jav = (JavascriptExecutor) driver;
	
	jav.executeScript("window.scroll(0,1000)");
	
	Thread.sleep(3000);
	
	jav.executeScript("window.scroll(0,-1000)");
	
	
	Thread.sleep(3000);
	jav.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	
	Thread.sleep(3000);
	WebElement offerarea = driver.findElement(By.xpath("//h2[text()='Today’s Deals']"));
	
	jav.executeScript("arguments[0].scrollIntoView(true);", offerarea);
	Thread.sleep(3000);
	jav.executeScript("window.scroll(0,0)");
		
	}

}
