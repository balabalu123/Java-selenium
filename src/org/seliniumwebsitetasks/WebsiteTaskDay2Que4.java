package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay2Que4 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&CTA_FLAG=DEPOSIT&ITM=nli_cms_FD_Primer_FDTaxSaverFD_INVESTINATAXS");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement textuser = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		
		
		textuser.sendKeys("balubalu12358");
		
		Thread.sleep(3000);
		
		WebElement password = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		
		
		password.sendKeys("Balu123456");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
