package pk02.com.carrental.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterLoginPage {

	WebDriver driver;
	public RegisterLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement returnLoginOrRegisterButton() {
		return driver.findElement(By.xpath("//a[text()='Login / Register']"));
	}
	
	public WebElement returnSignUpLink() {
		return driver.findElement(By.xpath("//a[text()='Signup Here']"));
	}
	
	public WebElement returnFullNameTextBox() {
		return driver.findElement(By.xpath("//input[@name='fullname']"));
	}
	
	public WebElement returnMobileNoTextBox() {
		return driver.findElement(By.xpath("//input[@name='mobileno']"));
	}
	
	public WebElement returnEmailIdTextBox() {
		return driver.findElement(By.xpath("//input[@name='emailid']"));
	}
	
	public WebElement returnPasswordTextBox() {
		return driver.findElement(By.xpath("(//input[@name='password'])[2]"));
	}
	
	public WebElement returnConfirmPasswordTextBox() {
		return driver.findElement(By.xpath("//input[@name='confirmpassword']"));
	}
	
	public WebElement returnSignUpButton() {
		return driver.findElement(By.xpath("//input[@name='signup']"));
	}
	
	public WebElement returnUserAvailabilityMessage() {
		return driver.findElement(By.xpath("//span[@id='user-availability-status']/span"));
	}
	
	public WebElement returnSignUpCloseButton() {
		return driver.findElement(By.xpath("(//button[@class='close'])[2]"));
	}
	
	//Login page
	public WebElement returnLoginEmailAddressTextBox() {
		return driver.findElement(By.xpath("(//input[@name='email'])[1]"));
	}
	
	public WebElement returnLoginPasswordTextBox() {
		return driver.findElement(By.xpath("(//input[@name='password'])[1]"));
	}
	
	public WebElement returnLoginButton() {
		return driver.findElement(By.xpath("//input[@name='login']"));
	}
	
}