package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class JavaScriptWorkout {
	
	public static void main(String[] args) throws InterruptedException {
		
  System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	JavascriptExecutor jav =(JavascriptExecutor) driver;
	
	WebElement textuser = driver.findElement(By.id("email"));
	
	jav.executeScript("arguments[0].setAttribute('value','balaaccudr@gmail.com')", textuser);
	
    //To get the attribute values(send key information)
	
	Object executeScript = jav.executeScript("return arguments[0].getAttribute('value')", textuser);
	System.out.println(executeScript);
	
	//To get the attribute values	
	Object executeScript2 = jav.executeScript("return arguments[0].getAttribute('id')", textuser);
	
	System.out.println(executeScript2);
	
	Thread.sleep(3000);
	WebElement textpass = driver.findElement(By.id("pass"));
	
	jav.executeScript("arguments[0].setAttribute('value','Balahealer12314584*#')", textpass );
	Thread.sleep(3000);
	
	WebElement loginbutton = driver.findElement(By.name("login"));
	
	jav.executeScript("arguments[0].click()",loginbutton );
	
	}
	
	
	

}
