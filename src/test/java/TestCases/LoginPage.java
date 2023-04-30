package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
		
	@FindBy(name="user-name")
	WebElement userName;
	
	@FindBy(id="password")
	WebElement password;
	
	
	@FindBy(name="login-button")
	WebElement loginBtn;
	
		
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
public void LoginFunction(String UserNameVal,String PasswordVal) {
		 
		
		
		userName.sendKeys(UserNameVal);
		password.sendKeys(PasswordVal);
		loginBtn.click();
		
	}
	

}
