package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pr27ActionsClassDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");

		Thread.sleep(2000);

		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.id("description"))).doubleClick().build().perform();
		driver.findElement(By.id("description")).sendKeys(Keys.BACK_SPACE);
		//You can use Keys.DELETE as well after selection
		//driver.findElement(By.id("description")).sendKeys(Keys.DELETE);
		//Instead of using two separate statements we can do it in a single statement //a.moveToElement(driver.findElement(By.id("description"))).doubleClick().sendKeys(Keys.BACK_SPACE).build().perform();
		Thread.sleep(3000);
		driver.quit();

	}
}