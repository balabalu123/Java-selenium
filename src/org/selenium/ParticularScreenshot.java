package org.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParticularScreenshot {
	
	
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		
		WebElement particularscreenshot = driver.findElement(By.xpath("//form[@class='_9vtf']"));
		
		File particular = particularscreenshot.getScreenshotAs(OutputType.FILE);
		
		
		File desirablelocation = new File("C:\\Selinium\\Screenshot record files\\particular web.png");
		
		
		FileUtils.copyFile(particular, desirablelocation);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
