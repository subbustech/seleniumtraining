package pk08testng;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pk02.com.carrental.pages.MyTestimonialsPage;
import pk02.com.carrental.pages.NavigationBarWithConstructor;
import pk02.com.carrental.pages.PostATestimonial;
import pk02.com.carrental.pages.RegisterLoginPage;

public class Pr05WithAnnotations {

	WebDriver driver;

	//@BeforeMethod
	//@BeforeClass
	//@BeforeTest
	@BeforeSuite
	public void loginToCarRental() {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");

		RegisterLoginPage registerLoginPage = new RegisterLoginPage(driver);

		//Login to CarRental as a User
		registerLoginPage.returnLoginOrRegisterButton().click();

		registerLoginPage.returnLoginEmailAddressTextBox().sendKeys("robertsmith1@gmail.com");

		registerLoginPage.returnLoginPasswordTextBox().sendKeys("robert1234");

		registerLoginPage.returnLoginButton().click();
	}

	@Test
	public void postTestimonialUser_FirstTime() {

		NavigationBarWithConstructor navigationBarWithConstructor = new NavigationBarWithConstructor(driver);
		PostATestimonial postATestimonial = new PostATestimonial(driver); 
		MyTestimonialsPage myTestimonialsPage = new MyTestimonialsPage(driver);

		//Post a new testimonial
		navigationBarWithConstructor.returnUserDropdown().click();

		navigationBarWithConstructor.returnPostATestimonialButton().click();

		Date date = new Date();

		long time = date.getTime();

		String message = "Nice Service - "+time;

		postATestimonial.returnTextArea().sendKeys(message);

		postATestimonial.returnSaveButton().click();

		//Get Success Message
		String successMessage = postATestimonial.returnSuccessDiv().getText();

		if(successMessage.equalsIgnoreCase("SUCCESS:Testimonail submitted successfully")) {
			System.out.println("SUCCESS:Testimonail submitted successfully");
		}
		else {
			System.out.println("FAILURE: Testimonial not submitted successfully");
		}

		navigationBarWithConstructor.returnUserDropdown().click();

		navigationBarWithConstructor.returnMyTestimonialButton().click();

		if(myTestimonialsPage.returnLatestTestimonial(message).isDisplayed()) {
			System.out.println("Testimonial is successfully posted");
		}
		else {
			System.out.println("Testimonial is not posted");
		}

	}

	@Test
	public void postTestimonialUser_SecondTime() {

		NavigationBarWithConstructor navigationBarWithConstructor = new NavigationBarWithConstructor(driver);
		PostATestimonial postATestimonial = new PostATestimonial(driver); 
		MyTestimonialsPage myTestimonialsPage = new MyTestimonialsPage(driver);

		//Post a new testimonial
		navigationBarWithConstructor.returnUserDropdown().click();

		navigationBarWithConstructor.returnPostATestimonialButton().click();

		Date date = new Date();

		long time = date.getTime();

		String message = "Nice Service - "+time;

		postATestimonial.returnTextArea().sendKeys(message);

		postATestimonial.returnSaveButton().click();

		//Get Success Message
		String successMessage = postATestimonial.returnSuccessDiv().getText();

		if(successMessage.equalsIgnoreCase("SUCCESS:Testimonail submitted successfully")) {
			System.out.println("SUCCESS:Testimonail submitted successfully");
		}
		else {
			System.out.println("FAILURE: Testimonial not submitted successfully");
		}

		navigationBarWithConstructor.returnUserDropdown().click();

		navigationBarWithConstructor.returnMyTestimonialButton().click();

		if(myTestimonialsPage.returnLatestTestimonial(message).isDisplayed()) {
			System.out.println("Testimonial is successfully posted");
		}
		else {
			System.out.println("Testimonial is not posted");
		}

	}

	@Test
	public void postTestimonialUser_ThirdTime() {

		NavigationBarWithConstructor navigationBarWithConstructor = new NavigationBarWithConstructor(driver);
		PostATestimonial postATestimonial = new PostATestimonial(driver); 
		MyTestimonialsPage myTestimonialsPage = new MyTestimonialsPage(driver);

		//Post a new testimonial
		navigationBarWithConstructor.returnUserDropdown().click();

		navigationBarWithConstructor.returnPostATestimonialButton().click();

		Date date = new Date();

		long time = date.getTime();

		String message = "Nice Service - "+time;

		postATestimonial.returnTextArea().sendKeys(message);

		postATestimonial.returnSaveButton().click();

		//Get Success Message
		String successMessage = postATestimonial.returnSuccessDiv().getText();

		if(successMessage.equalsIgnoreCase("SUCCESS:Testimonail submitted successfully")) {
			System.out.println("SUCCESS:Testimonail submitted successfully");
		}
		else {
			System.out.println("FAILURE: Testimonial not submitted successfully");
		}

		navigationBarWithConstructor.returnUserDropdown().click();

		navigationBarWithConstructor.returnMyTestimonialButton().click();

		if(myTestimonialsPage.returnLatestTestimonial(message).isDisplayed()) {
			System.out.println("Testimonial is successfully posted");
		}
		else {
			System.out.println("Testimonial is not posted");
		}

	}

	@Test
	public void postTestimonialUser_FourthTime() {

		NavigationBarWithConstructor navigationBarWithConstructor = new NavigationBarWithConstructor(driver);
		PostATestimonial postATestimonial = new PostATestimonial(driver); 
		MyTestimonialsPage myTestimonialsPage = new MyTestimonialsPage(driver);

		//Post a new testimonial
		navigationBarWithConstructor.returnUserDropdown().click();

		navigationBarWithConstructor.returnPostATestimonialButton().click();

		Date date = new Date();

		long time = date.getTime();

		String message = "Nice Service - "+time;

		postATestimonial.returnTextArea().sendKeys(message);

		postATestimonial.returnSaveButton().click();

		//Get Success Message
		String successMessage = postATestimonial.returnSuccessDiv().getText();

		if(successMessage.equalsIgnoreCase("SUCCESS:Testimonail submitted successfully")) {
			System.out.println("SUCCESS:Testimonail submitted successfully");
		}
		else {
			System.out.println("FAILURE: Testimonial not submitted successfully");
		}

		navigationBarWithConstructor.returnUserDropdown().click();

		navigationBarWithConstructor.returnMyTestimonialButton().click();

		if(myTestimonialsPage.returnLatestTestimonial(message).isDisplayed()) {
			System.out.println("Testimonial is successfully posted");
		}
		else {
			System.out.println("Testimonial is not posted");
		}

	}

	//@AfterMethod
	//@AfterClass
	//@AfterTest
	@AfterSuite
	public void logoutAndClose() {
		
		NavigationBarWithConstructor navigationBarWithConstructor = new NavigationBarWithConstructor(driver);
		
		navigationBarWithConstructor.returnUserDropdown().click();

		navigationBarWithConstructor.returnSignOutButton().click();

		driver.quit();
	}
}