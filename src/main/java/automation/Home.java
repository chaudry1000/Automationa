package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
WebDriver driver;
@FindBy(linkText="Find a Gift")
WebElement FindAGIft;
@FindBy(linkText="Gift Cards")
WebElement GiftCardsAmazon;
@FindBy(linkText="Computers")
WebElement  Computers;
@FindBy(xpath="//*[text()='Hello,Sign in']")
WebElement Signinbutton;
@FindBy(xpath="//*[text()='Sign in']")
WebElement Signinlink;
public Home(WebDriver  driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
public void FindAGiftclick() {
	FindAGIft.click();
}
public void GiftCardsclick() {
GiftCardsAmazon.click();
}
public void ComputerOfClick() {
ComputerOfClick();
}
public WebElement Signinbuttonclick() {
return Signinbutton;
}		
public WebElement Signinlink() {
return Signinlink();
}



	
	

}
