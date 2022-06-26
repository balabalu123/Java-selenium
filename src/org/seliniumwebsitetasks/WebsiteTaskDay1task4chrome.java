package org.seliniumwebsitetasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay1task4chrome {

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
	
	//interfaceName objectRef = new ClassName();
	WebDriver driver = new ChromeDriver();
	

	//To Launch the browser
	
	
	driver.get("http://greenstech.in/selenium-course-content.html\r\n"+"");
	
	//To maximize the screen
	
     driver.manage().window().maximize();

	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
