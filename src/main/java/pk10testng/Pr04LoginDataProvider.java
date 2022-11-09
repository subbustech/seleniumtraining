package pk10testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pk02.com.carrental.pages.NavigationBarWithConstructor;
import pk02.com.carrental.pages.RegisterLoginPage;

public class Pr04LoginDataProvider {

	@Test(dataProvider="getData")
	public void loginUser1(String username, String password) {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://localhost/carrental");
		
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
	
	@DataProvider
	public Object[][] getData() {
		//First combination - robertsmith1@gmail.com and robert1234
		//Second combination - jamessmith1@gmail.com and james1234
		//Third combination - davidbirla1@gmail.com and david1234
		//Fourth combination - johnjames1@gmail.com and john1234
		Object[][] data = new Object[4][2];
		
		data[0][0] = "robertsmith1@gmail.com";
		data[0][1] = "robert1234";
		
		data[1][0] = "jamessmith1@gmail.com";
		data[1][1] = "james1234";
		
		data[2][0] = "davidbirla1@gmail.com";
		data[2][1] = "david1234";
		
		data[3][0] = "johnjames1@gmail.com";
		data[3][1] = "john1234";
		
		return data;
	}

}
