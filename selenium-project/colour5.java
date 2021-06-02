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

public class colour5 {
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
		String sales =driver.findElement(By.xpath("//a[@id='grouptab_0']")).getText();
		System.out.println("element text on the home page is :" +sales);
		//Assert.assertEquals(sales, "SALES");
		
	}
	
	@Test(priority=2)
	public void color() {
		
		WebElement toolbar= driver.findElement(By.xpath("//div[@id='toolbar']"));
		System.out.println("Color of the menu tool bar is :" +toolbar.getCssValue("color"));
	}
	
	@AfterTest
	public void closebrowser() {
		//closing the browser
		driver.close();
	}

	

}
