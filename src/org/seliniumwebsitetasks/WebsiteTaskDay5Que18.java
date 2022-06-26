package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebsiteTaskDay5Que18 {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_d8eeece1-eb09-4bde-bde2-9eeb984dea42_1_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_3_1.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L0_view-all&cid=ZRQ4DKH28K8J");
		
		driver.manage().window().maximize();
		
		 Thread.sleep(3000);
		
		WebElement Babyskids = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		
		
		act.moveToElement(Babyskids).perform();
		
		 Thread.sleep(3000);
			
			
		    WebElement Remote = driver.findElement(By.xpath("//html[contains(@class,' fonts-loaded')][1]"));
		
		    Remote.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
