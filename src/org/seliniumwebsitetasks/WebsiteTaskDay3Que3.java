package org.seliniumwebsitetasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebsiteTaskDay3Que3 {

	public static void main(String[] args) throws InterruptedException  {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html\r\n" +"");
		
		
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		
		firstname.sendKeys("Bala");
		
		WebElement Lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		
		Lastname.sendKeys("Subramaniyam");
		
		Thread.sleep(3000);
		
		
		WebElement Address = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		
		
		Address.sendKeys("No.16/8,solaiyappan street,chennai-21");
		
	
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		
		email.sendKeys("balaaccudr@gmail.com");
		
		
		Thread.sleep(2000);
		
		WebElement Mobilenumber = driver.findElement(By.xpath("//input[@type='tel']"));
		
		Mobilenumber.sendKeys("9710685287");
		
		
		Thread.sleep(2000);
		
		WebElement gender = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		
		gender.click();
		
		Thread.sleep(2000);
		
		WebElement hobbies = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		
		hobbies.click();
		
		
		Thread.sleep(3000);
		
		WebElement languages = driver.findElement(By.xpath("//div[@style='min-height:30px;max-width:200px']"));
		
		languages.click();
		
		Thread.sleep(5000);
		
		WebElement arabic = driver.findElement(By.xpath("(//a[@class='ui-corner-all'])[1]"));
		
		arabic.click();
		
		
		Thread.sleep(3000);
		
        WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		
		skills.click();
		
		
		Thread.sleep(2000);
		
		WebElement country = driver.findElement(By.xpath("//select[@id='countries']"));
		
		country.click();
		
		
		
		Thread.sleep(2000);
		
		WebElement selectcountry = driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));
		
		selectcountry.click();
		
		
		Thread.sleep(2000);
		WebElement india = driver.findElement(By.xpath("//select[@id='countries']"));
		
		india.click();
		
		
		Thread.sleep(2000);
		
		
		WebElement year = driver.findElement(By.xpath("//select[@id='yearbox']"));
		
		year.click();
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		
		month.click();
		
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='daybox']"));
		
		day.click();
		
		Thread.sleep(2000);
		
		
		WebElement password = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		
		password.sendKeys("Bala123$%");;
		
		Thread.sleep(2000);
		
		WebElement confirmpass = driver.findElement(By.xpath("//input[@id='secondpassword']"));
	
		confirmpass.sendKeys("Bala123$%");;
		
		Thread.sleep(2000);
		
		
		WebElement submit = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		
		submit.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
