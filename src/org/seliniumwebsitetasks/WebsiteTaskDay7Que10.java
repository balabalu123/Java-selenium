package org.seliniumwebsitetasks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay7Que10 {
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get(" https://www.amazon.in/\r\n" + 
						"");
				
				driver.manage().window().maximize();
				
				Thread.sleep(3000);
				
				WebElement searchmotrolo = driver.findElement(By.id("twotabsearchtextbox"));
				
				
				searchmotrolo.sendKeys("motrolo",Keys.ENTER);
				
				 TakesScreenshot take = (TakesScreenshot)driver;
					
		            File source = take.getScreenshotAs(OutputType.FILE);
		            
		            File desirablelocation = new File("C:\\Selinium\\Screenshot record files\\Day7Que10.png");
		            
		            FileUtils.copyFile(source, desirablelocation);
		            
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
