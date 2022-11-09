package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr12TextAreas {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("description")).clear();
		
		driver.findElement(By.id("description")).sendKeys("Welcome to selenium classes");;

	}
}
