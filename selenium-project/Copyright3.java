package Activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copyright3 {
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
		
		WebElement text= driver.findElement(By.xpath("//a[@id='admin_options']"));
		System.out.println("copyright text in the footer: " +text.getText());
		
		
		
	}
	@AfterTest
	public void closebrowser() {
		//closing the browser
		driver.close();
	}

	

}
