package pk02.com.carrental.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterLoginPageFactory {

	WebDriver driver;
	public RegisterLoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Login / Register']") WebElement loginOrRegisterButton;
	public WebElement returnLoginOrRegisterButton() {
		return loginOrRegisterButton;
	}
	
	@FindBy(xpath="//a[text()='Signup Here']") WebElement signUpLink;
	public WebElement returnSignUpLink() {
		return signUpLink;
	}
	
	@FindBy(name="fullname") WebElement fullNameTextBox;
	public WebElement returnFullNameTextBox() {
		return fullNameTextBox;
	}
	
	@FindBy(name="mobileno") WebElement mobileNoTextBox;
	public WebElement returnMobileNoTextBox() {
		return mobileNoTextBox;
	}
	
	@FindBy(id="emailid") WebElement emailIdTextBox;
	public WebElement returnEmailIdTextBox() {
		return emailIdTextBox;
	}
	
	@FindBy(xpath="(//input[@name='password'])[2]") WebElement passwordTextBox;
	public WebElement returnPasswordTextBox() {
		return passwordTextBox;
	}

	@FindBy(xpath="(//input[@name='password'])[2]") WebElement confirmPasswordTextBox;
	public WebElement returnConfirmPasswordTextBox() {
		return confirmPasswordTextBox;
	}
	
	@FindBy(id="submit") WebElement signUpButton;
	public WebElement returnSignUpButton() {
		return signUpButton;
	}
	
	@FindBy(xpath="//span[@id='user-availability-status']/span") WebElement userAvailabilityMessage;
	public WebElement returnUserAvailabilityMessage() {
		return userAvailabilityMessage;
	}
}