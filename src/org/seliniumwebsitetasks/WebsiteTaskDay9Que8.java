package org.seliniumwebsitetasks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebsiteTaskDay9Que8 {

	
	public static void main(String[] args) throws InterruptedException {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/\r\n" + 
				"");
		
		driver.manage().window().maximize();
		
		
        Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.id("username"));
		
		username.sendKeys("balagood123");
		
		Thread.sleep(3000);
		
		
		WebElement password = driver.findElement(By.id("password"));
		
		password.sendKeys("0Y8525");
		
		Thread.sleep(3000);
		
		WebElement Loginbutton = driver.findElement(By.id("login"));
		
		Loginbutton.click();
		
		Thread.sleep(3000);
		
		WebElement Location = driver.findElement(By.id("location"));
		
		Select s = new Select(Location);
		
		s.selectByIndex(4);
		Thread.sleep(3000);
		WebElement hotels = driver.findElement(By.id("hotels"));
		
		Select s1 = new Select(hotels);
		s1.selectByValue("Hotel Hervey");
		Thread.sleep(3000);
		WebElement roomtype = driver.findElement(By.id("room_type"));
		
		Select s2 = new Select(roomtype);
		
		s2.selectByVisibleText("Double");
		
		Thread.sleep(3000);
		WebElement roomnos = driver.findElement(By.id("room_nos"));
		
		Select s3 = new Select(roomnos);
		s3.selectByIndex(2);
		
		Thread.sleep(3000);
		WebElement datepickin = driver.findElement(By.id("datepick_in"));
		
		datepickin.sendKeys("06/03/2022");
		
		
		Thread.sleep(3000);
		WebElement datepickout = driver.findElement(By.id("datepick_out"));
		
		datepickout.sendKeys("07/03/2022");
		
		Thread.sleep(3000);
		WebElement adultsperroom = driver.findElement(By.id("adult_room"));
		
		
		Select s4 = new Select(adultsperroom);
		
		s4.selectByValue("3");
		
		Thread.sleep(3000);
		WebElement childroom = driver.findElement(By.id("child_room"));
		
		Select s5 = new Select(childroom);
		
		s5.selectByIndex(3);
		
		Thread.sleep(3000);
		WebElement submitbutton = driver.findElement(By.id("Submit"));
		
		submitbutton.click();
		
		Thread.sleep(3000);
		WebElement radiobutton = driver.findElement(By.id("radiobutton_0"));
		
		radiobutton.click();
		Thread.sleep(3000);
		WebElement continuebutton = driver.findElement(By.id("continue"));
		
		continuebutton.click();
		
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.id("first_name"));
		
		firstname.sendKeys("Bala");
		Thread.sleep(3000);
		WebElement lastname = driver.findElement(By.id("last_name"));
		
		
		lastname.sendKeys("subramaniyam");
		
		Thread.sleep(3000);
		WebElement address = driver.findElement(By.id("address"));
		
		
		address.sendKeys("No.16,Solaiyappan street,old washermenpet chennai-21");
		
		Thread.sleep(3000);
		WebElement ccnum = driver.findElement(By.id("cc_num"));
		
		ccnum.sendKeys("2789 9999 0000 8987");
		
		Thread.sleep(3000);
		WebElement cctype = driver.findElement(By.id("cc_type"));
		
		Select s6 = new Select(cctype);
		
		
		s6.selectByValue("VISA");
		
		Thread.sleep(3000);
		WebElement expmonth = driver.findElement(By.id("cc_exp_month"));
		
		Select s7 = new Select(expmonth);
		
		s7.selectByIndex(6);
		
		Thread.sleep(3000);
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		
		Select s8 = new Select(expyear);
		
		s8.selectByVisibleText("2022");
		
		Thread.sleep(3000);
		WebElement cvvnum = driver.findElement(By.id("cc_cvv"));
		
		cvvnum.sendKeys("234");
		
		Thread.sleep(3000);
		WebElement bookbutton = driver.findElement(By.id("book_now"));
		
		bookbutton.click();
		
		
		
		
		
	     Thread.sleep(3000);
		
		WebElement ordernumber = driver.findElement(By.name("order_no"));
		
		
		
		String attribute = ordernumber.getAttribute("value");
		
		System.out.println(attribute);
		
	}
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}
