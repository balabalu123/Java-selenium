package org.seliniumwebsitetasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebsiteTaskDay9Que2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoqa.com/automation-practice-form/\r\n" + 
				"");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		WebElement city = driver.findElement(By.xpath("//div[@class='col-md-4 col-sm-12'][2]"));
		
		
		Select s = new Select (city);
		
		List<WebElement> options = s.getOptions();
		
		
		for (int i = 0; i < options.size(); i++) {
			
			if(i%2==0) {
			
			WebElement webElement = options.get(i);
			
			String text = webElement.getText();
			
			System.out.println(text);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
