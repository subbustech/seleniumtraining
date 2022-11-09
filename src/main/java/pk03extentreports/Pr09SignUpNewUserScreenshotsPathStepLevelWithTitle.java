package pk03extentreports;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pk02.com.carrental.pages.RegisterLoginPage;
import pk04Screenshots.GetScreenshots;

public class Pr09SignUpNewUserScreenshotsPathStepLevelWithTitle {

	public static void main(String[] args) {

		ExtentReports extent = new ExtentReports();
	
		ExtentSparkReporter spark = new ExtentSparkReporter("reports/ExtentReportResults.html");

		extent.attachReporter(spark);

		ExtentTest test = extent.createTest("Sign Up Test");

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		test.log(Status.PASS, "Navigated to the specified URL").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"homepage"), "Home Page").build());

		RegisterLoginPage registerLoginPage = new RegisterLoginPage(driver);

		registerLoginPage.returnLoginOrRegisterButton().click();
		test.log(Status.PASS, "Clicked on Login / Regisgter button").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"loginpage"), "Login Page").build());
		
		WebDriverWait d=new WebDriverWait(driver,20);
		d.until(ExpectedConditions.elementToBeClickable(registerLoginPage.returnSignUpLink()));

		registerLoginPage.returnSignUpLink().click();
		test.log(Status.PASS, "Clicked on Sign Up Link").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"signuppage"), "Sign Up Page").build());

		registerLoginPage.returnFullNameTextBox().sendKeys("Subbu");
		test.log(Status.PASS, "Entered First Name").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"firstname"), "First Name Entered").build());

		registerLoginPage.returnMobileNoTextBox().sendKeys("7856475645");
		test.log(Status.PASS, "Entered Mobile Number").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"mobileno"), "Mobile No. Entered").build());

		registerLoginPage.returnEmailIdTextBox().sendKeys("subbu1@gmail.com");
		registerLoginPage.returnEmailIdTextBox().sendKeys(Keys.TAB);
		test.log(Status.PASS, "Entered Email Id").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"emailid"), "Email Id Entered").build());

		String emailAvailableMsg = registerLoginPage.returnUserAvailabilityMessage().getText();

		if(emailAvailableMsg.equalsIgnoreCase("Email available for Registration .")) {
			test.log(Status.PASS, "Email Available for Registration").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"emailavailable"), "Email Available").build());
		}
		else {
			System.out.println("Email Not Available for Registration");
			test.log(Status.FAIL, "Email Not Available for Registration").fail(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"emailnotavailable"), "Email Not Available").build());
		}

		registerLoginPage.returnPasswordTextBox().sendKeys("Test1234");
		test.log(Status.PASS, "Entered Password").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"passwordentered"), "Password Entered").build());

		registerLoginPage.returnConfirmPasswordTextBox().sendKeys("Test1234");
		test.log(Status.PASS, "Entered Confirm Password").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"confirmpassword"), "Confirm Password Entered").build());

		registerLoginPage.returnSignUpButton().click();
		test.log(Status.PASS, "Click on Sign Up Button").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"clicksignup"), "Clicked on Sign Up").build());

		try {
			String successMsg = driver.switchTo().alert().getText();
			if(successMsg.equalsIgnoreCase("Registration successfull. Now you can login")) {
				test.log(Status.PASS, "Registration is successful").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"regsuccess"), "Registration Successful").build());
				driver.switchTo().alert().dismiss();
			}
			else {
				test.log(Status.FAIL, "Registration is not successful").fail(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"registrationnotsuccess"), "Registration Not Successful").build());
				extent.flush();
			}
		}
		catch(Exception e) {
			test.log(Status.FAIL, "Registration is not successful").fail(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"registrationnotsuccess"), "Registration Not Successful").build());
			extent.flush();	
		}

	}

}