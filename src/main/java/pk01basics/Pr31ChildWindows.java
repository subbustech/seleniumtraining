package pk01basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pr31ChildWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "servers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//Opening an URL
		driver.get("http://localhost/selenium_practice/index/");
		
		driver.findElement(By.xpath("//a[text()='Child Window 1']")).click();

		driver.findElement(By.xpath("//input[@id='cw1firstname']")).sendKeys("Child Window 1");
	}

}
