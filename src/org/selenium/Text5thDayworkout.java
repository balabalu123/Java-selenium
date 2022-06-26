package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text5thDayworkout {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/java-training-in-chennai.html");
		
		
		driver.manage().window().maximize();
		//To inspect the text value
		
		WebElement textinspection = driver.findElement(By.xpath("//h1[text()='Java Training in Chennai']"));
		
		String text = textinspection.getText();
		
		System.out.println(text);
		
		
		//To print the entire paragraph
		
		WebElement paratext = driver.findElement(By.xpath("(//p[contains(text(),'beginner ')][1])"));
		
		String text2 = paratext.getText();
		
		System.out.println(text2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
