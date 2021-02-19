package Com.programing.Home;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Homescnario {
  @Test
  public void f() {
System.out.println("this is test annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
 System.out.println("this is before method annotation");  
  }

  @AfterMethod
  public void afterMethod() {
 System.out.println("this is after method annotation");
  }

  @BeforeClass
  public void beforeClass() {
  System.out.println("this is before class annotation");
  }

  @AfterClass
  public void afterClass() {
 System.out.println("this is after class annotation");
  }

}
