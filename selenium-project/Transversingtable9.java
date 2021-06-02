package Activities;





import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Transversingtable9 {
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
	public void leads() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[@id='grouptab_0']")).click();
		System.out.println("Clicked slaes");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='moduleTab_9_Leads']")).click();
		System.out.println("Leads");	
		Thread.sleep(5000);
	}
	@Test(priority=3)
	public void accountstablename() throws InterruptedException {
		System.out.println("table1");
		Thread.sleep(5000);
		for (int i=1; i<=10; i++) {
		WebElement allRows= driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr["+i+"]/td[3]"));
		String name = allRows.getText();
		System.out.println("Name "+i+" is "+ name);
		
		}
		System.out.println("Name row");
	}
	@Test(priority=4)
	public void accountstableuser() throws InterruptedException {
		System.out.println("table1");
		Thread.sleep(5000);
		for (int i=1; i<=10; i++) {
			
		WebElement allRows= driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr["+i+"]/td[8]"));
		String name = allRows.getText();
		System.out.println(" User : "+i+" is "+ name );			
		
		}
		
		System.out.println("User row");
	}	
	
	@AfterTest
	public void closebrowser() {
		//closing the browser
		driver.close();
	}

	

}
