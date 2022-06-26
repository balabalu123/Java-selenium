package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framesworkout2 {

	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		
		
		
		List<WebElement> numberofframes = driver.findElements(By.tagName("iframe"));
		
		int size = numberofframes.size();
		
		System.out.println(size);
		
		
		
		WebElement jmeterframe = driver.findElement(By.id("a077aa5e"));
		
		
		driver.switchTo().frame(jmeterframe);
		
		
		WebElement jmeterclick = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		
		jmeterclick.click();
		
		
	}
	
	
	
	
	
	
}
