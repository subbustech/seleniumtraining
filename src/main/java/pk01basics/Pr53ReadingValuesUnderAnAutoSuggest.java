package pk01basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr53ReadingValuesUnderAnAutoSuggest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.in/");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Beng");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.UP);
		String placevalue = "return document.getElementById('src').value;";
		String value = (String) js.executeScript(placevalue);
		System.out.println(value);

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.DOWN);
		value = (String) js.executeScript(placevalue);
		System.out.println(value);

		driver.findElement(By.xpath("//input[@id='src']")).sendKeys(Keys.DOWN);
		value = (String) js.executeScript(placevalue);
		System.out.println(value);

	}
}