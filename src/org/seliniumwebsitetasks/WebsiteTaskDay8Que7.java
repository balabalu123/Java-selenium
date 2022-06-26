package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay8Que7 {
	
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://netbanking.hdfcbank.com/netbanking/\r\n" + 
						"");
				
				
				driver.manage().window().maximize();
				
				
				Thread.sleep(3000);
				
				WebElement frameset = driver.findElement(By.name("login_page"));
				
				driver.switchTo().frame(frameset);
				
				Thread.sleep(3000);
				WebElement customerid = driver.findElement(By.name("fldLoginUserId"));
				
				customerid.sendKeys("985421GDH",Keys.ENTER);
				
				
				Thread.sleep(3000);
				WebElement password = driver.findElement(By.id("fldPasswordDispId"));
				
				password.sendKeys("Bala1554dfgf#2");
				
				
	}

}
