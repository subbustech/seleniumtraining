package pk08testng;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pk02.com.carrental.pages.MyTestimonialsPage;
import pk02.com.carrental.pages.NavigationBarWithConstructor;
import pk02.com.carrental.pages.PostATestimonial;
import pk02.com.carrental.pages.RegisterLoginPage;

public class Pr04NoAnnotations {

	@Test
	public void postTestimonialUser_FirstTime() {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		
		RegisterLoginPage registerLoginPage = new RegisterLoginPage(driver);
		NavigationBarWithConstructor navigationBarWithConstructor = new NavigationBarWithConstructor(driver);
		PostATestimonial postATestimonial = new PostATestimonial(driver); 
		MyTestimonialsPage myTestimonialsPage = new MyTestimonialsPage(driver);

		//Login to CarRental as a User
		registerLoginPage.returnLoginOrRegisterButton().click();

		registerLoginPage.returnLoginEmailAddressTextBox().sendKeys("robertsmith1@gmail.com");
		
		registerLoginPage.returnLoginPasswordTextBox().sendKeys("robert1234");
		
		registerLoginPage.returnLoginButton().click();
		
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
		
		navigationBarWithConstructor.returnUserDropdown().click();
		
		navigationBarWithConstructor.returnSignOutButton().click();
		
		driver.quit();
		
	}
	
	@Test
	public void postTestimonialUser_SecondTime() {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		
		RegisterLoginPage registerLoginPage = new RegisterLoginPage(driver);
		NavigationBarWithConstructor navigationBarWithConstructor = new NavigationBarWithConstructor(driver);
		PostATestimonial postATestimonial = new PostATestimonial(driver); 
		MyTestimonialsPage myTestimonialsPage = new MyTestimonialsPage(driver);

		//Login to CarRental as a User
		registerLoginPage.returnLoginOrRegisterButton().click();

		registerLoginPage.returnLoginEmailAddressTextBox().sendKeys("robertsmith1@gmail.com");
		
		registerLoginPage.returnLoginPasswordTextBox().sendKeys("robert1234");
		
		registerLoginPage.returnLoginButton().click();
		
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
		
		navigationBarWithConstructor.returnUserDropdown().click();
		
		navigationBarWithConstructor.returnSignOutButton().click();
		
		driver.quit();
		
	}
	
	@Test
	public void postTestimonialUser_ThirdTime() {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		
		RegisterLoginPage registerLoginPage = new RegisterLoginPage(driver);
		NavigationBarWithConstructor navigationBarWithConstructor = new NavigationBarWithConstructor(driver);
		PostATestimonial postATestimonial = new PostATestimonial(driver); 
		MyTestimonialsPage myTestimonialsPage = new MyTestimonialsPage(driver);

		//Login to CarRental as a User
		registerLoginPage.returnLoginOrRegisterButton().click();

		registerLoginPage.returnLoginEmailAddressTextBox().sendKeys("robertsmith1@gmail.com");
		
		registerLoginPage.returnLoginPasswordTextBox().sendKeys("robert1234");
		
		registerLoginPage.returnLoginButton().click();
		
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
		
		navigationBarWithConstructor.returnUserDropdown().click();
		
		navigationBarWithConstructor.returnSignOutButton().click();
		
		driver.quit();
		
	}
	
	@Test
	public void postTestimonialUser_FourthTime() {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		
		RegisterLoginPage registerLoginPage = new RegisterLoginPage(driver);
		NavigationBarWithConstructor navigationBarWithConstructor = new NavigationBarWithConstructor(driver);
		PostATestimonial postATestimonial = new PostATestimonial(driver); 
		MyTestimonialsPage myTestimonialsPage = new MyTestimonialsPage(driver);

		//Login to CarRental as a User
		registerLoginPage.returnLoginOrRegisterButton().click();

		registerLoginPage.returnLoginEmailAddressTextBox().sendKeys("robertsmith1@gmail.com");
		
		registerLoginPage.returnLoginPasswordTextBox().sendKeys("robert1234");
		
		registerLoginPage.returnLoginButton().click();
		
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
		
		navigationBarWithConstructor.returnUserDropdown().click();
		
		navigationBarWithConstructor.returnSignOutButton().click();
		
		driver.quit();
		
	}
}
