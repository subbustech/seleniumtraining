package pk10testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pk02.com.carrental.pages.NavigationBarWithConstructor;
import pk02.com.carrental.pages.RegisterLoginPage;

public class Pr03LoginMultipleParameters {

	@Parameters({"URL","USERNAME","PASSWORD"})
	@Test
	public void loginUser1(String urlname, String username, String password) {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(urlname);
		
		RegisterLoginPage registerLoginPage = new RegisterLoginPage(driver);
		NavigationBarWithConstructor navigationBarWithConstructor = new NavigationBarWithConstructor(driver);

		registerLoginPage.returnLoginOrRegisterButton().click();

		registerLoginPage.returnLoginEmailAddressTextBox().sendKeys(username);
		
		registerLoginPage.returnLoginPasswordTextBox().sendKeys(password);
		
		registerLoginPage.returnLoginButton().click();
		
		navigationBarWithConstructor.returnUserDropdown().click();
		
		navigationBarWithConstructor.returnSignOutButton().click();
		
		driver.quit();
		
	}

}
