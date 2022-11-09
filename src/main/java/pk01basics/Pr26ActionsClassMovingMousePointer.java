package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pr26ActionsClassMovingMousePointer {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");

		Thread.sleep(2000);

		WebElement fn = driver.findElement(By.id("movehere"));
		Actions a = new Actions(driver);
		
		a.moveToElement(fn).build().perform();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("mouseoverbtn")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(2000);
		
		driver.quit();

	}
}