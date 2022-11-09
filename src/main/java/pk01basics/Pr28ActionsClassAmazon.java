package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pr28ActionsClassAmazon {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://www.amazon.in");

		Actions a = new Actions(driver);

		a.moveToElement(driver.findElement(By.xpath("//span[text()='Hello, sign in']"))).build().perform();
		
		Thread.sleep(2000);

		driver.findElement(By.linkText("Create a Wish List")).click();


		Thread.sleep(2000);

	}
}
