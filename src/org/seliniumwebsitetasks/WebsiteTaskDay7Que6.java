package org.seliniumwebsitetasks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay7Que6 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://greenstech.in/selenium-course-content.html");
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		
		
		WebElement topseleniumtrends = driver.findElement(By.xpath("(//h3[@title='Top Selenium Trends In 2020'])[1]"));
		
		JavascriptExecutor jav =  (JavascriptExecutor)driver;
		
		
		jav.executeScript("arguments[0].scrollIntoView(true);", topseleniumtrends);
		
		Thread.sleep(3000);
		TakesScreenshot take = (TakesScreenshot)driver;
		
		File source = take.getScreenshotAs(OutputType.FILE);
		
		File desirable = new File("C:\\Selinium\\Screenshot record files\\Day7Que6.png");
		
		FileUtils.copyFile(source, desirable);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
