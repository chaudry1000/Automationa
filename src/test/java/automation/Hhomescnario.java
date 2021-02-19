package automation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import common.Utilbase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import javax.print.DocFlavor.STRING;

import org.apache.commons.exec.OS;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Hhomescnario  extends  Utilbase {
 
//WebDriver driver;

	@Test
  public void f() {
  Home ob=new Home(driver);
 ob.ComputerOfClick();
ob.GiftCardsclick();	
ob.FindAGiftclick();	
	
	}
 @Test 
public  void CreateTheAccount(WebElement SigninlinkClick) throws InterruptedException  {
Home Home=new Home(driver) ;
sign login=new sign(driver);
Create create=new Create(driver);
Actions actions=new Actions(driver) ;
SoftAssert ob=new SoftAssert();
WebElement  SigninbuttonClick =Home.Signinbuttonclick();
WebElement SignInPage=Home.Signinlink();
actions.moveToElement(SignInPage).build().perform(); 
actions.moveToElement(SigninbuttonClick).click().build().perform();
login.createyourAccount();
create.firstusernameEnter() ;
create.UserIdEmailEnter() ;
create.paswdOfAccount(); 
create.ReenterOfPassword ();
Thread.sleep(6000);
create.CreateOfAccount();
Create.posswordToverify();
WebElement psswdOfText=Create.posswordToverify(); 
boolean results=psswdOfText.isDisplayed();
 
System.out.println("This is the result for displayed="+results); 
String tx=psswdOfText.getText(); 
 System.out.println(tx);
 ob.assertAll();
 
 
 }

 
 
 
 
 
 
  
  public void f6() {
 System.out.println("This is test6  annotation");
  } 
  @BeforeClass
  public void beforeClass() {
	  
		  System.setProperty("webdriver.chrome.driver","C:\\Usesana Chaudry\\eclipse-workspace\\Home\\src\\Driver\\chromedriver.exe"); 
			driver=new  ChromeDriver(); 
			driver.navigate().to("https://www.amazon.com");
			 driver.manage().window().maximize(); 
  }

  @AfterClass
  public void afterClass() {
  System.out.println("this is after class annotation");;
  }



}

