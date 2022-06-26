package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebsiteTaskDay12Que1 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement scrolldown = driver.findElement(By.xpath("(//span[contains(text(),'+91- 89399 15577')] )[4]"));
		
		
		JavascriptExecutor jav = (JavascriptExecutor)driver;
		
		jav.executeScript("arguments[0].scrollIntoView(true)",scrolldown );
		
		
		Thread.sleep(3000);
		WebElement print = driver.findElement(By.xpath("(//div[@class='trainer-info'])[5]"));
		
		
		String text = print.getText();
		
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
