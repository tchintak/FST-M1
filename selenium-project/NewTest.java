package Activities;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("@test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("@Beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@Aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass");
  }

}
