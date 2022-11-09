package pk13testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pk02.com.carrental.pages.NavigationBarWithConstructor;
import pk02.com.carrental.pages.RegisterLoginPage;

public class Pr0GlobalData {

	Properties prop;
	FileInputStream fip;

	@Test
	public void loginUser1() throws IOException {

		prop = new Properties();
		fip = new FileInputStream("properties/application.properties");
		prop.load(fip);
		
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		if(prop.getProperty("browser").equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");
		}
		else if(prop.getProperty("browser").equals("firefox")){
			System.setProperty("webdriver.gecho.driver", "servers\\geckodriver.exe");
		}

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get(prop.getProperty("url"));

		RegisterLoginPage registerLoginPage = new RegisterLoginPage(driver);
		NavigationBarWithConstructor navigationBarWithConstructor = new NavigationBarWithConstructor(driver);

		registerLoginPage.returnLoginOrRegisterButton().click();

		registerLoginPage.returnLoginEmailAddressTextBox().sendKeys(prop.getProperty("username"));

		registerLoginPage.returnLoginPasswordTextBox().sendKeys(prop.getProperty("password"));

		registerLoginPage.returnLoginButton().click();

		navigationBarWithConstructor.returnUserDropdown().click();

		navigationBarWithConstructor.returnSignOutButton().click();

		driver.quit();

	}
}
