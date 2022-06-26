package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay2Que9 {

	
	public static void main(String[] args) throws InterruptedException  {
		
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html\r\n" +		"");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		firstname.sendKeys("Abu");
		
		
		Thread.sleep(3000);
		WebElement Lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		
		Lastname.sendKeys("Mohammed");
		
		
		Thread.sleep(5000);
		
		WebElement Address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		
		Address.sendKeys("No.1/1,Muthu street,john Colony,kaladipet chennai-19");
		
		
		Thread.sleep(3000);
        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		
		email.sendKeys("Mohammed1323@gmail.com");
		
		Thread.sleep(3000);		
        WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		
		phone.sendKeys("8654528564");
		
		Thread.sleep(3000);
        WebElement password = driver.findElement(By.id("firstpassword"));
		
		password.sendKeys("mohammed123456");
		
		Thread.sleep(3000);
        WebElement confirmpassword = driver.findElement(By.id("secondpassword"));
		
		confirmpassword.sendKeys("mohammed123456");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
