package pk01basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Pr49InsecureCertificatesFirefox {

	public static void main(String[] args) throws InterruptedException {
		FirefoxOptions fo = new FirefoxOptions();
		fo.setAcceptInsecureCerts(true);

		System.setProperty("webdriver.gecko.driver", "servers\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver(fo);

		//Opening an URL
		driver.get("https://localhost/selenium_practice/index/");

	}
}