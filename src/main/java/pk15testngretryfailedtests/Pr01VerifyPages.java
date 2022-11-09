package pk15testngretryfailedtests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import pk04Screenshots.GetScreenshots;

public class Pr01VerifyPages {

	ExtentReports extent;
	ExtentSparkReporter spark;
	ExtentTest test;
	WebDriver driver;

	@BeforeTest
	public void initiateExtentReports() {
		extent = new ExtentReports();

		spark = new ExtentSparkReporter("reports/ExtentReportResults.html");

		extent.attachReporter(spark);
	}

	@AfterMethod
	public void getResult(ITestResult result) throws IOException {

		if(result.getStatus() == ITestResult.FAILURE) {

			test.log(Status.FAIL, "Test Case Failed: "+result.getName());

			test.log(Status.FAIL, "Test Case Failed: "+result.getThrowable()).fail(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"homepage"), "Home Page").build());
			
			driver.quit();
		}
		else if(result.getStatus() == ITestResult.SKIP) {
			
			test.log(Status.SKIP, "Test Case Skipped: "+result.getName());
			
			test.log(Status.SKIP, "Test Case Skipped: "+result.getThrowable()).skip(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"homepage"), "Home Page").build());
			
			driver.quit();
		}
	}

	@AfterTest
	public void flushReports() {
		extent.flush();
	}

	@Test(retryAnalyzer = RetryFailedTests.class)
	public void verifyHomePage() {

		test = extent.createTest("Home Page Test");

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");

		boolean header1 = driver.findElement(By.xpath("//h2[contains(text(),'1Find the Best') and span[contains(text(),'CarForYou')]]")).isDisplayed();

		if(header1) {
			System.out.println("Home Page is verified successfully");
			test.log(Status.PASS, "Home Page is verified successfully").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"homepage"), "Home Page").build());
		}
		else {
			System.out.println("Home Page can't be verified");
			test.log(Status.FAIL, "Home Page can't be verified successfully").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"homepage"), "Home Page").build());
		}

		driver.close();
	}

	@Test
	public void verifyAboutUsPage() {

		test = extent.createTest("About Us Page Test");

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");

		driver.findElement(By.xpath("(//a[text()='About Us'])[1]")).click();

		boolean header1 = driver.findElement(By.xpath("//h2[contains(text(),'About Us')]")).isDisplayed();

		if(header1) {
			System.out.println("About Us Page is verified successfully");
			test.log(Status.PASS, "About Us Page is verified successfully").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"aboutus"), "About Us Page").build());
		}
		else {
			System.out.println("About Us Page can't be verified");
			test.log(Status.FAIL, "About Us Page can't be verified successfully").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"aboutus"), "About Us Page").build());
		}

		driver.close();
	}

	@Test
	public void verifyCarListingPage() {

		test = extent.createTest("Car Listing Page Test");

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");

		driver.findElement(By.xpath("//a[text()='Car Listing']")).click();

		boolean header1 = driver.findElement(By.xpath("//h1[text()='Car Listing']")).isDisplayed();

		if(header1) {
			System.out.println("Car Listing Page is verified successfully");
			test.log(Status.PASS, "Car Listing Page is verified successfully").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"carlisting"), "Car Listing Page").build());
		}
		else {
			System.out.println("Car Listing Page can't be verified");
			test.log(Status.FAIL, "Car Listing Page can't be verified successfully").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"carlisting"), "Car Listing Page").build());
		}

		driver.close();
	}

	@Test
	public void verifyFAQsPage() {

		test = extent.createTest("FAQs Page Test");

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");

		driver.findElement(By.xpath("(//a[text()='FAQs'])[1]")).click();

		boolean header1 = driver.findElement(By.xpath("//h1[text()='FAQs']")).isDisplayed();

		if(header1) {
			System.out.println("FAQs Page is verified successfully");
			test.log(Status.PASS, "FAQs Page is verified successfully").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"faqs"), "FAQs Page").build());
		}
		else {
			System.out.println("FAQs Page can't be verified");
			test.log(Status.FAIL, "FAQs Page can't be verified successfully").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"faqs"), "FAQs Page").build());
		}

		driver.close();
	}

	@Test
	public void verifyContactUsPage() {

		test = extent.createTest("Contact Us Page Test");

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");

		driver.findElement(By.xpath("(//a[text()='Contact Us'])[1]")).click();

		boolean header1 = driver.findElement(By.xpath("//h1[text()='Contact Us']")).isDisplayed();

		if(header1) {
			System.out.println("Contact Us Page is verified successfully");
			test.log(Status.PASS, "Contact Us Page is verified successfully").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"contactus"), "Contact Us Page").build());
		}
		else {
			System.out.println("Contact Us Page can't be verified");
			test.log(Status.FAIL, "Contact Us Page can't be verified successfully").pass(MediaEntityBuilder.createScreenCaptureFromPath(GetScreenshots.captureScreenshot(driver,"contactus"), "Contact Us Page").build());
		}

		driver.close();
	}

}