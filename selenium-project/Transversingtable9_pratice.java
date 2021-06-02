package Activities;





import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Transversingtable9_pratice {
	WebDriver driver;
	WebDriverWait wait= new WebDriverWait(driver,20);
	
	
	@BeforeTest
	public void openurl() throws InterruptedException {
		try {
		//open browser
		driver =new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/crm/");
		driver.manage().window().maximize();
		}
		catch(Throwable t ){
			t.printStackTrace();
		}
		}
	
	
	@Test(priority=1)
	public void login() {
		try {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");	
		driver.findElement(By.xpath("//input[@id='username_password']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
		}
		catch(Throwable t) {
			t.printStackTrace();	
		}
		
	}
	
	@Test(priority=2)
	public void leads() throws InterruptedException {
		try {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='grouptab_0']")));		
		driver.findElement(By.xpath("//a[@id='grouptab_0']")).click();
		System.out.println("Clicked slaes");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='moduleTab_9_Leads']")));
		driver.findElement(By.xpath("//a[@id='moduleTab_9_Leads']")).click();
		System.out.println("Leads");	
		//Thread.sleep(5000);
		}
		catch(Throwable t) {
			t.printStackTrace();	
		}
	}
	
	@Test(priority=3)
	public void accountstable() throws InterruptedException {
		try {
		System.out.println("table1");
		//Thread.sleep(5000);
		for (int i=1; i<=10; i++) {	
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@class='list view table-responsive']/tbody/tr["+i+"]/td[3]")));	
		WebElement allRows= driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr["+i+"]/td[3]"));
		WebElement user= driver.findElement(By.xpath("//table[@class='list view table-responsive']/tbody/tr["+i+"]/td[8]"));
		String name = allRows.getText();
		String username = user.getText();
		System.out.println(" row name "+i+" is "+ name + " and corresponding user access:"+username );				
		}
		}
		catch(Throwable t) {
			t.printStackTrace();	
		}
		
		}
		
	
	@AfterTest
	public void closebrowser() {
		try {
		//closing the browser
		driver.close();
		}
		catch(Throwable t) {
			t.printStackTrace();	
		}
	}

	

}
