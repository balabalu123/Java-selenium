package org.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptScrollDownUpWorkout {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.in/");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor jav =(JavascriptExecutor) driver;
		
		
		WebElement scrolldown = driver.findElement(By.xpath("//h2[text()='Today’s Deals']"));
		
		
		jav.executeScript("arguments[0].scrollIntoView(true)",scrolldown );
		
		
		Thread.sleep(3000);
		
		WebElement scrollup = driver.findElement(By.xpath("//h2[text()='Top trending this summer']"));
		
		
		jav.executeScript("arguments[0].scrollIntoView(false)", scrollup);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
