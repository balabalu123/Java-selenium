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

public class WebsiteTaskDay7Que11 {
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get(" https://www.flipkart.com/babycare19-store?fm=neo%2Fmerchandising&iid=M_d6f6de25-4c7b-4d5f-bd5c-c0c4d8344a1e_2_372UD5BXDFYS_MC.9AN2RP44B3PG&otracker=hp_rich_navigation_5_2.navigationCard.RICH_NAVIGATION_Beauty%252C%2BToys%2B%2526%2BMore~Baby%2BCare_9AN2RP44B3PG&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_5_L1_view-all&cid=9AN2RP44B3PG");
				
				driver.manage().window().maximize();
				
				Thread.sleep(5000);
				
				WebElement babyandkids = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
				
				
				Actions act = new Actions(driver);
				
			    act.moveToElement(babyandkids).perform();
				
			    Thread.sleep(5000);
				
			    TakesScreenshot take = (TakesScreenshot)driver;		
				
				File source = take.getScreenshotAs(OutputType.FILE);
				
				File desirablelocation = new File("C:\\Selinium\\Screenshot record files\\Day7Que11.png");
				
				FileUtils.copyFile(source, desirablelocation);
				
				
				
				
				
	}

}
