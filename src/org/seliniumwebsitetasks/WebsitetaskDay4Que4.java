package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsitetaskDay4Que4 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
WebElement omraddress = driver.findElement(By.xpath("(//div[contains(@class,'col-md-3 short-desc-with-logo widget widget_text')])[2]"));
		
		String text = omraddress.getText();
		
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
