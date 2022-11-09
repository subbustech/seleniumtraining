package pk01basics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr52JavascriptExecutor {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("alert('Welcome to Selenium with Java Tutorials')");
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
	}
}