package pk02com.carrental.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pk02.com.carrental.pages.RegisterLoginPage;

public class Pr04SignUpNewUser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		
		RegisterLoginPage registerLoginPage = new RegisterLoginPage(driver);

		registerLoginPage.returnLoginOrRegisterButton().click();
		
		WebDriverWait d=new WebDriverWait(driver,20);
		d.until(ExpectedConditions.elementToBeClickable(registerLoginPage.returnSignUpLink()));
		
		registerLoginPage.returnSignUpLink().click();
		
		registerLoginPage.returnFullNameTextBox().sendKeys("Subbu");
		
		registerLoginPage.returnMobileNoTextBox().sendKeys("7856475645");
		
		registerLoginPage.returnEmailIdTextBox().sendKeys("subbu1@gmail.com");
		registerLoginPage.returnEmailIdTextBox().sendKeys(Keys.TAB);
		
		String emailAvailableMsg = registerLoginPage.returnUserAvailabilityMessage().getText();
		
		if(emailAvailableMsg.equalsIgnoreCase("Email available for Registration .")) {
			System.out.println("Email Available for Registration");
		}
		else {
			System.out.println("Email Not Available for Registration");
		}
		
		registerLoginPage.returnPasswordTextBox().sendKeys("Test1234");
		
		registerLoginPage.returnConfirmPasswordTextBox().sendKeys("Test1234");
		
		registerLoginPage.returnSignUpButton().click();
		
		String successMsg = driver.switchTo().alert().getText();
		if(successMsg.equalsIgnoreCase("Registration successfull. Now you can login")) {
			System.out.println("Registration is successful");
		}
		else {
			System.out.println("Registration is Not successful");
		}
		
		driver.switchTo().alert().dismiss();
	}

}
