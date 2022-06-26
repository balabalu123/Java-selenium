package org.seliniumwebsitetasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay11Que5 {

	public static void main(String[] args) {
		
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		
		driver.manage().window().maximize();
		
		
		List<WebElement> trows = driver.findElements(By.tagName("tr"));
		
          for (int i = 0; i < 2; i++) {
        	  
        	  
        	  if(i%2!=0) {
			
			WebElement webElement = trows.get(i);
			
			String text = webElement.getText();
			
			System.out.println(text);
			
			
		
        	  }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
          }
		
		
		
		
		
	}
}
