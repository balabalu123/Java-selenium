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

public class ScreenshotTasksWorkout {
	
	
public static void main(String[] args) throws IOException, InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	
	TakesScreenshot take = (TakesScreenshot)driver;
	
	File defaultLocation = take.getScreenshotAs(OutputType.FILE);
	
	File desirablelocation = new File("C:\\Selinium\\Screenshot record files\\fbloginpage.png");
	
	
	FileUtils.copyFile(defaultLocation, desirablelocation);
	
	
	Thread.sleep(3000);
	
	WebElement username = driver.findElement(By.id("email"));
	
	username.sendKeys("balaaccuhealer@gmail.com");
	
	Thread.sleep(3000);
    TakesScreenshot take2 = (TakesScreenshot)driver;
	
	File defaultLocation2 = take.getScreenshotAs(OutputType.FILE);
	
	File desirablelocation2 = new File("C:\\Selinium\\Screenshot record files\\fbusername.png");
	
	
	FileUtils.copyFile(defaultLocation2, desirablelocation2);
	
	
	
	
	Thread.sleep(3000);
	
	WebElement password = driver.findElement(By.id("pass"));
	
	password.sendKeys("Balagood12345*&");
	
	Thread.sleep(3000);
	TakesScreenshot take3 = (TakesScreenshot) driver;
	
	
	File defaultlocation3 = take3.getScreenshotAs(OutputType.FILE);
	
	File desirablelocation3 = new File("C:\\Selinium\\Screenshot record files\\password.png");
	
	
	FileUtils.copyFile(defaultlocation3,desirablelocation3 );
	
	
	
	Thread.sleep(3000);
	
	
	WebElement loginbutton = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
	
	
	loginbutton.click();
	
	Thread.sleep(5000);
	TakesScreenshot take4 = (TakesScreenshot) driver;
	
	File Defaultlocation4 = take4.getScreenshotAs(OutputType.FILE);
	
	
	File desirablelocation4 = new File ("C:\\Selinium\\Screenshot record files\\loginbutton.png");
	
	
	FileUtils.copyFile(Defaultlocation4, desirablelocation4);
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	}

}
