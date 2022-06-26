package org.seliniumwebsitetasks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebsiteTaskDay7Que9A{
	
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get(" https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_0833f5ab-7820-422f-b784-9e4c2dc2b3cd_2_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_3_2.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L0_view-all&cid=ZRQ4DKH28K8J");
				
				driver.manage().window().maximize();
				
				
                Thread.sleep(3000);
				
				WebElement womens = driver.findElement(By.xpath("//span[text()='Women']"));
				
				
				Actions act = new Actions(driver);
				
			    act.moveToElement(womens).perform();
				
			    Thread.sleep(3000);
				
			    TakesScreenshot take = (TakesScreenshot)driver;		
				
				File source = take.getScreenshotAs(OutputType.FILE);
				
				File desirablelocation = new File("C:\\Selinium\\Screenshot record files\\Day7Que9A.png");
				
				FileUtils.copyFile(source, desirablelocation);
				
				
				
				
	
	
	
	
	
}
	
	
	
	
	
	

}
