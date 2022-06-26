package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay3Que14 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.swiggy.com/");
		
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		
		WebElement signup = driver.findElement(By.xpath("//a[@class='r2iyh']"));
		
		signup.click();
		signup.
		
		
		Thread.sleep(3000);

		WebElement mobile = driver.findElement(By.xpath("//input[@id='mobile']"));
		
		mobile.sendKeys("9710685287");
		
		
		
		
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.xpath("//input[@id='name']"));
		
		name.sendKeys("Balasubramaniyam");
		
		
		Thread.sleep(3000);
       WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		
		email.sendKeys("balaaccudr@gmail.com");
		
		
		
		Thread.sleep(3000);
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		
		password.sendKeys("balagood123&%^");
		
		
		Thread.sleep(3000);
         WebElement Continue = driver.findElement(By.xpath("//a[@class='a-ayg']"));
		
		Continue.click();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
