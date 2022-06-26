package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		//interfaceName objectRef = new ClassName();
		WebDriver driver = new ChromeDriver();
		
	
		//To Launch the browser
		
		
		driver.get("https://www.facebook.com/");
		
		//To maximize the screen
		
	     driver.manage().window().maximize();
	
		
		//To inspect the username webelement
	     
	     
	     WebElement textuser = driver.findElement(By.id("email"));
		
		//To send the values to the username web element
	     
	     textuser.sendKeys("balaaccu107@gmail.com");
	     
		// To inspect the password web element
	     
	     
	     WebElement textpass = driver.findElement(By.id("pass"));
	     
	     
	   //To insert the values to the password web element
	     
	     textpass.sendKeys("Balu123*$451");
	     
	     //	 To inspect the login web element
	     
	     WebElement loginButton = driver.findElement(By.name("login"));
	     
	     loginButton.click();
	     
	     
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
