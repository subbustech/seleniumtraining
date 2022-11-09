package pk01basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Pr56ScrollDown {

	public static void main(String[] args) throws InterruptedException {

		//Disabling Chrome push notifications
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(ops);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.deccanchronicle.com/");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor)driver;

		//Scroll until an element comes into view
		WebElement element1 = driver.findElement(By.xpath("//a[text()='Cartoon of the day']"));
		js.executeScript("arguments[0].scrollIntoView();", element1);
		Thread.sleep(1000);

		//Scroll to the bottom of the page
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);

		//Scroll to the top of the page
		js.executeScript("window.scrollTo(document.body.scrollHeight, 0)");
		Thread.sleep(2000);

		//Scroll by a particular no. of pixels
		js.executeScript("window.scrollBy(0, 1000)");

	}
}