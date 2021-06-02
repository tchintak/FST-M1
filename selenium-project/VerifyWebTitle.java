package Activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyWebTitle {
	WebDriver driver;

	@BeforeTest
	public void openurl() throws InterruptedException {
		//open browser
		driver =new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		Thread.sleep(5000);
	}
	
	@Test
	public void verifytitle() {
		
		String Title = driver.getTitle();
		System.out.println("URL title : " +Title);
		Assert.assertEquals(Title, "SuiteCRM");
	}
	
	@AfterTest
	public void closebrowser() {
		//closing the browser
		driver.close();
	}

}
