package pk01basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pr02BasicScriptOnFirefox {

public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "servers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.google.com");

	}

}
