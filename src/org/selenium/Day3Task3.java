
package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Task3 {

	
	public static void main(String[] args) {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://auth.alipay.com/login/global.htm");
		
		
		driver.manage().window().maximize();
		
		
		WebElement textuser = driver.findElement(By.id("logonId"));
		
		
		textuser.sendKeys("karthi12345#@gmail.com");
		
		
		WebElement textpassword = driver.findElement(By.id("password_rsainput"));
		
		textpassword.sendKeys("Karthi123*#");
		

		WebElement loginbutton = driver.findElement(By.id("J-login-global-btn"));
		
		loginbutton.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
