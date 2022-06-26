package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay3Que13 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement Mobilenumber = driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']"));
		
		Mobilenumber.sendKeys("9710685287");
		
		
		
		Thread.sleep(3000);
		
        WebElement Continue = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		
		
		Continue.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
