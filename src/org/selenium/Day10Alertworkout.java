package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day10Alertworkout {

	
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement simplealertinsp = driver.findElement(By.xpath("(//button[contains(text(),'button')] )[1]"));
		
		simplealertinsp.click();
		
		Alert simplealert = driver.switchTo().alert();
		
		simplealert.accept();
		
		
		
		Thread.sleep(3000);
		
		WebElement alertwithokcancel = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
				
				alertwithokcancel.click();
				
				
				WebElement confirmalertinsp = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
				
				confirmalertinsp.click();
				
				
				Alert confirmalert = driver.switchTo().alert();
				confirmalert.dismiss();
				
				
				Thread.sleep(3000);
		
		WebElement Alertwithtextbox = driver.findElement(By.xpath("//a[contains(text(),'Textbox')] "));
		Alertwithtextbox.click();
		
		
		WebElement Promptinsp = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		Promptinsp.click();
		
		Alert promptalert = driver.switchTo().alert();
		
		promptalert.sendKeys("balu");
		promptalert.accept();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
