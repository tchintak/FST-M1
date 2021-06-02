package Activities;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Activities6 {
	WebDriver driver;
	
	
	@BeforeTest
	public void openurl() throws InterruptedException {
		//open browser
		driver =new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	@Test(priority=1)
	public void login() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");	
		driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@id='bigbutton']")).click();	
		
		
	}
	
	@Test(priority=2)
	public void leadcreen() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[@id='grouptab_0']")).click();
		System.out.println("Clicked slaes");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='moduleTab_9_Leads']")).click();
		System.out.println("leads");			
	}
	
	@Test(priority=3)
	public void additionalicon() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(6000);
		System.out.println("Entered to leads page");
		driver.findElement(By.xpath("(//span[@title='Additional Details'])[8]")).click();
		//Thread.sleep(6000);
		System.out.println("Clicked the i button");		
		
	}
	@Test(priority=4)
	public void phonenumber() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);
		System.out.println("Entered to additional pop up page");
        String  num=driver.findElement(By.xpath("//span[@class='phone']")).getText();
		//Thread.sleep(5000);
		System.out.println("Phone number is: " +num);		
		
	}
	
	
	
	@AfterTest
	public void closebrowser() {
		//closing the browser
		driver.close();
	}

	

}
