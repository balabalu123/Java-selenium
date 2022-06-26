package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay4Que1 {

	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com ");
		
		
		driver.manage().window().maximize();
		
		
		WebElement textinspection = driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
		
		
		String text = textinspection.getText();
		
		System.out.println(text);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
