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

import com.google.common.base.Throwables;


public class WebsiteTaskDay7Que4 {
	
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://www.greenstechnologys.com/");
		
		driver.manage().window().maximize();
		
		
		JavascriptExecutor jav = (JavascriptExecutor) driver;
		
		Thread.sleep(3000);
		
		WebElement perumbakkamaddress = driver.findElement(By.xpath("(//div[@class='trainer-info'])[6]"));
		
		
		jav.executeScript("arguments[0].scrollIntoView(true);", perumbakkamaddress);
		
		
		Thread.sleep(3000);
		TakesScreenshot  take = (TakesScreenshot)driver;
		
		File source = take.getScreenshotAs(OutputType.FILE);
		
		File desirable = new File("C:\\Selinium\\Screenshot record files\\perumbakkamadd.png");
		
		FileUtils.copyFile(source, desirable);
		
		
		
		
		
		
		
		
	}

}
