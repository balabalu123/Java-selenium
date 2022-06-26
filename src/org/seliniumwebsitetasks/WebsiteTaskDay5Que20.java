package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebsiteTaskDay5Que20 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/television-store?fm=neo%2Fmerchandising&iid=M_d6557c6c-7845-4b3e-a523-c819d03bb9da_1_372UD5BXDFYS_MC.AZUJARBK0TT8&otracker=hp_rich_navigation_1_1.navigationCard.RICH_NAVIGATION_Appliances~Televisions_AZUJARBK0TT8&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_1_L1_view-all&cid=AZUJARBK0TT8");
		
		driver.manage().window().maximize();
		
		 Thread.sleep(3000);
		
		WebElement tvandapp = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		
		
		act.moveToElement(tvandapp ).perform();
		
		 Thread.sleep(3000);
			
			WebElement mi = driver.findElement(By.xpath("/html[contains(@class,' fonts-loaded')]"));
			
			mi.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
