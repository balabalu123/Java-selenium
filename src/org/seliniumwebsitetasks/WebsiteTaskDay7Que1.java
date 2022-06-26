package org.seliniumwebsitetasks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay7Que1 {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(3000);
		TakesScreenshot  take = (TakesScreenshot) driver;
		
		
		File defaultlocation = take.getScreenshotAs(OutputType.FILE);
		
		File desirablelocation = new File ("C:\\Selinium\\Screenshot record files\\day7que1.png");
		
		FileUtils.copyFile(defaultlocation, desirablelocation);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
