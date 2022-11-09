package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr24JavascriptAlerts {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");

		Thread.sleep(2000);

		//Javascript alert box
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='check']")).click();
		String str = driver.switchTo().alert().getText();
		System.out.println(str);
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);

		//Javascript confirm box
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		//Javascript prompt box
		driver.findElement(By.xpath("//button[@id='reset']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Welcome to selenium");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		driver.quit();

	}
}
