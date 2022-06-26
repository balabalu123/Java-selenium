package org.seliniumwebsitetasks;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay10Que2 {
public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.snapdeal.com/ ");
				
				
				driver.manage().window().maximize();
				
				
				Thread.sleep(3000);
				
				
				WebElement searchiphones7 = driver.findElement(By.id("inputValEnter"));
				
				
				searchiphones7.sendKeys("iphones 7",Keys.ENTER);
				Thread.sleep(3000);
				
				WebElement click1stphone = driver.findElement(By.xpath("//p[text()='Apple iPhone 7 Hybrid Transparent Mobile Cover by NBOX - Black']"));
				
				
				click1stphone.click();
				
				
				
				String parentwindow = driver.getWindowHandle();
				
				System.out.println(parentwindow );
				
				
				
				Set<String> allwindow = driver.getWindowHandles();
				
				
				System.out.println(allwindow);
				
				
				for (String x : allwindow) {
					
					
					
					
					
					if(!parentwindow.equals(x));
					
					
					driver.switchTo().window(x);
					
					
				}
				
				Thread.sleep(3000);
				WebElement addtocartbutton = driver.findElement(By.xpath("//span[text()='add to cart']"));
				
				
				
				addtocartbutton .click();
				
				Thread.sleep(3000);
				WebElement printcost = driver.findElement(By.xpath("//div[@class='you-pay']"));
				
				String text = printcost.getText();
				
				System.out.println(text);
				
				
				
				
				
				
				
				
}

}
