package automation;

import org.testng.asserts.SoftAssert;
import org.w3c.dom.UserDataHandler;

import common.Utilbase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

@SuppressWarnings("unused")
public class provider  extends Utilbase{
 //WebDriver driver;
	
	
	@Test(dataProvider = "dp")
  public void f(String n, String s) throws Throwable {
		Home Home=new Home(driver) ;
		sign login=new sign(driver);
		Create create=new Create(driver);
		Actions actions=new Actions(driver) ;
		SoftAssert ob=new SoftAssert();
		WebElement  SigninbuttonClick =Home.Signinbuttonclick();
		WebElement SignInPage=Home.Signinlink();	
		actions.moveToElement(SignInPage).build().perform(); 
		actions.moveToElement(SigninbuttonClick).click().build().perform();	
	//shots();
		login.Username(s);		
	//shots();
		login.PasswordFieldChar();
	System.out.println(s);
	login.Signtoclick();
	Thread.sleep(6000);
	create.AmazonToClick();
	//shots();
	
	
	}

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Jhon@gmail.com", "jhon" },
      new Object[] { "nchaudry@hotmail.com.com ","testing" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  

	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Rukhsana Chaudry\\eclipse-workspace\\Home\\src\\Driver\\chromedriver.exe"); 
		driver=new  ChromeDriver(); 
		driver.navigate().to("https://www.amazon.com");
		 driver.manage().window().maximize(); 
//browsers("Chrome"); 
  }

@AfterClass
  public void afterClass() throws IOException {
  



	 
	
	


	
	
	

}
}	
	










  
	
	
	
	

	
