package pk01basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pr48InsecureCertificatesChrome {

	public static void main(String[] args) throws InterruptedException {
		//Disabling Chrome push notifications
		ChromeOptions ops = new ChromeOptions();
		//ops.addArguments("disable-infobars");
		ops.setAcceptInsecureCerts(true);


		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(ops);

		//Opening an URL
		driver.get("https://localhost/selenium_practice/index/");

	}
}