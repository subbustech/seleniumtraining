package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr25KeyboardKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");

		Thread.sleep(2000);

		driver.findElement(By.id("firstname")).sendKeys("subbu");
		driver.findElement(By.id("firstname")).sendKeys(Keys.TAB);
		
		for(int i=0; i<3; i++) {
			Thread.sleep(2000);
			driver.findElement(By.id("cars_single_selection")).sendKeys(Keys.ARROW_DOWN);
		}
		
		Thread.sleep(3000);
		driver.quit();

	}
}