package org.seliniumwebsitetasks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay8Que4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
				
				
				driver.manage().window().maximize();
				
				Thread.sleep(3000);
				
				WebElement frameset = driver.findElement(By.name("login_page"));
				
				driver.switchTo().frame(frameset);
	              
	
				
				WebElement continuebutton = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
				
				
				continuebutton.click();
	
	
	
	           Alert okbutton = driver.switchTo().alert();
	           
	           
	           okbutton.accept();
	
	
	
	}
	
	
	
	

}
