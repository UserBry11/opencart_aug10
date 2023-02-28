package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	@FindBy(name = "firstname")
	WebElement txtFirstname;
	
	@FindBy(name = "lastname")
	WebElement txtLastname;
	
	@FindBy(name = "email")
	WebElement txtEmail;
	
	@FindBy(name = "telephone")
	WebElement txtTelephone;
	
	@FindBy(name = "password")
	WebElement txtPassword;
	
	@FindBy(name = "confirm")
	WebElement txtConfirm;
	
	@FindBy(name = "chkdPolicy")
	WebElement chkdPolicy;
	
	@FindBy(name = "agree")
	WebElement txtAgree;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	public void setFirstName(String fname) {
		txtFirstname.sendKeys(fname);
	}
	
	public void setLasName(String lname) {
		txtLastname.sendKeys(lname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String pwd)
	{
		txtConfirm.sendKeys(pwd);
	}
	
	public void setPrivacyPolicy() {
		chkdPolicy.click();
	}
	
	public void clickContinue() {
		btnContinue.click();
	}
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e){
			return (e.getMessage());
		}
	}
	
}
