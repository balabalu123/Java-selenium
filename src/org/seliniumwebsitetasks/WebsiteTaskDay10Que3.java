package org.seliniumwebsitetasks;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay10Que3 {

public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.homedepot.com/\r\n" + 
						"");
				
				
				driver.manage().window().maximize();
	
	
				Thread.sleep(3000);
	
	            WebElement searchbutton = driver.findElement(By.id("headerSearch"));
	
	
	
	            searchbutton.sendKeys("ceiling fan",Keys.ENTER);
	
	
 

				Thread.sleep(3000);
	
	             driver.findElement(By.xpath("(//a[text()='Indoor Ceiling Fans with Lights'])[2]")).click();
	
	
	
	             Thread.sleep(3000);
	         	
	
	
	    driver.findElement(By.xpath("(//span[text()='Merwry 52 in. Integrated LED Indoor Matte Black Ceiling Fan with Light Kit and Remote Control'])[1]")).click();
	
	
	
}
	
	
	
	
	
}
