package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay3Que11 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement CreateAccount = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[1]"));
		
		CreateAccount.click();
		
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		
		firstname.sendKeys("Bala");
		
		
		Thread.sleep(3000);
		WebElement Lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		
		
		Lastname.sendKeys("Subramaniyam");
		
		
		Thread.sleep(3000);
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		
		
		email.sendKeys("balaaccuhome12$%@gmail.com");
		
		
		Thread.sleep(3000);
		WebElement password = driver.findElement(By.xpath("//input[@name='Passwd']"));
		
		password.sendKeys("Balagood123*#");
		
		
		Thread.sleep(3000);
		WebElement confirmpass = driver.findElement(By.name("ConfirmPasswd"));
		
		
		confirmpass.sendKeys("Balagood123*#");
		
		
		
		Thread.sleep(3000);
       
		WebElement next = driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[1]"));
		
		next.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
