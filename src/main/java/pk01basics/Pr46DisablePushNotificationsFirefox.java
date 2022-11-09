package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Pr46DisablePushNotificationsFirefox {

	public static void main(String[] args) throws InterruptedException {

		//Disabling Firefox push notifications
		FirefoxOptions ffo = new FirefoxOptions();
		ffo.addPreference("dom.webnotifications.enabled",false); 

		System.setProperty("webdriver.gecko.driver", "servers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(ffo);

		//Opening an URL
		driver.get("https://www.redbus.in");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Hydera");

	}

}
