package common;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Utilbase {
public WebDriver driver;
@BeforeClass
@Parameters("browser")
public  void browsers(String browser) {
if(browser.equalsIgnoreCase("Chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rukhsana Chaudry\\eclipse-workspace\\Home\\src\\Driver\\chromedriver.exe"); 
driver=new  ChromeDriver(); 
	driver.navigate().to("https://www.amazon.com");
	driver.manage().window().maximize(); 
}else if(browser.equalsIgnoreCase("Firefox")) {
System.setProperty("WebDriver.gecko.driver","C:\\Users\\Rukhsana Chaudry\\eclipse-workspace\\Home\\src\\Driver\\geckodriver.exe" );
	driver=new FirefoxDriver();
	driver.get("https://www.Amazon.com");
	driver.manage().window().maximize();
}else {	
	System.out.println("correct browser name");}
	}
public void shots() throws IOException  {
Date dt=new Date();
System.out.println("dt");	
String si=dt.toString().replace(" ", "_ ").replace(": ",  " _"  );	
File dti=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(dti, new File("C:\\Users\\Rukhsana Chaudry\\eclipseTakesScreenshot)driver).getScreen-workspace\\Home\\src\\test\\"+si+"picture.png"));
}
@AfterClass
public void Afterclass() throws IOException {
shots();



}
}






















