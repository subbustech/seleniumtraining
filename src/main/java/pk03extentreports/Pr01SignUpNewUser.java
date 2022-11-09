package pk03extentreports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pk02.com.carrental.pages.RegisterLoginPage;

public class Pr01SignUpNewUser {

	public static void main(String[] args) {

		ExtentReports extent = new ExtentReports();
	
		ExtentSparkReporter spark = new ExtentSparkReporter("reports/ExtentReportResults.html");

		extent.attachReporter(spark);

		ExtentTest test = extent.createTest("Extent Reports Test");


		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		test.log(Status.PASS, "Navigated to the specified URL");

		RegisterLoginPage registerLoginPage = new RegisterLoginPage(driver);

		registerLoginPage.returnLoginOrRegisterButton().click();
		test.log(Status.PASS, "Clicked on Login / Regisgter button");

		WebDriverWait d=new WebDriverWait(driver,20);
		d.until(ExpectedConditions.elementToBeClickable(registerLoginPage.returnSignUpLink()));

		registerLoginPage.returnSignUpLink().click();
		test.log(Status.PASS, "Clicked on Sign Up Link");

		registerLoginPage.returnFullNameTextBox().sendKeys("Subbu");
		test.log(Status.PASS, "Entered First Name");

		registerLoginPage.returnMobileNoTextBox().sendKeys("7856475645");
		test.log(Status.PASS, "Entered Mobile Number");

		registerLoginPage.returnEmailIdTextBox().sendKeys("subbu1@gmail.com");
		registerLoginPage.returnEmailIdTextBox().sendKeys(Keys.TAB);
		test.log(Status.PASS, "Entered Email Id");

		String emailAvailableMsg = registerLoginPage.returnUserAvailabilityMessage().getText();

		if(emailAvailableMsg.equalsIgnoreCase("Email available for Registration .")) {
			System.out.println("Email Available for Registration");
			test.log(Status.PASS, "Email Available for Registration");
		}
		else {
			System.out.println("Email Not Available for Registration");
			test.log(Status.FAIL, "Email Not Available for Registration");
		}

		registerLoginPage.returnPasswordTextBox().sendKeys("Test1234");
		test.log(Status.PASS, "Entered Password");

		registerLoginPage.returnConfirmPasswordTextBox().sendKeys("Test1234");
		test.log(Status.PASS, "Entered Confirm Password");

		registerLoginPage.returnSignUpButton().click();
		test.log(Status.PASS, "Click on Sign Up Button");

		try {
			String successMsg = driver.switchTo().alert().getText();
			if(successMsg.equalsIgnoreCase("Registration successfull. Now you can login")) {
				test.log(Status.PASS, "Registration is successful");
				driver.switchTo().alert().dismiss();
			}
			else {
				test.log(Status.FAIL, "Registration is not successful");
				extent.flush();
			}
		}
		catch(Exception e) {
			test.log(Status.FAIL, "Registration is not successful");
			extent.flush();	
		}

	}

}