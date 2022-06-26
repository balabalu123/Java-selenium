package org.seliniumwebsitetasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class websiteTaskDay9Que7 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement country = driver.findElement(By.name("country"));
		
		Select s = new Select(country);
		
		List<WebElement> options = s.getOptions();
		
		
		for (WebElement x : options) {
			
			String attribute = x.getAttribute("value");
			
			System.out.println(attribute);
			
			
			}
		
			Thread.sleep(10000);
		WebElement register = driver.findElement(By.xpath("//input[@type='submit']"));
		
		
		register.click();
			}

}
