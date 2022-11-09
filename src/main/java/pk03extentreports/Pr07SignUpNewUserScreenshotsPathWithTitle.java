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
import pk04Screenshots.GetScreenshots;

public class Pr07SignUpNewUserScreenshotsPathWithTitle {

	public static void main(String[] args) {

		ExtentReports extent = new ExtentReports();
	
		ExtentSparkReporter spark = new ExtentSparkReporter("reports/ExtentReportResults.html");

		extent.attachReporter(spark);

		ExtentTest test = extent.createTest("Sign Up Test");

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		test.log(Status.PASS, "Navigated to the specified URL").addScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver, "homepage"),"home page screenshot");

		RegisterLoginPage registerLoginPage = new RegisterLoginPage(driver);

		registerLoginPage.returnLoginOrRegisterButton().click();
		test.log(Status.PASS, "Clicked on Login / Regisgter button").addScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver, "loginpage"), "login page");
		
		WebDriverWait d=new WebDriverWait(driver,20);
		d.until(ExpectedConditions.elementToBeClickable(registerLoginPage.returnSignUpLink()));

		registerLoginPage.returnSignUpLink().click();
		test.log(Status.PASS, "Clicked on Sign Up Link").addScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver, "signuppage"), "Sign Up Page");

		registerLoginPage.returnFullNameTextBox().sendKeys("Subbu");
		test.log(Status.PASS, "Entered First Name").addScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver, "enteredfirstname"), "Entered First Name");

		registerLoginPage.returnMobileNoTextBox().sendKeys("7856475645");
		test.log(Status.PASS, "Entered Mobile Number").addScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver, "enteredmobileno"), "Entered Mobile No");

		registerLoginPage.returnEmailIdTextBox().sendKeys("subbu1@gmail.com");
		registerLoginPage.returnEmailIdTextBox().sendKeys(Keys.TAB);
		test.log(Status.PASS, "Entered Email Id").addScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver, "enteredemailid"), "Entered Email Id");

		String emailAvailableMsg = registerLoginPage.returnUserAvailabilityMessage().getText();

		if(emailAvailableMsg.equalsIgnoreCase("Email available for Registration .")) {
			test.log(Status.PASS, "Email Available for Registration").addScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver, "emailavailable"), "Email Available");
		}
		else {
			System.out.println("Email Not Available for Registration");
			test.log(Status.FAIL, "Email Not Available for Registration").addScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver, "emailnotavailable"), "Email Not Available");
		}

		registerLoginPage.returnPasswordTextBox().sendKeys("Test1234");
		test.log(Status.PASS, "Entered Password").addScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver, "enteredpwd"), "Entered Password");

		registerLoginPage.returnConfirmPasswordTextBox().sendKeys("Test1234");
		test.log(Status.PASS, "Entered Confirm Password").addScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver, "enteredconfirmpwd"), "Entered Confirm Password");

		registerLoginPage.returnSignUpButton().click();
		test.log(Status.PASS, "Click on Sign Up Button").addScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver, "clickedsignup"), "Clicked Sign Up");

		try {
			String successMsg = driver.switchTo().alert().getText();
			if(successMsg.equalsIgnoreCase("Registration successfull. Now you can login")) {
				test.log(Status.PASS, "Registration is successful").addScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver, "registrationsuccessful"), "Registration Successful");
				driver.switchTo().alert().dismiss();
			}
			else {
				test.log(Status.FAIL, "Registration is not successful").addScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver, "registrationnotsuccessful"), "Registration Not Successful");
				extent.flush();
			}
		}
		catch(Exception e) {
			test.log(Status.FAIL, "Registration is not successful").addScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver, "registrationnotsuccessful"), "Registration Not Successful");
			extent.flush();	
		}

	}

}