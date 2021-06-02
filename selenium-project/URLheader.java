package Activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class URLheader {
	WebDriver driver;
	@BeforeTest
	public void openurl() throws InterruptedException {
		//open browser
		driver =new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		Thread.sleep(5000);
	}
	@Test
	public void headerurl() {
		
		WebElement header= driver.findElement(By.xpath("//img[@alt='SuiteCRM']"));
		System.out.println("header: " +header.getAttribute("src"));
		
		
	}
	@AfterTest
	public void closebrowser() {
		//closing the browser
		driver.close();
	}

	

}
