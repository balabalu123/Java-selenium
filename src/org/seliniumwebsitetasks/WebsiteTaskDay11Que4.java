package org.seliniumwebsitetasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay11Que4 {

	
	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		
		driver.manage().window().maximize();
		
		
		
List<WebElement> trows = driver.findElements(By.tagName("tr"));
		
		
		int size = trows.size();
		
		System.out.println(size);
		
		
		List<WebElement> tdatas = driver.findElements(By.tagName("td"));
		
		int size2 = tdatas.size();
		System.out.println(size2);
		
		
		for (int i = 0; i < tdatas.size(); i++) {
			
			WebElement webElement = tdatas.get(i);
			
			String text = webElement.getText();
			System.out.println(text);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
