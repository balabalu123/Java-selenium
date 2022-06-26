package org.seliniumwebsitetasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay8Que2 {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
WebElement alertwithokcancel = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		
		alertwithokcancel.click();
		
		
		WebElement confirmalertinsp = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		
		confirmalertinsp.click();
		
		
		Alert confirmalert = driver.switchTo().alert();
		confirmalert.accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
