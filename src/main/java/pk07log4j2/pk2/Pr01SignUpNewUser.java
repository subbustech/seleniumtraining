package pk07log4j2.pk2;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pk02.com.carrental.pages.RegisterLoginPage;
import pk07log4j2.pk1.Pr01NavigationBarCheckWithPOM;

//Use log4j2_2.xml
public class Pr01SignUpNewUser {

	private static Logger log = LogManager.getLogger(Pr01SignUpNewUser.class.getName());
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		log.trace("This is trace message");
		
		RegisterLoginPage registerLoginPage = new RegisterLoginPage(driver);

		registerLoginPage.returnLoginOrRegisterButton().click();
		
		WebDriverWait d=new WebDriverWait(driver,20);
		d.until(ExpectedConditions.elementToBeClickable(registerLoginPage.returnSignUpLink()));
		
		registerLoginPage.returnSignUpLink().click();
		
		registerLoginPage.returnFullNameTextBox().sendKeys("Subbu");
		log.debug("This is debug message");
		
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
		log.info("This is info message");
		
		registerLoginPage.returnPasswordTextBox().sendKeys("Test1234");
		log.warn("This is warn message");
		
		registerLoginPage.returnConfirmPasswordTextBox().sendKeys("Test1234");
		log.error("This is error message");
		
		registerLoginPage.returnSignUpButton().click();
		log.fatal("This is fatal message");
		
//		String successMsg = driver.switchTo().alert().getText();
//		if(successMsg.equalsIgnoreCase("Registration successfull. Now you can login")) {
//			System.out.println("Registration is successful");
//		}
//		else {
//			System.out.println("Registration is Not successful");
//		}
		
		//driver.switchTo().alert().dismiss();
		
		driver.quit();
	}

}
