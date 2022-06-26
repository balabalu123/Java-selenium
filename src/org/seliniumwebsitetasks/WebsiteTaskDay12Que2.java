package org.seliniumwebsitetasks;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay12Que2 {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/");
		
		driver.manage().window().maximize();
		
		
		
		Thread.sleep(3000);
		
		WebElement scrolldown = driver.findElement(By.xpath("//div[text()='Training Batch starts from 02-April-2022']"));
		
		JavascriptExecutor jav = (JavascriptExecutor)driver;
		
		jav.executeScript("arguments[0].scrollIntoView(true)",scrolldown);
		
		Thread.sleep(5000);
		
		WebElement readmore = driver.findElement(By.xpath("//a[text()='Read More']"));
		
		readmore.click();
		
		
		
		Thread.sleep(3000);
		WebElement scrolldown2 = driver.findElement(By.xpath("//div[contains(text(),'2013')]"));
		
		
        jav.executeScript("arguments[0].scrollIntoView(true)",scrolldown2 );
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
