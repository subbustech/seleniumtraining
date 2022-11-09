package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pr45DisablePushNotificationsChrome {

	public static void main(String[] args) throws InterruptedException {

		//Disabling Chrome push notifications
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");


		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(ops);

		//Opening an URL
		driver.get("https://www.redbus.in");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Hydera");

	}

}
