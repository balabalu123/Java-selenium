package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WebsiteTaskDay5Que3 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.flipkart.com");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement Home = driver.findElement(By.xpath("//div[text()='Home']"));
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		
		act.moveToElement(Home).perform();
		
		
		
		Thread.sleep(3000);
		
		WebElement BathTowels = driver.findElement(By.xpath("//a[text()='Bath linen']"));
		
		BathTowels.click();
		
		Thread.sleep(3000);
		WebElement Product = driver.findElement(By.xpath("(//a[text()='Homeish Cotton 475 GSM Hand Towel Set'])[1]"));
		
		String text = Product.getText();
		System.out.println(text);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
