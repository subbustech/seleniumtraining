package pk11testnglisteners;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pk02.com.carrental.pages.NavigationBarWithConstructor;
import pk02.com.carrental.pages.RegisterLoginPage;

public class Pr02Login {

	@Test
	public void loginUser1() {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		
		RegisterLoginPage registerLoginPage = new RegisterLoginPage(driver);
		NavigationBarWithConstructor navigationBarWithConstructor = new NavigationBarWithConstructor(driver);

		registerLoginPage.returnLoginOrRegisterButton().click();

		registerLoginPage.returnLoginEmailAddressTextBox().sendKeys("robertsmith1@gmail.com");
		
		registerLoginPage.returnLoginPasswordTextBox().sendKeys("robert1234");
		
		registerLoginPage.returnLoginButton().click();
		
		navigationBarWithConstructor.returnUserDropdown().click();
		
		navigationBarWithConstructor.returnSignOutButton().click();
		
		driver.quit();
		
	}
	
	@Test
	public void loginUser2() {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		
		RegisterLoginPage registerLoginPage = new RegisterLoginPage(driver);
		NavigationBarWithConstructor navigationBarWithConstructor = new NavigationBarWithConstructor(driver);

		registerLoginPage.returnLoginOrRegisterButton().click();

		registerLoginPage.returnLoginEmailAddressTextBox().sendKeys("jamessmith1@gmail.com");
		
		registerLoginPage.returnLoginPasswordTextBox().sendKeys("james1234");
		
		registerLoginPage.returnLoginButton().click();
		
		navigationBarWithConstructor.returnUserDropdown().click();
		
		navigationBarWithConstructor.returnSignOutButton().click();
		
		driver.quit();
		
	}
	
	@Test
	public void loginUser3() {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		
		RegisterLoginPage registerLoginPage = new RegisterLoginPage(driver);
		NavigationBarWithConstructor navigationBarWithConstructor = new NavigationBarWithConstructor(driver);

		registerLoginPage.returnLoginOrRegisterButton().click();

		registerLoginPage.returnLoginEmailAddressTextBox().sendKeys("davidbirla1@gmail.com");
		
		registerLoginPage.returnLoginPasswordTextBox().sendKeys("david1234");
		
		registerLoginPage.returnLoginButton().click();
		
		navigationBarWithConstructor.returnUserDropdown().click();
		
		navigationBarWithConstructor.returnSignOutButton().click();
		
		driver.quit();
		
	}
	
	@Test
	public void loginUser4() {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		
		RegisterLoginPage registerLoginPage = new RegisterLoginPage(driver);
		NavigationBarWithConstructor navigationBarWithConstructor = new NavigationBarWithConstructor(driver);

		registerLoginPage.returnLoginOrRegisterButton().click();

		registerLoginPage.returnLoginEmailAddressTextBox().sendKeys("johnjames1@gmail.com");
		
		registerLoginPage.returnLoginPasswordTextBox().sendKeys("john1234");
		
		registerLoginPage.returnLoginButton().click();
		
		navigationBarWithConstructor.returnUserDropdown().click();
		
		navigationBarWithConstructor.returnSignOutButton().click();
		
		driver.quit();
		
	}
}
