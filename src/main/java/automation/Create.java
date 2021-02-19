package automation;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create {
WebDriver driver;
@FindBy(name="customerName")
static
WebElement firstusername;
@FindBy(name="email")
static
WebElement UserIdEmail;
@FindBy(name="password")
WebElement passwordofAccount;
@FindBy(name="passwordCheck")
WebElement pswdidcheck;
@FindBy(xpath="//*[contains(text(), ' Create your Amazon account ')]")
WebElement createOfAccount;
@FindBy(xpath="(//*div[contains(text(),'Password must be at least')])[2]")
WebElement passwordToVerify;


public Create(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver, this); 
}
public  void  firstusernameEnter() {
firstusername.sendKeys("Jhon");
}
public  void UserIdEmailEnter() {
UserIdEmail.sendKeys("9@gmail.com");
}
public void paswdOfAccount() {
passwordofAccount.sendKeys("1234");
}
public void ReenterOfPassword() {
	pswdidcheck.sendKeys("Jhon");
}
public void  CreateOfAmazonaccount() {
createOfAccount.click();
}
public static  WebElement posswordToverify() {
return posswordToverify();
}
public void AmazonToClick() {
	// TODO Auto-generated method stub
	
}
public void CreateOfAccount() {
	// TODO Auto-generated method stub
	
}	


	
}




