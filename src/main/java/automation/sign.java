package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class sign {
public WebDriver driver;
@FindBy(linkText="Create your amazon account")
WebElement CreatyourAmazonaccount;
@FindBy(name="email")
WebElement Usename;
@FindBy(id="continue")
WebElement Continue;
@FindBy(name="password")
WebElement Password;
@FindBy(id="signInSubmit")
WebElement Signin;

public sign(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this);
}
public void createyourAccount(){
CreatyourAmazonaccount.click();
}
public void Username(String Users) {
Usename.sendKeys(Users);	
}
public void continuebuttonids() {
Continue.click();
}
public void psswdfieldChar(String  psswd) {
Password.sendKeys (psswd);
}
public void Signtoclick() {
Signin.click();
}
public void PasswordFieldChar() {
	// TODO Auto-generated method stub
	
}

}