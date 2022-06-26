package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebsitetaskDay5Que15 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		 Thread.sleep(3000);
		
		WebElement signinmouseover = driver.findElement(By.xpath("(//span[contains(text(),'Hello')])[2]"));
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
	    act.moveToElement(signinmouseover).perform();
		
		 Thread.sleep(3000);
			
			WebElement Starthere = driver.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
			Starthere.click();
		
			Thread.sleep(3000);
		WebElement username = driver.findElement(By.id("ap_customer_name"));
		username.sendKeys("balagood123");
		
		Thread.sleep(3000);	
		WebElement email = driver.findElement(By.id("ap_email"));
		email.sendKeys("balaaccuhealer@gmail.com");
		
		
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.id("ap_password"));
     	password.sendKeys("Balau12346534");
		Thread.sleep(3000);
		WebElement confirmpass = driver.findElement(By.id("ap_password_check"));
		confirmpass.sendKeys("Balau12346534");
		
		Thread.sleep(3000);
		WebElement Continue = driver.findElement(By.id("continue"));
		Continue.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
